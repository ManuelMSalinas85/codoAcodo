package un6ej13;

public class Pasajero extends javax.swing.JFrame {

    public Pasajero() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pasajero");
        setSize(700,500);
        String [] destinos = new String[7];
        destinos[1]="Buenos Aires";
        destinos[2]="Inglaterra";
        destinos[3]="Francia";
        destinos[4]="Italia";
        destinos[5]="Alemania";
        destinos[6]="Japón";
        for (int i = 0; i < 7; i++) {
            this.listaDestinos.addItem(destinos[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonEstadoCivil = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        texNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        texApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soltero = new javax.swing.JRadioButton();
        casado = new javax.swing.JRadioButton();
        viudo = new javax.swing.JRadioButton();
        divorciado = new javax.swing.JRadioButton();
        separado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        listaDestinos = new javax.swing.JComboBox<>();
        botonSalir = new javax.swing.JButton();
        chEspaniol = new javax.swing.JCheckBox();
        chIngles = new javax.swing.JCheckBox();
        chFrances = new javax.swing.JCheckBox();
        chItaliano = new javax.swing.JCheckBox();
        chAleman = new javax.swing.JCheckBox();
        chJapones = new javax.swing.JCheckBox();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");

        texNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        texNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellido");

        texApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        texApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texApellidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado Civil");

        grupoBotonEstadoCivil.add(soltero);
        soltero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        soltero.setText("Soltero/a");
        soltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solteroActionPerformed(evt);
            }
        });

        grupoBotonEstadoCivil.add(casado);
        casado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        casado.setText("Casado/a");
        casado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casadoActionPerformed(evt);
            }
        });

        grupoBotonEstadoCivil.add(viudo);
        viudo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viudo.setText("Viudo/a");
        viudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viudoActionPerformed(evt);
            }
        });

        grupoBotonEstadoCivil.add(divorciado);
        divorciado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        divorciado.setText("Divorciado/a");
        divorciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divorciadoActionPerformed(evt);
            }
        });

        grupoBotonEstadoCivil.add(separado);
        separado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        separado.setText("Separado/a");
        separado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                separadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Destino");

        listaDestinos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDestinosActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        chEspaniol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chEspaniol.setText("Español");

        chIngles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chIngles.setText("Inglés");
        chIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chInglesActionPerformed(evt);
            }
        });

        chFrances.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chFrances.setText("Francés");
        chFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chFrancesActionPerformed(evt);
            }
        });

        chItaliano.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chItaliano.setText("Italiano");

        chAleman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chAleman.setText("Alemán");

        chJapones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chJapones.setText("Japonés");

        botonAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texNombre)
                            .addComponent(texApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listaDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(soltero)
                        .addGap(18, 18, 18)
                        .addComponent(casado)
                        .addGap(18, 18, 18)
                        .addComponent(viudo)
                        .addGap(18, 18, 18)
                        .addComponent(divorciado)
                        .addGap(18, 18, 18)
                        .addComponent(separado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(chIngles)
                                .addGap(32, 32, 32)
                                .addComponent(chFrances))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chEspaniol)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chItaliano)
                        .addGap(18, 18, 18)
                        .addComponent(chAleman)
                        .addGap(18, 18, 18)
                        .addComponent(chJapones)))
                .addGap(24, 24, 24))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(botonSalir)))
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(texNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casado)
                    .addComponent(viudo)
                    .addComponent(divorciado)
                    .addComponent(soltero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separado))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chEspaniol)
                    .addComponent(chIngles)
                    .addComponent(chFrances)
                    .addComponent(chItaliano)
                    .addComponent(chAleman)
                    .addComponent(chJapones))
                .addGap(18, 18, 18)
                .addComponent(botonAceptar)
                .addGap(26, 26, 26)
                .addComponent(botonSalir)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texApellidoActionPerformed

    private void listaDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDestinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDestinosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void chInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chInglesActionPerformed

    private void texNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texNombreActionPerformed

    private void casadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casadoActionPerformed

    private void solteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solteroActionPerformed

    @SuppressWarnings("static-access")
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        DatosViajero pantallaDatos = new DatosViajero();
        pantallaDatos.setVisible(true);
        pantallaDatos.nombreFinal.setText(texNombre.getText());
        pantallaDatos.apellidoFinal.setText(texApellido.getText());
        soltero.setActionCommand("Soltero/a");
        casado.setActionCommand("Casado/a");
        viudo.setActionCommand("Viudo/a");
        divorciado.setActionCommand("Divorciado/a");
        separado.setActionCommand("Separado/a");
        pantallaDatos.estadoFinal.setText(grupoBotonEstadoCivil.getSelection().getActionCommand());
        String destino = this.listaDestinos.getSelectedItem().toString();
        pantallaDatos.destinoFinal.setText(destino);
        String idiomasElegidos = " ";
        if (chEspaniol.isSelected()) {
            idiomasElegidos+= "Español";
        }
        if (chIngles.isSelected()) {
            idiomasElegidos+= " Inglés";
        }
        if (chFrances.isSelected()) {
                idiomasElegidos+= " Francés";
        }
        if (chItaliano.isSelected()) {
            idiomasElegidos+= " Italiano";
        }
        if (chAleman.isSelected()) {
            idiomasElegidos+= " Alemán";
        }
        if (chJapones.isSelected()) {
            idiomasElegidos+= " Japonés";
        }
        pantallaDatos.totalIdiomas.setText(idiomasElegidos);
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void chFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chFrancesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chFrancesActionPerformed

    private void viudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viudoActionPerformed

    private void divorciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divorciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divorciadoActionPerformed

    private void separadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_separadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_separadoActionPerformed

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
            java.util.logging.Logger.getLogger(Pasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JRadioButton casado;
    private javax.swing.JCheckBox chAleman;
    private javax.swing.JCheckBox chEspaniol;
    private javax.swing.JCheckBox chFrances;
    private javax.swing.JCheckBox chIngles;
    private javax.swing.JCheckBox chItaliano;
    private javax.swing.JCheckBox chJapones;
    private javax.swing.JRadioButton divorciado;
    public static javax.swing.ButtonGroup grupoBotonEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaDestinos;
    private javax.swing.JRadioButton separado;
    private javax.swing.JRadioButton soltero;
    public static javax.swing.JTextField texApellido;
    public static javax.swing.JTextField texNombre;
    private javax.swing.JRadioButton viudo;
    // End of variables declaration//GEN-END:variables
}
