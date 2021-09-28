
package Vista;

import conexion.ConexionDB;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author KB
 */
public class Asientos extends javax.swing.JDialog {

    private int[] capacidad=new int[30];
    public Asientos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
          this.setLocationRelativeTo(null);
        lblAviso.setVisible(false);
          lblAviso1.setVisible(false);
          menu.setVisible(false);
         detalles.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        avionCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        lblAviso1 = new javax.swing.JLabel();
        jAsientosM = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        asiento1 = new javax.swing.JCheckBoxMenuItem();
        asiento2 = new javax.swing.JCheckBoxMenuItem();
        asiento3 = new javax.swing.JCheckBoxMenuItem();
        asiento4 = new javax.swing.JCheckBoxMenuItem();
        asiento5 = new javax.swing.JCheckBoxMenuItem();
        asiento6 = new javax.swing.JCheckBoxMenuItem();
        asiento7 = new javax.swing.JCheckBoxMenuItem();
        asiento8 = new javax.swing.JCheckBoxMenuItem();
        asiento9 = new javax.swing.JCheckBoxMenuItem();
        asiento10 = new javax.swing.JCheckBoxMenuItem();
        asiento11 = new javax.swing.JCheckBoxMenuItem();
        asiento12 = new javax.swing.JCheckBoxMenuItem();
        asiento13 = new javax.swing.JCheckBoxMenuItem();
        asiento14 = new javax.swing.JCheckBoxMenuItem();
        asiento15 = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        asiento16 = new javax.swing.JCheckBoxMenuItem();
        asiento17 = new javax.swing.JCheckBoxMenuItem();
        asiento18 = new javax.swing.JCheckBoxMenuItem();
        asiento19 = new javax.swing.JCheckBoxMenuItem();
        asiento20 = new javax.swing.JCheckBoxMenuItem();
        asiento21 = new javax.swing.JCheckBoxMenuItem();
        asiento22 = new javax.swing.JCheckBoxMenuItem();
        asiento23 = new javax.swing.JCheckBoxMenuItem();
        asiento24 = new javax.swing.JCheckBoxMenuItem();
        asiento25 = new javax.swing.JCheckBoxMenuItem();
        asiento26 = new javax.swing.JCheckBoxMenuItem();
        asiento27 = new javax.swing.JCheckBoxMenuItem();
        asiento28 = new javax.swing.JCheckBoxMenuItem();
        asiento29 = new javax.swing.JCheckBoxMenuItem();
        asiento30 = new javax.swing.JCheckBoxMenuItem();
        detalles = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Asientos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Asientos");

        avionCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE UNA OPCION---", "Boeing 747", "T400" }));
        avionCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                avionCmbItemStateChanged(evt);
            }
        });

        jLabel2.setText("Avión:");

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/bus.png"))); // NOI18N
        imagen.setToolTipText("");

        lblAviso.setText("Seleccione una silla, cada silla que esté marcada, está ocupada");

        lblAviso1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAviso1.setText("Capacidad del Avión: 30");

        menu.setText("Asientos");
        menu.add(jSeparator4);

        jMenuItem2.setText("Clase Regular");
        jMenuItem2.setEnabled(false);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem2);
        menu.add(jSeparator5);

        asiento1.setText("Asiento 1");
        asiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento1ActionPerformed(evt);
            }
        });
        menu.add(asiento1);

        asiento2.setText("Asiento 2");
        asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento2ActionPerformed(evt);
            }
        });
        menu.add(asiento2);

        asiento3.setText("Asiento 3");
        asiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento3ActionPerformed(evt);
            }
        });
        menu.add(asiento3);

        asiento4.setText("Asiento 4");
        asiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento4ActionPerformed(evt);
            }
        });
        menu.add(asiento4);

        asiento5.setText("Asiento 5");
        asiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento5ActionPerformed(evt);
            }
        });
        menu.add(asiento5);

        asiento6.setText("Asiento 6");
        asiento6.setToolTipText("");
        asiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento6ActionPerformed(evt);
            }
        });
        menu.add(asiento6);

        asiento7.setText("Asiento 7");
        asiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento7ActionPerformed(evt);
            }
        });
        menu.add(asiento7);

        asiento8.setText("Asiento 8");
        asiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento8ActionPerformed(evt);
            }
        });
        menu.add(asiento8);

        asiento9.setText("Asiento 9");
        asiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento9ActionPerformed(evt);
            }
        });
        menu.add(asiento9);

        asiento10.setText("Asiento 10");
        asiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento10ActionPerformed(evt);
            }
        });
        menu.add(asiento10);

        asiento11.setText("Asiento 11");
        asiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento11ActionPerformed(evt);
            }
        });
        menu.add(asiento11);

        asiento12.setText("Asiento 12");
        asiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento12ActionPerformed(evt);
            }
        });
        menu.add(asiento12);

        asiento13.setText("Asiento 13");
        asiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento13ActionPerformed(evt);
            }
        });
        menu.add(asiento13);

        asiento14.setText("Asiento 14");
        asiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento14ActionPerformed(evt);
            }
        });
        menu.add(asiento14);

        asiento15.setText("Asiento 15");
        asiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento15ActionPerformed(evt);
            }
        });
        menu.add(asiento15);
        menu.add(jSeparator3);

        jMenuItem1.setText("Primera Clase");
        jMenuItem1.setEnabled(false);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem1);
        menu.add(jSeparator2);

        asiento16.setText("Asiento 16");
        asiento16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento16ActionPerformed(evt);
            }
        });
        menu.add(asiento16);

        asiento17.setText("Asiento 17");
        asiento17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento17ActionPerformed(evt);
            }
        });
        menu.add(asiento17);

        asiento18.setText("Asiento 18");
        asiento18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento18ActionPerformed(evt);
            }
        });
        menu.add(asiento18);

        asiento19.setText("Asiento 19");
        asiento19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento19ActionPerformed(evt);
            }
        });
        menu.add(asiento19);

        asiento20.setText("Asiento 20");
        asiento20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento20ActionPerformed(evt);
            }
        });
        menu.add(asiento20);

        asiento21.setText("Asiento 21");
        asiento21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento21ActionPerformed(evt);
            }
        });
        menu.add(asiento21);

        asiento22.setText("Asiento 22");
        asiento22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento22ActionPerformed(evt);
            }
        });
        menu.add(asiento22);

        asiento23.setText("Asiento 23");
        asiento23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento23ActionPerformed(evt);
            }
        });
        menu.add(asiento23);

        asiento24.setText("Asiento 24");
        asiento24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento24ActionPerformed(evt);
            }
        });
        menu.add(asiento24);

        asiento25.setText("Asiento 25");
        asiento25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento25ActionPerformed(evt);
            }
        });
        menu.add(asiento25);

        asiento26.setText("Asiento 26");
        asiento26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento26ActionPerformed(evt);
            }
        });
        menu.add(asiento26);

        asiento27.setText("Asiento 27");
        asiento27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento27ActionPerformed(evt);
            }
        });
        menu.add(asiento27);

        asiento28.setText("Asiento 28");
        asiento28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento28ActionPerformed(evt);
            }
        });
        menu.add(asiento28);

        asiento29.setText("Asiento 29");
        asiento29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento29ActionPerformed(evt);
            }
        });
        menu.add(asiento29);

        asiento30.setText("Asiento 30");
        asiento30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asiento30ActionPerformed(evt);
            }
        });
        menu.add(asiento30);

        jAsientosM.add(menu);

        detalles.setText("Detalles");
        detalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detallesMouseClicked(evt);
            }
        });
        jAsientosM.add(detalles);

        setJMenuBar(jAsientosM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblAviso1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(avionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAviso)
                        .addGap(17, 17, 17)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addComponent(lblAviso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAviso)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void checkAsientos()
    {
     if(capacidad[0]!=0)
          asiento1.setState(false);
     else
          asiento1.setState(true); 
     if(capacidad[1]!=0)
          asiento2.setState(false);
     else
          asiento2.setState(true); 
      if(capacidad[2]!=0)
          asiento3.setState(false);
     else
          asiento3.setState(true); 
       if(capacidad[3]!=0)
          asiento4.setState(false);
     else
          asiento4.setState(true); 
     if(capacidad[4]!=0)
          asiento5.setState(false);
     else
          asiento5.setState(true);
    if(capacidad[5]!=0)
          asiento6.setState(false);
     else
          asiento6.setState(true);
    if(capacidad[6]!=0)
          asiento7.setState(false);
     else
          asiento7.setState(true);
      if(capacidad[7]!=0)
          asiento8.setState(false);
     else
          asiento8.setState(true);
      if(capacidad[8]!=0)
          asiento9.setState(false);
     else
          asiento9.setState(true);
     if(capacidad[9]!=0)
          asiento10.setState(false);
     else
          asiento10.setState(true);
     if(capacidad[10]!=0)
          asiento11.setState(false);
     else
          asiento11.setState(true);
     if(capacidad[11]!=0)
          asiento12.setState(false);
     else
          asiento12.setState(true);
     if(capacidad[12]!=0)
          asiento13.setState(false);
     else
          asiento13.setState(true);
     if(capacidad[13]!=0)
          asiento14.setState(false);
     else
          asiento14.setState(true);
     if(capacidad[14]!=0)
          asiento15.setState(false);
     else
          asiento15.setState(true);
     if(capacidad[15]!=0)
          asiento16.setState(false);
     else
          asiento16.setState(true);
     if(capacidad[16]!=0)
          asiento17.setState(false);
     else
          asiento17.setState(true);
     if(capacidad[17]!=0)
          asiento18.setState(false);
     else
          asiento18.setState(true);
     if(capacidad[18]!=0)
          asiento19.setState(false);
     else
          asiento19.setState(true);
     if(capacidad[19]!=0)
          asiento20.setState(false);
     else
          asiento20.setState(true);
     if(capacidad[20]!=0)
          asiento21.setState(false);
     else
          asiento21.setState(true);
     if(capacidad[21]!=0)
          asiento22.setState(false);
     else
          asiento22.setState(true);
     if(capacidad[22]!=0)
          asiento23.setState(false);
     else
          asiento23.setState(true);
     if(capacidad[23]!=0)
          asiento24.setState(false);
     else
          asiento24.setState(true);
     if(capacidad[24]!=0)
          asiento25.setState(false);
     else
          asiento25.setState(true);
     if(capacidad[25]!=0)
          asiento26.setState(false);
     else
          asiento26.setState(true);
     if(capacidad[26]!=0)
          asiento27.setState(false);
     else
          asiento27.setState(true);
     if(capacidad[27]!=0)
          asiento28.setState(false);
     else
          asiento28.setState(true);
     if(capacidad[28]!=0)
          asiento29.setState(false);
     else
          asiento29.setState(true);
      if(capacidad[29]!=0)
          asiento30.setState(false);
     else
          asiento30.setState(true);
    }
    
    
    private void avionCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_avionCmbItemStateChanged
              ConexionDB conn=new ConexionDB();
        int cont=0;
        if (avionCmb.getSelectedIndex()==0)
       {
            lblAviso.setVisible(false);
            lblAviso1.setVisible(false);
            menu.setVisible(false);
                detalles.setVisible(false);
       }
       else
       {
           if(avionCmb.getSelectedIndex()==1)
           {
               cont=0;
              capacidad= conn.capacidad(0);
              
              for(int i=0; i<30;i++)
              {
                  if(capacidad[i]==1)
                     cont++;
                  
              }
              
             checkAsientos();  
              lblAviso1.setText("Capacidad del Avión: "+cont);
           }
           else if(avionCmb.getSelectedIndex()==2)
           {
               cont=0;

              capacidad= conn.capacidad(1);
              
              for(int i=0; i<30;i++)
              {
                  if(capacidad[i]==1)
                     cont++;
                  
              }
              
           checkAsientos();
               lblAviso1.setText("Capacidad del Avión: "+cont);
           }
          lblAviso.setVisible(true);
           lblAviso1.setVisible(true);
           menu.setVisible(true);
           detalles.setVisible(true);
       }
 
    }//GEN-LAST:event_avionCmbItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void detallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detallesMouseClicked
         if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            Detalles d=new Detalles(modalidad,true);
            d.envioAvion(0);
            d.setVisible(true);
            
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
             JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            Detalles d=new Detalles(modalidad,true);
              d.envioAvion(1);
            d.setVisible(true);
        }
    }//GEN-LAST:event_detallesMouseClicked

    private void asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento2ActionPerformed
      if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,2,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento2.setState(true);
            else
                 asiento2.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,2,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento2.setState(true);
            else
                 asiento2.setState(false); 
          
        }
    }//GEN-LAST:event_asiento2ActionPerformed

    private void asiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento3ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,3,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento3.setState(true);
            else
                 asiento3.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,3,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento3.setState(true);
            else
                 asiento3.setState(false); 
          
        }
    }//GEN-LAST:event_asiento3ActionPerformed

    private void asiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento4ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,4,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento4.setState(true);
            else
                 asiento4.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,4,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento4.setState(true);
            else
                 asiento4.setState(false); 
          
        }
    }//GEN-LAST:event_asiento4ActionPerformed

    private void asiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento5ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,5,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento5.setState(true);
            else
                 asiento5.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,5,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento5.setState(true);
            else
                 asiento5.setState(false); 
          
        }
    }//GEN-LAST:event_asiento5ActionPerformed

    private void asiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento6ActionPerformed
  if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,6,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento6.setState(true);
            else
                 asiento6.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,6,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento6.setState(true);
            else
                 asiento6.setState(false); 
          
        }
    }//GEN-LAST:event_asiento6ActionPerformed

    private void asiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento7ActionPerformed
        if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,7,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento7.setState(true);
            else
                 asiento7.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,7,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento7.setState(true);
            else
                 asiento7.setState(false); 
          
        }
    }//GEN-LAST:event_asiento7ActionPerformed

    private void asiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento8ActionPerformed
     if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,8,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento8.setState(true);
            else
                 asiento8.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,8,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento8.setState(true);
            else
                 asiento8.setState(false); 
          
        }
    }//GEN-LAST:event_asiento8ActionPerformed

    private void asiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento9ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,9,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento9.setState(true);
            else
                 asiento9.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,9,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento9.setState(true);
            else
                 asiento9.setState(false); 
          
        }
    }//GEN-LAST:event_asiento9ActionPerformed

    private void asiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento10ActionPerformed
        if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,10,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento10.setState(true);
            else
                 asiento10.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,10,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento10.setState(true);
            else
                 asiento10.setState(false); 
          
        }
    }//GEN-LAST:event_asiento10ActionPerformed

    private void asiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento11ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,12,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento11.setState(true);
            else
                 asiento11.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,12,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento11.setState(true);
            else
                 asiento11.setState(false); 
          
        }
          
    }//GEN-LAST:event_asiento11ActionPerformed

    private void asiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento12ActionPerformed
           if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,12,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento12.setState(true);
            else
                 asiento12.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,12,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento12.setState(true);
            else
                 asiento12.setState(false); 
          
        }
    }//GEN-LAST:event_asiento12ActionPerformed

    private void asiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento13ActionPerformed
             if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,13,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento13.setState(true);
            else
                 asiento13.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,13,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento13.setState(true);
            else
                 asiento13.setState(false); 
          
        }
    }//GEN-LAST:event_asiento13ActionPerformed

    private void asiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento14ActionPerformed
        if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,14,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento14.setState(true);
            else
                 asiento14.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,14,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento14.setState(true);
            else
                 asiento14.setState(false); 
          
        }
    }//GEN-LAST:event_asiento14ActionPerformed

    private void asiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento15ActionPerformed
           if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,15,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento15.setState(true);
            else
                 asiento15.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,15,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento15.setState(true);
            else
                 asiento15.setState(false); 
          
        }
    }//GEN-LAST:event_asiento15ActionPerformed

    private void asiento16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento16ActionPerformed
             if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,16,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento16.setState(true);
            else
                 asiento16.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,16,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento16.setState(true);
            else
                 asiento16.setState(false); 
          
        }
    }//GEN-LAST:event_asiento16ActionPerformed

    private void asiento17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento17ActionPerformed
               if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,17,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento17.setState(true);
            else
                 asiento17.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,17,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento17.setState(true);
            else
                 asiento17.setState(false); 
          
        }
    }//GEN-LAST:event_asiento17ActionPerformed

    private void asiento18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento18ActionPerformed
               if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,18,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento18.setState(true);
            else
                 asiento18.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,18,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento18.setState(true);
            else
                 asiento18.setState(false); 
          
        }
    }//GEN-LAST:event_asiento18ActionPerformed

    private void asiento19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento19ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,19,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento19.setState(true);
            else
                 asiento19.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,19,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento19.setState(true);
            else
                 asiento19.setState(false); 
          
        }
    }//GEN-LAST:event_asiento19ActionPerformed

    private void asiento20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento20ActionPerformed
        if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,20,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento20.setState(true);
            else
                 asiento20.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,20,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento20.setState(true);
            else
                 asiento20.setState(false); 
          
        }
    }//GEN-LAST:event_asiento20ActionPerformed

    private void asiento21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento21ActionPerformed
         if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,21,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento21.setState(true);
            else
                 asiento21.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,21,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento21.setState(true);
            else
                 asiento21.setState(false); 
          
        }
    }//GEN-LAST:event_asiento21ActionPerformed

    private void asiento22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento22ActionPerformed
             if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,22,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento22.setState(true);
            else
                 asiento22.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,22,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento22.setState(true);
            else
                 asiento22.setState(false); 
          
        }
    }//GEN-LAST:event_asiento22ActionPerformed

    private void asiento23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento23ActionPerformed
        if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,23,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento23.setState(true);
            else
                 asiento23.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,23,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento23.setState(true);
            else
                 asiento23.setState(false); 
          
        }
    }//GEN-LAST:event_asiento23ActionPerformed

    private void asiento24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento24ActionPerformed
            if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,24,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento24.setState(true);
            else
                 asiento24.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,24,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento24.setState(true);
            else
                 asiento24.setState(false); 
          
        }
    }//GEN-LAST:event_asiento24ActionPerformed

    private void asiento25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento25ActionPerformed
                   if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,25,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento25.setState(true);
            else
                 asiento25.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,20,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento25.setState(true);
            else
                 asiento25.setState(false); 
          
        }
    }//GEN-LAST:event_asiento25ActionPerformed

    private void asiento26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento26ActionPerformed
      if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,26,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento26.setState(true);
            else
                 asiento26.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,26,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento26.setState(true);
            else
                 asiento26.setState(false); 
          
        }
    }//GEN-LAST:event_asiento26ActionPerformed

    private void asiento27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento27ActionPerformed
                   if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,27,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento27.setState(true);
            else
                 asiento27.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,27,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento27.setState(true);
            else
                 asiento27.setState(false); 
          
        }
    }//GEN-LAST:event_asiento27ActionPerformed

    private void asiento28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento28ActionPerformed
                    if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,28,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento28.setState(true);
            else
                 asiento28.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,28,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento28.setState(true);
            else
                 asiento28.setState(false); 
          
        }
    }//GEN-LAST:event_asiento28ActionPerformed

    private void asiento29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento29ActionPerformed
         if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,29,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento29.setState(true);
            else
                 asiento29.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,29,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento29.setState(true);
            else
                 asiento29.setState(false); 
        }
    }//GEN-LAST:event_asiento29ActionPerformed

    private void asiento30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento30ActionPerformed
       if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,30,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento30.setState(true);
            else
                 asiento30.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,30,"Primera Clase");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento30.setState(true);
            else
                 asiento30.setState(false); 
        }
    }//GEN-LAST:event_asiento30ActionPerformed

    private void asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asiento1ActionPerformed
      
        if(avionCmb.getSelectedItem().toString().equals("Boeing 747"))
        {
            JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
            AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(0,1,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento1.setState(true);
            else
                 asiento1.setState(false); 
      
        }
        else if(avionCmb.getSelectedItem().toString().equals("T400"))
        {
           JFrame modalidad = (JFrame) SwingUtilities.getWindowAncestor(this);
           AdminAsientos ad=new AdminAsientos(modalidad,true);
            ad.envioDatos(1,1,"Clase Regular");
            int valor=ad.showDialog();
            if (valor==0)
                  asiento1.setState(true);
            else
                 asiento1.setState(false); 
          
        }
    }//GEN-LAST:event_asiento1ActionPerformed

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
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Asientos dialog = new Asientos(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBoxMenuItem asiento1;
    private javax.swing.JCheckBoxMenuItem asiento10;
    private javax.swing.JCheckBoxMenuItem asiento11;
    private javax.swing.JCheckBoxMenuItem asiento12;
    private javax.swing.JCheckBoxMenuItem asiento13;
    private javax.swing.JCheckBoxMenuItem asiento14;
    private javax.swing.JCheckBoxMenuItem asiento15;
    private javax.swing.JCheckBoxMenuItem asiento16;
    private javax.swing.JCheckBoxMenuItem asiento17;
    private javax.swing.JCheckBoxMenuItem asiento18;
    private javax.swing.JCheckBoxMenuItem asiento19;
    private javax.swing.JCheckBoxMenuItem asiento2;
    private javax.swing.JCheckBoxMenuItem asiento20;
    private javax.swing.JCheckBoxMenuItem asiento21;
    private javax.swing.JCheckBoxMenuItem asiento22;
    private javax.swing.JCheckBoxMenuItem asiento23;
    private javax.swing.JCheckBoxMenuItem asiento24;
    private javax.swing.JCheckBoxMenuItem asiento25;
    private javax.swing.JCheckBoxMenuItem asiento26;
    private javax.swing.JCheckBoxMenuItem asiento27;
    private javax.swing.JCheckBoxMenuItem asiento28;
    private javax.swing.JCheckBoxMenuItem asiento29;
    private javax.swing.JCheckBoxMenuItem asiento3;
    private javax.swing.JCheckBoxMenuItem asiento30;
    private javax.swing.JCheckBoxMenuItem asiento4;
    private javax.swing.JCheckBoxMenuItem asiento5;
    private javax.swing.JCheckBoxMenuItem asiento6;
    private javax.swing.JCheckBoxMenuItem asiento7;
    private javax.swing.JCheckBoxMenuItem asiento8;
    private javax.swing.JCheckBoxMenuItem asiento9;
    private javax.swing.JComboBox<String> avionCmb;
    private javax.swing.JMenu detalles;
    private javax.swing.JLabel imagen;
    private javax.swing.JMenuBar jAsientosM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblAviso1;
    private javax.swing.JMenu menu;
    // End of variables declaration//GEN-END:variables
}
