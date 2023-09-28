/*
Proyecto #2 Floricela Arguedas
Estructura de Datos - UNED 2023
Pantalla principal del programa
 */
package proyecto2_floricela_arguedas;


public class Interfaz_p2 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_p2
     */
    public Interfaz_p2() {
        initComponents();
        
        this.setLocationRelativeTo(null);//Ventana en el centro
        this.setTitle("Instrumentos Musicales");//Título de ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jLabel_Tittle = new javax.swing.JLabel();
        jLa_image = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMe_TipoInstrumentos = new javax.swing.JMenuItem();
        jMe_Instrumentos = new javax.swing.JMenuItem();
        jMe_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Tittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Tittle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Tittle.setText("Gestión de Instrumentos Musicales");

        jLa_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iStock-1157742384-1024x576.jpg"))); // NOI18N

        jDesktopPane.setLayer(jLabel_Tittle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLa_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLa_image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel_Tittle)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLa_image, javax.swing.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE))
        );

        jMenu.setText("Menú");

        jMe_TipoInstrumentos.setText("Tipos de Instrumentos");
        jMe_TipoInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMe_TipoInstrumentosActionPerformed(evt);
            }
        });
        jMenu.add(jMe_TipoInstrumentos);

        jMe_Instrumentos.setText("Instrumentos");
        jMe_Instrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMe_InstrumentosActionPerformed(evt);
            }
        });
        jMenu.add(jMe_Instrumentos);

        jMe_salir.setText("Salir");
        jMe_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMe_salirActionPerformed(evt);
            }
        });
        jMenu.add(jMe_salir);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMe_TipoInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMe_TipoInstrumentosActionPerformed
        // Activación de la ventana correspondiente
        try {
            VentanaTipodeInstrumentos activarventanati = new VentanaTipodeInstrumentos();
            Cola.Resetear();
            TipoInstrumento ExtraerTipo = Cola.Siguiente();
            while (ExtraerTipo != null) {
                activarventanati.modelolista.addElement("ID: " + ExtraerTipo.getID_instrumento() + " " + "Descripción: " + ExtraerTipo.getDescripcion());
                ExtraerTipo = Cola.Siguiente();
            }
            jDesktopPane.add(activarventanati);
            activarventanati.show();

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jMe_TipoInstrumentosActionPerformed

    private void jMe_InstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMe_InstrumentosActionPerformed
        // Activación de la ventana correspondiente
        try {
             VentanaInstrumento activarventanaI = new VentanaInstrumento();
            jDesktopPane.add(activarventanaI);
            activarventanaI.show();
            activarventanaI.CargarComboBox();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jMe_InstrumentosActionPerformed

    private void jMe_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMe_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jMe_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_p2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLa_image;
    private javax.swing.JLabel jLabel_Tittle;
    private javax.swing.JMenuItem jMe_Instrumentos;
    private javax.swing.JMenuItem jMe_TipoInstrumentos;
    private javax.swing.JMenuItem jMe_salir;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
