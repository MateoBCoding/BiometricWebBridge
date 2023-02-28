/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.DmlJsonDao;
import Model.IDmlJsonDao;
import Utils.UtilsApp;

import Domain.ConfigDTO;
import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mauricio Herrera
 */
public final class ConfigForm extends javax.swing.JFrame {

    /**
     * Creates new form ConfigForm
     *
     * @throws java.sql.SQLException
     */
    public ConfigForm() throws SQLException {
        initComponents();
        id_config.setVisible(false);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/fingerprint_32px.png")).getImage());
        setTitle("Configuración | Plugin Biometrico V 2.0 - RC 2020-11-13");
        validateConfigDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TblMenu = new javax.swing.JPopupMenu();
        MnuModificar = new javax.swing.JMenuItem();
        MnuEliminar = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        url_api_sensor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        serial_number_pc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        browser = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConfig = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        id_config = new javax.swing.JLabel();

        MnuModificar.setText("Modificar");
        MnuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuModificarActionPerformed(evt);
            }
        });
        TblMenu.add(MnuModificar);

        MnuEliminar.setText("Eliminar");
        MnuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuEliminarActionPerformed(evt);
            }
        });
        TblMenu.add(MnuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Url Api");

        jLabel3.setText("Serial Number PC");

        jLabel4.setText("Browser");

        browser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Chrome", "Mozilla", "Edge", "Explorer" }));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));

        tblConfig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblConfig.setComponentPopupMenu(TblMenu);
        tblConfig.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblConfig);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_24px.png"))); // NOI18N
        btnSave.setToolTipText("Guardar");
        btnSave.setAlignmentY(0.0F);
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSave.setIconTextGap(0);
        btnSave.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_24px.png"))); // NOI18N
        btnCancel.setToolTipText("Cancelar");
        btnCancel.setActionCommand("Cancelar");
        btnCancel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(serial_number_pc)
                                    .addComponent(url_api_sensor)
                                    .addComponent(browser, 0, 405, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(url_api_sensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(serial_number_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(id_config)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(198, 198, 198)
                    .addComponent(id_config)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String urlApi = url_api_sensor.getText();
        String serialNumberPc = serial_number_pc.getText();
        String Browser = (String) browser.getSelectedItem();
        Object[] componentes = {url_api_sensor, serial_number_pc, browser};
        if (validarCampos(componentes) > 0) {
            DesktopNotify.showDesktopMessage("Aviso..!", "Los campos marcados en rojo son obligatorios", DesktopNotify.INFORMATION, 5000L);
            return;
        }
        for (int i = 0; i < tblConfig.getRowCount(); i++) {
            if (tblConfig.getValueAt(i, 3).toString().equals(Browser)) {
                DesktopNotify.showDesktopMessage("Aviso..!", "Ya existe una configuracion para el navegador '" + Browser + "'", DesktopNotify.ERROR, 5000L);
                return;
            }
        }
        UUID uuid = UUID.randomUUID();
        ConfigDTO config = new ConfigDTO();
        config.setId(uuid.toString());
        config.setUrl_api(urlApi);
        config.setBrowser(Browser);
        config.setSerial_number_pc(serialNumberPc);
        config.setStatus("Active");
        IDmlJsonDao dml = new DmlJsonDao();
        if (id_config.getText().equals("")) {
            dml.insert(config);
        } else {
            config.setId(id_config.getText());
            dml.update(config);
        }
        limpiarCampos(componentes);
        cargarConfiguracion();
        DesktopNotify.showDesktopMessage("Aviso, navagador activo: " + Browser, "Configuración actualizada."
                + "\nLa aplicación se reiniciara para que la configuración tenga efecto",
                DesktopNotify.INFORMATION, 30000L);
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                UtilsApp.restartApplication();
            }
        };
        timer.schedule(tarea, 4000, 1);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Object[] componentes = {url_api_sensor, serial_number_pc, browser};
        limpiarCampos(componentes);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void MnuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuModificarActionPerformed
        browser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione", "Chrome", "Mozilla", "Edge", "Explorer"}));
        int fila = tblConfig.getSelectedRow();
        if (fila >= 0) {
            id_config.setText(tblConfig.getValueAt(fila, 0).toString());
            serial_number_pc.setText(tblConfig.getValueAt(fila, 1).toString());
            url_api_sensor.setText(tblConfig.getValueAt(fila, 2).toString());
            browser.setSelectedItem(tblConfig.getValueAt(fila, 3).toString());
        } else {
            DesktopNotify.showDesktopMessage("Aviso..!", "Debes seleccionar la fila primero", DesktopNotify.WARNING, 4000L);
        }
    }//GEN-LAST:event_MnuModificarActionPerformed

    private void MnuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuEliminarActionPerformed
        int fila = tblConfig.getSelectedRow();
        if (fila >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el registro seleccionado?", "Confirmación", JOptionPane.OK_CANCEL_OPTION);
            if (option == 0) {
                ConfigDTO config = new ConfigDTO();
                config.setId(tblConfig.getValueAt(fila, 0).toString());
                IDmlJsonDao dml = new DmlJsonDao();
                dml.delete(config);
                cargarConfiguracion();
                DesktopNotify.showDesktopMessage("Aviso..!", "Configuración eliminada correctamente."
                        + "\nLa aplicación se reiniciara para que la configuración tenga efecto",
                        DesktopNotify.INFORMATION, 10000L);
                Timer timer = new Timer();
                TimerTask tarea = new TimerTask() {
                    @Override
                    public void run() {
                        UtilsApp.restartApplication();
                    }
                };
                timer.schedule(tarea, 3000, 1);
            }
        } else {
            DesktopNotify.showDesktopMessage("Aviso..!", "Debes seleccionar la fila primero", DesktopNotify.WARNING, 4000L);
        }
    }//GEN-LAST:event_MnuEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConfigForm().setVisible(true);
                } catch (SQLException ex) {
                    System.out.println("error " + ex.getMessage());
                }
            }
        });
    }

    public void cargarConfiguracion() {
        DefaultTableModel modelo = new DefaultTableModel();
        String Titulos[] = {"Id", "Serial Number", "URL Api", "Browser", "Status"};
        modelo = new DefaultTableModel(null, Titulos) {
            @Override
            public boolean isCellEditable(int row, int column) {//para evitar que las celdas sean editables
                return false;
            }
        };
        Object[] columna = new Object[5];
        IDmlJsonDao dml = new DmlJsonDao();
        Iterator<ConfigDTO> nombreIterator = dml.select().iterator();
        while (nombreIterator.hasNext()) {
            ConfigDTO config = nombreIterator.next();
            columna[0] = config.getId();
            columna[1] = config.getSerial_number_pc();
            columna[2] = config.getUrl_api();
            columna[3] = config.getBrowser();
            columna[4] = config.getStatus();
            modelo.addRow(columna);
        }
        tblConfig.setModel(modelo);
        TableRowSorter<TableModel> ordenar = new TableRowSorter<>(modelo);
        tblConfig.setRowSorter(ordenar);
        tblConfig.getColumnModel().getColumn(0).setMaxWidth(0);
        tblConfig.getColumnModel().getColumn(0).setMinWidth(0);
        tblConfig.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblConfig.setModel(modelo);
    }

    public int validarCampos(Object[] componentes) {
        int countErrors = 0;
        for (Object componente : componentes) {
            if (componente instanceof JTextField) {
                boolean equals = ((JTextField) componente).getText().equals("");
                if (equals) {
                    countErrors++;
                    ((JTextField) componente).setBorder(BorderFactory.createLineBorder(Color.decode("#EE1313")));  //2C6791                  
                } else {
                    ((JTextField) componente).setBorder(BorderFactory.createLineBorder(Color.decode("#ABADB3")));
                }
            }
            if (componente instanceof JComboBox) {
                boolean equals = false;
                if (((JComboBox) componente).getSelectedItem() instanceof String) {
                    equals = ((JComboBox) componente).getSelectedItem().equals("Seleccione");
                }
                if (equals) {
                    countErrors++;
                    ((JComboBox) componente).setBorder(BorderFactory.createLineBorder(Color.decode("#EE1313")));  //2C6791                  
                } else {
                    ((JComboBox) componente).setBorder(BorderFactory.createLineBorder(Color.decode("#ABADB3")));
                }
            }
        }
        return countErrors;
    }

    public void limpiarCampos(Object[] componentes) {
        id_config.setText("");
        for (Object componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            }
            if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedItem("Seleccione");
            }
        }
    }

    private void validateConfigDB() {
        try {
            File archivo = new File("src/Config/Config.json");
            if (archivo.exists()) {
                cargarConfiguracion();
            } else {
                IDmlJsonDao dml = new DmlJsonDao();
                dml.createFileJson();
            }
        } catch (IOException ex) {
            System.out.println("error ConfigForm " + ex.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnuEliminar;
    private javax.swing.JMenuItem MnuModificar;
    private javax.swing.JPopupMenu TblMenu;
    public javax.swing.JComboBox<String> browser;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel id_config;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField serial_number_pc;
    private javax.swing.JTable tblConfig;
    public javax.swing.JTextField url_api_sensor;
    // End of variables declaration//GEN-END:variables

}
