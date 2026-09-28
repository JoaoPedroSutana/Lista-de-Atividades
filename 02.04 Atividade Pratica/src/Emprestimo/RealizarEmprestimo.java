package Emprestimo;

import Base.Biblioteca;
import Base.Livro;
import Base.Membro;
import Base.Emprestimo;
import javax.swing.*;
import java.awt.*;

public class RealizarEmprestimo {
    public RealizarEmprestimo(Biblioteca biblioteca) {
        JFrame janela = new JFrame("Realizar empréstimo");

        JPanel painel = new JPanel(new GridLayout(0, 2, 10, 10));
        painel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel labelLivro = new JLabel("Livro:");
        JComboBox<Livro> livros = new JComboBox<>();

        for (Livro livro : biblioteca.getLivros()) {
            livros.addItem(livro);
        }

        JLabel labelMembro = new JLabel("Membro:");
        JComboBox<Membro> membros = new JComboBox<>();

        for (Membro membro : biblioteca.getMembros()) {
            membros.addItem(membro);
        }

        livros.setSelectedIndex(-1);
        membros.setSelectedIndex(-1);

        JButton realizar = new JButton("Realizar empréstimo");
        JButton cancelar = new JButton("Cancelar");
        JLabel aviso = new JLabel("");

        realizar.addActionListener(e -> {
            Livro livro = (Livro) livros.getSelectedItem();
            Membro membro = (Membro) membros.getSelectedItem();

            if (livro == null || membro == null) {
                aviso.setText("Selecione livro e membro!");
                return;
            }

            // Impede emprestar novamente um livro ainda emprestado
            for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
                if (emprestimo.getLivro() == livro) {
                    aviso.setText("Livro já emprestado!");
                    return;
                }
            }

            Emprestimo emprestimo = new Emprestimo(livro, membro);
            biblioteca.getEmprestimos().add(emprestimo);

            janela.dispose();
        });

        cancelar.addActionListener(e -> {
            janela.dispose();
        });

        painel.add(labelLivro);
        painel.add(livros);
        painel.add(labelMembro);
        painel.add(membros);
        painel.add(realizar);
        painel.add(cancelar);
        painel.add(aviso);

        janela.add(painel, BorderLayout.NORTH);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}