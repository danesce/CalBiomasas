/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 * @author JEAN PAUL
 */
public class GraficasCasoestudio extends javax.swing.JFrame {

    inicioframe casa;
    
    public GraficasCasoestudio(int opcion) {
        initComponents();
        this.setLocationRelativeTo(null);        
        
        if(opcion==1)
        {
            //grafica region 1
           JlblImagenGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/DisponibilidadRegion1.JPG"))); // NOI18N
           JlblImagenGrafica.setAlignmentY(0.0F);
           getContentPane().add(JlblImagenGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1220, 460));
            
            
        }else if(opcion==2)
        {
           JlblImagenGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/DisponibilidadRegion2.JPG"))); // NOI18N
           JlblImagenGrafica.setAlignmentY(0.0F);
           getContentPane().add(JlblImagenGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1220, 460));
            
            
        }else{
            //grafica region 3
           JlblImagenGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/DisponibilidadRegion3.JPG"))); // NOI18N
           JlblImagenGrafica.setAlignmentY(0.0F);
           getContentPane().add(JlblImagenGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1220, 460)); 
                       
        }
        
        
        setVisible(true);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlblImagenGrafica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grafica");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setName("Grafica"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(JlblImagenGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1250, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GraficasCasoestudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficasCasoestudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficasCasoestudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficasCasoestudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblImagenGrafica;
    // End of variables declaration//GEN-END:variables
}
