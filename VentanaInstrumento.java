
package proyecto2_floricela_arguedas;

import static java.lang.Double.parseDouble;
import java.util.UUID;
import javax.swing.table.DefaultTableModel;


public class VentanaInstrumento extends javax.swing.JInternalFrame {

    DefaultTableModel modelotabla = new DefaultTableModel();
   
    public VentanaInstrumento() {
        initComponents(); 
        jTa_Instrumentos.setModel(modelotabla);
        modelotabla.addColumn("DNI");
        modelotabla.addColumn("NOMBRE");
        modelotabla.addColumn("CONDICION");
        modelotabla.addColumn("VALOR");
        this.pila = new Pila();
        
    }

    //Declaraciones
    String dni;
    String[] MostrarInstrumento = new String[4];
    Pila pila;
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPa_PrincipalInstrumento = new javax.swing.JPanel();
        jLa_RegistroInstrumento = new javax.swing.JLabel();
        jLa_nombre = new javax.swing.JLabel();
        jLa_condicion = new javax.swing.JLabel();
        jLa_Valor = new javax.swing.JLabel();
        jBut_RegistrarInstrumento = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jText_Nombre = new javax.swing.JTextField();
        jText_Valor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTa_Instrumentos = new javax.swing.JTable();
        jBu_EliminarInstrumento = new javax.swing.JButton();
        jCB_condicion = new javax.swing.JComboBox<>();
        jLa_AvisoInstrumentos = new javax.swing.JLabel();
        jLa_TipoInstrumento = new javax.swing.JLabel();
        jCB_ElegirTiposIns = new javax.swing.JComboBox<>();
        jLa_InstruccionEliminar = new javax.swing.JLabel();
        jLa_TittleEliminar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro y Eliminación de Instrumentos");

        jPa_PrincipalInstrumento.setBackground(new java.awt.Color(0, 153, 153));
        jPa_PrincipalInstrumento.setForeground(new java.awt.Color(255, 255, 255));

        jLa_RegistroInstrumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLa_RegistroInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        jLa_RegistroInstrumento.setText("Registro de Instrumentos");

        jLa_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLa_nombre.setText("Nombre:");

        jLa_condicion.setForeground(new java.awt.Color(255, 255, 255));
        jLa_condicion.setText("Condición: ");

        jLa_Valor.setForeground(new java.awt.Color(255, 255, 255));
        jLa_Valor.setText("Valor: ");

