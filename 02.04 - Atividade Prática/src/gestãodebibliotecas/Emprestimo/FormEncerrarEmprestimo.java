package gestãodebibliotecas.Emprestimo;

import Base.Biblioteca;
import Base.Emprestimo;

public class FormEncerrarEmprestimo extends javax.swing.JFrame {

    private final Biblioteca biblioteca;

    // Carrega os empréstimos ativos e informa quando não existem registros.
    public FormEncerrarEmprestimo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        initComponents();
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            emprestimos.addItem(emprestimo);
        }
        emprestimos.setSelectedIndex(-1);
        if (biblioteca.getEmprestimos().isEmpty()) {
            aviso.setText("Nenhum empréstimo ativo.");
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEmprestimo = new javax.swing.JLabel();
        emprestimos = new javax.swing.JComboBox<>();
        labelConfirma = new javax.swing.JLabel();
        campoConfirma = new javax.swing.JTextField();
        encerrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ENCERRAR EMPRESTIMO");

        labelEmprestimo.setText("Escolha o empréstimo:");
        labelConfirma.setText("Digite CONFIRME para encerrar:");

        encerrar.setText("ENCERRAR EMPRESTIMO");
        encerrar.addActionListener(this::encerrarActionPerformed);
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(this::cancelarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmprestimo).addComponent(labelConfirma))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emprestimos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoConfirma)
                    .addComponent(aviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encerrar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelEmprestimo).addComponent(emprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(labelConfirma).addComponent(campoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(encerrar).addComponent(cancelar))
                .addGap(18, 18, 18)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Encerra o empréstimo somente após seleção e confirmação textual corretas.
    private void encerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarActionPerformed
        Emprestimo selecionado = (Emprestimo) emprestimos.getSelectedItem();
        if (selecionado == null) {
            aviso.setText("Selecione um empréstimo!");
            return;
        }
        if (!campoConfirma.getText().trim().equals("CONFIRME")) {
            aviso.setText("Digite CONFIRME corretamente!");
            return;
        }
        biblioteca.getEmprestimos().remove(selecionado);
        dispose();
    }//GEN-LAST:event_encerrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormEncerrarEmprestimo(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JTextField campoConfirma;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton encerrar;
    private javax.swing.JComboBox<Emprestimo> emprestimos;
    private javax.swing.JLabel labelConfirma;
    private javax.swing.JLabel labelEmprestimo;
    // End of variables declaration//GEN-END:variables
}
