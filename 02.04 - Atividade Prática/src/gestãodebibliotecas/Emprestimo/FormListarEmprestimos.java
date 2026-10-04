package gestãodebibliotecas.Emprestimo;

import Base.Biblioteca;
import Base.Emprestimo;
import javax.swing.table.DefaultTableModel;

public class FormListarEmprestimos extends javax.swing.JFrame {

    // Preenche a tabela com os empréstimos que permanecem ativos.
    public FormListarEmprestimos(Biblioteca biblioteca) {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaEmprestimos.getModel();
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            modelo.addRow(new Object[]{emprestimo.getLivro().getTitulo(), emprestimo.getMembro()});
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEmprestimos = new javax.swing.JScrollPane();
        tabelaEmprestimos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA DE EMPRESTIMOS");

        tabelaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {"Livro", "Membro"}
        ) {
            boolean[] canEdit = new boolean [] {false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEmprestimos.setFillsViewportHeight(true);
        tabelaEmprestimos.setRowHeight(25);
        scrollEmprestimos.setViewportView(tabelaEmprestimos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(scrollEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(scrollEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE).addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormListarEmprestimos(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollEmprestimos;
    private javax.swing.JTable tabelaEmprestimos;
    // End of variables declaration//GEN-END:variables
}
