package Livro;

import Base.Biblioteca;
import javax.swing.*;
import java.awt.*;

public class TelaLivros {
    public TelaLivros(Biblioteca biblioteca) {
        JFrame janelaLivros = new JFrame("Livros");

        JPanel painelLivros = new JPanel();
        painelLivros.setLayout(new GridLayout(4, 1, 0, 10));
        painelLivros.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JButton addLivro = new JButton("Adicionar livro");
        JButton editLivro = new JButton("Editar livro");
        JButton delLivro = new JButton("Remover livro");
        JButton listLivro = new JButton("Listar livros");

        painelLivros.add(addLivro);
        painelLivros.add(editLivro);
        painelLivros.add(delLivro);
        painelLivros.add(listLivro);

        addLivro.addActionListener(e -> {
            new AdicionarLivro(biblioteca);
        });

        editLivro.addActionListener(e -> {
            new EditarLivro(biblioteca);
        });

        delLivro.addActionListener(e -> {
            new RemoverLivro(biblioteca);
        });

        listLivro.addActionListener(e -> {
            biblioteca.listaLivros();
        });

        janelaLivros.add(painelLivros);
        janelaLivros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaLivros.setSize(500, 300);
        janelaLivros.setLocationRelativeTo(null);
        janelaLivros.setVisible(true);
    }
}