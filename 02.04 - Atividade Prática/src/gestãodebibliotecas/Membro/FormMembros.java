package gestãodebibliotecas.Membro;

import Base.Biblioteca;

public class FormMembros extends javax.swing.JFrame {
    private final Biblioteca biblioteca;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMembros.class.getName());

    public FormMembros(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEditarMembro = new javax.swing.JButton();
        BtnListarMembros = new javax.swing.JButton();
        BtnAdicionarMembro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEMBROS");

        BtnEditarMembro.setText("EDITAR MEMBRO");
        BtnEditarMembro.addActionListener(this::BtnEditarMembroActionPerformed);

        BtnListarMembros.setText("LISTAR MEMBROS");
        BtnListarMembros.addActionListener(this::BtnListarMembrosActionPerformed);

        BtnAdicionarMembro.setText("ADICIONAR MEMBRO");
        BtnAdicionarMembro.setToolTipText("");
        BtnAdicionarMembro.addActionListener(this::BtnAdicionarMembroActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAdicionarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnListarMembros, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BtnAdicionarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnEditarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnListarMembros, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Abre o formulário responsável pelo cadastro de membros.
    private void BtnAdicionarMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarMembroActionPerformed
        FormCadastrarMembro cadMembro = new FormCadastrarMembro(biblioteca);
        abrirSubTela(cadMembro);
    }//GEN-LAST:event_BtnAdicionarMembroActionPerformed

    // Abre o formulário responsável pela edição de membros.
    private void BtnEditarMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarMembroActionPerformed
        FormEditarMembro editMembro = new FormEditarMembro(biblioteca);
        abrirSubTela(editMembro);
    }//GEN-LAST:event_BtnEditarMembroActionPerformed

    // Abre a tabela com os membros cadastrados.
    private void BtnListarMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarMembrosActionPerformed
        FormListarMembros listarMembros = new FormListarMembros(biblioteca);
        abrirSubTela(listarMembros);
    }//GEN-LAST:event_BtnListarMembrosActionPerformed

    // Oculta o menu de membros enquanto a subtela estiver aberta.
    private void abrirSubTela(javax.swing.JFrame subTela) {
        setVisible(false);
        subTela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                setVisible(true);
            }
        });
        subTela.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormMembros(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionarMembro;
    private javax.swing.JButton BtnEditarMembro;
    private javax.swing.JButton BtnListarMembros;
    // End of variables declaration//GEN-END:variables
}
