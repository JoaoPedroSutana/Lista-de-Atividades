import javax.swing.*;
import java.awt.*;
import Base.Biblioteca;
import Emprestimo.*;
import Livro.*;
import Membro.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        JFrame janela = new JFrame("Menu Inicial");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botao = new JButton("Gerenciamento de Livros");
        JButton botao2 = new JButton("Gerenciamento de Membros");
        JButton botao3 = new JButton("Gerenciamento de Empréstimos");

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 1, 0, 10));
        painel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        painel.add(botao);
        painel.add(botao2);
        painel.add(botao3);

        botao.addActionListener(e -> {
            new TelaLivros(biblioteca);
        });

        botao2.addActionListener(e -> {
            new TelaMembros(biblioteca);
        });

        botao3.addActionListener(e -> {
            new TelaEmprestimos(biblioteca);
        });

        janela.add(painel);
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}