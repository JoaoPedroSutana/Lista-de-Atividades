package gestãodebibliotecas.Livro;

import Base.Biblioteca;
import Base.Livro;

public class FormCadastrarLivro extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    public FormCadastrarLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        campoAutor = new javax.swing.JTextField();
        cadLivro = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE LIVRO");

        labelTitulo.setText("Título:");

        labelAutor.setText("Autor:");

        cadLivro.setText("CADASTRAR LIVRO");
        cadLivro.addActionListener(this::cadLivroActionPerformed);

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(this::cancelarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(labelAutor))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoTitulo)
                    .addComponent(campoAutor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadLivro)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadLivro)
                    .addComponent(cancelar))
                .addGap(18, 18, 18)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Valida os dados informados e adiciona um novo livro à biblioteca.
    private void cadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadLivroActionPerformed
        String titulo = campoTitulo.getText().trim();
        String autor = campoAutor.getText().trim();

        if (titulo.isEmpty() || autor.isEmpty()) {
            aviso.setText("Preencha título e autor!");
            return;
        }

        biblioteca.getLivros().add(new Livro(titulo, autor));
        dispose();
    }//GEN-LAST:event_cadLivroActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormCadastrarLivro(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton cadLivro;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
