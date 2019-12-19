/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamofausto;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class ProcesosCobros extends javax.swing.JFrame {

    /**
     * Creates new form ProcesosCobros
     */
    public ProcesosCobros() {
        initComponents();
        setLocationRelativeTo(null);
              setResizable(false);
         this.getContentPane().setBackground(Color.WHITE);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desde = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCobros = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hasta = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 207, -1));

        tablaCobros.setBackground(new java.awt.Color(255, 0, 204));
        tablaCobros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id cobro", "Fecha cobro", "Id cliente", "Valor cobro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCobros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 730, 190));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Menu");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 70, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Procesos de cobros");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Hasta");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Desde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(274, 274, 274))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(desde.getCalendar()!=null && hasta.getCalendar()!=null ){
            MetodosGenerales generales = new MetodosGenerales();
            ArrayList vector = new ArrayList();
            DefaultTableModel  modelo =(DefaultTableModel) tablaCobros.getModel();
            modelo.setRowCount(0);
            tablaCobros.setModel(modelo);
            SimpleDateFormat formato = new SimpleDateFormat("MM/dd/YYYY");
            String fechaD=formato.format(desde.getCalendar().getTime());
            Date fechaDesde = new Date(fechaD);

            String fechaH=formato.format(hasta.getCalendar().getTime());
            Date fechaHasta = new Date(fechaH);
            vector=generales.LlenarTablaRangoFecha("Cobros_prestamos.txt",fechaDesde,fechaHasta,1);
            String datos [ ] = new String [4];
            for (int i = 0; i <vector.size(); i++) {
                if(vector.get(i).toString().split("~")[5].equals("false")){
                datos[0]=vector.get(i).toString().split("~")[0];
                datos[1]=vector.get(i).toString().split("~")[1];
                datos[2]=vector.get(i).toString().split("~")[2];
                datos[3]=vector.get(i).toString().split("~")[3];
                modelo.addRow(datos);
                }
               

            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if(tablaCobros.getRowCount()==0){
                    JOptionPane.showMessageDialog(null,"La tabla de cobros esta vacia, por favor llenarlo","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                MetodosGenerales generales = new MetodosGenerales();
           
                 for(int i=0;i<tablaCobros.getRowCount();i++){
                     
                      ArrayList vector = generales.LlenarTablaCondicion("Detalles_Cobros.txt", 0,tablaCobros.getValueAt(i, 0).toString());
                      for(int j=0;j<vector.size();j++){
                          String cuotaPres  = generales.CuotaPrestamo(vector.get(i).toString().split("~")[2], vector.get(i).toString().split("~")[3]);
                          if(cuotaPres.equals("no")==false){
                              double valorCuota = Double.parseDouble(cuotaPres.split("~")[4]);
                              valorCuota -= Double.parseDouble(vector.get(i).toString().split("~")[4]);
                              String statusCuota="false";
                              if(valorCuota<=0.0){
                                  statusCuota="true";
                              }
                               cuotaPres = cuotaPres.split("~")[0]+"~"+cuotaPres.split("~")[1]+"~"+cuotaPres.split("~")[2]+"~"+cuotaPres.split("~")[3]+"~"+String.valueOf(valorCuota)+"~"+cuotaPres.split("~")[5]+"~"+cuotaPres.split("~")[6]+"~"+statusCuota;
                               generales.modificar("Cuotas_Prestamos.txt", cuotaPres.split("~")[0], cuotaPres);
                          
                          }
                      
                      }
                      
                      
                     String detalleCobro = generales.validarCondicion("Detalles_Cobros.txt", tablaCobros.getValueAt(i, 0).toString(), 0);
                     String prestamo = generales.validarID("Prestamos.txt", detalleCobro.split("~")[2]);
                     double balancePrestamo = Double.parseDouble(prestamo.split("~")[9]);
                     double valorCobro = Double.parseDouble(tablaCobros.getValueAt(i, 3).toString());
                     balancePrestamo -= valorCobro;
                     String statusPrestamo="false";
                     
                     if(balancePrestamo<=0.0){
                         statusPrestamo="true";
                     }
                     
                     prestamo=prestamo.split("~")[0]+"~"+prestamo.split("~")[1]+"~"+prestamo.split("~")[2]+"~"+statusPrestamo+"~"+prestamo.split("~")[4]+"~"+prestamo.split("~")[5]+"~"+
                                prestamo.split("~")[6]+"~"+prestamo.split("~")[7]+"~"+prestamo.split("~")[8]+"~"+balancePrestamo+"~"+prestamo.split("~")[10]+"~"+prestamo.split("~")[11]+"~"+prestamo.split("~")[12];
                        generales.modificarPrestamos("Prestamos.txt",prestamo.split("~")[0], prestamo);
                  }
                 
                  JOptionPane.showMessageDialog(null,"Los cobros se ha actualizado correctamente.");
                  DefaultTableModel  modelo =(DefaultTableModel) tablaCobros.getModel();
                  modelo.setRowCount(0);
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesosCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesosCobros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser desde;
    private com.toedter.calendar.JDateChooser hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCobros;
    // End of variables declaration//GEN-END:variables
}
