package Livro;

import Base.Biblioteca;
import Base.Livro;
import javax.swing.*;
import java.awt.*;

public class RemoverLivro {
    public RemoverLivro(Biblioteca biblioteca) {
        JFrame janelaRemoverLivro = new JFrame("Remover Livro");

        JPanel painelRemoverLivro = new JPanel();
        painelRemoverLivro.setLayout(new GridLayout(0, 2, 10, 10));
        painelRemoverLivro.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel labelLivro = new JLabel("Escolha o livro");
        JComboBox<Livro> livros = new JComboBox<>();

        // Mostra os livros cadastrados
        for (Livro livro : biblioteca.getLivros()) {
            livros.addItem(livro);
        }

        livros.setSelectedIndex(-1);

        JLabel labelConfirma = new JLabel("Digite CONFIRME para remover:");
        JTextField campoConfirma = new JTextField(20);

        JButton remover = new JButton("Remover");
        JButton cancelar = new JButton("Cancelar");

        remover.addActionListener(e -> {
            Livro selecionado = (Livro) livros.getSelectedItem();

            if (selecionado != null
                    && campoConfirma.getText().equals("CONFIRME")) {

                biblioteca.getLivros().remove(selecionado);
                janelaRemoverLivro.dispose();
            }
        });

        cancelar.addActionListener(e -> {
            janelaRemoverLivro.dispose();
        });

        painelRemoverLivro.add(labelLivro);
        painelRemoverLivro.add(livros);
        painelRemoverLivro.add(labelConfirma);
        painelRemoverLivro.add(campoConfirma);
        painelRemoverLivro.add(remover);
        painelRemoverLivro.add(cancelar);

        janelaRemoverLivro.add(painelRemoverLivro, BorderLayout.NORTH);
        janelaRemoverLivro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaRemoverLivro.setSize(500, 300);
        janelaRemoverLivro.setLocationRelativeTo(null);
        janelaRemoverLivro.setVisible(true);
    }
}