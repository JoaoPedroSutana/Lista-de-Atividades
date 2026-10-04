package gestãodebibliotecas.Livro;

import Base.Biblioteca;

public class FormLivros extends javax.swing.JFrame {
    private final Biblioteca biblioteca;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormLivros.class.getName());

    public FormLivros(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEditarLivros = new javax.swing.JButton();
        BtnListarLivros = new javax.swing.JButton();
        BtnCadastroLivro = new javax.swing.JButton();
        BtnExcluirLivro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LIVROS");

        BtnEditarLivros.setText("EDITAR LIVRO");
        BtnEditarLivros.addActionListener(this::BtnEditarLivrosActionPerformed);

        BtnListarLivros.setText("LISTAR LIVROS");
        BtnListarLivros.addActionListener(this::BtnListarLivrosActionPerformed);

        BtnCadastroLivro.setText("ADICIONAR LIVRO");
        BtnCadastroLivro.addActionListener(this::BtnCadastroLivroActionPerformed);

        BtnExcluirLivro.setText("EXCLUIR LIVRO");
        BtnExcluirLivro.addActionListener(this::BtnExcluirLivroActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnExcluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnListarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BtnCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEditarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnExcluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnListarLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Abre o formulário responsável pelo cadastro de livros.
    private void BtnCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastroLivroActionPerformed
        FormCadastrarLivro cadLivro = new FormCadastrarLivro(biblioteca);
        cadLivro.setVisible(true);
    }//GEN-LAST:event_BtnCadastroLivroActionPerformed

    // Abre o formulário responsável pela edição de livros.
    private void BtnEditarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarLivrosActionPerformed
        FormEditarLivro editLivro = new FormEditarLivro(biblioteca);
        editLivro.setVisible(true);
    }//GEN-LAST:event_BtnEditarLivrosActionPerformed

    // Abre o formulário responsável pela exclusão de livros.
    private void BtnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirLivroActionPerformed
        FormExcluirLivro excluirLivro = new FormExcluirLivro(biblioteca);
        excluirLivro.setVisible(true);
    }//GEN-LAST:event_BtnExcluirLivroActionPerformed

    // Abre a tabela com os livros cadastrados.
    private void BtnListarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarLivrosActionPerformed
        FormListarLivros listarLivros = new FormListarLivros(biblioteca);
        listarLivros.setVisible(true);
    }//GEN-LAST:event_BtnListarLivrosActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormLivros(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastroLivro;
    private javax.swing.JButton BtnEditarLivros;
    private javax.swing.JButton BtnExcluirLivro;
    private javax.swing.JButton BtnListarLivros;
    // End of variables declaration//GEN-END:variables
}
