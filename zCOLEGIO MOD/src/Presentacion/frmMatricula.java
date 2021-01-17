package Presentacion;

import Entidad.Alumno;
import Entidad.Matricula;
import Entidad.Pago;
import Logica.PagoL;
import Logica.AlumnoL;
import Logica.MatriculaL;
import com.mysql.jdbc.StringUtils;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class frmMatricula extends javax.swing.JFrame {

    public frmMatricula() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel7.setVisible(false);
        cboGrado.setSelectedIndex(1);
        cboNivel.setSelectedIndex(1);
        cboTurno.setSelectedIndex(1);
    }
    Matricula objmatricula = new Matricula();
    MatriculaL matriculal = new MatriculaL();

    Alumno objalumno = new Alumno();
    AlumnoL alumnol = new AlumnoL();

    Pago objpago = new Pago();
    PagoL pagol = new PagoL();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnGuardarPago = new javax.swing.JButton();
        btnCancelarPago = new javax.swing.JButton();
        cboTurno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboGrado = new javax.swing.JComboBox<>();
        cboNivel = new javax.swing.JComboBox<>();
        btnVerificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("MATRÍCULA");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("N° DNI:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Grado:");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnGuardarPago.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardarPago.setText("Guardar");
        btnGuardarPago.setEnabled(false);
        btnGuardarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPagoActionPerformed(evt);
            }
        });

        btnCancelarPago.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarPago.setText("Cancelar");
        btnCancelarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPagoActionPerformed(evt);
            }
        });

        cboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mañana", "Tarde" }));
        cboTurno.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Turno:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Nivel:");

        cboGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));
        cboGrado.setEnabled(false);

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Primaria", "Secundaria" }));
        cboNivel.setEnabled(false);

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");

        txtNombress.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("jLabel7");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnVerificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addComponent(cboTurno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarPago)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtNombress, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel2)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarPago)))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_txtDniKeyPressed
    private void btnGuardarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPagoActionPerformed

        if (txtDni.getText().isEmpty() || cboGrado.getSelectedIndex() < 0 || cboNivel.getSelectedIndex() < 0 || cboTurno.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(null, "Debe Rellenar el campo");
        } else {
            objmatricula.setDni(txtDni.getText());
            objmatricula.setGrado(cboGrado.getSelectedIndex());
            objmatricula.setNivel(cboNivel.getSelectedIndex());
            objmatricula.setTurno(cboTurno.getSelectedIndex());
            limpiar1();

            if (matriculal.graba_Matricula(objmatricula)) {
                JOptionPane.showMessageDialog(null, "Grabado Realizado");
                desactivar_cbo();
                btnGuardarPago.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnGuardarPagoActionPerformed
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (alumnol.busssca_Alumno(txtDni.getText())) {
            objalumno = alumnol.bussca_Alumno(txtDni.getText());

            txtNombress.setText(objalumno.getApell_pat() + " " + objalumno.getApell_mat() + ", " + objalumno.getNomb_alum());

            objmatricula = matriculal.bussca_Matricula(txtDni.getText());

            cboGrado.setSelectedIndex(objmatricula.getGrado());
            cboNivel.setSelectedIndex(objmatricula.getNivel());
            cboTurno.setSelectedIndex(objmatricula.getTurno());

            if (pagol.busca_Pago(txtDni.getText())) {
                jLabel7.setVisible(true);
                jLabel7.setText("Ha Efectuado el Pago");
                activar_cbo();
                btnGuardarPago.setEnabled(true);
                txtDni.setEnabled(false);
                btnNuevo.setEnabled(true);
                btnVerificar.setEnabled(false);
            } else {
                jLabel7.setVisible(true);
                jLabel7.setText("No Ha Efectuado el Pago");
                btnNuevo.setEnabled(true);

                Muestra_Vacio_Cbo();
            }
        } else {

            if ("".equals(txtDni.getText())) {
                JOptionPane.showMessageDialog(null, "Debe Rellenar el campo");
                txtDni.requestFocus();
                limpiar1();
            } else {
                JOptionPane.showMessageDialog(null, "NO Existe el DNI Ingresado");
                btnGuardarPago.setEnabled(false);
                desactivar_cbo();
                txtDni.setText("");
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed


    private void btnCancelarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPagoActionPerformed
        fmrBienvenido bienvenido = new fmrBienvenido();
        bienvenido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarPagoActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped

        if (txtDni.getText().length() == 8) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        jLabel7.setVisible(false);
        desactivar_cbo();
        limpiar1();
        txtDni.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnVerificar.setEnabled(true);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        objmatricula.setDni(txtDni.getText());
        objmatricula.setGrado(cboGrado.getSelectedIndex());
        objmatricula.setNivel(cboNivel.getSelectedIndex());
        objmatricula.setTurno(cboTurno.getSelectedIndex());
        if (matriculal.edita_Matricula(objmatricula)) {
            JOptionPane.showMessageDialog(null, "¡Se modificó correctamente!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Error de grabación!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
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
            java.util.logging.Logger.getLogger(frmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMatricula().setVisible(true);
            }
        });
    }

    public void Muestra_Vacio_Cbo() {
        cboGrado.setSelectedIndex(-1);
        cboNivel.setSelectedIndex(-1);
        cboTurno.setSelectedIndex(-1);
    }

    public void Muestra_Result_Cbo() {
        cboGrado.setSelectedIndex(objmatricula.getGrado());
        cboNivel.setSelectedIndex(objmatricula.getNivel());
        cboTurno.setSelectedIndex(objmatricula.getTurno());
    }

    public void activar_cbo() {

        cboGrado.setEnabled(true);
        cboNivel.setEnabled(true);
        cboTurno.setEnabled(true);

    }

    public void desactivar_cbo() {

        cboGrado.setEnabled(false);
        cboNivel.setEnabled(false);
        cboTurno.setEnabled(false);

    }

    public void limpiar1() {
        txtDni.setText(null);
        txtNombress.setText(null);
        cboGrado.setSelectedIndex(-1);
        cboNivel.setSelectedIndex(-1);
        cboTurno.setSelectedIndex(-1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPago;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardarPago;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cboGrado;
    private javax.swing.JComboBox<String> cboNivel;
    private javax.swing.JComboBox<String> cboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtNombress;
    // End of variables declaration//GEN-END:variables
}
