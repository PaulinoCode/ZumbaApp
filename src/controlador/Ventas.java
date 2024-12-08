package controlador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ventas extends ControladorPrincipal {

    @Override
    public void vaciarCampos(JComponent[] campos) {
        super.vaciarCampos(campos);
    }

    public void mostrarTabla(JTable tabla) {
        String[] columnasProveedor = {"idVenta", "FechaVenta", "TotalVenta", "idUsuario"};
        super.mostrarTabla(tabla, "Venta", columnasProveedor);
    }

    public void mostrarTablaDetalle(JTable tabla, Object id) {
        String[] columnasProveedor = {"idProducto", "Venta_idVenta", "CantidadDetallesVenta", "PrecioUnitarioDetallesVenta", "SuptotalDetallesVenta"};
        String consulta = "DetallesVenta WHERE Venta_idVenta = " + id;
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
        String consulta = "UPDATE Venta SET TotalVenta = ? where idVenta = ?";
        super.actualizarRegistro(consulta, parametros, tabla, campos);
    }
}
