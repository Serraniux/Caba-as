/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabañas;

/**
 *
 * @author laptop
 */
public class Clientes_Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Clientes_Modificar
     */
    public Clientes_Modificar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        Nc = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        NomC = new javax.swing.JTextField();
        ModiC = new javax.swing.JButton();
        NcCM = new javax.swing.JSpinner();
        FechaC = new javax.swing.JLabel();
        CORREOCM = new javax.swing.JTextField();
        TELCM = new javax.swing.JTextField();
        ESTADOCM = new javax.swing.JTextField();
        UsCa = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        IniC = new javax.swing.JMenu();
        ModC = new javax.swing.JMenu();
        ConC = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre.setText("Nombre");

        Nc.setText("Numero de cliente");

        Correo.setText("Correo");

        telefono.setText("Telefono");

        Fecha.setText("Fecha de registro");

        Estado.setText("Estado");

        ModiC.setText("Modificar");
        ModiC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModiCActionPerformed(evt);
            }
        });

        FechaC.setText("20-06-2025");

        UsCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsCa.setIcon(new javax.swing.ImageIcon("C:\\Cursos\\Java\\POO\\Cabañas\\img\\IconIniUs.png")); // NOI18N
        UsCa.setText("Usuario");
        UsCa.setPreferredSize(new java.awt.Dimension(100, 100));

        IniC.setText("Inicio");
        jMenuBar1.add(IniC);

        ModC.setText("Modificar");
        jMenuBar1.add(ModC);

        ConC.setText("Consultar");
        jMenuBar1.add(ConC);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsCa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nc)
                            .addComponent(Correo)
                            .addComponent(telefono)
                            .addComponent(Fecha)
                            .addComponent(Estado))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NcCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaC)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ESTADOCM, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(CORREOCM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TELCM, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(80, 80, 80)
                                .addComponent(ModiC))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nombre)
                        .addGap(106, 106, 106)
                        .addComponent(NomC, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nc)
                    .addComponent(NcCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(NomC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo)
                    .addComponent(CORREOCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(TELCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(FechaC))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(ModiC)
                    .addComponent(ESTADOCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModiCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModiCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModiCActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes_Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CORREOCM;
    private javax.swing.JMenu ConC;
    private javax.swing.JLabel Correo;
    private javax.swing.JTextField ESTADOCM;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel FechaC;
    private javax.swing.JMenu IniC;
    private javax.swing.JMenu ModC;
    private javax.swing.JButton ModiC;
    private javax.swing.JLabel Nc;
    private javax.swing.JSpinner NcCM;
    private javax.swing.JTextField NomC;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField TELCM;
    private javax.swing.JLabel UsCa;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
