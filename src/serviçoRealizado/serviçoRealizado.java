/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serviçoRealizado;

/**
 *
 * @author renan.losantos
 */
public class serviçoRealizado extends javax.swing.JFrame {

    /**
     * Creates new form serviçoRealizado
     */
    public serviçoRealizado() {
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

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txtMarcarConcluido = new javax.swing.JLabel();
        txtServiçoRealizado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaServiço = new javax.swing.JTextArea();
        btnConcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        JavaLogo2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtMarcarConcluido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtMarcarConcluido.setText("Deseja Marcar como concluido?");
        jPanel1.add(txtMarcarConcluido);
        txtMarcarConcluido.setBounds(60, 70, 370, 20);

        txtServiçoRealizado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtServiçoRealizado.setText("Relate o serviço realizado:");
        jPanel1.add(txtServiçoRealizado);
        txtServiçoRealizado.setBounds(60, 120, 150, 16);

        textAreaServiço.setColumns(20);
        textAreaServiço.setRows(5);
        jScrollPane1.setViewportView(textAreaServiço);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 150, 380, 100);

        btnConcluir.setBackground(new java.awt.Color(153, 255, 153));
        btnConcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConcluir.setText("CONCLUIR");
        jPanel1.add(btnConcluir);
        btnConcluir.setBounds(290, 270, 140, 50);

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVoltar.setText("VOLTAR");
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(60, 270, 140, 50);

        JavaLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo java  48x48.png"))); // NOI18N
        jPanel1.add(JavaLogo2);
        JavaLogo2.setBounds(440, 350, 48, 48);

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(serviçoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(serviçoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(serviçoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(serviçoRealizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new serviçoRealizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaLogo2;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea textAreaServiço;
    private javax.swing.JLabel txtMarcarConcluido;
    private javax.swing.JLabel txtServiçoRealizado;
    // End of variables declaration//GEN-END:variables
}
