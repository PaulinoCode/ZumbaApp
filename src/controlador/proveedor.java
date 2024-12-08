package controlador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;

public class proveedor extends ControladorPrincipal {

    @Override
    public void vaciarCampos(JComponent[] campos) {
        super.vaciarCampos(campos);
    }

    public void mostrarTabla(JTable tabla) {
        String[] columnasProveedor = {"idProveedor", "NombreProveedor", "TelefonoProveedor", "DescripcionProveedor"};
        super.mostrarTabla(tabla, "Proveedor", columnasProveedor);
    }

    public void insertarRegistro(JTable tabla, Object[] parametros, JTextField[] campos) {
        String consulta = "INSERT INTO proveedor VALUES (?, ?, ?, ?)";
        super.insertarRegistro(consulta, parametros, campos);
        mostrarTabla(tabla);
    }

    @Override
    public void llenarCamposDesdeTabla(JTable tabla, JComponent[] campos) {
        super.llenarCamposDesdeTabla(tabla, campos); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setVisibility(JComponent[] componentes, boolean visible) {
        super.setVisibility(componentes, visible); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void actualizarRegistro(Object[] parametros, JTable tabla, JTextField[] campos) {
        String consulta = "UPDATE proveedor SET NombreProveedor = ?, TelefonoProveedor = ?, DescripcionProveedor = ? WHERE IDProveedor = ?";
        super.actualizarRegistro(consulta, parametros, tabla, campos);
    }

    public void eliminarRegistro(Object id, JTextField[] campos) {
        super.eliminarRegistro("Proveedor", "idProveedor", id, campos);
    }

  
    public void llenarComboBox(JComboBox comboBox) {
        String consulta = "SELECT IDProveedor FROM proveedor";
        String valorColumna = "IDProveedor";
        super.llenarComboBox(comboBox, consulta, valorColumna); 
    }

    public void activarComponentes(JComponent[] componentes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
