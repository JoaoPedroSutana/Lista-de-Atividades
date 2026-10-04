package gestãodebibliotecas;

import Base.Biblioteca;
import gestãodebibliotecas.Livro.FormLivros;
import gestãodebibliotecas.Emprestimo.FormEmprestimo;
import gestãodebibliotecas.Membro.FormMembros;

public class FormPrincipal extends javax.swing.JFrame {
    private final Biblioteca biblioteca;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPrincipal.class.getName());

    public FormPrincipal(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnLivro = new javax.swing.JButton();
        BtnMembros = new javax.swing.JButton();
        BtnEmprestimos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        BtnLivro.setText("GERENCIAMENTO DE LIVROS");
        BtnLivro.addActionListener(this::BtnLivroActionPerformed);

        BtnMembros.setText("GERENCIAMENTO DE MEMBROS");
        BtnMembros.addActionListener(this::BtnMembrosActionPerformed);

        BtnEmprestimos.setText("GERENCIAMENTO DE EMPRESTIMOS");
        BtnEmprestimos.addActionListener(this::BtnEmprestimosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMembros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BtnLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnMembros, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Abre o gerenciamento de livros usando a biblioteca compartilhada.
    private void BtnLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLivroActionPerformed
        FormLivros formLivro = new FormLivros(biblioteca);
        formLivro.setVisible(true);
    }//GEN-LAST:event_BtnLivroActionPerformed

    // Abre o gerenciamento de membros usando a biblioteca compartilhada.
    private void BtnMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMembrosActionPerformed
        FormMembros formMembros = new FormMembros(biblioteca);
        formMembros.setVisible(true);
    }//GEN-LAST:event_BtnMembrosActionPerformed

    // Abre o gerenciamento de empréstimos usando a biblioteca compartilhada.
    private void BtnEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEmprestimosActionPerformed
        FormEmprestimo formEmprestimos = new FormEmprestimo(biblioteca);
        formEmprestimos.setVisible(true);
    }//GEN-LAST:event_BtnEmprestimosActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormPrincipal(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEmprestimos;
    private javax.swing.JButton BtnLivro;
    private javax.swing.JButton BtnMembros;
    // End of variables declaration//GEN-END:variables
}