        jBut_RegistrarInstrumento.setBackground(new java.awt.Color(0, 255, 153));
        jBut_RegistrarInstrumento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBut_RegistrarInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        jBut_RegistrarInstrumento.setText("Registrar");
        jBut_RegistrarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_RegistrarInstrumentoActionPerformed(evt);
            }
        });

        jTa_Instrumentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTa_Instrumentos);

        jBu_EliminarInstrumento.setBackground(new java.awt.Color(255, 51, 0));
        jBu_EliminarInstrumento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBu_EliminarInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        jBu_EliminarInstrumento.setText("Eliminar Instrumento");
        jBu_EliminarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBu_EliminarInstrumentoActionPerformed(evt);
            }
        });

        jCB_condicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Usado", "Reconstruido" }));

        jLa_AvisoInstrumentos.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLa_AvisoInstrumentos.setForeground(new java.awt.Color(255, 153, 153));

        jLa_TipoInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        jLa_TipoInstrumento.setText("Tipo de Instrumento");

        jCB_ElegirTiposIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ElegirTiposInsActionPerformed(evt);
            }
        });

        jLa_InstruccionEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLa_InstruccionEliminar.setText("Seleccione el tipo de instrumento");

        jLa_TittleEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLa_TittleEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLa_TittleEliminar.setText("Eliminación de Instrumentos");

        javax.swing.GroupLayout jPa_PrincipalInstrumentoLayout = new javax.swing.GroupLayout(jPa_PrincipalInstrumento);
        jPa_PrincipalInstrumento.setLayout(jPa_PrincipalInstrumentoLayout);
        jPa_PrincipalInstrumentoLayout.setHorizontalGroup(
            jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLa_InstruccionEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLa_AvisoInstrumentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                                .addComponent(jLa_RegistroInstrumento)
                                .addGap(226, 226, 226))))
                    .addGroup(jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLa_TittleEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jBu_EliminarInstrumento)))
                .addContainerGap())
            .addGroup(jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLa_TipoInstrumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_ElegirTiposIns, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLa_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLa_Valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLa_condicion)
                        .addGap(5, 5, 5)
                        .addComponent(jCB_condicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBut_RegistrarInstrumento)
                        .addGap(170, 170, 170))))
        );
        jPa_PrincipalInstrumentoLayout.setVerticalGroup(
            jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLa_RegistroInstrumento)
                .addGap(18, 18, 18)
                .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPa_PrincipalInstrumentoLayout.createSequentialGroup()
                        .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLa_nombre)
                            .addComponent(jText_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLa_InstruccionEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLa_condicion)
                        .addComponent(jCB_condicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLa_Valor)
                            .addComponent(jText_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_RegistrarInstrumento)
                    .addComponent(jLa_TipoInstrumento)
                    .addComponent(jCB_ElegirTiposIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPa_PrincipalInstrumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLa_TittleEliminar)
                    .addComponent(jBu_EliminarInstrumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLa_AvisoInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPa_PrincipalInstrumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPa_PrincipalInstrumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //METODOS
  public void CargarTablaInstrumentos() {
        // Funcion para cargar la tabla con los instrumentos creados segun su tipo
        try {
            modelotabla.setRowCount(0);
            int IndiceTipo = jCB_ElegirTiposIns.getSelectedIndex();

            TipoInstrumento TIencontrado = null;
            for (int contador = 0; contador <= IndiceTipo; contador++) {
                TIencontrado = Cola.Siguiente(); //Extraigo cada TI de la cola.
            }

            if (IndiceTipo != -1 && Cola.cola != null) {
                TIencontrado.pilaInstrumentos.Resetear();//Devuelvo la pila al inicio.
                Instrumento ins = TIencontrado.pilaInstrumentos.Siguiente();
                while (ins != null) {//Extraigo los atributos de cada Instrumento.
                    MostrarInstrumento[0] = ins.DNI;
                    MostrarInstrumento[1] = ins.nombre;
                    MostrarInstrumento[2] = ins.Condicion;
                    MostrarInstrumento[3] = Double.toString(ins.valor);
                    modelotabla.addRow(MostrarInstrumento);
                    ins = TIencontrado.pilaInstrumentos.Siguiente();
                }
            }
        } catch (Exception e) {
            jLa_AvisoInstrumentos.setText("ERROR INESPERADO");
        }

    }

    
    //Funcion para pasar a los combobox los tipos de instrumentos registrados
    public void CargarComboBox() {
        try {
            for (int i = 0; i <= Cola.fin; i++) {
                jCB_ElegirTiposIns.addItem(Cola.cola[i].getDescripcion());
            }
            if (jCB_ElegirTiposIns.getSelectedItem() == null) {

                jLa_AvisoInstrumentos.setText("CUIDADO. No existen Tipos de Instrumento, debe crear primero los tipos.");
            }
        } catch (Exception e) {
            jLa_AvisoInstrumentos.setText("ERROR INESPERADO");
        }
    }
    
    //Funcion para generar el DNI
    public String generarDNI() {
        UUID dni = UUID.randomUUID();
        return dni.toString();
    }
    
    
 
    
    //ACCIONES A PARTIR DE EVENTOS
    private void jBut_RegistrarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_RegistrarInstrumentoActionPerformed
        // Codigo para registrar un instrumento
        try {
            if (jText_Nombre.getText().length() != 0 && jText_Valor.getText().length() != 0) {
                modelotabla.setRowCount(0);
                String DNI = generarDNI();
                String nombre = jText_Nombre.getText();
                String condicion = jCB_condicion.getSelectedItem().toString();
                int IndiceTipo = jCB_ElegirTiposIns.getSelectedIndex();
                String valorS = jText_Valor.getText();
                double valor = parseDouble(valorS);
                //creo el objeto Instrumento
                Instrumento nuevoinstrumento = new Instrumento(DNI, nombre, condicion, valor);

                //Codigo para enviar el instrumento a la pila de la cola correspondiente
                TipoInstrumento TIencontrado = null;
                Cola.Resetear();
                for (int contador = 0; contador <= IndiceTipo; contador++) {
                    TIencontrado = Cola.Siguiente();
                }

                if (TIencontrado.pilaInstrumentos.LlenarPila(nuevoinstrumento) == true) {
                    //Creo array para guardar los atributos de los objetos y mostrarlos en pantalla.
                    TIencontrado.pilaInstrumentos.Resetear();
                    Instrumento ins = TIencontrado.pilaInstrumentos.Siguiente();
                    while (ins != null) {
                        MostrarInstrumento[0] = ins.DNI;
                        MostrarInstrumento[1] = ins.nombre;
                        MostrarInstrumento[2] = ins.Condicion;
                        MostrarInstrumento[3] = Double.toString(ins.valor);
                        modelotabla.addRow(MostrarInstrumento);
                        ins = TIencontrado.pilaInstrumentos.Siguiente();
                    }

                    jLa_AvisoInstrumentos.setText("Instrumento agregado con exito");

                } else {
                    jLa_AvisoInstrumentos.setText("No es posible agregar mas instrumentos, la pila esta llena");
                }
            } else {
                jLa_AvisoInstrumentos.setText("Error, debe llenar todas las casillas");
            }

        } catch (Exception e) {
            jLa_AvisoInstrumentos.setText("ERROR INESPERADO");
        }
    }//GEN-LAST:event_jBut_RegistrarInstrumentoActionPerformed

    private void jBu_EliminarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBu_EliminarInstrumentoActionPerformed
        // Llamo a la funcion para eliminar instrumento
        try {
            int IndiceTipo = jCB_ElegirTiposIns.getSelectedIndex();
            TipoInstrumento TIencontrado = null;
            Cola.Resetear();
            for (int contador = 0; contador <= IndiceTipo; contador++) {
                TIencontrado = Cola.Siguiente();
            }
            if (TIencontrado.pilaInstrumentos.VaciarPila() == true) {
                jLa_AvisoInstrumentos.setText("Instrumento eliminado con exito");
                modelotabla.setRowCount(0);
                TIencontrado.pilaInstrumentos.Resetear();
                Instrumento ins = TIencontrado.pilaInstrumentos.Siguiente();
                while (ins != null) {
                    MostrarInstrumento[0] = ins.DNI;
                    MostrarInstrumento[1] = ins.nombre;
                    MostrarInstrumento[2] = ins.Condicion;
                    MostrarInstrumento[3] = Double.toString(ins.valor);
                    modelotabla.addRow(MostrarInstrumento);
                    ins = TIencontrado.pilaInstrumentos.Siguiente();
                }

            } else {
                jLa_AvisoInstrumentos.setText("Imposible eliminar, la pila ya esta vacia");

            }
        } catch (Exception e) {
            jLa_AvisoInstrumentos.setText("ERROR INESPERADO");
        }
    }//GEN-LAST:event_jBu_EliminarInstrumentoActionPerformed

    private void jCB_ElegirTiposInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ElegirTiposInsActionPerformed
        // Codigo para cambiar los instrumentos mostrados en la tabla segun el tipo
        try {
            int IndiceTipo = jCB_ElegirTiposIns.getSelectedIndex();
            TipoInstrumento TIencontrado = null;
            Cola.Resetear();
            for (int contador = 0; contador <= IndiceTipo; contador++) {
                TIencontrado = Cola.Siguiente();
            }
            modelotabla.setRowCount(0);
            if (IndiceTipo != -1 && TIencontrado != null) {
                TIencontrado.pilaInstrumentos.Resetear();
                Instrumento ins = TIencontrado.pilaInstrumentos.Siguiente();
                while (ins != null) {
                    MostrarInstrumento[0] = ins.DNI;
                    MostrarInstrumento[1] = ins.nombre;
                    MostrarInstrumento[2] = ins.Condicion;
                    MostrarInstrumento[3] = Double.toString(ins.valor);
                    modelotabla.addRow(MostrarInstrumento);
                    ins = TIencontrado.pilaInstrumentos.Siguiente();
                }
            }
        } catch (Exception e) {
            jLa_AvisoInstrumentos.setText("ERROR INESPERADO");

        }
    }//GEN-LAST:event_jCB_ElegirTiposInsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBu_EliminarInstrumento;
    private javax.swing.JButton jBut_RegistrarInstrumento;
    private javax.swing.JComboBox<String> jCB_ElegirTiposIns;
    private javax.swing.JComboBox<String> jCB_condicion;
    private javax.swing.JLabel jLa_AvisoInstrumentos;
    private javax.swing.JLabel jLa_InstruccionEliminar;
    private javax.swing.JLabel jLa_RegistroInstrumento;
    private javax.swing.JLabel jLa_TipoInstrumento;
    private javax.swing.JLabel jLa_TittleEliminar;
    private javax.swing.JLabel jLa_Valor;
    private javax.swing.JLabel jLa_condicion;
    private javax.swing.JLabel jLa_nombre;
    private javax.swing.JPanel jPa_PrincipalInstrumento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTa_Instrumentos;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Valor;
    // End of variables declaration//GEN-END:variables
}
