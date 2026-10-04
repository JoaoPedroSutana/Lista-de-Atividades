package gestãodebibliotecas.Emprestimo;

import Base.Biblioteca;

public class FormEmprestimo extends javax.swing.JFrame {
    private final Biblioteca biblioteca;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormEmprestimo.class.getName());

    public FormEmprestimo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEncerarEmprestimo = new javax.swing.JButton();
        BtnListarEmprestimos = new javax.swing.JButton();
        BtnRealizarEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMPRESTIMOS");

        BtnEncerarEmprestimo.setText("ENCERRAR EMPRESTIMO");
        BtnEncerarEmprestimo.addActionListener(this::BtnEncerarEmprestimoActionPerformed);

        BtnListarEmprestimos.setText("LISTAR EMPRESTIMOS");
        BtnListarEmprestimos.addActionListener(this::BtnListarEmprestimosActionPerformed);

        BtnRealizarEmprestimo.setText("REALIZAR EMPRESTIMO");
        BtnRealizarEmprestimo.addActionListener(this::BtnRealizarEmprestimoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnRealizarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnListarEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEncerarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BtnRealizarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnEncerarEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnListarEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Abre o formulário para registrar um novo empréstimo.
    private void BtnRealizarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealizarEmprestimoActionPerformed
        FormRealizarEmprestimo realizarEmprestimo = new FormRealizarEmprestimo(biblioteca);
        realizarEmprestimo.setVisible(true);
    }//GEN-LAST:event_BtnRealizarEmprestimoActionPerformed

    // Abre o formulário para encerrar um empréstimo ativo.
    private void BtnEncerarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEncerarEmprestimoActionPerformed
      FormEncerrarEmprestimo encerrarEmprestimo = new FormEncerrarEmprestimo(biblioteca);
      encerrarEmprestimo.setVisible(true);
    }//GEN-LAST:event_BtnEncerarEmprestimoActionPerformed

    // Abre a tabela com os empréstimos ativos.
    private void BtnListarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarEmprestimosActionPerformed
        FormListarEmprestimos listarEmprestimos = new FormListarEmprestimos(biblioteca);
        listarEmprestimos.setVisible(true);
    }//GEN-LAST:event_BtnListarEmprestimosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormEmprestimo(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEncerarEmprestimo;
    private javax.swing.JButton BtnListarEmprestimos;
    private javax.swing.JButton BtnRealizarEmprestimo;
    // End of variables declaration//GEN-END:variables
}
