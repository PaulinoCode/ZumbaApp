package controlador;

import Conexion.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComponent;
import javax.swing.JTable;

public class Finanzas extends ControladorPrincipal {

    public void mostrarTablaVentas(JTable tabla, String fechaInicio, String fechaFin) {
        String[] columnasProveedor = {"idVenta", "FechaVenta", "TotalVenta", "idUsuario"};
        String consulta = "Venta WHERE FechaVenta BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' AND TotalVenta > 0";
        super.mostrarTabla(tabla, consulta, columnasProveedor);
    }

    public void mostrarTablaCompras(JTable tabla, String fechaInicio, String fechaFin) {
        String[] columnasProveedor = {"idCompra", "FechaCompra", "TotalCompra", "idUsuario"};
        String consulta = "Compra WHERE FechaCompra BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' AND TotalCompra > 0";
        super.mostrarTabla(tabla, consulta, columnasProveedor);
    }

    public Object sumaTotalesVentas(String fechaInicio, String fechaFin) {
        Object valor = null;
        String consulta = "SELECT SUM(TotalVenta) AS SumaTotales FROM Venta WHERE FechaVenta BETWEEN ? AND ? AND TotalVenta > 0";
        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(consulta)) {
            pst.setObject(1, fechaInicio);
            pst.setObject(2, fechaFin);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                valor = rs.getObject("SumaTotales");
            }
        } catch (SQLException e) {
            super.mostrarError("Eror en la suma de las ventas", e.getMessage());
        }
        return valor;
    }

    public Object sumaTotalesCompras(String fechaInicio, String fechaFin) {
        Object valor = null;
        String consulta = "SELECT SUM(TotalCompra) AS SumaTotales FROM Compra WHERE FechaCompra BETWEEN ? AND ? AND TotalCompra > 0";
        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(consulta)) {
            pst.setObject(1, fechaInicio);
            pst.setObject(2, fechaFin);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                valor = rs.getObject("SumaTotales");
            }
        } catch (SQLException e) {
            super.mostrarError("Eror en la suma de las ventas", e.getMessage());
        }
        return valor;
    }

    @Override
    protected boolean camposNoVacios(JComponent[] campos) {
        return super.camposNoVacios(campos); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Object calcularGanancias(String fechaInicio, String fechaFin) {
        Object ganancias = null;
        String consulta = "SELECT " + "(SELECT SUM(TotalVenta) FROM Venta WHERE FechaVenta BETWEEN ? AND ? AND TotalVenta > 0) - " + "(SELECT SUM(TotalCompra) FROM Compra WHERE FechaCompra BETWEEN ? AND ? AND TotalCompra > 0) AS Ganancias";
        try (Connection cn = MySQLConnection.getConnection(); PreparedStatement pst = cn.prepareStatement(consulta)) {
            pst.setString(1, fechaInicio);
            pst.setString(2, fechaFin);
            pst.setString(3, fechaInicio);
            pst.setString(4, fechaFin);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ganancias = rs.getObject("Ganancias");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ganancias;
    }
}
