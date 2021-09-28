/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import conexion.ConexionDB;
import javax.swing.JOptionPane;

public class AdminAsientos extends javax.swing.JDialog {

   private int idAvion;
   private int idAsiento;
   private String idClase;
   private String[] datos;
   private int disponible;
    int vacio=1;
        
    public AdminAsientos(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
          this.setLocationRelativeTo(null);
    }

    public void envioDatos(int idAvion, int idAsiento, String idClase)
    {
        this.idAvion=idAvion;
        this.idAsiento=idAsiento;
         this.idClase=idClase;
        
         
    }
    
     public int showDialog()
     {
         this.setVisible(true);
         return this.disponible;
     }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        ajustar = new javax.swing.JButton();
        vacante = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        clase = new javax.swing.JTextField();
        checkDisp = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asiento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nombre del Pasajero");

        jLabel2.setText("Apellido del Pasajero");

        jLabel3.setText("Correo");

        jLabel4.setText("Precio");

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Asiento");

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailKeyReleased(evt);
            }
        });

        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        ajustar.setText("Ajustar");
        ajustar.setToolTipText("");
        ajustar.setEnabled(false);
        ajustar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajustarMouseClicked(evt);
            }
        });

        vacante.setText("Poner en Vacante");
        vacante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacanteActionPerformed(evt);
            }
        });

        jLabel6.setText("Clase");

        clase.setEnabled(false);
        clase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                claseKeyReleased(evt);
            }
        });

        checkDisp.setSelected(true);
        checkDisp.setText("No Disponible");
        checkDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDispActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(checkDisp)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(3, 3, 3)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clase)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(precio)
                            .addComponent(apellido, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ajustar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vacante))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(checkDisp)
                .addGap(18, 18, 18)
                .addComponent(ajustar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vacante)
                .addGap(17, 17, 17))
        );

        checkDisp.getAccessibleContext().setAccessibleName("Deshabilitado");
        checkDisp.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           
        titulo.setText(titulo.getText()+" "+idAsiento);
           ConexionDB conn= new ConexionDB();           
           ajustar.setEnabled(false);        
           datos=conn.asiento(idAvion, idAsiento);

           if(conn.registrarAsiento(idAvion,idAsiento,idClase))
           {
                  name.setText("");
                 apellido.setText("");
                 mail.setText("");
                  precio.setText("0");
                 clase.setText(idClase);
                  vacante.setEnabled(false);
                 disponible=1;
                  vacio=1;
                  
                  
             }
           else
           {    
                name.setText(datos[1]);
                apellido.setText(datos[2]);
                mail.setText(datos[3]);
                precio.setText(datos[4]);
               clase.setText(datos[5]);
               vacante.setEnabled(true);
                    
 
                if(Integer.parseInt(datos[6])==0)
                 {
                     checkDisp.setSelected(true);
                     disponible=0;
               }
              else
               {
                   checkDisp.setSelected(false);     
                   disponible=1;
                }
                    vacio=0;
             
           }

    }//GEN-LAST:event_formWindowOpened

    private void vacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacanteActionPerformed
            ConexionDB conn= new ConexionDB();
            conn.vacante(idAvion, idAsiento,idClase);
           JOptionPane.showMessageDialog(this, "Se ha vaciado el asiento correctamente", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            vacio=1;
           this.disponible=1;
           this.dispose();
    }//GEN-LAST:event_vacanteActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
           
        if(name.getText().equals(datos[1]) && apellido.getText().equals(datos[2]) && mail.getText().equals(datos[3]) && precio.getText().equals(datos[4]) && clase.getText().equals(datos[5]))
           {
               ajustar.setEnabled(false); 
           }
           else
           {
              ajustar.setEnabled(true);        
           }
           
           
    }//GEN-LAST:event_nameKeyReleased

    private void apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyReleased
           if(name.getText().equals(datos[1]) && apellido.getText().equals(datos[2]) && mail.getText().equals(datos[3]) && precio.getText().equals(datos[4]) && clase.getText().equals(datos[5]))
           {
               ajustar.setEnabled(false); 
           }
           else
           {
              ajustar.setEnabled(true);        
           }
           
    }//GEN-LAST:event_apellidoKeyReleased

    private void mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyReleased
           if(name.getText().equals(datos[1]) && apellido.getText().equals(datos[2]) && mail.getText().equals(datos[3]) && precio.getText().equals(datos[4]) && clase.getText().equals(datos[5]))
           {
               ajustar.setEnabled(false); 
           }
           else
           {
              ajustar.setEnabled(true);        
           }
    }//GEN-LAST:event_mailKeyReleased

    private void precioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyReleased
           if(name.getText().equals(datos[1]) && apellido.getText().equals(datos[2]) && mail.getText().equals(datos[3]) && precio.getText().equals(datos[4]) && clase.getText().equals(datos[5]))
           {
               ajustar.setEnabled(false); 
           }
           else
           {
              ajustar.setEnabled(true);        
           }
    }//GEN-LAST:event_precioKeyReleased

    private void claseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claseKeyReleased
            if(name.getText().equals(datos[1]) && apellido.getText().equals(datos[2]) && mail.getText().equals(datos[3]) && precio.getText().equals(datos[4]) && clase.getText().equals(datos[5]))
           {
               ajustar.setEnabled(false); 
           }
           else
           {
              ajustar.setEnabled(true);        
           }
    }//GEN-LAST:event_claseKeyReleased

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
       char c = evt.getKeyChar();
	
	if(Character.isLetter(c) || Character.isISOControl(c))
	{
		evt = evt;
	}
        
	else
        {

		evt.consume();
	}
    }//GEN-LAST:event_nameKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
            char c = evt.getKeyChar();
	
	if(Character.isLetter(c) || Character.isISOControl(c))
	{
		evt = evt;
	}
        
	else
        {

		evt.consume();
	}
    }//GEN-LAST:event_apellidoKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
             char c = evt.getKeyChar();
	
	if(Character.isDigit(c) || Character.isISOControl(c))
	{
		evt = evt;
	}
        
	else
        {

		evt.consume();
	}
    }//GEN-LAST:event_precioKeyTyped

    private void ajustarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustarMouseClicked
          ConexionDB conn= new ConexionDB();
          int deshabilitado=0;
          if (checkDisp.isSelected())
          {
            deshabilitado=0;     
            this.disponible=0;
          }
          else
          {
            deshabilitado=1;  
             this.disponible=1;
          }
          
          if(name.getText().equals("") || apellido.getText().equals("") || mail.getText().equals("") || precio.getText().equals("0"))
          {
                 JOptionPane.showMessageDialog(this, "Llene todos los datos por favor o los datos ingresados son incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);       
          }
          else
          {
               conn.setAsiento(idAvion, idAsiento,name.getText(),apellido.getText(),mail.getText(),Integer.parseInt(precio.getText()),clase.getText(),deshabilitado);
                 JOptionPane.showMessageDialog(this, "Se ha editado el asiento correctamente", "Listo!", JOptionPane.INFORMATION_MESSAGE);
              vacio=0;

          }
          
          
         
    }//GEN-LAST:event_ajustarMouseClicked

    private void checkDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDispActionPerformed
 
    }//GEN-LAST:event_checkDispActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         ConexionDB conn= new ConexionDB();
        switch(vacio)
        {
            case 1:
                conn.anularNuevo(this.idAvion, this.idAsiento);   
             break;
       
        }

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(AdminAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminAsientos dialog = new AdminAsientos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ajustar;
    private javax.swing.JTextField apellido;
    private javax.swing.JCheckBox checkDisp;
    private javax.swing.JTextField clase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton vacante;
    // End of variables declaration//GEN-END:variables
}
