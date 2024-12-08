package controlador;

import Conexion.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class newCompras extends ControladorPrincipal {

    public void insertarRegistro(Object[] parametros, JComponent[] campos) {
        try {
            String consulta = "INSERT INTO Compra (idUsuario) VALUES (?)";
            super.insertarRegistro(consulta, parametros, campos);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }


    public void mostrarTablaDetalle(JTable tabla) {
        int id = obtenerMaxId();
        String[] columnasProveedor = {"idProducto", "idCompra", "CantidadDetallesCompra", "CostoUnitarioDetallesCompra", "SubtotalDetallesCompra"};
        String consulta = "DetallesCompra WHERE idCompra = " + id;
        super.mostrarTabla(tabla, consulta, columnasProveedor);
    }

    public void llenarCamposDesdeTabla(JTable tabla, JComboBox txt1, JTextField txt2, JTextField txt3) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            txt1.setSelectedItem(tabla.getValueAt(filaSeleccionada, 0).toString());
            txt2.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
            txt3.setText(tabla.getValueAt(filaSeleccionada, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila en la tabla.");
        }
    }

    public int obtenerMaxId() {
        return super.obtenerMaxId("idCompra", "compra");
    }

    public void modificarCantidad(Object idproducto, Object idventa, int cantidad) {
        try (Connection cn = MySQLConnection.getConnection()) {
            String selectQuery = "SELECT CantidadDetallesCompra FROM DetallesCompra WHERE idProducto = ? AND idCompra = ?";
            PreparedStatement pst = cn.prepareStatement(selectQuery);
            pst.setObject(1, idproducto);
            pst.setObject(2, idventa);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int cantidadDetallaProducto = rs.getInt("CantidadDetallesCompra");
                int cantidadNew = cantidadDetallaProducto - cantidad;

                String updateQuery;
                if (cantidadNew > 0) {
                    updateQuery = "UPDATE Producto SET StockProducto = StockProducto - ? WHERE idProducto = ?";
                } else {
                    updateQuery = "UPDATE Producto SET StockProducto = StockProducto + ? WHERE idProducto = ?";
                    cantidadNew = Math.abs(cantidadNew);
                }
                System.out.println(cantidadNew);
                pst = cn.prepareStatement(updateQuery);
                pst.setInt(1, cantidadNew);
                pst.setObject(2, idproducto);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
    }

    public void eliminarCantidad(int idventa, Object idproducto) {
        String selectQuery = "SELECT CantidadDetallesCompra FROM DetallesCompra WHERE idCompra = ? AND idProducto = ?";
        String updateQuery = "UPDATE Producto SET StockProducto = StockProducto + ? WHERE idProducto = ?";

        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pstSelect = cn.prepareStatement(selectQuery); PreparedStatement pstUpdate = cn.prepareStatement(updateQuery)) {

            // Obtener la cantidad actual del detalle del producto
            pstSelect.setInt(1, idventa);
            pstSelect.setObject(2, idproducto);
            try (ResultSet rs = pstSelect.executeQuery()) {
                if (rs.next()) {
                    int cantidadDetallaProducto = rs.getInt("CantidadDetallesCompra");

                    // Actualizar la cantidad en la tabla 'producto'
                    pstUpdate.setInt(1, cantidadDetallaProducto);
                    pstUpdate.setObject(2, idproducto);
                    pstUpdate.executeUpdate();
                }
            }
        } catch (SQLException e) {
        }
    }

    public void aumentarCantidadProducto(Object idProducto, int cantidad) {
        String query = "UPDATE Producto SET StockProducto = StockProducto + ? WHERE idProducto = ?";
        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setInt(1, cantidad);
            pst.setObject(2, idProducto);
            pst.executeUpdate();

        } catch (SQLException e) {
            mostrarError("Error al descontar cantidad del producto: ", e.getMessage());
        }
    }

    public Object obtenerPrecioProducto(Object idProducto) {
        return obtenerValor("PrecioProducto", "Producto", "idProducto", idProducto);
    }

    public Object obtenerCantidadProducto(Object idProducto) {
        return obtenerValor("StockProducto", "Producto", "idProducto", idProducto);
    }

    public Object obtenerNombreProducto(Object idProducto) {
        return obtenerValor("NombreProducto", "Producto", "idProducto", idProducto);
    }

    public Object obtenerTotalVenta() {
        int idCompra = obtenerMaxId();
        return obtenerValor("TotalCompra", "compra", "idCompra", idCompra);
    }
    
   

    public void insertarRegistro(JTable tabla, Object[] parametros, JComponent[] campos) {
        try {
            if (camposNoVacios(campos)) {
                int cantidadDisponible = (int) obtenerCantidadProducto(parametros[0]);

                String consulta = "INSERT INTO DetallesCompra (idProducto, idCompra, CantidadDetallesCompra, CostoUnitarioDetallesCompra, SubtotalDetallesCompra) VALUES (?, ?, ?, ?, ?)";
                super.insertarRegistro(consulta, parametros, campos);
                aumentarCantidadProducto(parametros[0], (int) parametros[2]);
                mostrarTablaDetalle(tabla);
                vaciarCampos(campos);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void eliminarRegistro(Object idProducto, JComponent[] campos, JTable tabla) {
        if (camposNoVacios(campos)) {
            int Venta_idVenta = obtenerMaxId();
            eliminarCantidad(Venta_idVenta, idProducto);
            try (Connection cn = MySQLConnection.getConnection()) {
                String consulta = "DELETE FROM DetallesCompra WHERE idProducto = ? AND idCompra = ?";
                PreparedStatement pst = cn.prepareStatement(consulta);
                pst.setObject(1, idProducto);
                pst.setObject(2, Venta_idVenta);
                int filasAfectadas = pst.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "El registro se ha eliminado con éxito.");
                    vaciarCampos(campos);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
            }
        }
        mostrarTablaDetalle(tabla);
    }

    public void actualizarRegistro(Object[] parametros, JTable tabla, JComponent[] campos) {
        String consulta = "UPDATE DetallesCompra SET CantidadDetallesCompra = ?, CostoUnitarioDetallesCompra = ?, SubtotalDetallesCompra = ? WHERE idProducto = ? AND idCompra = ?";
        if (camposNoVacios(campos)) {
            modificarCantidad(parametros[3], parametros[4], (int) parametros[0]);
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
        mostrarTablaDetalle(tabla);
    }
}
