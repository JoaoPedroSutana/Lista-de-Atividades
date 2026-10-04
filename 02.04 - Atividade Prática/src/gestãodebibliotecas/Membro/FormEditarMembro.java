package gestãodebibliotecas.Membro;

import Base.Biblioteca;
import Base.Membro;

public class FormEditarMembro extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    // Carrega os membros disponíveis sem selecionar um registro inicialmente.
    public FormEditarMembro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        for (Membro membro : biblioteca.getMembros()) {
            membros.addItem(membro);
        }
        membros.setSelectedIndex(-1);
        limparCampos();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMembro = new javax.swing.JLabel();
        membros = new javax.swing.JComboBox<>();
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
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDIÇÃO DE MEMBROS");

        labelMembro.setText("Escolha o membro:");
        membros.addActionListener(this::membrosActionPerformed);
        labelNome.setText("Nome:");
        labelEndereço.setText("Endereço:");
        labelIdade.setText("Idade:");
        labelTelefone.setText("Telefone:");
        labelCPF.setText("CPF:");
        labelId.setText("Id:");
        labelData.setText("Data de cadastro:");

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
                    .addComponent(labelMembro).addComponent(labelNome).addComponent(labelEndereço)
                    .addComponent(labelIdade).addComponent(labelTelefone).addComponent(labelCPF)
                    .addComponent(labelId).addComponent(labelData))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(membros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNome).addComponent(campoEndereço).addComponent(campoIdade)
                    .addComponent(campoTelefone).addComponent(campoCPF).addComponent(campoId).addComponent(campoData)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelMembro).addComponent(membros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelNome).addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelEndereço).addComponent(campoEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelIdade).addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelTelefone).addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelCPF).addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelId).addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelData).addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(salvar).addComponent(cancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Preenche os campos quando um membro é selecionado para edição.
    private void membrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosActionPerformed
        Membro selecionado = (Membro) membros.getSelectedItem();
        if (selecionado != null) {
            campoNome.setText(selecionado.getNome());
            campoEndereço.setText(selecionado.getEndereço());
            campoIdade.setText(String.valueOf(selecionado.getIdade()));
            campoTelefone.setText(selecionado.getTelefone());
            campoCPF.setText(selecionado.getCpf());
            campoId.setText(String.valueOf(selecionado.getId()));
            campoData.setText(selecionado.getDataCadastro());
        } else {
            limparCampos();
        }
    }//GEN-LAST:event_membrosActionPerformed

    // Limpa os dados exibidos quando nenhum membro está selecionado.
    private void limparCampos() {
        campoNome.setText("");
        campoEndereço.setText("");
        campoIdade.setText("");
        campoTelefone.setText("");
        campoCPF.setText("");
        campoId.setText("");
        campoData.setText("");
    }

    // Salva os valores informados diretamente no membro selecionado.
    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Membro selecionado = (Membro) membros.getSelectedItem();
        if (selecionado != null) {
            selecionado.setNome(campoNome.getText());
            selecionado.setEndereço(campoEndereço.getText());
            selecionado.setIdade(Integer.parseInt(campoIdade.getText()));
            selecionado.setTelefone(campoTelefone.getText());
            selecionado.setCpf(campoCPF.getText());
            selecionado.setId(Integer.parseInt(campoId.getText()));
            selecionado.setDataCadastro(campoData.getText());
            dispose();
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormEditarMembro(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel labelMembro;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JComboBox<Membro> membros;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
