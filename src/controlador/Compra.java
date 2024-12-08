package controlador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Compra extends ControladorPrincipal {

    @Override
    public void vaciarCampos(JComponent[] campos) {
        super.vaciarCampos(campos);
    }

    public void mostrarTabla(JTable tabla) {
        String[] columnasProveedor = {"idCompra", "FechaCompra", "TotalCompra", "idUsuario"};
        super.mostrarTabla(tabla, "Compra", columnasProveedor);
    }

    public void mostrarTablaDetalle(JTable tabla, Object id) {
        String[] columnasProveedor = {"idProducto", "idCompra", "CantidadDetallesCompra", "CostoUnitarioDetallesCompra", "SubtotalDetallesCompra"};
        String consulta = "DetallesCompra WHERE idCompra = " + id;
        super.mostrarTabla(tabla, consulta, columnasProveedor);
    }

    public void llenarCamposDesdeTabla(JTable tabla, JTextField txt1, JTextField txt2) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            txt1.setText(tabla.getValueAt(filaSeleccionada, 0).toString());
            txt2.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila en la tabla.");
        }
    }

    public void actualizarRegistro(Object[] parametros, JTable tabla, JComponent[] campos) {
        String consulta = "UPDATE Compra SET TotalCompra = ? where idCompra = ?";
        super.actualizarRegistro(consulta, parametros, tabla, campos);
    }
}
