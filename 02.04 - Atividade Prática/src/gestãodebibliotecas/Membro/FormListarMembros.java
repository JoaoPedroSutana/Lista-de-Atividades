package gestãodebibliotecas.Membro;

import Base.Biblioteca;
import Base.Membro;
import javax.swing.table.DefaultTableModel;

public class FormListarMembros extends javax.swing.JFrame {

    // Preenche e dimensiona a tabela com os membros cadastrados.
    public FormListarMembros(Biblioteca biblioteca) {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaMembros.getModel();
        for (Membro membro : biblioteca.getMembros()) {
            modelo.addRow(new Object[]{
                membro.getId(), membro.getNome(), membro.getEndereço(), membro.getIdade(),
                membro.getTelefone(), membro.getCpf(), membro.getDataCadastro()
            });
        }
        int[] larguras = {50, 140, 180, 60, 130, 120, 120};
        for (int coluna = 0; coluna < larguras.length; coluna++) {
            tabelaMembros.getColumnModel().getColumn(coluna).setPreferredWidth(larguras[coluna]);
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMembros = new javax.swing.JScrollPane();
        tabelaMembros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA DE MEMBROS");

        tabelaMembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Idade", "Telefone", "CPF", "Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {false, false, false, false, false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMembros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelaMembros.setFillsViewportHeight(true);
        tabelaMembros.setRowHeight(25);
        scrollMembros.setViewportView(tabelaMembros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(scrollMembros, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(scrollMembros, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE).addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormListarMembros(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollMembros;
    private javax.swing.JTable tabelaMembros;
    // End of variables declaration//GEN-END:variables
}
