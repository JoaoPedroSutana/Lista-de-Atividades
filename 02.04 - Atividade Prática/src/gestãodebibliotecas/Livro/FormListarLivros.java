package gestãodebibliotecas.Livro;

import Base.Biblioteca;
import Base.Livro;
import javax.swing.table.DefaultTableModel;

public class FormListarLivros extends javax.swing.JFrame {

    // Preenche a tabela com os livros cadastrados na biblioteca.
    public FormListarLivros(Biblioteca biblioteca) {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
        for (Livro livro : biblioteca.getLivros()) {
            modelo.addRow(new Object[]{livro.getTitulo(), livro.getAutor()});
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollLivros = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA DE LIVROS");

        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Livro", "Autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLivros.setFillsViewportHeight(true);
        tabelaLivros.setRowHeight(25);
        scrollLivros.setViewportView(tabelaLivros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormListarLivros(new Biblioteca()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollLivros;
    private javax.swing.JTable tabelaLivros;
    // End of variables declaration//GEN-END:variables
}
