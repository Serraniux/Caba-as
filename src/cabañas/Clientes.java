/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cabañas;

/**
 *
 * @author laptop
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
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
        ConsultarC = new javax.swing.JButton();
        NomC = new javax.swing.JTextField();
        NcC = new javax.swing.JLabel();
        CorreoC = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        FechaC = new javax.swing.JLabel();
        EsC = new javax.swing.JLabel();
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

        ConsultarC.setText("Consultar");

        NcC.setText("4");

        CorreoC.setText("Jairrrseto@gmail.com");

        Tel.setText("6692552310");

        FechaC.setText("20-06-2025");

        EsC.setText("Activo");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(Nc)
                            .addComponent(Correo)
                            .addComponent(telefono)
                            .addComponent(Fecha)
                            .addComponent(Estado))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaC)
                                    .addComponent(Tel)
                                    .addComponent(CorreoC)
                                    .addComponent(NcC)
                                    .addComponent(NomC, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(194, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EsC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConsultarC)
                                .addGap(35, 35, 35))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UsCa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(NomC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nc)
                    .addComponent(NcC))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo)
                    .addComponent(CorreoC))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(Tel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(FechaC))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(ConsultarC)
                    .addComponent(EsC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(UsCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ConC;
    private javax.swing.JButton ConsultarC;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel CorreoC;
    private javax.swing.JLabel EsC;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel FechaC;
    private javax.swing.JMenu IniC;
    private javax.swing.JMenu ModC;
    private javax.swing.JLabel Nc;
    private javax.swing.JLabel NcC;
    private javax.swing.JTextField NomC;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Tel;
    private javax.swing.JLabel UsCa;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
