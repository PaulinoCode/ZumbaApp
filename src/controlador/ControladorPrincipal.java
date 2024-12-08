package controlador;

import Conexion.MySQLConnection;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class ControladorPrincipal {

    protected final void mostrarTabla(JTable tabla, String nombreTabla, String[] columnas) {
        try (Connection cn = MySQLConnection.getConnection()) {
            String consulta = "SELECT * FROM " + nombreTabla;
            PreparedStatement pst = cn.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
            modeloTabla.setRowCount(0);
            while (rs.next()) {
                Object[] fila = new Object[columnas.length];
                for (int i = 0; i < columnas.length; i++) {
                    fila[i] = rs.getObject(columnas[i]);
                }
                modeloTabla.addRow(fila);
            }
            tabla.setModel(modeloTabla);
        } catch (SQLException e) {
            mostrarError("Error al mostrar la tabla ", e.getMessage());
        }
    }

    protected void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    protected void vaciarCampos(JComponent[] campos) {
        try {
            for (JComponent componente : campos) {
                if (componente instanceof JTextField) {
                    JTextField textField = (JTextField) componente;
                    textField.setText("");
                } else if (componente instanceof JComboBox) {
                    JComboBox comboBox = (JComboBox) componente;
                    comboBox.setSelectedItem("");
                }
            }
        } catch (Exception e) {
            mostrarError("Error al vaciar los Campos ", e.getMessage());
        }
    }

    protected boolean camposNoVacios(JComponent[] campos) {
        for (JComponent componente : campos) {
            if (componente instanceof JTextField) {
                JTextField textField = (JTextField) componente;
                if (textField.getText().isEmpty()) {
                    mostrarError("El campo de texto ", textField.getName() + " está vacío.");
                    return false;
                }
            } else if (componente instanceof JComboBox) {
                JComboBox comboBox = (JComboBox) componente;
                if (comboBox.getSelectedItem().toString().trim().isEmpty()) {
                    mostrarError("Debe seleccionar una opción en el combo box ", comboBox.getName() + ".");
                    return false;
                }
            }
        }
        return true;
    }

    protected void insertarRegistro(String consulta, Object[] parametros, JComponent[] campos) {
        if (camposNoVacios(campos)) {
            try (Connection cn = MySQLConnection.getConnection()) {
                PreparedStatement pst = cn.prepareStatement(consulta);
                for (int i = 0; i < parametros.length; i++) {
                    pst.setObject(i + 1, parametros[i]);
                }
                int exito = pst.executeUpdate();
                if (exito > 0) {
                    vaciarCampos(campos);
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.");
                }
            } catch (SQLException e) {
                mostrarError("Error al insertar registro: ", e.getMessage());
            }
        }
    }

    protected void llenarCamposDesdeTabla(JTable tabla, JComponent[] campos) {
        try {
            int filaSeleccionada = tabla.getSelectedRow();
            if (filaSeleccionada != -1) {
                for (int i = 0; i < campos.length; i++) {
                    if (campos[i] instanceof JTextField) {
                        JTextField textField = (JTextField) campos[i];
                        textField.setText(tabla.getValueAt(filaSeleccionada, i).toString());
                    } else if (campos[i] instanceof JComboBox) {
                        JComboBox comboBox = (JComboBox) campos[i];
                        comboBox.setSelectedItem(tabla.getValueAt(filaSeleccionada, i).toString());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila en la tabla.");
            }
        } catch (Exception e) {
            mostrarError("Error al llenar los Campos Desde la Tabla: ", e.getMessage());
        }
    }

    protected void actualizarRegistro(String consulta, Object[] parametros, JTable tabla, JComponent[] campos) {
        if (camposNoVacios(campos)) {
            try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(consulta)) {
                for (int i = 0; i < parametros.length; i++) {
                    pst.setObject(i + 1, parametros[i]);
                }
                int filasAfectadas = pst.executeUpdate();

                if (filasAfectadas > 0) {
                    vaciarCampos(campos);
                    JOptionPane.showMessageDialog(null, "La modificación se ha realizado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro.");
                }
            } catch (SQLException ex) {
                mostrarError("Error al modificar el registro: ", ex.getMessage());
            }
        }
    }

    protected void eliminarRegistro(String tabla, String columnaId, Object id, JComponent[] campos) {
        if (camposNoVacios(campos)) {
            try (Connection cn = MySQLConnection.getConnection()) {
                String consulta = "DELETE FROM " + tabla + " WHERE " + columnaId + " = ?";
                PreparedStatement pst = cn.prepareStatement(consulta);
                pst.setObject(1, id);

                int filasAfectadas = pst.executeUpdate();

                if (filasAfectadas > 0) {
                    vaciarCampos(campos);
                    JOptionPane.showMessageDialog(null, "El registro se ha eliminado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
            }
        }
    }

    protected void llenarComboBox(JComboBox comboBox, String consulta, String valorColumna) {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) comboBox.getModel();
        modelo.removeAllElements();

        try (Connection cn = MySQLConnection.getConnection()) {
            PreparedStatement pst = cn.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();

            modelo.addElement("");

            while (rs.next()) {
                modelo.addElement(rs.getString(valorColumna));
            }
            
         comboBox.setEditable(true);
        habilitarAutocompletado(comboBox);
        configurarComboBox(comboBox, modelo);
        } catch (SQLException ex) {
            mostrarError("Error al llenar el ComboBox: ", ex.getMessage());
        }
    }

    protected int obtenerMaxId(String atributo, String tabla) {
        int maxId = -1;
        String consulta = "SELECT MAX(" + atributo + ") AS max_id FROM " + tabla;
        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(consulta); ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                maxId = rs.getInt("max_id");
            }
        } catch (SQLException ex) {
            mostrarError("Error al obtener el ID máximo de " + tabla + ": ", ex.getMessage());
        }
        return maxId;
    }

    public Object obtenerValor(String columna, String tabla, String idColumna, Object id) {
        Object valor = null;
        String consulta = "SELECT " + columna + " FROM " + tabla + " WHERE " + idColumna + " = ?";
        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(consulta)) {
            pst.setObject(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                valor = rs.getObject(columna);
            }
        } catch (SQLException e) {
            mostrarError("Error al obtener el valor de " + columna + " en " + tabla + ": ", e.getMessage());
        }
        return valor;
    }

    protected void setVisibility(JComponent[] componentes, boolean visible) {
        for (JComponent componente : componentes) {
            componente.setVisible(visible);
        }
    }

    protected void setEnabled(JComponent[] componentes, boolean enabled) {
        for (JComponent componente : componentes) {
            componente.setEnabled(enabled);
        }
    }
    
    
    
    protected void habilitarAutocompletado(JComboBox<String> comboBox) {
    JTextField textField = (JTextField) comboBox.getEditor().getEditorComponent();
    DefaultComboBoxModel<String> modeloOriginal = (DefaultComboBoxModel<String>) comboBox.getModel();

    Timer timer = new Timer(300, e -> filtrarOpciones(comboBox, modeloOriginal));
    timer.setRepeats(false); // Solo se ejecuta una vez por cada evento

    textField.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            timer.restart(); // Reinicia el temporizador con cada cambio
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            timer.restart();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            timer.restart();
        }
    });

    comboBox.addActionListener(e -> {
        Object selectedItem = comboBox.getSelectedItem();
        if (selectedItem != null) {
            textField.setText(selectedItem.toString());
        }
    });
}



