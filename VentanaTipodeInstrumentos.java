/*
 Ventana para el registro y eliminación de tipos de instrumentos
 */
package proyecto2_floricela_arguedas;

import javax.swing.DefaultListModel;


public class VentanaTipodeInstrumentos extends javax.swing.JInternalFrame {

        
    DefaultListModel modelolista = new DefaultListModel();
    
    public VentanaTipodeInstrumentos() {
        initComponents();
        jList_TipoInstrumentosR.setModel(modelolista);
    }

    //Declaraciones
    int IDc = 0;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPa_PrincipalTI = new javax.swing.JPanel();
        jLa_EncabezadoTI = new javax.swing.JLabel();
        jLa_TextoTI = new javax.swing.JLabel();
        jText_DescripcionTI = new javax.swing.JTextField();
        jBu_RegistrarTI = new javax.swing.JButton();
        jLa_AvisoRegistroTI = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_TipoInstrumentosR = new javax.swing.JList<>();
        jLa_TextoTIRegistrados = new javax.swing.JLabel();
        jBu_EliminarTI = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro y Eliminación de Tipos de Instrumentos");

        JPa_PrincipalTI.setBackground(new java.awt.Color(0, 153, 153));

        jLa_EncabezadoTI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLa_EncabezadoTI.setForeground(new java.awt.Color(255, 255, 255));
        jLa_EncabezadoTI.setText("Registre el Tipo de Instrumento");

        jLa_TextoTI.setForeground(new java.awt.Color(255, 255, 255));
        jLa_TextoTI.setText("Describa el tipo de Instrumento que desea registrar: ");

        jText_DescripcionTI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_DescripcionTIKeyTyped(evt);
            }
        });

        jBu_RegistrarTI.setBackground(new java.awt.Color(0, 255, 153));
        jBu_RegistrarTI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBu_RegistrarTI.setForeground(new java.awt.Color(255, 255, 255));
        jBu_RegistrarTI.setText("Registrar");
        jBu_RegistrarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBu_RegistrarTIActionPerformed(evt);
            }
        });

        jLa_AvisoRegistroTI.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLa_AvisoRegistroTI.setForeground(new java.awt.Color(255, 153, 153));

        jScrollPane1.setViewportView(jList_TipoInstrumentosR);

        jLa_TextoTIRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        jLa_TextoTIRegistrados.setText("Tipos de Instrumentos Registrados");

        jBu_EliminarTI.setBackground(new java.awt.Color(255, 51, 0));
        jBu_EliminarTI.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jBu_EliminarTI.setForeground(new java.awt.Color(255, 255, 255));
        jBu_EliminarTI.setText("Eliminar Tipo Instrumento");
        jBu_EliminarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBu_EliminarTIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPa_PrincipalTILayout = new javax.swing.GroupLayout(JPa_PrincipalTI);
        JPa_PrincipalTI.setLayout(JPa_PrincipalTILayout);
        JPa_PrincipalTILayout.setHorizontalGroup(
            JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLa_TextoTIRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jBu_EliminarTI)
                .addGap(25, 25, 25))
            .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                .addGroup(JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLa_AvisoRegistroTI, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                                .addComponent(jLa_TextoTI)
                                .addGap(18, 18, 18)
                                .addComponent(jText_DescripcionTI, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPa_PrincipalTILayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBu_RegistrarTI)
                        .addGap(32, 32, 32)))
                .addContainerGap())
            .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLa_EncabezadoTI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPa_PrincipalTILayout.setVerticalGroup(
            JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLa_EncabezadoTI)
                .addGap(18, 18, 18)
                .addGroup(JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLa_TextoTI)
                    .addComponent(jText_DescripcionTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBu_RegistrarTI)
                    .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLa_AvisoRegistroTI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLa_TextoTIRegistrados)
                .addGroup(JPa_PrincipalTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBu_EliminarTI)
                        .addGap(66, 66, 66))
                    .addGroup(JPa_PrincipalTILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPa_PrincipalTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPa_PrincipalTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void jBu_RegistrarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBu_RegistrarTIActionPerformed
        // Codigo que se ejecuta en el evento de registrar
        try {
            //Genero codigo unico y consecutivo cada vez que se registra
            IDc++;
            String descrip = jText_DescripcionTI.getText();//Extraigo la descripcion 
            if (jText_DescripcionTI.getText().length()!= 0){
            //Creo el objeto TipoInstrumento
            TipoInstrumento nuevoTipoInstrumento = new TipoInstrumento(IDc, descrip);
            //Llamo a la funcion que llena la cola de objetos     
            if (Cola.LlenarCola(nuevoTipoInstrumento) == true) {
                modelolista.addElement("ID: " + nuevoTipoInstrumento.getID_instrumento() + " " + "Descripción: " + nuevoTipoInstrumento.getDescripcion());
                // modelolista.addElement("ID: " + Cola.cola[Cola.fin].getID_instrumento() + " " + "Descripción: " + Cola.cola[Cola.fin].getDescripcion());//Muestro en la lista el Tipo Elemento registrado
                jLa_AvisoRegistroTI.setText(" Se agrego con exito el Tipo de Instrumento ");

            } else {
                jLa_AvisoRegistroTI.setText("No es posible agregar mas, la cola esta llena");
            }
            jText_DescripcionTI.setText(null);
            }
            else{
                jLa_AvisoRegistroTI.setText("Error, debe llenar la casilla");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jBu_RegistrarTIActionPerformed

    private void jText_DescripcionTIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_DescripcionTIKeyTyped
        // Limitar caracteres
         if (jText_DescripcionTI.getText().length() >= 20) {
            evt.consume();
       }
    }//GEN-LAST:event_jText_DescripcionTIKeyTyped

    private void jBu_EliminarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBu_EliminarTIActionPerformed
        // Llamado a la funcion para eliminar el primer elemento de la cola
        try {
            //Y desplazar todos los elementos como corresponda.
            if (Cola.fin != -1 && Cola.NoExistenInstrumentos() == true) {
                Cola.VaciarCola();
                jLa_AvisoRegistroTI.setText("Eliminacion exitosa");
                modelolista.clear();
                //Cargar de nuevo la lista
                Cola.Resetear();
                TipoInstrumento ExtraerTipo = Cola.Siguiente();

                while (ExtraerTipo != null) {
                    modelolista.addElement("ID: " + ExtraerTipo.getID_instrumento() + " " + "Descripción: " + ExtraerTipo.getDescripcion());
                    ExtraerTipo = Cola.Siguiente();
                }

            } else {
                if (Cola.fin != -1 && Cola.NoExistenInstrumentos() == false) {
                    jLa_AvisoRegistroTI.setText("No es posible eliminar,contiene instrumentos asociados");
                    return;

                }
                if (Cola.fin == -1) {
                    jLa_AvisoRegistroTI.setText("No es posible eliminar Tipos de Instrumentos, la cola esta vacia");
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jBu_EliminarTIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPa_PrincipalTI;
    private javax.swing.JButton jBu_EliminarTI;
    private javax.swing.JButton jBu_RegistrarTI;
    private javax.swing.JLabel jLa_AvisoRegistroTI;
    private javax.swing.JLabel jLa_EncabezadoTI;
    private javax.swing.JLabel jLa_TextoTI;
    private javax.swing.JLabel jLa_TextoTIRegistrados;
    private javax.swing.JList<String> jList_TipoInstrumentosR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jText_DescripcionTI;
    // End of variables declaration//GEN-END:variables
}
