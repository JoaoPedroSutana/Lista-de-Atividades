package Base;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Membro> membros = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    // Exibe os livros cadastrados em uma tabela não editável.
    public void listaLivros() {
        JFrame janela = new JFrame("Livros cadastrados");

        DefaultTableModel modelo = new DefaultTableModel(
                new String[]{"Livro", "Autor"}, 0
        ) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };

        for (Livro livro : livros) {
            modelo.addRow(new Object[]{
                    livro.getTitulo(),
                    livro.getAutor()
            });
        }

        JTable tabela = new JTable(modelo);
        tabela.setRowHeight(25);
        tabela.setFillsViewportHeight(true);

        janela.add(new JScrollPane(tabela));
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    // Exibe os membros cadastrados com todos os dados disponíveis.
    public void listaMembros() {
        JFrame janela = new JFrame("Membros cadastrados");

        DefaultTableModel modelo = new DefaultTableModel(
                new String[]{"ID", "Nome", "Endereço", "Idade", "Telefone", "CPF", "Cadastro"}, 0
        ) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };
        for (Membro membro : getMembros()) {
            modelo.addRow(new Object[]{
                    membro.getId(),
                    membro.getNome(),
                    membro.getEndereço(),
                    membro.getIdade(),
                    membro.getTelefone(),
                    membro.getCpf(),
                    membro.getDataCadastro()
            });
        }
        JTable tabela = new JTable(modelo);
        tabela.setRowHeight(25);
        tabela.setFillsViewportHeight(true);

        janela.add(new JScrollPane(tabela));
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(700, 400);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    // Exibe os empréstimos que ainda estão ativos.
    public void listaEmprestimos() {
        JFrame janela = new JFrame("Empréstimos ativos");

        DefaultTableModel modelo = new DefaultTableModel(
                new String[]{"Livro", "Membro"}, 0
        ) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };

        for (Emprestimo emprestimo : emprestimos) {
            modelo.addRow(new Object[]{
                    emprestimo.getLivro().getTitulo(),
                    emprestimo.getMembro()
            });
        }

        JTable tabela = new JTable(modelo);
        tabela.setRowHeight(25);
        tabela.setFillsViewportHeight(true);

        janela.add(new JScrollPane(tabela));
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
