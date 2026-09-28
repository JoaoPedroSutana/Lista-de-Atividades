package Livro;

import Base.*;
import Base.Livro;
import javax.swing.*;
import java.awt.*;

public class AdicionarLivro {
    public AdicionarLivro(Biblioteca biblioteca) {
        JFrame janelaCadastroLivro = new JFrame("Cadastrar Livro");

        JPanel painelCadastroLivro = new JPanel();
        painelCadastroLivro.setLayout(new GridLayout(0, 2, 10, 10));
        painelCadastroLivro.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel labelTitulo = new JLabel("Título:");
        JTextField campoTitulo = new JTextField(20);

        JLabel labelAutor = new JLabel("Autor:");
        JTextField campoAutor = new JTextField(20);

        JButton cadLivro = new JButton("Cadastrar livro");
        JButton cancelar = new JButton("Cancelar");

        JLabel aviso = new JLabel("");

        cadLivro.addActionListener(e -> {
            String titulo = campoTitulo.getText().trim();
            String autor = campoAutor.getText().trim();

            if (titulo.isEmpty() || autor.isEmpty()) {
                aviso.setText("Preencha título e autor!");
                return;
            }

            Livro novoLivro = new Livro(titulo, autor);
            biblioteca.getLivros().add(novoLivro);

            janelaCadastroLivro.dispose();
        });

        cancelar.addActionListener(e -> {
            janelaCadastroLivro.dispose();
        });

        painelCadastroLivro.add(labelTitulo);
        painelCadastroLivro.add(campoTitulo);
        painelCadastroLivro.add(labelAutor);
        painelCadastroLivro.add(campoAutor);
        painelCadastroLivro.add(cadLivro);
        painelCadastroLivro.add(cancelar);
        painelCadastroLivro.add(aviso);

        janelaCadastroLivro.add(painelCadastroLivro, BorderLayout.NORTH);
        janelaCadastroLivro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaCadastroLivro.setSize(500, 300);
        janelaCadastroLivro.setLocationRelativeTo(null);
        janelaCadastroLivro.setVisible(true);
    }
}