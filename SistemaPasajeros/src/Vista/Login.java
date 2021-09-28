/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import conexion.ConexionDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author KB
 */
public class Login extends javax.swing.JDialog

{
   String[][] tabla1=new String[2][5];
    boolean iniciado=false;
    int sesion=0;
    public Login(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public int showDialog()
     {
         this.setVisible(true);
         return this.sesion;
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Inicio de Sesión");
        jLabel2.setToolTipText("");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPass.setEnabled(false);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        btnLogon.setText("Ingresar");
        btnLogon.setEnabled(false);
        btnLogon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogonActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(btnLogon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(btnLogon)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(!iniciado)
        {
             System.exit(0);  
        }
      
    }//GEN-LAST:event_formWindowClosing

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
  
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

        if(!txtNombre.getText().equals(""))
       {
           txtPass.setEnabled(true);
       }
        else if(txtNombre.getText().equals(""))
       {
           txtPass.setEnabled(false);
       }   
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
           if(!txtPass.getText().equals(""))
       {
           if (KeyEvent.VK_ENTER == evt.getKeyCode()) 
           {
                btnLogon.doClick();
            }
           btnLogon.setEnabled(true);
       }
        else if(txtPass.getText().equals(""))
       {
           btnLogon.setEnabled(false);
       }   
    }//GEN-LAST:event_txtPassKeyReleased

    private void btnLogonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogonActionPerformed
         ConexionDB conn= new ConexionDB();
          tabla1= conn.datosLogin();
          for(int i=0; i<2;i++)
          {
              if(txtNombre.getText().equals(tabla1[i][1]) && txtPass.getText().equals(tabla1[i][2]))
              {
                  if(Integer.parseInt(tabla1[i][4])!=1)
                  {
                        if(Integer.parseInt(tabla1[i][3])==1)
                        {   
                               ConexionDB conn2= new ConexionDB();
                               conn2.sesionIniciada(1, 1);
                               JOptionPane.showMessageDialog(null, "Iniciado Sesion como Matriz", "Listo!", JOptionPane.INFORMATION_MESSAGE);
                               this.sesion=1;
                                this.dispose();
                             return;
                        }
                        else
                        {
                              ConexionDB conn2= new ConexionDB();
                              conn2.sesionIniciada(2, 1);
                             JOptionPane.showMessageDialog(null, "Iniciado Sesion como Sucursal", "Listo!", JOptionPane.INFORMATION_MESSAGE);
                                   this.sesion=0;
                             this.dispose();
                              return;
                        }
                  }
                  else
                  {
                        JOptionPane.showMessageDialog(null, "Este usuario ya inició sesión, cierre el programa en donde se está ejecutando la sesión", "ERROR", JOptionPane.ERROR_MESSAGE);
                         txtPass.setText("");
                          txtNombre.setText("");
                          txtPass.setEnabled(false);
                           btnLogon.setEnabled(false);
                            return;
                  }
              }
          }

        JOptionPane.showMessageDialog(null, "La combinación Usuario/Contraseña es incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
        txtPass.setText("");
    }//GEN-LAST:event_btnLogonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
