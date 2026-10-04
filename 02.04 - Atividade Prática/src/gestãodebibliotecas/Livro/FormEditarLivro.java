package gestãodebibliotecas.Livro;

import Base.Biblioteca;
import Base.Livro;

public class FormEditarLivro extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    // Carrega os livros disponíveis sem selecionar um registro inicialmente.
    public FormEditarLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        for (Livro livro : biblioteca.getLivros()) {
            livros.addItem(livro);
        }
        livros.setSelectedIndex(-1);
        limparCampos();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLivro = new javax.swing.JLabel();
        livros = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDIÇÃO DE LIVRO");

        labelLivro.setText("Escolha o livro:");

        livros.addActionListener(this::livrosActionPerformed);

        labelTitulo.setText("Alterar título:");

        labelAutor.setText("Alterar autor:");

        salvar.setText("SALVAR");
        salvar.addActionListener(this::salvarActionPerformed);

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
                    .addComponent(labelTitulo)
                    .addComponent(labelAutor))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(livros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoTitulo)
                    .addComponent(campoAutor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLivro)
                    .addComponent(livros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(cancelar))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Preenche os campos quando um livro é selecionado para edição.
    private void livrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosActionPerformed
        Livro selecionado = (Livro) livros.getSelectedItem();
        if (selecionado != null) {
            campoTitulo.setText(selecionado.getTitulo());
            campoAutor.setText(selecionado.getAutor());
        } else {
            limparCampos();
        }
    }//GEN-LAST:event_livrosActionPerformed

    // Limpa os dados exibidos quando nenhum livro está selecionado.
    private void limparCampos() {
        campoTitulo.setText("");
        campoAutor.setText("");
    }

    // Salva as alterações diretamente no livro selecionado.
    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Livro selecionado = (Livro) livros.getSelectedItem();
        if (selecionado != null) {
            selecionado.setTitulo(campoTitulo.getText());
            selecionado.setAutor(campoAutor.getText());
            dispose();
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormEditarLivro(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelLivro;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JComboBox<Livro> livros;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