private String ultimoTextoIngresado = "";  // Variable para guardar el último texto ingresado

private void filtrarOpciones(JComboBox<String> comboBox, DefaultComboBoxModel<String> modeloOriginal) {
    SwingUtilities.invokeLater(() -> {
        JTextField textField = (JTextField) comboBox.getEditor().getEditorComponent();
        String textoIngresado = textField.getText().toLowerCase();

        // Si el texto no ha cambiado, no filtramos
        if (textoIngresado.equals(ultimoTextoIngresado)) {
            return;
        }

        // Guardamos el nuevo texto ingresado
        ultimoTextoIngresado = textoIngresado;

        // Crear un modelo filtrado
        DefaultComboBoxModel<String> modeloFiltrado = new DefaultComboBoxModel<>();
        for (int i = 0; i < modeloOriginal.getSize(); i++) {
            String opcion = modeloOriginal.getElementAt(i).toLowerCase();
            if (opcion.contains(textoIngresado)) {
                modeloFiltrado.addElement(modeloOriginal.getElementAt(i));
            }
        }

        // Solo actualizamos el modelo si hay resultados
        if (modeloFiltrado.getSize() > 0) {
            // Solo actualizar el modelo si es diferente del actual
            if (comboBox.getModel() != modeloFiltrado) {
                comboBox.setModel(modeloFiltrado);
            }

            // Mostrar el popup solo si no está visible
            if (!comboBox.isPopupVisible()) {
                comboBox.showPopup();
            }
        } else {
            // Si no hay coincidencias, ocultamos el popup si está visible
            if (comboBox.isPopupVisible()) {
                comboBox.hidePopup();
            }
        }

        // Restaurar el texto ingresado y la selección
        JTextField nuevoTextField = (JTextField) comboBox.getEditor().getEditorComponent();
        nuevoTextField.setText(textoIngresado);

        // Prevenir la selección automática cuando no hay coincidencias
        if (comboBox.getItemCount() > 0 && comboBox.getSelectedItem() == null) {
            comboBox.setSelectedItem(textoIngresado);
        }
    });
}



