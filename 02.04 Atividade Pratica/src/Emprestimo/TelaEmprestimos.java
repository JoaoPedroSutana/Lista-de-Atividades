package Emprestimo;

import Base.Biblioteca;

import javax.swing.*;
import java.awt.*;

public class TelaEmprestimos  {
    public TelaEmprestimos(Biblioteca biblioteca) {
        JFrame janelaEmprestimos = new JFrame("Emprestimos");

        JPanel painelEmprestimos = new JPanel();
        painelEmprestimos.setLayout(new GridLayout(3, 1, 0, 10));

        painelEmprestimos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JButton relEmprestimo = new JButton("Realizar empréstimo");
        JButton encEmprestimo = new JButton("Encerrar empréstimo");
        JButton listEmprestimo = new JButton("Listar Emprestimos");

        painelEmprestimos.add(relEmprestimo);
        relEmprestimo.addActionListener(e -> {new RealizarEmprestimo(biblioteca);});
        painelEmprestimos.add(encEmprestimo);
        encEmprestimo.addActionListener(e -> {
            new EncerrarEmprestimo(biblioteca);
        });
        painelEmprestimos.add(listEmprestimo);
        listEmprestimo.addActionListener(e -> {
            biblioteca.listaEmprestimos();
        });
        janelaEmprestimos.add(painelEmprestimos);
        janelaEmprestimos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaEmprestimos.setSize(500, 300);
        janelaEmprestimos.setLocationRelativeTo(null);
        janelaEmprestimos.setVisible(true);

    }
}
