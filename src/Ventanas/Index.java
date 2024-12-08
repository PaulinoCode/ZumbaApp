package Ventanas;

import controlador.ExportarPDF;
import java.awt.Color;
import controlador.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Index extends javax.swing.JFrame {

    Object idUsuario;
    Object rol;
    // instacias  
    proveedor insProveedor = new proveedor();
    producto insProducto = new producto();
    Ventas insVentas = new Ventas();
    newVenta insNewVenta = new newVenta();
    Compra insCompra = new Compra();
    newCompras insNewCompras = new newCompras();
    Usuarios insUsuarios = new Usuarios();
    Finanzas insFinanzas = new Finanzas();

    public Index(Object idUsuario, Object rol) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Micelanea Zumba");
        this.idUsuario = idUsuario;
        this.rol = rol;
        if (rol.equals("Vendedor")) {
            Proveedores_tbl.setCellSelectionEnabled(false);

            JComponent[] componentes2 = {Usuarios_btn, Finanzas_btn};
            insUsuarios.setVisibility(componentes2, false);
        }
        mostarTablas();
        JComponent[] componenteR = {Proveedores_btn};
        restablecerColorPaneles(componenteR);
    }

    public Index() {
        this("Dark", "Administrador");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btns = new javax.swing.JPanel();
        Proveedores_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Proveedores_btn_lbl = new javax.swing.JLabel();
        Productos_btn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Productos_btn_lbl = new javax.swing.JLabel();
        Ventas_btn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Ventas_btn_lbl = new javax.swing.JLabel();
        NewVenta_btn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        NewVenta_btn_lbl = new javax.swing.JLabel();
        Compras_btn = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Compras_btn_lbl = new javax.swing.JLabel();
        NewCompra_btn = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        NewCompra_btn_lbl = new javax.swing.JLabel();
        Finanzas_btn = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Finanzas_btn_lbl = new javax.swing.JLabel();
        Usuarios_btn = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Usuarios_btn_lbl = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtvacio = new javax.swing.JTextField();
        Usuarios_btn_eliminar1 = new javax.swing.JButton();
        pnls = new javax.swing.JTabbedPane();
        Proveedores_Pnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Proveedores_tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Proveedores_txt_id = new javax.swing.JTextField();
        Proveedores_txt_nombre = new javax.swing.JTextField();
        Proveedores_txt_telefono = new javax.swing.JTextField();
        Proveedores_txt_descripcion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Proveedores_btn_eliminar = new javax.swing.JButton();
        Proveedores_btn_editar = new javax.swing.JButton();
        Proveedores_btn_cancelar = new javax.swing.JButton();
        Proveedores_btn_agregar = new javax.swing.JButton();
        Productos_Pnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Productos_tbl = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        Productos_txt_id = new javax.swing.JTextField();
        Productos_txt_nombre = new javax.swing.JTextField();
        Productos_cbb_idproveedor = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        Productos_txt_descripcion = new javax.swing.JTextField();
        Productos_txt_cantidad = new javax.swing.JTextField();
        Productos_txt_precio = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Productos_btn_eliminar = new javax.swing.JButton();
        Productos_btn_editar = new javax.swing.JButton();
        Productos_btn_cancelar = new javax.swing.JButton();
        Productos_btn_agregar = new javax.swing.JButton();
        Ventas_Pnl = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Ventas_tbl_ventas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Ventas_txt_id = new javax.swing.JTextField();
        Ventas_txt_total = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Ventas_btn_editar = new javax.swing.JButton();
        Ventas_btn_cancelar = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        Ventas_tbl_detalla = new javax.swing.JTable();
        NewVenta_Pnl = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        NewVenta_tbl = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        NewVenta_btn_eliminar = new javax.swing.JButton();
        NewVenta_btn_editar = new javax.swing.JButton();
        NewVenta_btn_cancelar = new javax.swing.JButton();
        NewVenta_btn_agregar = new javax.swing.JButton();
        NewVenta_txt_cantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NewVenta_btn_TerVenta = new javax.swing.JButton();
        NewVenta_btn_IniVenta = new javax.swing.JButton();
        NewVenta_txt_id = new javax.swing.JComboBox<>();
        NewVenta_txt_precio = new javax.swing.JTextField();
        NewVenta_txt_nombre = new javax.swing.JTextField();
        NewVenta_txt_cantidadDispo = new javax.swing.JTextField();
        NewVenta_txt_total = new javax.swing.JTextField();
        Compras_Pnl = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        Compras_tbl_compras = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Compras_txt_id = new javax.swing.JTextField();
        Compras_txt_total = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        Compras_btn_editar = new javax.swing.JButton();
        Compras_btn_cancelar = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        Compras_tbl_detalla = new javax.swing.JTable();
        NewCompra_Pnl = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        NewCompra_tbl = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        NewCompra_btn_eliminar = new javax.swing.JButton();
        NewCompra_btn_editar = new javax.swing.JButton();
        NewCompra_btn_cancelar = new javax.swing.JButton();
        NewCompra_btn_agregar = new javax.swing.JButton();
        NewCompra_txt_Cantidad = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        NewCompra_txt_Costo = new javax.swing.JTextField();
        NewCompra_txt_nombre = new javax.swing.JTextField();
        NewCompra_txt_total = new javax.swing.JTextField();
        NewCompra_btn_TerVenta = new javax.swing.JButton();
        NewCompra_btn_IniVenta = new javax.swing.JButton();
        NewCompra_txt_id = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        NewCompra_txt_cantidadDispo = new javax.swing.JTextField();
        Finanzas_Pnl = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Finanzas_tbl_c = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Finanzas_fecha_ini = new com.toedter.calendar.JDateChooser();
        Finanzas_fecha_fin = new com.toedter.calendar.JDateChooser();
        jPanel16 = new javax.swing.JPanel();
        Finanzas_btn_buscar = new javax.swing.JButton();
        Finanzas_btn_cancelar = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        Finanzas_tbl_v = new javax.swing.JTable();
        Finanzas_ingresos = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Finanzas_btn_pdf = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        Finanzas_ganancias = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Finanzas_gastos = new javax.swing.JTextField();
        Usuarios_Pnl = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        Usuarios_tbl = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Usuarios_txt_id = new javax.swing.JTextField();
        Usuarios_txt_nombre = new javax.swing.JTextField();
        Usuarios_txt_contra = new javax.swing.JTextField();
        Usuarios_txt_rol = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        Usuarios_btn_eliminar = new javax.swing.JButton();
        Usuarios_btn_editar = new javax.swing.JButton();
        Usuarios_btn_cancelar = new javax.swing.JButton();
        Usuarios_btn_agregar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btns.setBackground(new java.awt.Color(44, 44, 44));
        btns.setLayout(new java.awt.GridLayout(0, 1, 10, 10));

        Proveedores_btn.setBackground(new java.awt.Color(44, 44, 44));
        Proveedores_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Proveedores_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Proveedores_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Proveedores_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Proveedores_btnMouseExited(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Proveedores_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Proveedores_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        Proveedores_btn_lbl.setText("Proveedores ");

        javax.swing.GroupLayout Proveedores_btnLayout = new javax.swing.GroupLayout(Proveedores_btn);
        Proveedores_btn.setLayout(Proveedores_btnLayout);
        Proveedores_btnLayout.setHorizontalGroup(
            Proveedores_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Proveedores_btnLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Proveedores_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Proveedores_btnLayout.setVerticalGroup(
            Proveedores_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Proveedores_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(Proveedores_btn);

        Productos_btn.setBackground(new java.awt.Color(44, 44, 44));
        Productos_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Productos_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Productos_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Productos_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Productos_btnMouseExited(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Productos_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Productos_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        Productos_btn_lbl.setText("Productos");

        javax.swing.GroupLayout Productos_btnLayout = new javax.swing.GroupLayout(Productos_btn);
        Productos_btn.setLayout(Productos_btnLayout);
        Productos_btnLayout.setHorizontalGroup(
            Productos_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Productos_btnLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Productos_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Productos_btnLayout.setVerticalGroup(
            Productos_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Productos_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(Productos_btn);

        Ventas_btn.setBackground(new java.awt.Color(44, 44, 44));
        Ventas_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ventas_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ventas_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ventas_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ventas_btnMouseExited(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Ventas_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Ventas_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        Ventas_btn_lbl.setText("Ventas");

        javax.swing.GroupLayout Ventas_btnLayout = new javax.swing.GroupLayout(Ventas_btn);
        Ventas_btn.setLayout(Ventas_btnLayout);
        Ventas_btnLayout.setHorizontalGroup(
            Ventas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas_btnLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ventas_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Ventas_btnLayout.setVerticalGroup(
            Ventas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Ventas_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(Ventas_btn);

        NewVenta_btn.setBackground(new java.awt.Color(44, 44, 44));
        NewVenta_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NewVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewVenta_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewVenta_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewVenta_btnMouseExited(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        NewVenta_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        NewVenta_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        NewVenta_btn_lbl.setText("New venta");

        javax.swing.GroupLayout NewVenta_btnLayout = new javax.swing.GroupLayout(NewVenta_btn);
        NewVenta_btn.setLayout(NewVenta_btnLayout);
        NewVenta_btnLayout.setHorizontalGroup(
            NewVenta_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewVenta_btnLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewVenta_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewVenta_btnLayout.setVerticalGroup(
            NewVenta_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(NewVenta_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(NewVenta_btn);

        Compras_btn.setBackground(new java.awt.Color(44, 44, 44));
        Compras_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Compras_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Compras_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Compras_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Compras_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Compras_btnMouseExited(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Compras_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Compras_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        Compras_btn_lbl.setText("Compras");

        javax.swing.GroupLayout Compras_btnLayout = new javax.swing.GroupLayout(Compras_btn);
        Compras_btn.setLayout(Compras_btnLayout);
        Compras_btnLayout.setHorizontalGroup(
            Compras_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Compras_btnLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Compras_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Compras_btnLayout.setVerticalGroup(
            Compras_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Compras_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(Compras_btn);

        NewCompra_btn.setBackground(new java.awt.Color(44, 44, 44));
        NewCompra_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NewCompra_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewCompra_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewCompra_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewCompra_btnMouseExited(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        NewCompra_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        NewCompra_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        NewCompra_btn_lbl.setText("New Compra");

        javax.swing.GroupLayout NewCompra_btnLayout = new javax.swing.GroupLayout(NewCompra_btn);
        NewCompra_btn.setLayout(NewCompra_btnLayout);
        NewCompra_btnLayout.setHorizontalGroup(
            NewCompra_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewCompra_btnLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewCompra_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewCompra_btnLayout.setVerticalGroup(
            NewCompra_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(NewCompra_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(NewCompra_btn);

        Finanzas_btn.setBackground(new java.awt.Color(44, 44, 44));
        Finanzas_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Finanzas_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Finanzas_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Finanzas_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Finanzas_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Finanzas_btnMouseExited(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Finanzas_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Finanzas_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        Finanzas_btn_lbl.setText("Finanzas");

        javax.swing.GroupLayout Finanzas_btnLayout = new javax.swing.GroupLayout(Finanzas_btn);
        Finanzas_btn.setLayout(Finanzas_btnLayout);
        Finanzas_btnLayout.setHorizontalGroup(
            Finanzas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Finanzas_btnLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Finanzas_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Finanzas_btnLayout.setVerticalGroup(
            Finanzas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Finanzas_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(Finanzas_btn);

        Usuarios_btn.setBackground(new java.awt.Color(44, 44, 44));
        Usuarios_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuarios_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuarios_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Usuarios_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Usuarios_btnMouseExited(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Usuarios_btn_lbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Usuarios_btn_lbl.setForeground(new java.awt.Color(224, 224, 224));
        Usuarios_btn_lbl.setText("Usuarios ");

        javax.swing.GroupLayout Usuarios_btnLayout = new javax.swing.GroupLayout(Usuarios_btn);
        Usuarios_btn.setLayout(Usuarios_btnLayout);
        Usuarios_btnLayout.setHorizontalGroup(
            Usuarios_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Usuarios_btnLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuarios_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Usuarios_btnLayout.setVerticalGroup(
            Usuarios_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Usuarios_btn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btns.add(Usuarios_btn);

        jPanel1.add(btns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, 510));

        jPanel12.setBackground(new java.awt.Color(44, 44, 44));

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 55)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 209, 178));
        jLabel30.setText("Micelanea Zumba ");

        txtvacio.setEditable(false);
        txtvacio.setBackground(new java.awt.Color(159, 62, 117));
        txtvacio.setText("jTextField1");
        txtvacio.setOpaque(true);

        Usuarios_btn_eliminar1.setBackground(new java.awt.Color(255, 107, 107));
        Usuarios_btn_eliminar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Usuarios_btn_eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios_btn_eliminar1.setText("Cerrar sesión");
        Usuarios_btn_eliminar1.setBorder(null);
        Usuarios_btn_eliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_btn_eliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Usuarios_btn_eliminar1.setRequestFocusEnabled(false);
        Usuarios_btn_eliminar1.setRolloverEnabled(false);
        Usuarios_btn_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_btn_eliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(txtvacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Usuarios_btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtvacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(Usuarios_btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Usuarios_btn_eliminar.setVisible(false);

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1100, 110));

        Proveedores_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        Proveedores_tbl.setAutoCreateRowSorter(true);
        Proveedores_tbl.setBackground(new java.awt.Color(245, 245, 245));
        Proveedores_tbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Proveedores_tbl.setForeground(new java.awt.Color(51, 51, 51));
        Proveedores_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Proveedores_tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores_tbl.setGridColor(new java.awt.Color(180, 180, 180));
        Proveedores_tbl.setShowGrid(true);
        Proveedores_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Proveedores_tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Proveedores_tbl);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Proveedores ");

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("ID");

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Nombre:");

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Telefono:");

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Descripcion:");

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 30, 5));

        Proveedores_txt_id.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Proveedores_txt_id.setToolTipText("");
        jPanel2.add(Proveedores_txt_id);

        Proveedores_txt_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jPanel2.add(Proveedores_txt_nombre);

        Proveedores_txt_telefono.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Proveedores_txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Proveedores_txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(Proveedores_txt_telefono);

        Proveedores_txt_descripcion.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jPanel2.add(Proveedores_txt_descripcion);

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        Proveedores_btn_eliminar.setBackground(new java.awt.Color(255, 107, 107));
        Proveedores_btn_eliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Proveedores_btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Proveedores_btn_eliminar.setText("Eliminar");
        Proveedores_btn_eliminar.setBorder(null);
        Proveedores_btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores_btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proveedores_btn_eliminar.setRequestFocusEnabled(false);
        Proveedores_btn_eliminar.setRolloverEnabled(false);
        Proveedores_btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proveedores_btn_eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(Proveedores_btn_eliminar);
        Proveedores_btn_eliminar.setVisible(false);

        Proveedores_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        Proveedores_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Proveedores_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        Proveedores_btn_editar.setText("Editar");
        Proveedores_btn_editar.setBorder(null);
        Proveedores_btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proveedores_btn_editar.setRequestFocusEnabled(false);
        Proveedores_btn_editar.setRolloverEnabled(false);
        Proveedores_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proveedores_btn_editarActionPerformed(evt);
            }
        });
        jPanel3.add(Proveedores_btn_editar);
        Proveedores_btn_editar.setVisible(false);

        Proveedores_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        Proveedores_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Proveedores_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Proveedores_btn_cancelar.setText("Cancelar");
        Proveedores_btn_cancelar.setBorder(null);
        Proveedores_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proveedores_btn_cancelar.setRequestFocusEnabled(false);
        Proveedores_btn_cancelar.setRolloverEnabled(false);
        Proveedores_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proveedores_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(Proveedores_btn_cancelar);
        Proveedores_btn_cancelar.setVisible(false);

        Proveedores_btn_agregar.setBackground(new java.awt.Color(129, 199, 132));
        Proveedores_btn_agregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Proveedores_btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        Proveedores_btn_agregar.setText("Agregar");
        Proveedores_btn_agregar.setBorder(null);
        Proveedores_btn_agregar.setBorderPainted(false);
        Proveedores_btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedores_btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proveedores_btn_agregar.setRequestFocusEnabled(false);
        Proveedores_btn_agregar.setRolloverEnabled(false);
        Proveedores_btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proveedores_btn_agregarActionPerformed(evt);
            }
        });
        jPanel3.add(Proveedores_btn_agregar);

        javax.swing.GroupLayout Proveedores_PnlLayout = new javax.swing.GroupLayout(Proveedores_Pnl);
        Proveedores_Pnl.setLayout(Proveedores_PnlLayout);
        Proveedores_PnlLayout.setHorizontalGroup(
            Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Proveedores_PnlLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Proveedores_PnlLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel26)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Proveedores_PnlLayout.createSequentialGroup()
                        .addGroup(Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Proveedores_PnlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(14, 14, 14))))
        );
        Proveedores_PnlLayout.setVerticalGroup(
            Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Proveedores_PnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Proveedores_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnls.addTab("tab1", Proveedores_Pnl);

        Productos_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Productos ");

        Productos_tbl.setAutoCreateRowSorter(true);
        Productos_tbl.setBackground(new java.awt.Color(245, 245, 245));
        Productos_tbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Productos_tbl.setForeground(new java.awt.Color(51, 51, 51));
        Productos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Cantidad", "Precio", "IDProvedor"
            }
        ));
        Productos_tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos_tbl.setGridColor(new java.awt.Color(180, 180, 180));
        Productos_tbl.setShowGrid(true);
        Productos_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Productos_tblMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Productos_tbl);

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("ID:");

        jLabel32.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Nombre:");

        jLabel34.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("IDProveedor:");

        jPanel19.setBackground(new java.awt.Color(245, 245, 245));
        jPanel19.setLayout(new java.awt.GridLayout(1, 0, 70, 5));

        Productos_txt_id.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Productos_txt_id.setToolTipText("");
        jPanel19.add(Productos_txt_id);

        Productos_txt_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jPanel19.add(Productos_txt_nombre);

        Productos_cbb_idproveedor.setToolTipText("");
        jPanel19.add(Productos_cbb_idproveedor);

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 70, 5));

        Productos_txt_descripcion.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Productos_txt_descripcion.setToolTipText("");
        jPanel4.add(Productos_txt_descripcion);

        Productos_txt_cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Productos_txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Productos_txt_cantidadKeyTyped(evt);
            }
        });
        jPanel4.add(Productos_txt_cantidad);

        Productos_txt_precio.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Productos_txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Productos_txt_precioKeyTyped(evt);
            }
        });
        jPanel4.add(Productos_txt_precio);

        jLabel59.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Descripcion:");

        jLabel60.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Cantidad:");

        jLabel61.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Precio:");

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        Productos_btn_eliminar.setBackground(new java.awt.Color(255, 107, 107));
        Productos_btn_eliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Productos_btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Productos_btn_eliminar.setText("Eliminar");
        Productos_btn_eliminar.setBorder(null);
        Productos_btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos_btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos_btn_eliminar.setRequestFocusEnabled(false);
        Productos_btn_eliminar.setRolloverEnabled(false);
        Productos_btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_btn_eliminarActionPerformed(evt);
            }
        });
        jPanel5.add(Productos_btn_eliminar);
        Productos_btn_eliminar.setVisible(false);

        Productos_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        Productos_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Productos_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        Productos_btn_editar.setText("Editar");
        Productos_btn_editar.setBorder(null);
        Productos_btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos_btn_editar.setRequestFocusEnabled(false);
        Productos_btn_editar.setRolloverEnabled(false);
        Productos_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_btn_editarActionPerformed(evt);
            }
        });
        jPanel5.add(Productos_btn_editar);
        Productos_btn_editar.setVisible(false);

        Productos_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        Productos_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Productos_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Productos_btn_cancelar.setText("Cancelar");
        Productos_btn_cancelar.setBorder(null);
        Productos_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos_btn_cancelar.setRequestFocusEnabled(false);
        Productos_btn_cancelar.setRolloverEnabled(false);
        Productos_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel5.add(Productos_btn_cancelar);
        Productos_btn_cancelar.setVisible(false);

        Productos_btn_agregar.setBackground(new java.awt.Color(129, 199, 132));
        Productos_btn_agregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Productos_btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        Productos_btn_agregar.setText("Agregar");
        Productos_btn_agregar.setBorder(null);
        Productos_btn_agregar.setBorderPainted(false);
        Productos_btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Productos_btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos_btn_agregar.setRequestFocusEnabled(false);
        Productos_btn_agregar.setRolloverEnabled(false);
        Productos_btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productos_btn_agregarActionPerformed(evt);
            }
        });
        jPanel5.add(Productos_btn_agregar);

        javax.swing.GroupLayout Productos_PnlLayout = new javax.swing.GroupLayout(Productos_Pnl);
        Productos_Pnl.setLayout(Productos_PnlLayout);
        Productos_PnlLayout.setHorizontalGroup(
            Productos_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Productos_PnlLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(Productos_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Productos_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Productos_PnlLayout.createSequentialGroup()
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(258, 258, 258)
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34)
                            .addGap(209, 209, 209))
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Productos_PnlLayout.createSequentialGroup()
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(258, 258, 258)
                            .addComponent(jLabel60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61)
                            .addGap(254, 254, 254)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        Productos_PnlLayout.setVerticalGroup(
            Productos_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Productos_PnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Productos_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Productos_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnls.addTab("tab1", Productos_Pnl);

        Ventas_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        Ventas_tbl_ventas.setAutoCreateRowSorter(true);
        Ventas_tbl_ventas.setBackground(new java.awt.Color(245, 245, 245));
        Ventas_tbl_ventas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ventas_tbl_ventas.setForeground(new java.awt.Color(51, 51, 51));
        Ventas_tbl_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Total", "Usuario"
            }
        ));
        Ventas_tbl_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas_tbl_ventas.setGridColor(new java.awt.Color(180, 180, 180));
        Ventas_tbl_ventas.setShowGrid(true);
        Ventas_tbl_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ventas_tbl_ventasMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(Ventas_tbl_ventas);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Ventas");

        jLabel35.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("ID");

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Total");

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 30, 5));

        Ventas_txt_id.setEditable(false);
        Ventas_txt_id.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Ventas_txt_id.setToolTipText("");
        jPanel6.add(Ventas_txt_id);

        Ventas_txt_total.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Ventas_txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Ventas_txt_totalKeyTyped(evt);
            }
        });
        jPanel6.add(Ventas_txt_total);

        jPanel7.setBackground(new java.awt.Color(245, 245, 245));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        Ventas_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        Ventas_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Ventas_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        Ventas_btn_editar.setText("Editar");
        Ventas_btn_editar.setBorder(null);
        Ventas_btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ventas_btn_editar.setRequestFocusEnabled(false);
        Ventas_btn_editar.setRolloverEnabled(false);
        Ventas_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventas_btn_editarActionPerformed(evt);
            }
        });
        jPanel7.add(Ventas_btn_editar);
        Ventas_btn_editar.setVisible(false);

        Ventas_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        Ventas_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Ventas_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Ventas_btn_cancelar.setText("Cancelar");
        Ventas_btn_cancelar.setBorder(null);
        Ventas_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ventas_btn_cancelar.setRequestFocusEnabled(false);
        Ventas_btn_cancelar.setRolloverEnabled(false);
        Ventas_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventas_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel7.add(Ventas_btn_cancelar);
        Ventas_btn_cancelar.setVisible(false);

        Ventas_tbl_detalla.setAutoCreateRowSorter(true);
        Ventas_tbl_detalla.setBackground(new java.awt.Color(245, 245, 245));
        Ventas_tbl_detalla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ventas_tbl_detalla.setForeground(new java.awt.Color(51, 51, 51));
        Ventas_tbl_detalla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDProducto", "IDVenta", "Cantidad", "Precio U/u", "Suptotal"
            }
        ));
        Ventas_tbl_detalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ventas_tbl_detalla.setEnabled(false);
        Ventas_tbl_detalla.setGridColor(new java.awt.Color(180, 180, 180));
        Ventas_tbl_detalla.setShowGrid(true);
        jScrollPane17.setViewportView(Ventas_tbl_detalla);

        javax.swing.GroupLayout Ventas_PnlLayout = new javax.swing.GroupLayout(Ventas_Pnl);
        Ventas_Pnl.setLayout(Ventas_PnlLayout);
        Ventas_PnlLayout.setHorizontalGroup(
            Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas_PnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ventas_PnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Ventas_PnlLayout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Ventas_PnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17)))
                        .addGap(14, 14, 14))
                    .addGroup(Ventas_PnlLayout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel36)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Ventas_PnlLayout.setVerticalGroup(
            Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventas_PnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ventas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnls.addTab("tab1", Ventas_Pnl);

        NewVenta_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        NewVenta_tbl.setAutoCreateRowSorter(true);
        NewVenta_tbl.setBackground(new java.awt.Color(245, 245, 245));
        NewVenta_tbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NewVenta_tbl.setForeground(new java.awt.Color(51, 51, 51));
        NewVenta_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "ID Venta", "Cantidad", "Precio U/u", "Suptotal"
            }
        ));
        NewVenta_tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_tbl.setGridColor(new java.awt.Color(180, 180, 180));
        NewVenta_tbl.setShowGrid(true);
        NewVenta_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewVenta_tblMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(NewVenta_tbl);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("New Venta");

        jLabel39.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("ID Producto");

        jLabel40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Cantidad:");

        jPanel9.setBackground(new java.awt.Color(245, 245, 245));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        NewVenta_btn_eliminar.setBackground(new java.awt.Color(255, 107, 107));
        NewVenta_btn_eliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewVenta_btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        NewVenta_btn_eliminar.setText("Eliminar");
        NewVenta_btn_eliminar.setBorder(null);
        NewVenta_btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewVenta_btn_eliminar.setRequestFocusEnabled(false);
        NewVenta_btn_eliminar.setRolloverEnabled(false);
        txtvacio.setVisible(false);
        NewVenta_btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_btn_eliminarActionPerformed(evt);
            }
        });
        jPanel9.add(NewVenta_btn_eliminar);
        NewVenta_btn_eliminar.setVisible(false);

        NewVenta_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        NewVenta_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewVenta_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        NewVenta_btn_editar.setText("Editar");
        NewVenta_btn_editar.setBorder(null);
        NewVenta_btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewVenta_btn_editar.setRequestFocusEnabled(false);
        NewVenta_btn_editar.setRolloverEnabled(false);
        txtvacio.setVisible(false);
        NewVenta_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_btn_editarActionPerformed(evt);
            }
        });
        jPanel9.add(NewVenta_btn_editar);
        NewVenta_btn_editar.setVisible(false);

        NewVenta_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        NewVenta_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewVenta_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        NewVenta_btn_cancelar.setText("Cancelar");
        NewVenta_btn_cancelar.setBorder(null);
        NewVenta_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewVenta_btn_cancelar.setRequestFocusEnabled(false);
        NewVenta_btn_cancelar.setRolloverEnabled(false);
        txtvacio.setVisible(false);
        NewVenta_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel9.add(NewVenta_btn_cancelar);
        NewVenta_btn_cancelar.setVisible(false);

        NewVenta_btn_agregar.setBackground(new java.awt.Color(129, 199, 132));
        NewVenta_btn_agregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewVenta_btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        NewVenta_btn_agregar.setText("Agregar");
        NewVenta_btn_agregar.setBorder(null);
        NewVenta_btn_agregar.setBorderPainted(false);
        NewVenta_btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewVenta_btn_agregar.setRequestFocusEnabled(false);
        NewVenta_btn_agregar.setRolloverEnabled(false);
        NewVenta_btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_btn_agregarActionPerformed(evt);
            }
        });
        jPanel9.add(NewVenta_btn_agregar);
        NewVenta_btn_agregar.setVisible(false);

        NewVenta_txt_cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        NewVenta_txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NewVenta_txt_cantidadKeyTyped(evt);
            }
        });

        jLabel2.setText("Cantidad Disponible:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Total de la venta:");

        jLabel20.setText("Precio");

        NewVenta_btn_TerVenta.setBackground(new java.awt.Color(77, 150, 255));
        NewVenta_btn_TerVenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewVenta_btn_TerVenta.setForeground(new java.awt.Color(255, 255, 255));
        NewVenta_btn_TerVenta.setText("Terminar Venta");
        NewVenta_btn_TerVenta.setBorder(null);
        NewVenta_btn_TerVenta.setBorderPainted(false);
        NewVenta_btn_TerVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn_TerVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewVenta_btn_TerVenta.setRequestFocusEnabled(false);
        NewVenta_btn_TerVenta.setRolloverEnabled(false);
        txtvacio.setVisible(false);
        NewVenta_btn_TerVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_btn_TerVentaActionPerformed(evt);
            }
        });
        NewVenta_btn_TerVenta.setVisible(false);

        NewVenta_btn_IniVenta.setBackground(new java.awt.Color(129, 199, 132));
        NewVenta_btn_IniVenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewVenta_btn_IniVenta.setForeground(new java.awt.Color(255, 255, 255));
        NewVenta_btn_IniVenta.setText("Iniciar Venta");
        NewVenta_btn_IniVenta.setBorder(null);
        NewVenta_btn_IniVenta.setBorderPainted(false);
        NewVenta_btn_IniVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVenta_btn_IniVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewVenta_btn_IniVenta.setRequestFocusEnabled(false);
        NewVenta_btn_IniVenta.setRolloverEnabled(false);
        NewVenta_btn_IniVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_btn_IniVentaActionPerformed(evt);
            }
        });

        NewVenta_txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVenta_txt_idActionPerformed(evt);
            }
        });

        NewVenta_txt_precio.setEditable(false);
        NewVenta_txt_precio.setEnabled(false);

        NewVenta_txt_nombre.setEditable(false);
        NewVenta_txt_nombre.setEnabled(false);

        NewVenta_txt_cantidadDispo.setEditable(false);

        NewVenta_txt_total.setEditable(false);
        NewVenta_txt_total.setEnabled(false);

        javax.swing.GroupLayout NewVenta_PnlLayout = new javax.swing.GroupLayout(NewVenta_Pnl);
        NewVenta_Pnl.setLayout(NewVenta_PnlLayout);
        NewVenta_PnlLayout.setHorizontalGroup(
            NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewVenta_PnlLayout.createSequentialGroup()
                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NewVenta_txt_id, 0, 245, Short.MAX_VALUE)
                                    .addComponent(NewVenta_txt_nombre))
                                .addGap(19, 19, 19)
                                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NewVenta_txt_precio)
                                    .addComponent(NewVenta_txt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(NewVenta_txt_total))
                                    .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NewVenta_txt_cantidadDispo))))
                            .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewVenta_btn_TerVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NewVenta_btn_IniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        NewVenta_PnlLayout.setVerticalGroup(
            NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewVenta_PnlLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewVenta_btn_TerVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewVenta_btn_IniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(NewVenta_txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewVenta_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewVenta_txt_cantidadDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(NewVenta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(NewVenta_txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewVenta_txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewVenta_txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnls.addTab("tab1", NewVenta_Pnl);

        Compras_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        Compras_tbl_compras.setAutoCreateRowSorter(true);
        Compras_tbl_compras.setBackground(new java.awt.Color(245, 245, 245));
        Compras_tbl_compras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Compras_tbl_compras.setForeground(new java.awt.Color(51, 51, 51));
        Compras_tbl_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Total", "Usuario"
            }
        ));
        Compras_tbl_compras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Compras_tbl_compras.setGridColor(new java.awt.Color(180, 180, 180));
        Compras_tbl_compras.setShowGrid(true);
        Compras_tbl_compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Compras_tbl_comprasMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(Compras_tbl_compras);

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Compras");

        jLabel37.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("ID");

        jLabel38.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Total");

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0, 30, 5));

        Compras_txt_id.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Compras_txt_id.setToolTipText("");
        Compras_txt_id.setEnabled(false);
        jPanel8.add(Compras_txt_id);

        Compras_txt_total.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Compras_txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Compras_txt_totalKeyTyped(evt);
            }
        });
        jPanel8.add(Compras_txt_total);

        jPanel20.setBackground(new java.awt.Color(245, 245, 245));
        jPanel20.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        Compras_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        Compras_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Compras_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        Compras_btn_editar.setText("Editar");
        Compras_btn_editar.setBorder(null);
        Compras_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Compras_btn_editar.setRequestFocusEnabled(false);
        Compras_btn_editar.setRolloverEnabled(false);
        Compras_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compras_btn_editarActionPerformed(evt);
            }
        });
        jPanel20.add(Compras_btn_editar);
        Compras_btn_editar.setVisible(false);

        Compras_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        Compras_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Compras_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Compras_btn_cancelar.setText("Cancelar");
        Compras_btn_cancelar.setBorder(null);
        Compras_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Compras_btn_cancelar.setRequestFocusEnabled(false);
        Compras_btn_cancelar.setRolloverEnabled(false);
        Compras_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compras_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel20.add(Compras_btn_cancelar);
        Compras_btn_cancelar.setVisible(false);

        Compras_tbl_detalla.setAutoCreateRowSorter(true);
        Compras_tbl_detalla.setBackground(new java.awt.Color(245, 245, 245));
        Compras_tbl_detalla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Compras_tbl_detalla.setForeground(new java.awt.Color(51, 51, 51));
        Compras_tbl_detalla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDProducto", "IDCompra", "Cantidad", "Costo U/u", "Suptotal"
            }
        ));
        Compras_tbl_detalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Compras_tbl_detalla.setEnabled(false);
        Compras_tbl_detalla.setGridColor(new java.awt.Color(180, 180, 180));
        Compras_tbl_detalla.setShowGrid(true);
        jScrollPane19.setViewportView(Compras_tbl_detalla);

        javax.swing.GroupLayout Compras_PnlLayout = new javax.swing.GroupLayout(Compras_Pnl);
        Compras_Pnl.setLayout(Compras_PnlLayout);
        Compras_PnlLayout.setHorizontalGroup(
            Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Compras_PnlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Compras_PnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Compras_PnlLayout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Compras_PnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane19)))
                        .addGap(14, 14, 14))
                    .addGroup(Compras_PnlLayout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel38)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Compras_PnlLayout.setVerticalGroup(
            Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Compras_PnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Compras_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnls.addTab("tab1", Compras_Pnl);

        NewCompra_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        NewCompra_tbl.setAutoCreateRowSorter(true);
        NewCompra_tbl.setBackground(new java.awt.Color(245, 245, 245));
        NewCompra_tbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NewCompra_tbl.setForeground(new java.awt.Color(51, 51, 51));
        NewCompra_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "ID Compra", "Cantidad", "Costo U/u", "Suptotal"
            }
        ));
        NewCompra_tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_tbl.setGridColor(new java.awt.Color(180, 180, 180));
        NewCompra_tbl.setShowGrid(true);
        NewCompra_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewCompra_tblMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(NewCompra_tbl);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("New Compra");

        jLabel41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("ID Producto");

        jLabel42.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Cantidad:");

        jPanel10.setBackground(new java.awt.Color(245, 245, 245));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        NewCompra_btn_eliminar.setBackground(new java.awt.Color(255, 107, 107));
        NewCompra_btn_eliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewCompra_btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        NewCompra_btn_eliminar.setText("Eliminar");
        NewCompra_btn_eliminar.setBorder(null);
        NewCompra_btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewCompra_btn_eliminar.setRequestFocusEnabled(false);
        NewCompra_btn_eliminar.setRolloverEnabled(false);
        NewCompra_btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_btn_eliminarActionPerformed(evt);
            }
        });
        jPanel10.add(NewCompra_btn_eliminar);
        NewCompra_btn_eliminar.setVisible(false);

        NewCompra_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        NewCompra_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewCompra_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        NewCompra_btn_editar.setText("Editar");
        NewCompra_btn_editar.setBorder(null);
        NewCompra_btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewCompra_btn_editar.setRequestFocusEnabled(false);
        NewCompra_btn_editar.setRolloverEnabled(false);
        NewCompra_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_btn_editarActionPerformed(evt);
            }
        });
        jPanel10.add(NewCompra_btn_editar);
        NewCompra_btn_editar.setVisible(false);

        NewCompra_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        NewCompra_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewCompra_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        NewCompra_btn_cancelar.setText("Cancelar");
        NewCompra_btn_cancelar.setBorder(null);
        NewCompra_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewCompra_btn_cancelar.setRequestFocusEnabled(false);
        NewCompra_btn_cancelar.setRolloverEnabled(false);
        NewCompra_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel10.add(NewCompra_btn_cancelar);
        NewCompra_btn_cancelar.setVisible(false);

        NewCompra_btn_agregar.setBackground(new java.awt.Color(129, 199, 132));
        NewCompra_btn_agregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewCompra_btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        NewCompra_btn_agregar.setText("Agregar");
        NewCompra_btn_agregar.setBorder(null);
        NewCompra_btn_agregar.setBorderPainted(false);
        NewCompra_btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewCompra_btn_agregar.setRequestFocusEnabled(false);
        NewCompra_btn_agregar.setRolloverEnabled(false);
        NewCompra_btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_btn_agregarActionPerformed(evt);
            }
        });
        jPanel10.add(NewCompra_btn_agregar);
        NewCompra_btn_agregar.setVisible(false);

        NewCompra_txt_Cantidad.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        NewCompra_txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NewCompra_txt_CantidadKeyTyped(evt);
            }
        });

        jLabel23.setText("Nombre:");

        jLabel24.setText("Total:");

        jLabel43.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Costo ");

        NewCompra_txt_Costo.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        NewCompra_txt_Costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NewCompra_txt_CostoKeyTyped(evt);
            }
        });

        NewCompra_txt_nombre.setEditable(false);
        NewCompra_txt_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        NewCompra_txt_nombre.setEnabled(false);

        NewCompra_txt_total.setEditable(false);
        NewCompra_txt_total.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        NewCompra_txt_total.setEnabled(false);

        NewCompra_btn_TerVenta.setBackground(new java.awt.Color(77, 150, 255));
        NewCompra_btn_TerVenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewCompra_btn_TerVenta.setForeground(new java.awt.Color(255, 255, 255));
        NewCompra_btn_TerVenta.setText("Terminar Compra");
        NewCompra_btn_TerVenta.setBorder(null);
        NewCompra_btn_TerVenta.setBorderPainted(false);
        NewCompra_btn_TerVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn_TerVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewCompra_btn_TerVenta.setRequestFocusEnabled(false);
        NewCompra_btn_TerVenta.setRolloverEnabled(false);
        txtvacio.setVisible(false);
        NewCompra_btn_TerVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_btn_TerVentaActionPerformed(evt);
            }
        });

        NewCompra_btn_IniVenta.setBackground(new java.awt.Color(129, 199, 132));
        NewCompra_btn_IniVenta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NewCompra_btn_IniVenta.setForeground(new java.awt.Color(255, 255, 255));
        NewCompra_btn_IniVenta.setText("Iniciar Compra");
        NewCompra_btn_IniVenta.setBorder(null);
        NewCompra_btn_IniVenta.setBorderPainted(false);
        NewCompra_btn_IniVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewCompra_btn_IniVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewCompra_btn_IniVenta.setRequestFocusEnabled(false);
        NewCompra_btn_IniVenta.setRolloverEnabled(false);
        NewCompra_btn_IniVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_btn_IniVentaActionPerformed(evt);
            }
        });

        NewCompra_txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCompra_txt_idActionPerformed(evt);
            }
        });

        jLabel33.setText("Stock:");

        NewCompra_txt_cantidadDispo.setEditable(false);
        NewCompra_txt_cantidadDispo.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        NewCompra_txt_cantidadDispo.setEnabled(false);

        javax.swing.GroupLayout NewCompra_PnlLayout = new javax.swing.GroupLayout(NewCompra_Pnl);
        NewCompra_Pnl.setLayout(NewCompra_PnlLayout);
        NewCompra_PnlLayout.setHorizontalGroup(
            NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewCompra_PnlLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                        .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NewCompra_txt_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(NewCompra_txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewCompra_PnlLayout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(18, 18, 18)
                                        .addComponent(NewCompra_txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NewCompra_txt_cantidadDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NewCompra_txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewCompra_txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewCompra_PnlLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewCompra_btn_TerVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NewCompra_btn_IniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        NewCompra_PnlLayout.setVerticalGroup(
            NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewCompra_PnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewCompra_PnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewCompra_btn_IniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewCompra_btn_TerVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(NewCompra_txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(NewCompra_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(NewCompra_txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewCompra_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(NewCompra_txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewCompra_txt_cantidadDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewCompra_txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NewCompra_btn_TerVenta.setVisible(false);

        pnls.addTab("tab1", NewCompra_Pnl);

        Finanzas_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        Finanzas_tbl_c.setAutoCreateRowSorter(true);
        Finanzas_tbl_c.setBackground(new java.awt.Color(245, 245, 245));
        Finanzas_tbl_c.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Finanzas_tbl_c.setForeground(new java.awt.Color(51, 51, 51));
        Finanzas_tbl_c.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Total", "Usuario"
            }
        ));
        Finanzas_tbl_c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Finanzas_tbl_c.setEnabled(false);
        Finanzas_tbl_c.setGridColor(new java.awt.Color(180, 180, 180));
        Finanzas_tbl_c.setShowGrid(true);
        Finanzas_tbl_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Finanzas_tbl_cMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(Finanzas_tbl_c);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Finanzas");

        jLabel52.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Fecha inicial");

        jLabel51.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Fecha final ");

        jPanel15.setBackground(new java.awt.Color(245, 245, 245));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        Finanzas_fecha_ini.setDateFormatString("yyyy-MM-dd");
        jPanel15.add(Finanzas_fecha_ini);

        Finanzas_fecha_fin.setDateFormatString("yyyy-MM-dd");
        jPanel15.add(Finanzas_fecha_fin);

        jPanel16.setBackground(new java.awt.Color(245, 245, 245));
        jPanel16.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        Finanzas_btn_buscar.setBackground(new java.awt.Color(129, 199, 132));
        Finanzas_btn_buscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Finanzas_btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        Finanzas_btn_buscar.setText("Buscar");
        Finanzas_btn_buscar.setBorder(null);
        Finanzas_btn_buscar.setBorderPainted(false);
        Finanzas_btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Finanzas_btn_buscar.setRequestFocusEnabled(false);
        Finanzas_btn_buscar.setRolloverEnabled(false);
        Finanzas_btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finanzas_btn_buscarActionPerformed(evt);
            }
        });
        jPanel16.add(Finanzas_btn_buscar);

        Finanzas_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        Finanzas_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Finanzas_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Finanzas_btn_cancelar.setText("Cancelar");
        Finanzas_btn_cancelar.setBorder(null);
        Finanzas_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Finanzas_btn_cancelar.setRequestFocusEnabled(false);
        Finanzas_btn_cancelar.setRolloverEnabled(false);
        Finanzas_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finanzas_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel16.add(Finanzas_btn_cancelar);
        Finanzas_btn_cancelar.setVisible(false);

        Finanzas_tbl_v.setAutoCreateRowSorter(true);
        Finanzas_tbl_v.setBackground(new java.awt.Color(245, 245, 245));
        Finanzas_tbl_v.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Finanzas_tbl_v.setForeground(new java.awt.Color(51, 51, 51));
        Finanzas_tbl_v.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Total", "Usuario"
            }
        ));
        Finanzas_tbl_v.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Finanzas_tbl_v.setEnabled(false);
        Finanzas_tbl_v.setGridColor(new java.awt.Color(180, 180, 180));
        Finanzas_tbl_v.setShowGrid(true);
        Finanzas_tbl_v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Finanzas_tbl_vMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(Finanzas_tbl_v);

        Finanzas_ingresos.setEditable(false);
        Finanzas_ingresos.setBackground(new java.awt.Color(245, 245, 245));
        Finanzas_ingresos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Finanzas_ingresos.setEnabled(false);

        jLabel53.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Ingresos:");

        jLabel54.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Costo:");

        Finanzas_btn_pdf.setBackground(new java.awt.Color(77, 150, 255));
        Finanzas_btn_pdf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Finanzas_btn_pdf.setForeground(new java.awt.Color(255, 255, 255));
        Finanzas_btn_pdf.setText("Generar PDF");
        Finanzas_btn_pdf.setBorder(null);
        Finanzas_btn_pdf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Finanzas_btn_pdf.setRequestFocusEnabled(false);
        Finanzas_btn_pdf.setRolloverEnabled(false);
        Finanzas_btn_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finanzas_btn_pdfActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Ganancias:");

        Finanzas_ganancias.setEditable(false);
        Finanzas_ganancias.setBackground(new java.awt.Color(245, 245, 245));
        Finanzas_ganancias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Finanzas_ganancias.setEnabled(false);

        jLabel63.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 51, 51));
        jLabel63.setText("Ingresos:");

        jLabel64.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("Costo::");

        Finanzas_gastos.setEditable(false);
        Finanzas_gastos.setBackground(new java.awt.Color(245, 245, 245));
        Finanzas_gastos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Finanzas_gastos.setEnabled(false);

        javax.swing.GroupLayout Finanzas_PnlLayout = new javax.swing.GroupLayout(Finanzas_Pnl);
        Finanzas_Pnl.setLayout(Finanzas_PnlLayout);
        Finanzas_PnlLayout.setHorizontalGroup(
            Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Finanzas_PnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Finanzas_PnlLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Finanzas_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Finanzas_gastos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Finanzas_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Finanzas_btn_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Finanzas_PnlLayout.createSequentialGroup()
                        .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Finanzas_PnlLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Finanzas_PnlLayout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(207, 207, 207)
                                        .addComponent(jLabel51))
                                    .addGroup(Finanzas_PnlLayout.createSequentialGroup()
                                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Finanzas_PnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Finanzas_PnlLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(485, 485, 485)
                                .addComponent(jLabel54)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        Finanzas_PnlLayout.setVerticalGroup(
            Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Finanzas_PnlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Finanzas_PnlLayout.createSequentialGroup()
                        .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Finanzas_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Finanzas_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Finanzas_btn_pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Finanzas_ganancias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Finanzas_gastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Finanzas_btn_pdf.setVisible(false);

        pnls.addTab("tab1", Finanzas_Pnl);

        Usuarios_Pnl.setBackground(new java.awt.Color(245, 245, 245));

        Usuarios_tbl.setAutoCreateRowSorter(true);
        Usuarios_tbl.setBackground(new java.awt.Color(245, 245, 245));
        Usuarios_tbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Usuarios_tbl.setForeground(new java.awt.Color(51, 51, 51));
        Usuarios_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Contraseña", "Rol"
            }
        ));
        Usuarios_tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_tbl.setGridColor(new java.awt.Color(180, 180, 180));
        Usuarios_tbl.setShowGrid(true);
        Usuarios_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Usuarios_tblMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(Usuarios_tbl);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Usuarios");

        jLabel55.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("ID");

        jLabel56.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Nombre:");

        jLabel57.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Contraseña:");

        jLabel58.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Rol:");

        jPanel17.setBackground(new java.awt.Color(245, 245, 245));
        jPanel17.setLayout(new java.awt.GridLayout(1, 0, 30, 5));

        Usuarios_txt_id.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        Usuarios_txt_id.setToolTipText("");
        jPanel17.add(Usuarios_txt_id);

        Usuarios_txt_nombre.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jPanel17.add(Usuarios_txt_nombre);

        Usuarios_txt_contra.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jPanel17.add(Usuarios_txt_contra);

        Usuarios_txt_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor" }));
        jPanel17.add(Usuarios_txt_rol);

        jPanel18.setBackground(new java.awt.Color(245, 245, 245));
        jPanel18.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        Usuarios_btn_eliminar.setBackground(new java.awt.Color(255, 107, 107));
        Usuarios_btn_eliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Usuarios_btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios_btn_eliminar.setText("Eliminar");
        Usuarios_btn_eliminar.setBorder(null);
        Usuarios_btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Usuarios_btn_eliminar.setRequestFocusEnabled(false);
        Usuarios_btn_eliminar.setRolloverEnabled(false);
        Usuarios_btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_btn_eliminarActionPerformed(evt);
            }
        });
        jPanel18.add(Usuarios_btn_eliminar);
        Usuarios_btn_eliminar.setVisible(false);

        Usuarios_btn_editar.setBackground(new java.awt.Color(77, 150, 255));
        Usuarios_btn_editar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Usuarios_btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios_btn_editar.setText("Editar");
        Usuarios_btn_editar.setBorder(null);
        Usuarios_btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Usuarios_btn_editar.setRequestFocusEnabled(false);
        Usuarios_btn_editar.setRolloverEnabled(false);
        Usuarios_btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_btn_editarActionPerformed(evt);
            }
        });
        jPanel18.add(Usuarios_btn_editar);
        Usuarios_btn_editar.setVisible(false);

        Usuarios_btn_cancelar.setBackground(new java.awt.Color(166, 166, 166));
        Usuarios_btn_cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Usuarios_btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios_btn_cancelar.setText("Cancelar");
        Usuarios_btn_cancelar.setBorder(null);
        Usuarios_btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_btn_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Usuarios_btn_cancelar.setRequestFocusEnabled(false);
        Usuarios_btn_cancelar.setRolloverEnabled(false);
        Usuarios_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_btn_cancelarActionPerformed(evt);
            }
        });
        jPanel18.add(Usuarios_btn_cancelar);
        Usuarios_btn_cancelar.setVisible(false);

        Usuarios_btn_agregar.setBackground(new java.awt.Color(129, 199, 132));
        Usuarios_btn_agregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Usuarios_btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios_btn_agregar.setText("Agregar");
        Usuarios_btn_agregar.setBorder(null);
        Usuarios_btn_agregar.setBorderPainted(false);
        Usuarios_btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Usuarios_btn_agregar.setRequestFocusEnabled(false);
        Usuarios_btn_agregar.setRolloverEnabled(false);
        Usuarios_btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_btn_agregarActionPerformed(evt);
            }
        });
        jPanel18.add(Usuarios_btn_agregar);

        javax.swing.GroupLayout Usuarios_PnlLayout = new javax.swing.GroupLayout(Usuarios_Pnl);
        Usuarios_Pnl.setLayout(Usuarios_PnlLayout);
        Usuarios_PnlLayout.setHorizontalGroup(
            Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Usuarios_PnlLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Usuarios_PnlLayout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel56)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel57)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel58)
                        .addContainerGap(225, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuarios_PnlLayout.createSequentialGroup()
                        .addGroup(Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Usuarios_PnlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(14, 14, 14))))
        );
        Usuarios_PnlLayout.setVerticalGroup(
            Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Usuarios_PnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Usuarios_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnls.addTab("tab1", Usuarios_Pnl);

        jPanel1.add(pnls, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 1100, 580));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Proveedores_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedores_tblMouseClicked
        if (!rol.equals("Vendedor")) {
            try {
                JTextField[] campos = {Proveedores_txt_id, Proveedores_txt_nombre, Proveedores_txt_telefono, Proveedores_txt_descripcion};
                insProveedor.llenarCamposDesdeTabla(Proveedores_tbl, campos);

                JComponent[] componentes1 = {Proveedores_btn_cancelar, Proveedores_btn_editar, Proveedores_btn_eliminar};
                insUsuarios.setVisibility(componentes1, true);

                JComponent[] componentes2 = {Proveedores_btn_agregar};
                insUsuarios.setVisibility(componentes2, false);

                JComponent[] componentesE = {Proveedores_txt_id};
                insUsuarios.setEnabled(componentesE, false);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_Proveedores_tblMouseClicked

    private void Proveedores_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedores_btnMouseClicked
        pnls.setSelectedIndex(0);
        mostarTablas();
        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {Proveedores_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_Proveedores_btnMouseClicked

    private void Proveedores_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedores_btnMouseEntered
        Proveedores_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_Proveedores_btnMouseEntered

    private void Proveedores_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedores_btnMouseExited
        Proveedores_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_Proveedores_btnMouseExited

    private void Productos_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productos_btnMouseClicked
        pnls.setSelectedIndex(1);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {Productos_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_Productos_btnMouseClicked

    private void Productos_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productos_btnMouseEntered
        Productos_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_Productos_btnMouseEntered

    private void Productos_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productos_btnMouseExited
        Productos_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_Productos_btnMouseExited

    private void Ventas_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ventas_btnMouseClicked
        pnls.setSelectedIndex(2);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {Ventas_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_Ventas_btnMouseClicked

    private void Ventas_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ventas_btnMouseEntered
        Ventas_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_Ventas_btnMouseEntered

    private void Ventas_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ventas_btnMouseExited
        Ventas_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_Ventas_btnMouseExited

    private void NewVenta_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewVenta_btnMouseClicked
        pnls.setSelectedIndex(3);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {NewVenta_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_NewVenta_btnMouseClicked

    private void NewVenta_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewVenta_btnMouseEntered
        NewVenta_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_NewVenta_btnMouseEntered

    private void NewVenta_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewVenta_btnMouseExited
        NewVenta_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_NewVenta_btnMouseExited

    private void Compras_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Compras_btnMouseClicked
        pnls.setSelectedIndex(4);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {Compras_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_Compras_btnMouseClicked

    private void Compras_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Compras_btnMouseEntered
        Compras_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_Compras_btnMouseEntered

    private void Compras_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Compras_btnMouseExited
        Compras_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_Compras_btnMouseExited

    private void NewCompra_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCompra_btnMouseClicked
        pnls.setSelectedIndex(5);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {NewCompra_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_NewCompra_btnMouseClicked

    private void NewCompra_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCompra_btnMouseEntered
        NewCompra_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_NewCompra_btnMouseEntered

    private void NewCompra_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCompra_btnMouseExited
        NewCompra_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_NewCompra_btnMouseExited

    private void Finanzas_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Finanzas_btnMouseClicked
        pnls.setSelectedIndex(6);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {Finanzas_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_Finanzas_btnMouseClicked

    private void Finanzas_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Finanzas_btnMouseEntered
        Finanzas_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_Finanzas_btnMouseEntered

    private void Finanzas_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Finanzas_btnMouseExited
        Finanzas_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_Finanzas_btnMouseExited

    private void Usuarios_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuarios_btnMouseClicked
        pnls.setSelectedIndex(7);
        mostarTablas();

        JComponent[] componente = {Proveedores_btn, Productos_btn, Ventas_btn, NewVenta_btn, Compras_btn, NewCompra_btn, Finanzas_btn, Usuarios_btn};
        revertirColorPaneles(componente);

        JComponent[] componenteR = {Usuarios_btn};
        restablecerColorPaneles(componenteR);
    }//GEN-LAST:event_Usuarios_btnMouseClicked

    private void Usuarios_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuarios_btnMouseEntered
        Usuarios_btn_lbl.setForeground(new Color(0, 209, 178));
    }//GEN-LAST:event_Usuarios_btnMouseEntered

    private void Usuarios_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuarios_btnMouseExited
        Usuarios_btn_lbl.setForeground(new Color(224, 224, 224));
    }//GEN-LAST:event_Usuarios_btnMouseExited

    private void Proveedores_btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedores_btn_agregarActionPerformed
        try {
            JTextField[] campos = {Proveedores_txt_id, Proveedores_txt_nombre, Proveedores_txt_telefono, Proveedores_txt_descripcion};
            Object[] parametros = {Proveedores_txt_id.getText().trim(), Proveedores_txt_nombre.getText().trim(), Proveedores_txt_telefono.getText().trim(), Proveedores_txt_descripcion.getText().trim()};
            insProveedor.insertarRegistro(Proveedores_tbl, parametros, campos);

            insProveedor.mostrarTabla(Proveedores_tbl);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Proveedores_btn_agregarActionPerformed

    private void Productos_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Productos_tblMouseClicked
        if (!rol.equals("Vendedor")) {
            try {
                JComponent[] campos = {Productos_txt_id, Productos_txt_nombre, Productos_txt_descripcion, Productos_txt_cantidad, Productos_txt_precio, Productos_cbb_idproveedor};
                insProducto.llenarCamposDesdeTabla(Productos_tbl, campos);

                JComponent[] componentes1 = {Productos_btn_cancelar, Productos_btn_editar, Productos_btn_eliminar};
                insUsuarios.setVisibility(componentes1, true);

                JComponent[] componentes2 = {Productos_btn_agregar};
                insUsuarios.setVisibility(componentes2, false);

                JComponent[] componentesE = {Productos_txt_id};
                insUsuarios.setEnabled(componentesE, false);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_Productos_tblMouseClicked

    private void Productos_btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_btn_agregarActionPerformed
        try {
            JComponent[] campos = {Productos_txt_id, Productos_txt_nombre, Productos_txt_descripcion, Productos_txt_cantidad, Productos_txt_precio, Productos_cbb_idproveedor};
            Object[] parametros = {Productos_txt_id.getText().trim(), Productos_txt_nombre.getText().trim(), Productos_txt_descripcion.getText().trim(), Productos_txt_cantidad.getText().trim(), Productos_txt_precio.getText().trim(), Productos_cbb_idproveedor.getSelectedItem().toString().trim()};
            insProducto.insertarRegistro(Productos_tbl, parametros, campos);

            insProducto.mostrarTabla(Productos_tbl);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Productos_btn_agregarActionPerformed

    private void Ventas_tbl_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ventas_tbl_ventasMouseClicked
        if (!rol.equals("Vendedor")) {
            try {
                int filaSeleccionada = Ventas_tbl_ventas.getSelectedRow();
                Object id = Ventas_tbl_ventas.getValueAt(filaSeleccionada, 0).toString();
                insVentas.mostrarTablaDetalle(Ventas_tbl_detalla, id);

                insVentas.llenarCamposDesdeTabla(Ventas_tbl_ventas, Ventas_txt_id, Ventas_txt_total);

                JComponent[] componentes1 = {Ventas_btn_cancelar, Ventas_btn_editar};
                insUsuarios.setVisibility(componentes1, true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_Ventas_tbl_ventasMouseClicked

    private void NewVenta_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewVenta_tblMouseClicked
        try {
            insNewVenta.llenarCamposDesdeTabla(NewVenta_tbl, NewVenta_txt_id, NewVenta_txt_cantidad);

            JComponent[] componentes = {NewVenta_btn_editar, NewVenta_btn_eliminar, NewVenta_btn_cancelar};
            insProveedor.setVisibility(componentes, true);

            JComponent[] componentesT = {NewVenta_btn_agregar};
            insUsuarios.setVisibility(componentesT, false);

            JComponent[] componentesE = {NewVenta_txt_id};
            insUsuarios.setEnabled(componentesE, false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewVenta_tblMouseClicked

    private void NewVenta_btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_btn_agregarActionPerformed
        try {
            float precio = Float.parseFloat(NewVenta_txt_precio.getText().trim());
            int cantidad = Integer.parseInt(NewVenta_txt_cantidad.getText().trim());
            float supTotal = precio * cantidad;

            String idProducto = NewVenta_txt_id.getSelectedItem().toString().trim();
            int idVenta = insNewVenta.obtenerMaxId();

            Object[] parametros = {idProducto, idVenta, cantidad, precio, supTotal};
            JComponent[] campos = {NewVenta_txt_id, NewVenta_txt_cantidad};

            insNewVenta.insertarRegistro(NewVenta_tbl, parametros, campos);
            actualizarCamposVenta();
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewVenta_btn_agregarActionPerformed

    private void Finanzas_tbl_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Finanzas_tbl_cMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Finanzas_tbl_cMouseClicked

    private void Finanzas_btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finanzas_btn_buscarActionPerformed
        try {
            String fechaInicio = null;
            String fechaFin = null;
            Date fechaSeleccionadaInicio = Finanzas_fecha_ini.getDate();
            Date fechaSeleccionadaFin = Finanzas_fecha_fin.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

            if (fechaSeleccionadaInicio != null && fechaSeleccionadaFin != null) {
                fechaInicio = formato.format(fechaSeleccionadaInicio)+ " 00:00:00";
                fechaFin = formato.format(fechaSeleccionadaFin) + " 23:59:59";
                System.out.println(fechaInicio);
                System.out.println(fechaFin);

                insFinanzas.mostrarTablaVentas(Finanzas_tbl_v, fechaInicio, fechaFin);
                insFinanzas.mostrarTablaCompras(Finanzas_tbl_c, fechaInicio, fechaFin);

                String sumaTotalesVentas = insFinanzas.sumaTotalesVentas(fechaInicio, fechaFin).toString();
                String sumaTotalesCompras = insFinanzas.sumaTotalesCompras(fechaInicio, fechaFin).toString();
                String Ganancias = insFinanzas.calcularGanancias(fechaInicio, fechaFin).toString();
                Finanzas_gastos.setText(sumaTotalesCompras);
                Finanzas_ingresos.setText(sumaTotalesVentas);
                Finanzas_ganancias.setText(Ganancias);

                JComponent[] componentes1 = {Finanzas_btn_pdf, Finanzas_btn_cancelar};
                insUsuarios.setVisibility(componentes1, true);
            } else {
                JOptionPane.showMessageDialog(null, "Llene todos los Compos");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Finanzas_btn_buscarActionPerformed

    private void Usuarios_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Usuarios_tblMouseClicked
        JComponent[] campos = {Usuarios_txt_id, Usuarios_txt_nombre, Usuarios_txt_contra, Usuarios_txt_rol};
        insUsuarios.llenarCamposDesdeTabla(Usuarios_tbl, campos);

        JComponent[] componentesT = {Usuarios_btn_cancelar, Usuarios_btn_editar, Usuarios_btn_eliminar};
        insUsuarios.setVisibility(componentesT, true);

        JComponent[] componentesF = {Usuarios_btn_agregar};
        insUsuarios.setVisibility(componentesF, false);

        JComponent[] componentesE = {Usuarios_txt_id};
        insUsuarios.setEnabled(componentesE, false);
    }//GEN-LAST:event_Usuarios_tblMouseClicked

    private void Usuarios_btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_btn_agregarActionPerformed
        if (!rol.equals("Vendedor")) {
            try {
                JComponent[] campos = {Usuarios_txt_id, Usuarios_txt_nombre, Usuarios_txt_contra, Usuarios_txt_rol};
                Object[] parametros = {Usuarios_txt_id.getText().trim(), Usuarios_txt_nombre.getText().trim(), Usuarios_txt_contra.getText().trim(), Usuarios_txt_rol.getSelectedItem().toString().trim()};

                insUsuarios.insertarRegistro(Usuarios_tbl, parametros, campos);
                insUsuarios.mostrarTabla(Usuarios_tbl);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_Usuarios_btn_agregarActionPerformed

    private void Compras_tbl_comprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Compras_tbl_comprasMouseClicked
        if (!rol.equals("Vendedor")) {
            try {
                int filaSeleccionada = Compras_tbl_compras.getSelectedRow();
                Object id = Compras_tbl_compras.getValueAt(filaSeleccionada, 0).toString();
                insCompra.mostrarTablaDetalle(Compras_tbl_detalla, id);

                insCompra.llenarCamposDesdeTabla(Compras_tbl_compras, Compras_txt_id, Compras_txt_total);

                JComponent[] componentes1 = {Compras_btn_cancelar, Compras_btn_editar};
                insUsuarios.setVisibility(componentes1, true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_Compras_tbl_comprasMouseClicked

    private void NewCompra_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCompra_tblMouseClicked
        if (NewCompra_tbl.isEnabled()) {
            try {
                insNewCompras.llenarCamposDesdeTabla(NewCompra_tbl, NewCompra_txt_id, NewCompra_txt_Cantidad, NewCompra_txt_Costo);

                JComponent[] componentes = {NewCompra_btn_editar, NewCompra_btn_eliminar, NewCompra_btn_cancelar};
                insProveedor.setVisibility(componentes, true);

                JComponent[] componentesF = {NewCompra_btn_agregar};
                insUsuarios.setVisibility(componentesF, false);

                JComponent[] componentesE = {NewCompra_txt_id};
                insUsuarios.setEnabled(componentesE, false);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_NewCompra_tblMouseClicked

    private void NewCompra_btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_btn_agregarActionPerformed
        try {
            float precio = Float.parseFloat(NewCompra_txt_Costo.getText().trim());
            int cantidad = Integer.parseInt(NewCompra_txt_Cantidad.getText().trim());
            float supTotal = precio * cantidad;

            String idProducto = NewCompra_txt_id.getSelectedItem().toString().trim();
            int idVenta = insNewCompras.obtenerMaxId();

            Object[] parametros = {idProducto, idVenta, cantidad, precio, supTotal};
            JComponent[] campos = {NewCompra_txt_id, NewCompra_txt_Cantidad, NewCompra_txt_Costo};

            insNewCompras.insertarRegistro(NewCompra_tbl, parametros, campos);
            actualizarCamposCompra();
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewCompra_btn_agregarActionPerformed

    private void Proveedores_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedores_btn_cancelarActionPerformed
        try {
            JTextField[] campos = {Proveedores_txt_id, Proveedores_txt_nombre, Proveedores_txt_telefono, Proveedores_txt_descripcion};
            insProveedor.vaciarCampos(campos);

            JComponent[] componentes1 = {Proveedores_btn_cancelar, Proveedores_btn_editar, Proveedores_btn_eliminar};
            insUsuarios.setVisibility(componentes1, false);

            JComponent[] componentes2 = {Proveedores_btn_agregar};
            insUsuarios.setVisibility(componentes2, true);

            JComponent[] componentesE = {Proveedores_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Proveedores_btn_cancelarActionPerformed

    private void Proveedores_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedores_btn_editarActionPerformed
        try {
            JTextField[] campos = {Proveedores_txt_id, Proveedores_txt_nombre, Proveedores_txt_telefono, Proveedores_txt_descripcion};
            Object[] parametros = {Proveedores_txt_nombre.getText().trim(), Proveedores_txt_telefono.getText().trim(), Proveedores_txt_descripcion.getText().trim(), Proveedores_txt_id.getText().trim()};
            insProveedor.actualizarRegistro(parametros, Proveedores_tbl, campos);

            insProveedor.mostrarTabla(Proveedores_tbl);

            JComponent[] componentes1 = {Proveedores_btn_cancelar, Proveedores_btn_editar, Proveedores_btn_eliminar};
            insUsuarios.setVisibility(componentes1, false);

            JComponent[] componentes2 = {Proveedores_btn_agregar};
            insUsuarios.setVisibility(componentes2, true);

            JComponent[] componentesE = {Proveedores_txt_id};
            insUsuarios.setEnabled(componentesE, true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Proveedores_btn_editarActionPerformed

    private void Proveedores_btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedores_btn_eliminarActionPerformed
        try {
            JTextField[] campos = {Proveedores_txt_id, Proveedores_txt_nombre, Proveedores_txt_telefono, Proveedores_txt_descripcion};
            Object id = Proveedores_txt_id.getText().trim();
            insProveedor.eliminarRegistro(id, campos);

            insProveedor.mostrarTabla(Proveedores_tbl);

            JComponent[] componentes1 = {Proveedores_btn_cancelar, Proveedores_btn_editar, Proveedores_btn_eliminar};
            insUsuarios.setVisibility(componentes1, false);

            JComponent[] componentes2 = {Proveedores_btn_agregar};
            insUsuarios.setVisibility(componentes2, true);

            JComponent[] componentesE = {Proveedores_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Proveedores_btn_eliminarActionPerformed

    private void Productos_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_btn_cancelarActionPerformed
        try {
            JComponent[] campos = {Productos_txt_id, Productos_txt_nombre, Productos_txt_descripcion, Productos_txt_cantidad, Productos_txt_precio, Productos_cbb_idproveedor};
            insProducto.vaciarCampos(campos);

            JComponent[] componentes1 = {Productos_btn_cancelar, Productos_btn_editar, Productos_btn_eliminar};
            insUsuarios.setVisibility(componentes1, false);

            JComponent[] componentes2 = {Productos_btn_agregar};
            insUsuarios.setVisibility(componentes2, true);

            JComponent[] componentesE = {Productos_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Productos_btn_cancelarActionPerformed

    private void Productos_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_btn_editarActionPerformed
        try {
            JComponent[] campos = {Productos_txt_id, Productos_txt_nombre, Productos_txt_descripcion, Productos_txt_cantidad, Productos_txt_precio, Productos_cbb_idproveedor};
            Object[] parametros = {Productos_txt_nombre.getText().trim(), Productos_txt_descripcion.getText().trim(), Productos_txt_cantidad.getText().trim(), Productos_txt_precio.getText().trim(), Productos_cbb_idproveedor.getSelectedItem().toString().trim(), Productos_txt_id.getText().trim()};
            insProducto.actualizarRegistro(parametros, Productos_tbl, campos);

            insProducto.mostrarTabla(Productos_tbl);

            JComponent[] componentes1 = {Productos_btn_cancelar, Productos_btn_editar, Productos_btn_eliminar};
            insUsuarios.setVisibility(componentes1, false);

            JComponent[] componentes2 = {Productos_btn_agregar};
            insUsuarios.setVisibility(componentes2, true);

            JComponent[] componentesE = {Productos_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_Productos_btn_editarActionPerformed

    private void Productos_btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productos_btn_eliminarActionPerformed
        try {
            JComponent[] campos = {Productos_txt_id, Productos_txt_nombre, Productos_txt_descripcion, Productos_txt_cantidad, Productos_txt_precio, Productos_cbb_idproveedor};
            Object id = Productos_txt_id.getText().trim();
            insProducto.eliminarRegistro(id, campos);

            insProducto.mostrarTabla(Productos_tbl);

            JComponent[] componentes1 = {Productos_btn_cancelar, Productos_btn_editar, Productos_btn_eliminar};
            insUsuarios.setVisibility(componentes1, false);

            JComponent[] componentes2 = {Productos_btn_agregar};
            insUsuarios.setVisibility(componentes2, true);

            JComponent[] componentesE = {Productos_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_Productos_btn_eliminarActionPerformed

    private void Ventas_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventas_btn_editarActionPerformed
        try {
            JComponent[] campos = {Ventas_txt_id, Ventas_txt_total};
            Object[] parametros = {Ventas_txt_total.getText().trim(), Ventas_txt_id.getText().trim()};
            insVentas.actualizarRegistro(parametros, Ventas_tbl_ventas, campos);

            insVentas.mostrarTabla(Ventas_tbl_ventas);

            JComponent[] componentes1 = {Ventas_btn_cancelar, Ventas_btn_editar};
            insUsuarios.setVisibility(componentes1, false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ventas_btn_editarActionPerformed

    private void Ventas_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventas_btn_cancelarActionPerformed
        try {
            JComponent[] campos = {Ventas_txt_id, Ventas_txt_total};
            insVentas.vaciarCampos(campos);

            DefaultTableModel modeloTabla = (DefaultTableModel) Ventas_tbl_detalla.getModel();
            modeloTabla.setRowCount(0);

            JComponent[] componentes1 = {Ventas_btn_cancelar, Ventas_btn_editar};
            insUsuarios.setVisibility(componentes1, false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Ventas_btn_cancelarActionPerformed

    private void NewVenta_btn_TerVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_btn_TerVentaActionPerformed
        try {
            JComponent[] componentes = {NewVenta_btn_TerVenta, NewVenta_btn_agregar, NewVenta_btn_editar, NewVenta_btn_eliminar, NewVenta_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesF = {NewVenta_btn_IniVenta};
            insUsuarios.setVisibility(componentesF, true);

            JComponent[] componentesVaciar = {NewVenta_txt_id, NewVenta_txt_cantidad, NewVenta_txt_cantidadDispo, NewVenta_txt_nombre, NewVenta_txt_precio, NewVenta_txt_total};
            insNewVenta.vaciarCampos(componentesVaciar);

            JComponent[] componentesE = {NewVenta_txt_id};
            insUsuarios.setEnabled(componentesE, false);

            DefaultTableModel modeloTabla = (DefaultTableModel) NewVenta_tbl.getModel();
            modeloTabla.setRowCount(0);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewVenta_btn_TerVentaActionPerformed

    private void NewVenta_btn_IniVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_btn_IniVentaActionPerformed
        try {
            JComponent[] campos = {txtvacio};
            Object[] parametros = {idUsuario};
            insNewVenta.insertarRegistro(parametros, campos);
            txtvacio.setText("vacio");

            insProducto.llenarComboBox(NewVenta_txt_id);
            insNewVenta.mostrarTablaDetalle(NewVenta_tbl);

            JComponent[] componentes = {NewVenta_btn_TerVenta, NewVenta_btn_agregar};
            insUsuarios.setVisibility(componentes, true);

            JComponent[] componentesF = {NewVenta_btn_IniVenta};
            insUsuarios.setVisibility(componentesF, false);

            JComponent[] componentesE = {NewVenta_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewVenta_btn_IniVentaActionPerformed

    private void NewVenta_txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_txt_idActionPerformed
        actualizarCamposVenta();
    }//GEN-LAST:event_NewVenta_txt_idActionPerformed

    private void NewVenta_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_btn_editarActionPerformed
        try {
            float precio = Float.parseFloat(NewVenta_txt_precio.getText().trim());
            int cantidad = Integer.parseInt(NewVenta_txt_cantidad.getText().trim());
            float supTotal = precio * cantidad;

            String idProducto = NewVenta_txt_id.getSelectedItem().toString().trim();
            int idVenta = insNewVenta.obtenerMaxId();

            Object[] parametros = {cantidad, precio, supTotal, idProducto, idVenta};
            JComponent[] campos = {NewVenta_txt_id, NewVenta_txt_cantidad};
            insNewVenta.actualizarRegistro(parametros, NewVenta_tbl, campos);

            JComponent[] componentes = {NewVenta_btn_editar, NewVenta_btn_eliminar, NewVenta_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesT = {NewVenta_btn_agregar};
            insUsuarios.setVisibility(componentesT, true);

            JComponent[] componentesE = {NewVenta_txt_id};
            insUsuarios.setEnabled(componentesE, true);

            actualizarCamposVenta();
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            insNewVenta.mostrarTablaDetalle(NewVenta_tbl);
        }
    }//GEN-LAST:event_NewVenta_btn_editarActionPerformed

    private void NewVenta_btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_btn_eliminarActionPerformed
        try {
            String idProducto = NewVenta_txt_id.getSelectedItem().toString().trim();
            JComponent[] campos = {NewVenta_txt_id, NewVenta_txt_cantidad};
            insNewVenta.eliminarRegistro(idProducto, campos, NewVenta_tbl);

            JComponent[] componentes = {NewVenta_btn_editar, NewVenta_btn_eliminar, NewVenta_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesT = {NewVenta_btn_agregar};
            insUsuarios.setVisibility(componentesT, true);

            JComponent[] componentesE = {NewVenta_txt_id};
            insUsuarios.setEnabled(componentesE, true);

            actualizarCamposVenta();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewVenta_btn_eliminarActionPerformed

    private void NewVenta_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVenta_btn_cancelarActionPerformed
        try {
            JComponent[] campos = {NewVenta_txt_id, NewVenta_txt_cantidad};
            insProducto.vaciarCampos(campos);

            JComponent[] componentes = {NewVenta_btn_editar, NewVenta_btn_eliminar, NewVenta_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesT = {NewVenta_btn_agregar};
            insUsuarios.setVisibility(componentesT, true);

            JComponent[] componentesE = {NewVenta_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewVenta_btn_cancelarActionPerformed

    private void Compras_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compras_btn_editarActionPerformed
        try {
            JComponent[] campos = {Compras_txt_id, Compras_txt_total};
            Object[] parametros = {Compras_txt_total.getText().trim(), Compras_txt_id.getText().trim()};
            insCompra.actualizarRegistro(parametros, Compras_tbl_compras, campos);

            insCompra.mostrarTabla(Compras_tbl_compras);

            JComponent[] componentes1 = {Compras_btn_cancelar, Compras_btn_editar};
            insUsuarios.setVisibility(componentes1, false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Compras_btn_editarActionPerformed

    private void Compras_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compras_btn_cancelarActionPerformed
        try {
            JComponent[] campos = {Compras_txt_id, Compras_txt_total};
            insCompra.vaciarCampos(campos);

            DefaultTableModel modeloTabla = (DefaultTableModel) Compras_tbl_detalla.getModel();
            modeloTabla.setRowCount(0);

            JComponent[] componentes1 = {Compras_btn_cancelar, Compras_btn_editar};
            insUsuarios.setVisibility(componentes1, false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Compras_btn_cancelarActionPerformed

    private void NewCompra_btn_IniVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_btn_IniVentaActionPerformed
        try {
            JComponent[] campos = {txtvacio};
            Object[] parametros = {idUsuario};
            insNewCompras.insertarRegistro(parametros, campos);

            insProducto.llenarComboBox(NewCompra_txt_id);
            txtvacio.setText("vacio");

            JComponent[] componentes = {NewCompra_btn_TerVenta, NewCompra_btn_agregar};
            insUsuarios.setVisibility(componentes, true);

            JComponent[] componentesF = {NewCompra_btn_IniVenta};
            insUsuarios.setVisibility(componentesF, false);

            JComponent[] componentesE = {NewCompra_txt_id};
            insUsuarios.setEnabled(componentesE, true);
            actualizarCamposCompra();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewCompra_btn_IniVentaActionPerformed

    private void NewCompra_btn_TerVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_btn_TerVentaActionPerformed
        try {
            JComponent[] componentesVaciar = {NewCompra_txt_id, NewCompra_txt_Cantidad, NewCompra_txt_cantidadDispo, NewCompra_txt_nombre, NewCompra_txt_Costo, NewCompra_txt_total};
            insNewVenta.vaciarCampos(componentesVaciar);

            JComponent[] componentes = {NewCompra_btn_TerVenta, NewCompra_btn_agregar, NewCompra_btn_editar, NewCompra_btn_eliminar, NewCompra_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesF = {NewCompra_btn_IniVenta};
            insUsuarios.setVisibility(componentesF, true);

            JComponent[] componentesE = {NewCompra_txt_id};
            insUsuarios.setEnabled(componentesE, false);

            DefaultTableModel modeloTabla = (DefaultTableModel) NewCompra_tbl.getModel();
            modeloTabla.setRowCount(0);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewCompra_btn_TerVentaActionPerformed

    private void NewCompra_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_btn_cancelarActionPerformed
        try {
            JComponent[] campos = {NewCompra_txt_id, NewCompra_txt_Cantidad, NewCompra_txt_Costo};
            insProducto.vaciarCampos(campos);

            JComponent[] componentes = {NewCompra_btn_editar, NewCompra_btn_eliminar, NewCompra_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesF = {NewCompra_btn_agregar};
            insUsuarios.setVisibility(componentesF, true);

            JComponent[] componentesE = {NewCompra_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_NewCompra_btn_cancelarActionPerformed

    private void NewCompra_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_btn_editarActionPerformed
        try {
            float precio = Float.parseFloat(NewCompra_txt_Costo.getText().trim());
            int cantidad = Integer.parseInt(NewCompra_txt_Cantidad.getText().trim());
            float supTotal = precio * cantidad;

            String idProducto = NewCompra_txt_id.getSelectedItem().toString().trim();
            int idVenta = insNewCompras.obtenerMaxId();

            Object[] parametros = {cantidad, precio, supTotal, idProducto, idVenta};
            JComponent[] campos = {NewCompra_txt_id, NewCompra_txt_Cantidad, NewCompra_txt_Costo};
            insNewCompras.actualizarRegistro(parametros, NewCompra_tbl, campos);

            JComponent[] componentes = {NewCompra_btn_editar, NewCompra_btn_eliminar, NewCompra_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesF = {NewCompra_btn_agregar};
            insUsuarios.setVisibility(componentesF, true);

            JComponent[] componentesE = {NewCompra_txt_id};
            insUsuarios.setEnabled(componentesE, true);

            actualizarCamposCompra();
        } catch (NumberFormatException e) {
            System.out.println(e);

        } finally {
            insNewCompras.mostrarTablaDetalle(NewCompra_tbl);
        }
    }//GEN-LAST:event_NewCompra_btn_editarActionPerformed

    private void NewCompra_btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_btn_eliminarActionPerformed
        try {
            String idProducto = NewCompra_txt_id.getSelectedItem().toString().trim();
            JComponent[] campos = {NewCompra_txt_id, NewCompra_txt_Cantidad, NewCompra_txt_Costo};
            insNewCompras.eliminarRegistro(idProducto, campos, NewCompra_tbl);

            JComponent[] componentes = {NewCompra_btn_editar, NewCompra_btn_eliminar, NewCompra_btn_cancelar};
            insProveedor.setVisibility(componentes, false);

            JComponent[] componentesF = {NewCompra_btn_agregar};
            insUsuarios.setVisibility(componentesF, true);

            JComponent[] componentesE = {NewCompra_txt_id};
            insUsuarios.setEnabled(componentesE, true);
            actualizarCamposCompra();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_NewCompra_btn_eliminarActionPerformed

    private void NewCompra_txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCompra_txt_idActionPerformed
        actualizarCamposCompra();
    }//GEN-LAST:event_NewCompra_txt_idActionPerformed

    private void Usuarios_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_btn_cancelarActionPerformed
        try {
            JComponent[] campos = {Usuarios_txt_id, Usuarios_txt_nombre, Usuarios_txt_contra, Usuarios_txt_rol};
            insUsuarios.vaciarCampos(campos);

            JComponent[] componentesF = {Usuarios_btn_cancelar, Usuarios_btn_editar, Usuarios_btn_eliminar};
            insUsuarios.setVisibility(componentesF, false);

            JComponent[] componentesT = {Usuarios_btn_agregar};
            insUsuarios.setVisibility(componentesT, true);

            JComponent[] componentesE = {Usuarios_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Usuarios_btn_cancelarActionPerformed

    private void Usuarios_btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_btn_editarActionPerformed
        try {
            JComponent[] campos = {Usuarios_txt_id, Usuarios_txt_nombre, Usuarios_txt_contra, Usuarios_txt_rol};
            Object[] parametros = {Usuarios_txt_nombre.getText().trim(), Usuarios_txt_contra.getText().trim(), Usuarios_txt_rol.getSelectedItem().toString().trim(), Usuarios_txt_id.getText().trim()};
            insUsuarios.actualizarRegistro(parametros, Usuarios_tbl, campos);

            insUsuarios.mostrarTabla(Usuarios_tbl);

            JComponent[] componentesF = {Usuarios_btn_cancelar, Usuarios_btn_editar, Usuarios_btn_eliminar};
            insUsuarios.setVisibility(componentesF, false);

            JComponent[] componentesT = {Usuarios_btn_agregar};
            insUsuarios.setVisibility(componentesT, true);

            JComponent[] componentesE = {Usuarios_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_Usuarios_btn_editarActionPerformed

    private void Usuarios_btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_btn_eliminarActionPerformed
        try {
            JComponent[] campos = {Usuarios_txt_id, Usuarios_txt_nombre, Usuarios_txt_contra, Usuarios_txt_rol};
            Object id = Usuarios_txt_id.getText().trim();
            insUsuarios.eliminarRegistro(id, campos);

            insUsuarios.mostrarTabla(Usuarios_tbl);

            JComponent[] componentesF = {Usuarios_btn_cancelar, Usuarios_btn_editar, Usuarios_btn_eliminar};
            insUsuarios.setVisibility(componentesF, false);

            JComponent[] componentesT = {Usuarios_btn_agregar};
            insUsuarios.setVisibility(componentesT, true);

            JComponent[] componentesE = {Usuarios_txt_id};
            insUsuarios.setEnabled(componentesE, true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Usuarios_btn_eliminarActionPerformed

    private void Proveedores_txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Proveedores_txt_telefonoKeyTyped
        validarTelefono(evt, Proveedores_txt_telefono);
    }//GEN-LAST:event_Proveedores_txt_telefonoKeyTyped

    private void Productos_txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Productos_txt_cantidadKeyTyped
        validarSoloNumeros(evt, Productos_txt_cantidad);
    }//GEN-LAST:event_Productos_txt_cantidadKeyTyped

    private void Productos_txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Productos_txt_precioKeyTyped
        validarEntradaNumerica(evt, Productos_txt_precio);
    }//GEN-LAST:event_Productos_txt_precioKeyTyped

    private void Ventas_txt_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Ventas_txt_totalKeyTyped
        validarEntradaNumerica(evt, Ventas_txt_total);
    }//GEN-LAST:event_Ventas_txt_totalKeyTyped

    private void NewVenta_txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewVenta_txt_cantidadKeyTyped
        validarSoloNumeros(evt, NewVenta_txt_cantidad);
    }//GEN-LAST:event_NewVenta_txt_cantidadKeyTyped

    private void Compras_txt_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Compras_txt_totalKeyTyped
        validarEntradaNumerica(evt, Compras_txt_total);
    }//GEN-LAST:event_Compras_txt_totalKeyTyped

    private void Finanzas_tbl_vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Finanzas_tbl_vMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Finanzas_tbl_vMouseClicked

    private void Finanzas_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finanzas_btn_cancelarActionPerformed
        try {
            Finanzas_fecha_ini.setDate(null);
            Finanzas_fecha_fin.setDate(null);

            DefaultTableModel modeloTabla = (DefaultTableModel) Finanzas_tbl_v.getModel();
            modeloTabla.setRowCount(0);

            DefaultTableModel modeloTabla1 = (DefaultTableModel) Finanzas_tbl_c.getModel();
            modeloTabla1.setRowCount(0);
            

            JComponent[] componentes1 = {Finanzas_btn_pdf, Finanzas_btn_cancelar};
            insUsuarios.setVisibility(componentes1, false);
            
            JComponent[] componentes = {Finanzas_ingresos, Finanzas_gastos,Finanzas_ganancias};
            insUsuarios.vaciarCampos(componentes);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_Finanzas_btn_cancelarActionPerformed

    private void Finanzas_btn_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finanzas_btn_pdfActionPerformed
        String fechaInicio = null;
        String fechaFin = null;
        Date fechaSeleccionadaInicio = Finanzas_fecha_ini.getDate();
        Date fechaSeleccionadaFin = Finanzas_fecha_fin.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        if (fechaSeleccionadaInicio != null && fechaSeleccionadaFin != null) {
            fechaInicio = formato.format(fechaSeleccionadaInicio);
            fechaFin = formato.format(fechaSeleccionadaFin);
            String periodo = "_" + fechaInicio + "_a_" + fechaFin;
            String sumaTotalesVentas = Finanzas_gastos.getText();
            String sumaTotalesCompras = Finanzas_ingresos.getText();
            String sumaTotalesDiferencia = Finanzas_ganancias.getText();
            String ruta = "C:\\Users\\ppaul\\OneDrive\\Escritorio\\Estados_de_resultados" + periodo +".pdf";
            ExportarPDF.exportarTablasPDF(Finanzas_tbl_v, Finanzas_tbl_c, ruta, sumaTotalesCompras, sumaTotalesVentas, sumaTotalesDiferencia, fechaInicio, fechaFin);
        }
    }//GEN-LAST:event_Finanzas_btn_pdfActionPerformed

    private void Usuarios_btn_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_btn_eliminar1ActionPerformed
        dispose(); 
        login login = new login();  
        login.setVisible(true); 
    }//GEN-LAST:event_Usuarios_btn_eliminar1ActionPerformed

    private void NewCompra_txt_CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewCompra_txt_CantidadKeyTyped
        validarSoloNumeros(evt, NewCompra_txt_Cantidad);
    }//GEN-LAST:event_NewCompra_txt_CantidadKeyTyped

    private void NewCompra_txt_CostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewCompra_txt_CostoKeyTyped
        validarEntradaNumerica(evt, NewCompra_txt_Costo);
    }//GEN-LAST:event_NewCompra_txt_CostoKeyTyped

    public void mostarTablas() {
        try {
            insProveedor.mostrarTabla(Proveedores_tbl);
            insProveedor.llenarComboBox(Productos_cbb_idproveedor);
            insProducto.mostrarTabla(Productos_tbl);
            insVentas.mostrarTabla(Ventas_tbl_ventas);
            insCompra.mostrarTabla(Compras_tbl_compras);
            insUsuarios.mostrarTabla(Usuarios_tbl);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actualizarCamposVenta() {
        try {
            Object id = NewVenta_txt_id.getSelectedItem().toString().trim();

            Float precio = (Float) insNewVenta.obtenerPrecioProducto(id);
            if (precio != null) {
                NewVenta_txt_precio.setText(String.valueOf(precio));
            } else {
                NewVenta_txt_precio.setText("");
            }
            String nombre = (String) insNewVenta.obtenerNombreProducto(id);
            if (nombre != null) {
                NewVenta_txt_nombre.setText(nombre);
            } else {
                NewVenta_txt_nombre.setText("");
            }
            Integer cantidad = (Integer) insNewVenta.obtenerCantidadProducto(id);
            if (cantidad != null) {
                NewVenta_txt_cantidadDispo.setText(String.valueOf(cantidad));
            } else {
                NewVenta_txt_cantidadDispo.setText("");
            }

            String totalVenta = insNewVenta.obtenerTotalVenta().toString();
            if (totalVenta != null) {
                NewVenta_txt_total.setText(totalVenta);
            } else {
                NewVenta_txt_total.setText("");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actualizarCamposCompra() {
        try {
            Object id = NewCompra_txt_id.getSelectedItem().toString().trim();

            String nombre = (String) insNewCompras.obtenerNombreProducto(id);
            if (nombre != null) {
                NewCompra_txt_nombre.setText(nombre);
            } else {
                NewCompra_txt_nombre.setText("");
            }
            Integer cantidad = (Integer) insNewCompras.obtenerCantidadProducto(id);
            if (cantidad != null) {
                NewCompra_txt_cantidadDispo.setText(String.valueOf(cantidad));
            } else {
                NewCompra_txt_cantidadDispo.setText("");
            }

            String totalVenta = insNewCompras.obtenerTotalVenta().toString();
            if (totalVenta != null) {
                NewCompra_txt_total.setText(totalVenta);
            } else {
                NewCompra_txt_total.setText("");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarEntradaNumerica(KeyEvent evt, JTextField textField) {
        char key = evt.getKeyChar();
        String textoActual = textField.getText();
        boolean esDigito = Character.isDigit(key);
        boolean esPuntoValido = key == '.' && !textoActual.contains(".");
        boolean esRetroceso = key == '\b';
        if (!(esDigito || esPuntoValido || esRetroceso)) {
            evt.consume();
        }
    }

    public static void validarSoloNumeros(KeyEvent evt, JTextField textField) {
        char key = evt.getKeyChar();
        boolean esDigito = Character.isDigit(key);
        boolean esRetroceso = key == '\b';
        if (!esDigito && !esRetroceso) {
            evt.consume();
        }
    }

    public static void validarTelefono(KeyEvent evt, JTextField textField) {
        char key = evt.getKeyChar();
        String textoActual = textField.getText().trim();
        boolean esDigito = Character.isDigit(key);
        boolean tieneLongitudValida = textoActual.length() < 10;
        boolean esRetroceso = key == '\b';
        if (!(esDigito && tieneLongitudValida) && !esRetroceso) {
            evt.consume();
        }
    }

    protected void restablecerColorPaneles(JComponent[] componentes) {
        for (JComponent componente : componentes) {
            componente.setBackground(new Color(159, 62, 117));
        }
    }

    protected void revertirColorPaneles(JComponent[] componentes) {
        for (JComponent componente : componentes) {
            componente.setBackground(new Color(44, 44, 44));
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Compras_Pnl;
    private javax.swing.JPanel Compras_btn;
    private javax.swing.JButton Compras_btn_cancelar;
    private javax.swing.JButton Compras_btn_editar;
    private javax.swing.JLabel Compras_btn_lbl;
    private javax.swing.JTable Compras_tbl_compras;
    private javax.swing.JTable Compras_tbl_detalla;
    private javax.swing.JTextField Compras_txt_id;
    private javax.swing.JTextField Compras_txt_total;
    private javax.swing.JPanel Finanzas_Pnl;
    private javax.swing.JPanel Finanzas_btn;
    private javax.swing.JButton Finanzas_btn_buscar;
    private javax.swing.JButton Finanzas_btn_cancelar;
    private javax.swing.JLabel Finanzas_btn_lbl;
    private javax.swing.JButton Finanzas_btn_pdf;
    private com.toedter.calendar.JDateChooser Finanzas_fecha_fin;
    private com.toedter.calendar.JDateChooser Finanzas_fecha_ini;
    private javax.swing.JTextField Finanzas_ganancias;
    private javax.swing.JTextField Finanzas_gastos;
    private javax.swing.JTextField Finanzas_ingresos;
    private javax.swing.JTable Finanzas_tbl_c;
    private javax.swing.JTable Finanzas_tbl_v;
    private javax.swing.JPanel NewCompra_Pnl;
    private javax.swing.JPanel NewCompra_btn;
    private javax.swing.JButton NewCompra_btn_IniVenta;
    private javax.swing.JButton NewCompra_btn_TerVenta;
    private javax.swing.JButton NewCompra_btn_agregar;
    private javax.swing.JButton NewCompra_btn_cancelar;
    private javax.swing.JButton NewCompra_btn_editar;
    private javax.swing.JButton NewCompra_btn_eliminar;
    private javax.swing.JLabel NewCompra_btn_lbl;
    private javax.swing.JTable NewCompra_tbl;
    private javax.swing.JTextField NewCompra_txt_Cantidad;
    private javax.swing.JTextField NewCompra_txt_Costo;
    private javax.swing.JTextField NewCompra_txt_cantidadDispo;
    private javax.swing.JComboBox<String> NewCompra_txt_id;
    private javax.swing.JTextField NewCompra_txt_nombre;
    private javax.swing.JTextField NewCompra_txt_total;
    private javax.swing.JPanel NewVenta_Pnl;
    private javax.swing.JPanel NewVenta_btn;
    private javax.swing.JButton NewVenta_btn_IniVenta;
    private javax.swing.JButton NewVenta_btn_TerVenta;
    private javax.swing.JButton NewVenta_btn_agregar;
    private javax.swing.JButton NewVenta_btn_cancelar;
    private javax.swing.JButton NewVenta_btn_editar;
    private javax.swing.JButton NewVenta_btn_eliminar;
    private javax.swing.JLabel NewVenta_btn_lbl;
    private javax.swing.JTable NewVenta_tbl;
    private javax.swing.JTextField NewVenta_txt_cantidad;
    private javax.swing.JTextField NewVenta_txt_cantidadDispo;
    private javax.swing.JComboBox<String> NewVenta_txt_id;
    private javax.swing.JTextField NewVenta_txt_nombre;
    private javax.swing.JTextField NewVenta_txt_precio;
    private javax.swing.JTextField NewVenta_txt_total;
    private javax.swing.JPanel Productos_Pnl;
    private javax.swing.JPanel Productos_btn;
    private javax.swing.JButton Productos_btn_agregar;
    private javax.swing.JButton Productos_btn_cancelar;
    private javax.swing.JButton Productos_btn_editar;
    private javax.swing.JButton Productos_btn_eliminar;
    private javax.swing.JLabel Productos_btn_lbl;
    private javax.swing.JComboBox<String> Productos_cbb_idproveedor;
    private javax.swing.JTable Productos_tbl;
    private javax.swing.JTextField Productos_txt_cantidad;
    private javax.swing.JTextField Productos_txt_descripcion;
    private javax.swing.JTextField Productos_txt_id;
    private javax.swing.JTextField Productos_txt_nombre;
    private javax.swing.JTextField Productos_txt_precio;
    private javax.swing.JPanel Proveedores_Pnl;
    private javax.swing.JPanel Proveedores_btn;
    private javax.swing.JButton Proveedores_btn_agregar;
    private javax.swing.JButton Proveedores_btn_cancelar;
    private javax.swing.JButton Proveedores_btn_editar;
    private javax.swing.JButton Proveedores_btn_eliminar;
    private javax.swing.JLabel Proveedores_btn_lbl;
    public javax.swing.JTable Proveedores_tbl;
    public javax.swing.JTextField Proveedores_txt_descripcion;
    public javax.swing.JTextField Proveedores_txt_id;
    public javax.swing.JTextField Proveedores_txt_nombre;
    public javax.swing.JTextField Proveedores_txt_telefono;
    private javax.swing.JPanel Usuarios_Pnl;
    private javax.swing.JPanel Usuarios_btn;
    private javax.swing.JButton Usuarios_btn_agregar;
    private javax.swing.JButton Usuarios_btn_cancelar;
    private javax.swing.JButton Usuarios_btn_editar;
    private javax.swing.JButton Usuarios_btn_eliminar;
    private javax.swing.JButton Usuarios_btn_eliminar1;
    private javax.swing.JLabel Usuarios_btn_lbl;
    private javax.swing.JTable Usuarios_tbl;
    private javax.swing.JTextField Usuarios_txt_contra;
    private javax.swing.JTextField Usuarios_txt_id;
    private javax.swing.JTextField Usuarios_txt_nombre;
    private javax.swing.JComboBox<String> Usuarios_txt_rol;
    private javax.swing.JPanel Ventas_Pnl;
    private javax.swing.JPanel Ventas_btn;
    private javax.swing.JButton Ventas_btn_cancelar;
    private javax.swing.JButton Ventas_btn_editar;
    private javax.swing.JLabel Ventas_btn_lbl;
    private javax.swing.JTable Ventas_tbl_detalla;
    private javax.swing.JTable Ventas_tbl_ventas;
    private javax.swing.JTextField Ventas_txt_id;
    private javax.swing.JTextField Ventas_txt_total;
    private javax.swing.JPanel btns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTabbedPane pnls;
    private javax.swing.JTextField txtvacio;
    // End of variables declaration//GEN-END:variables
}
