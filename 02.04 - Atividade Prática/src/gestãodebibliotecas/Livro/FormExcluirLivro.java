package gestãodebibliotecas.Livro;

import Base.Biblioteca;
import Base.Livro;

public class FormExcluirLivro extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    // Carrega os livros que podem ser selecionados para exclusão.
    public FormExcluirLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        for (Livro livro : biblioteca.getLivros()) {
            livros.addItem(livro);
        }
        livros.setSelectedIndex(-1);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLivro = new javax.swing.JLabel();
        livros = new javax.swing.JComboBox<>();
        labelConfirma = new javax.swing.JLabel();
        campoConfirma = new javax.swing.JTextField();
        remover = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXCLUSÃO DE LIVRO");

        labelLivro.setText("Escolha o livro:");

        labelConfirma.setText("Digite CONFIRME para remover:");

        remover.setText("REMOVER");
        remover.addActionListener(this::removerActionPerformed);

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(this::cancelarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLivro)
                    .addComponent(labelConfirma))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(livros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoConfirma)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remover)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar))
                    .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLivro)
                    .addComponent(livros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConfirma)
                    .addComponent(campoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remover)
                    .addComponent(cancelar))
                .addGap(18, 18, 18)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Remove o livro somente após seleção e confirmação textual corretas.
    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        Livro selecionado = (Livro) livros.getSelectedItem();
        if (selecionado == null) {
            aviso.setText("Selecione um livro!");
            return;
        }
        if (!campoConfirma.getText().equals("CONFIRME")) {
            aviso.setText("Digite CONFIRME corretamente!");
            return;
        }
        biblioteca.getLivros().remove(selecionado);
        dispose();
    }//GEN-LAST:event_removerActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormExcluirLivro(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JTextField campoConfirma;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel labelConfirma;
    private javax.swing.JLabel labelLivro;
    private javax.swing.JComboBox<Livro> livros;
    private javax.swing.JButton remover;
    // End of variables declaration//GEN-END:variables
}
