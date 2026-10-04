package gestãodebibliotecas.Emprestimo;

import Base.Biblioteca;
import Base.Emprestimo;
import Base.Livro;
import Base.Membro;

public class FormRealizarEmprestimo extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    // Carrega os livros e membros disponíveis para um novo empréstimo.
    public FormRealizarEmprestimo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        for (Livro livro : biblioteca.getLivros()) {
            livros.addItem(livro);
        }
        for (Membro membro : biblioteca.getMembros()) {
            membros.addItem(membro);
        }
        livros.setSelectedIndex(-1);
        membros.setSelectedIndex(-1);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLivro = new javax.swing.JLabel();
        livros = new javax.swing.JComboBox<>();
        labelMembro = new javax.swing.JLabel();
        membros = new javax.swing.JComboBox<>();
        realizar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REALIZAÇÃO DE EMPRESTIMO");

        labelLivro.setText("Livro:");
        labelMembro.setText("Membro:");

        realizar.setText("REALIZAR EMPRESTIMO");
        realizar.addActionListener(this::realizarActionPerformed);

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(this::cancelarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLivro).addComponent(labelMembro))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(livros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(membros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(realizar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelLivro).addComponent(livros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelMembro).addComponent(membros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(realizar).addComponent(cancelar))
                .addGap(18, 18, 18)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Registra o empréstimo após validar as seleções e a disponibilidade do livro.
    private void realizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarActionPerformed
        Livro livro = (Livro) livros.getSelectedItem();
        Membro membro = (Membro) membros.getSelectedItem();

        if (livro == null || membro == null) {
            aviso.setText("Selecione livro e membro!");
            return;
        }

        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.getLivro() == livro) {
                aviso.setText("Livro já emprestado!");
                return;
            }
        }

        biblioteca.getEmprestimos().add(new Emprestimo(livro, membro));
        dispose();
    }//GEN-LAST:event_realizarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormRealizarEmprestimo(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel labelLivro;
    private javax.swing.JLabel labelMembro;
    private javax.swing.JComboBox<Livro> livros;
    private javax.swing.JComboBox<Membro> membros;
    private javax.swing.JButton realizar;
    // End of variables declaration//GEN-END:variables
}
