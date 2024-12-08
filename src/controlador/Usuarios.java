package controlador;
import javax.swing.JComponent;
import javax.swing.JTable;

public class Usuarios extends ControladorPrincipal {

    @Override
    public void vaciarCampos(JComponent[] campos) {
        super.vaciarCampos(campos);
    }

    public void mostrarTabla(JTable tabla) {
        String[] columnasProveedor = {"idUsuario", "NombreUsuario", "PasswordUsuario", "RolUsuario"};
        super.mostrarTabla(tabla, "Usuario", columnasProveedor);
    }

    public void insertarRegistro(JTable tabla, Object[] parametros, JComponent[] campos) {
        String consulta = "INSERT INTO usuario VALUES (?, ?, ?, ?)";
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
        String consulta = "UPDATE Usuario SET NombreUsuario = ?, PasswordUsuario = ?, RolUsuario = ? WHERE idUsuario = ?";
        super.actualizarRegistro(consulta, parametros, tabla, campos);
    }

    public void eliminarRegistro(Object id, JComponent[] campos) {
        super.eliminarRegistro("Usuario", "idUsuario", id, campos);
    }

    @Override
    public void setEnabled(JComponent[] componentes, boolean enabled) {
        super.setEnabled(componentes, enabled); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
