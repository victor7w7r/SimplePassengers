
package Vista;

import conexion.ConexionDB;
import javax.swing.JOptionPane;

/**
 *
 * @author KB
 */
public class Vuelos extends javax.swing.JDialog {

    public Vuelos() {
        initComponents();
        setModal(true);
        ConexionDB conn= new ConexionDB();
         tabla1= conn.datosAvion();
         
          for(int i=0; i<2; i++)
          {
             for(int j=0; j<5; j++)
            {
                 tabla.setValueAt(tabla1[i][j], i, j);   
            }
          }
          this.setLocationRelativeTo(null);
        
    } 
    
     String[][] tabla1=new String[2][5];
     
 
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        avionCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        origenCmb = new javax.swing.JComboBox<>();
        destCmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fecha = new org.jdatepicker.JDatePicker();
        enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuste de Vuelos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ajuste de Vuelos");

        avionCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE UNA OPCION---", "Boeing 747", "T400" }));
        avionCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                avionCmbItemStateChanged(evt);
            }
        });

        jLabel2.setText("Avión");

        jLabel3.setText("Origen");

        jLabel4.setText("Destino");
        jLabel4.setToolTipText("");

        origenCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE UNA OPCION---", "Quito", "Guayaquil", "Cuenca", "Latacunga" }));
        origenCmb.setEnabled(false);
        origenCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                origenCmbItemStateChanged(evt);
            }
        });
        origenCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenCmbActionPerformed(evt);
            }
        });

        destCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE UNA OPCION---", "Quito", "Guayaquil", "Cuenca", "Latacunga", " " }));
        destCmb.setEnabled(false);
        destCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destCmbItemStateChanged(evt);
            }
        });
        destCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destCmbActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Salida");
        jLabel5.setToolTipText("");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Avion", "Capacidad", "Origen", "Destino", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        fecha.setEnabled(false);
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        enviar.setText("Enviar");
        enviar.setEnabled(false);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(origenCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avionCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(origenCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(destCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enviar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void origenCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenCmbActionPerformed
     
    }//GEN-LAST:event_origenCmbActionPerformed

    private void destCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destCmbActionPerformed
     
        
    }//GEN-LAST:event_destCmbActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        enviar.setEnabled(true);
    }//GEN-LAST:event_fechaActionPerformed

    private void avionCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_avionCmbItemStateChanged
 
        if (avionCmb.getSelectedIndex()==0)
       {
           origenCmb.setEnabled(false);
           destCmb.setEnabled(false);
            fecha.setEnabled(false);
             enviar.setEnabled(false);
       }
       else
       {
           origenCmb.setEnabled(true);
       }
    }//GEN-LAST:event_avionCmbItemStateChanged

    private void origenCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_origenCmbItemStateChanged

         String selec=origenCmb.getSelectedItem().toString();
       if (origenCmb.getSelectedIndex()==0)
       {
           destCmb.setEnabled(false);
           fecha.setEnabled(false);
           enviar.setEnabled(false);
       }
       else
       {
            destCmb.removeAllItems();
           if(selec=="Quito")
           {
                destCmb.addItem("---SELECCIONE UNA OPCION---");
                destCmb.addItem("Guayaquil");
                destCmb.addItem("Cuenca");
                destCmb.addItem("Latacunga");
           }
           else if(selec=="Guayaquil")
           {
                destCmb.addItem("---SELECCIONE UNA OPCION---");
                destCmb.addItem("Quito");
                destCmb.addItem("Cuenca");
                destCmb.addItem("Latacunga");  
           }
           
           else if(selec=="Cuenca")
           {
               destCmb.addItem("---SELECCIONE UNA OPCION---");
                destCmb.addItem("Quito");
                destCmb.addItem("Guayaquil");
                destCmb.addItem("Latacunga");  
           }
              else if(selec=="Latacunga")
           {
               destCmb.addItem("---SELECCIONE UNA OPCION---");
                destCmb.addItem("Quito");
                destCmb.addItem("Guayaquil");
                destCmb.addItem("Cuenca");  
           }
           
           destCmb.setEnabled(true);
       }
        
        
       
        
    }//GEN-LAST:event_origenCmbItemStateChanged

    private void destCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destCmbItemStateChanged
 
        
        if (destCmb.getSelectedIndex()==0)
       {
            fecha.setEnabled(false);
             enviar.setEnabled(false);
       }
       else
       {
           fecha.setEnabled(true);
       }
    }//GEN-LAST:event_destCmbItemStateChanged

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        ConexionDB conn= new ConexionDB();
        int mes=fecha.getModel().getMonth()+1;
         String fechaActual=fecha.getModel().getYear()+"-"+mes+"-"+fecha.getModel().getDay();
         
        if(avionCmb.getSelectedItem().toString()=="Boeing 747")
        {
              conn.actualizarAvion(1, origenCmb.getSelectedItem().toString(), destCmb.getSelectedItem().toString(), fechaActual);
        }
        else
        {
              conn.actualizarAvion(2, origenCmb.getSelectedItem().toString(), destCmb.getSelectedItem().toString(), fechaActual);
        }
       
        
         ConexionDB conn2= new ConexionDB();
         tabla1= conn2.datosAvion();
         
          for(int i=0; i<2; i++)
          {
             for(int j=0; j<5; j++)
            {
                 tabla.setValueAt(tabla1[i][j], i, j);   
            }
          }
          
         JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente", "Listo!", JOptionPane.INFORMATION_MESSAGE);
         avionCmb.setSelectedIndex(0);
          origenCmb.setSelectedIndex(0);
              destCmb.setSelectedIndex(0);
          origenCmb.setEnabled(false);
           destCmb.setEnabled(false);
            fecha.setEnabled(false);
             enviar.setEnabled(false);
         
    }//GEN-LAST:event_enviarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> avionCmb;
    private javax.swing.JComboBox<String> destCmb;
    private javax.swing.JButton enviar;
    private org.jdatepicker.JDatePicker fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> origenCmb;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
