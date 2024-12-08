package controlador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextField;

public class producto extends ControladorPrincipal{
    @Override
    public void vaciarCampos(JComponent[] campos) {
        super.vaciarCampos(campos);
    }

    public void mostrarTabla(JTable tabla) {
        String[] columnasProveedor = {"idProducto", "NombreProducto", "DescripcionProducto", "StockProducto", "PrecioProducto","idProveedor"};
        super.mostrarTabla(tabla, "Producto", columnasProveedor);
    }

    public void insertarRegistro(JTable tabla, Object[] parametros, JComponent[] campos) {
        String consulta = "INSERT INTO Producto VALUES (?, ?, ?, ?, ?, ?)";
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

    public void actualizarRegistro(Object[] parametros, JTable tabla, JComponent[] campos) {
        String consulta = "UPDATE Producto SET NombreProducto = ?, DescripcionProducto = ?, StockProducto = ?, PrecioProducto = ?, idProveedor = ? where idProducto = ?";
        super.actualizarRegistro(consulta, parametros, tabla, campos);
    }

    public void eliminarRegistro(Object id, JComponent[] campos) {
        super.eliminarRegistro("Producto", "idProducto", id, campos);
    }

  
    public void llenarComboBox(JComboBox comboBox) {
        String consulta = "SELECT idProducto FROM Producto";
        String valorColumna = "idProducto";
        super.llenarComboBox(comboBox, consulta, valorColumna); 
    }

    public void insertarRegistro(JTable Productos_tbl, Object[] parametros, JTextField[] campos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