private void configurarComboBox(JComboBox<String> comboBox, DefaultComboBoxModel<String> modeloOriginal) {
    // Agregar el ItemListener para manejar la selección de una opción
    comboBox.addItemListener(e -> {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            // Ocultar el popup inmediatamente después de seleccionar una opción
            comboBox.hidePopup();
        }
    });

    // Listener para convertir el texto a mayúsculas mientras se escribe
    JTextField textField = (JTextField) comboBox.getEditor().getEditorComponent();
    textField.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            convertirAMayusculas(textField);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            convertirAMayusculas(textField);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            convertirAMayusculas(textField);
        }
    });

    // Validación cuando el campo pierde el foco (el usuario no seleccionó ninguna opción válida)
    comboBox.getEditor().getEditorComponent().addFocusListener(new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent e) {
            validarSeleccion(comboBox, modeloOriginal);
        }
    });

    // Aquí llamamos al método filtrarOpciones para aplicar el filtro según lo que el usuario escribe
    comboBox.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            filtrarOpciones(comboBox, modeloOriginal);  // Filtramos las opciones al escribir
        }
    });
}

// Método para convertir el texto a mayúsculas
private void convertirAMayusculas(JTextField textField) {
    // Usa invokeLater para asegurarte de que el cambio de texto se haga fuera de la notificación
    SwingUtilities.invokeLater(() -> {
        String texto = textField.getText().toUpperCase();  // Convertir el texto a mayúsculas
        if (!texto.equals(textField.getText())) {  // Solo actualiza si el texto es diferente
            textField.setText(texto);  // Establecer el texto convertido
        }
    });
}




// Método para validar que la opción seleccionada esté en las disponibles
private void validarSeleccion(JComboBox<String> comboBox, DefaultComboBoxModel<String> modeloOriginal) {
    String textoIngresado = (String) comboBox.getEditor().getItem();

    boolean esValida = false;

    // Recorremos el modelo para ver si el texto coincide con alguna opción
    for (int i = 0; i < modeloOriginal.getSize(); i++) {
        if (modeloOriginal.getElementAt(i).equalsIgnoreCase(textoIngresado)) {
            esValida = true;
            break;
        }
    }

    // Si el texto no coincide con ninguna opción, mostramos un mensaje o revertimos la selección
    if (!esValida) {
        JOptionPane.showMessageDialog(comboBox, "Debes seleccionar una opción válida.", "Selección inválida", JOptionPane.WARNING_MESSAGE);
        comboBox.setSelectedItem("");  // Restaurar a la opción vacía o default
    }
}




}
