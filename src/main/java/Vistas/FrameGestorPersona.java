
package Vistas;
import Clases.*;
import Controladores.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameGestorPersona extends javax.swing.JFrame {

    CtlPersona controlador;
    LinkedList<ClsPersona> personas;
    FrameMenu menu;
    /**
     * Creates new form NewJFrame
     */
    public FrameGestorPersona(FrameMenu menu) {
        initComponents();
        if (menu != null) {
            this.menu = menu;
            this.menu.setVisible(false);
        }

        this.botonNuevo1.setVisible(false);
        this.botonActualizar1.setVisible(false);
        this.controlador = new CtlPersona();
        this.ObtenerPersonas();
    }

    public void ObtenerPersonas() {

        this.personas = this.controlador.ObtenerPersonas();
        this.ActualizarTabla(personas);
        
    }
    
        public void ActualizarTabla(LinkedList<ClsPersona> lista) {

        DefaultTableModel model = (DefaultTableModel) this.tablaListaPersonas.getModel();

        model.setRowCount(0);

        for (ClsPersona persona : lista) {

            Object[] row = {persona.getNumeroDocumento(), persona.getNombre(), persona.getTelefono(), persona.getCorreo()};
            model.addRow(row);

        }

    }
        public ClsPersona BuscarPersona(String id) {

        for (ClsPersona persona : this.personas) {

            if (persona.getNumeroDocumento().equals(id)) {
                return persona;
            }
        }

        return null;

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoNumeroCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botonNuevo1 = new javax.swing.JButton();
        botonActualizar1 = new javax.swing.JButton();
        botonAgregar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaPersonas = new javax.swing.JTable();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonRegreso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("N??mero c??dula:");

        campoNumeroCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroCedulaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Correo:");

        botonNuevo1.setText("Nuevo Registro");
        botonNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevo1ActionPerformed(evt);
            }
        });

        botonActualizar1.setText("Actualizar");
        botonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizar1ActionPerformed(evt);
            }
        });

        botonAgregar1.setText("Agregar");
        botonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(botonNuevo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(botonActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(85, 85, 85))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoTelefono)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(174, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNuevo1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAgregar1)
                        .addComponent(botonActualizar1)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(218, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Formulario", jPanel2);

        tablaListaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaListaPersonas);

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonEditar))
                .addGap(151, 151, 151))
        );

        jTabbedPane1.addTab("Lista", jPanel1);

        botonRegreso.setText("Volver");
        botonRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Men?? de Personas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(botonRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonRegreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {                                           

        this.botonNuevo1.setVisible(false);
        this.botonActualizar1.setVisible(false);
        this.botonAgregar1.setVisible(true);
        this.campoNumeroCedula.enable();

        this.campoNumeroCedula.setText("");
        this.campoNombre.setText("");
        this.campoTelefono.setText("");
        this.campoCorreo.setText("");
        
    }                                          

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                                

        String cedula = this.campoNumeroCedula.getText();
        ClsPersona persona = this.BuscarPersona(cedula);

        String nombre = this.campoNombre.getText();
        persona.setNombre(nombre);

        String telefono = this.campoTelefono.getText();
        persona.setTelefono(telefono);

        String correo = this.campoCorreo.getText();
        persona.setCorreo(correo);

        ClsMensaje mensaje = this.controlador.ActualizarPersona(persona);

        if (mensaje.getTipo().equals(mensaje.OK)) {
            this.ObtenerPersonas();
        }

        JOptionPane.showMessageDialog(null, mensaje.getDescripcion());
    }                                               

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                             

        String numeroCedula = campoNumeroCedula.getText();
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();

        ClsPersona persona = new ClsPersona(numeroCedula, nombre, telefono, correo);

        ClsMensaje mensaje = this.controlador.AgregarPersona(persona);

        if (mensaje.getTipo().equals(mensaje.OK)) {
            this.ObtenerPersonas();

            this.campoNumeroCedula.setText("");
            this.campoNombre.setText("");
            this.campoTelefono.setText("");
            this.campoCorreo.setText("");

        }

        JOptionPane.showMessageDialog(null, mensaje.getDescripcion());
    }    
    private void campoNumeroCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroCedulaActionPerformed

    private void botonNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevo1ActionPerformed

        this.botonNuevo1.setVisible(false);
        this.botonActualizar1.setVisible(false);
        this.botonAgregar1.setVisible(true);
        this.campoNumeroCedula.enable();

        this.campoNumeroCedula.setText("");
        this.campoNombre.setText("");
        this.campoTelefono.setText("");
        this.campoCorreo.setText("");
    }//GEN-LAST:event_botonNuevo1ActionPerformed

    private void botonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizar1ActionPerformed

        String cedula = this.campoNumeroCedula.getText();
        ClsPersona persona = this.BuscarPersona(cedula);

        String nombre = this.campoNombre.getText();
        persona.setNombre(nombre);

        String telefono = this.campoTelefono.getText();
        persona.setTelefono(telefono);

        String correo = this.campoCorreo.getText();
        persona.setCorreo(correo);

        ClsMensaje mensaje = this.controlador.ActualizarPersona(persona);

        if (mensaje.getTipo().equals(mensaje.OK)) {
            this.ObtenerPersonas();
        }

        JOptionPane.showMessageDialog(null, mensaje.getDescripcion());
    }//GEN-LAST:event_botonActualizar1ActionPerformed

    private void botonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar1ActionPerformed

        String numeroCedula = campoNumeroCedula.getText();
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();

        ClsPersona persona = new ClsPersona(numeroCedula, nombre, telefono, correo);

        ClsMensaje mensaje = this.controlador.AgregarPersona(persona);

        if (mensaje.getTipo().equals(mensaje.OK)) {
            this.ObtenerPersonas();

            this.campoNumeroCedula.setText("");
            this.campoNombre.setText("");
            this.campoTelefono.setText("");
            this.campoCorreo.setText("");

        }

        JOptionPane.showMessageDialog(null, mensaje.getDescripcion());
    }//GEN-LAST:event_botonAgregar1ActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        int column = 0;
        int row = this.tablaListaPersonas.getSelectedRow();
        String cedula = this.tablaListaPersonas.getModel().getValueAt(row, column).toString();
        ClsPersona persona = this.BuscarPersona(cedula);

        if (persona != null) {
            this.campoNumeroCedula.setText(persona.getNumeroDocumento());
            this.campoNombre.setText(persona.getNombre());
            this.campoTelefono.setText(persona.getTelefono());
            this.campoCorreo.setText(persona.getCorreo());

            this.campoNumeroCedula.disable();

            this.botonNuevo1.setVisible(true);
            this.botonActualizar1.setVisible(true);
            this.botonAgregar1.setVisible(false);

            this.jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int column = 0;
        int row = this.tablaListaPersonas.getSelectedRow();
        String cedula = this.tablaListaPersonas.getModel().getValueAt(row, column).toString();

        ClsMensaje mensaje = this.controlador.EliminarPersona(cedula);

        if (mensaje.getTipo().equals(mensaje.OK)) {
            this.ObtenerPersonas();
        }

        JOptionPane.showMessageDialog(null, mensaje.getDescripcion());
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresoActionPerformed
        this.setVisible(false);
        this.menu.setVisible(true);
    }//GEN-LAST:event_botonRegresoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameGestorPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGestorPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGestorPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGestorPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGestorPersona(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar1;
    private javax.swing.JButton botonAgregar1;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonNuevo1;
    private javax.swing.JButton botonRegreso;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumeroCedula;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaListaPersonas;
    // End of variables declaration//GEN-END:variables
}
