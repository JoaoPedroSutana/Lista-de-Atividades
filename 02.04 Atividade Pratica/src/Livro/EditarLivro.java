package Livro;

import Base.Biblioteca;
import Base.Livro;
import javax.swing.*;
import java.awt.*;

public class EditarLivro {
    public EditarLivro(Biblioteca biblioteca) {
        JFrame janelaEditarLivro = new JFrame("Editar Livro");

        JPanel painelEditarLivro = new JPanel();
        painelEditarLivro.setLayout(new GridLayout(0, 2, 10, 10));
        painelEditarLivro.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel labelLivro = new JLabel("Escolha o livro");
        JComboBox<Livro> livros = new JComboBox<>();

        // Coloca os livros cadastrados na caixa de seleção
        for (Livro livro : biblioteca.getLivros()) {
            livros.addItem(livro);
        }

        livros.setSelectedIndex(-1);

        JLabel labelTitulo = new JLabel("Alterar título:");
        JTextField campoTitulo = new JTextField(20);

        JLabel labelAutor = new JLabel("Alterar autor:");
        JTextField campoAutor = new JTextField(20);

        JButton salvar = new JButton("Salvar");
        JButton cancelar = new JButton("Cancelar");

        // Preenche os campos ao selecionar um livro
        livros.addActionListener(e -> {
            Livro selecionado = (Livro) livros.getSelectedItem();

            if (selecionado != null) {
                campoTitulo.setText(selecionado.getTitulo());
                campoAutor.setText(selecionado.getAutor());
            }
        });

        // Altera os dados do próprio livro que está na biblioteca
        salvar.addActionListener(e -> {
            Livro selecionado = (Livro) livros.getSelectedItem();

            if (selecionado != null) {
                selecionado.setTitulo(campoTitulo.getText());
                selecionado.setAutor(campoAutor.getText());

                janelaEditarLivro.dispose();
            }
        });

        cancelar.addActionListener(e -> {
            janelaEditarLivro.dispose();
        });

        painelEditarLivro.add(labelLivro);
        painelEditarLivro.add(livros);
        painelEditarLivro.add(labelTitulo);
        painelEditarLivro.add(campoTitulo);
        painelEditarLivro.add(labelAutor);
        painelEditarLivro.add(campoAutor);
        painelEditarLivro.add(salvar);
        painelEditarLivro.add(cancelar);

        janelaEditarLivro.add(painelEditarLivro, BorderLayout.NORTH);
        janelaEditarLivro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaEditarLivro.setSize(500, 300);
        janelaEditarLivro.setLocationRelativeTo(null);
        janelaEditarLivro.setVisible(true);
    }
}