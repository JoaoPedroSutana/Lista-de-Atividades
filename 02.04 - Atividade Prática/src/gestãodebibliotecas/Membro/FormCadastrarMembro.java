package gestãodebibliotecas.Membro;

import Base.Biblioteca;
import Base.Membro;

public class FormCadastrarMembro extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    public FormCadastrarMembro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelEndereço = new javax.swing.JLabel();
        campoEndereço = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        campoIdade = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        cadMembro = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADICIONAR MEMBROS");

        labelNome.setText("Nome:");
        labelEndereço.setText("Endereço:");
        labelIdade.setText("Idade:");
        labelTelefone.setText("Telefone:");
        labelCPF.setText("CPF:");
        labelId.setText("Id:");
        labelData.setText("Data de cadastro:");

        cadMembro.setText("CADASTRAR MEMBRO");
        cadMembro.addActionListener(this::cadMembroActionPerformed);

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(this::cancelarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(labelEndereço)
                    .addComponent(labelIdade)
                    .addComponent(labelTelefone)
                    .addComponent(labelCPF)
                    .addComponent(labelId)
                    .addComponent(labelData))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNome)
                    .addComponent(campoEndereço)
                    .addComponent(campoIdade)
                    .addComponent(campoTelefone)
                    .addComponent(campoCPF)
                    .addComponent(campoId)
                    .addComponent(campoData)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadMembro)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelNome).addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelEndereço).addComponent(campoEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelIdade).addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelTelefone).addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelCPF).addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelId).addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelData).addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cadMembro).addComponent(cancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Converte os campos necessários e adiciona um novo membro à biblioteca.
    private void cadMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadMembroActionPerformed
        Membro novoMembro = new Membro(
                campoNome.getText().trim(),
                campoEndereço.getText().trim(),
                Integer.parseInt(campoIdade.getText().trim()),
                campoTelefone.getText().trim(),
                campoCPF.getText().trim(),
                Integer.parseInt(campoId.getText().trim()),
                campoData.getText().trim()
        );
        biblioteca.getMembros().add(novoMembro);
        dispose();
    }//GEN-LAST:event_cadMembroActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormCadastrarMembro(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadMembro;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoEndereço;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEndereço;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    // End of variables declaration//GEN-END:variables
}
