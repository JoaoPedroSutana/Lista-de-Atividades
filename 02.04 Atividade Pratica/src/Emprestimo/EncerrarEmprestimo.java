package Emprestimo;

import Base.Biblioteca;
import Base.Emprestimo;
import javax.swing.*;
import java.awt.*;

public class EncerrarEmprestimo {
    public EncerrarEmprestimo(Biblioteca biblioteca) {
        JFrame janela = new JFrame("Encerrar empréstimo");

        JPanel painel = new JPanel(new GridLayout(0, 2, 10, 10));
        painel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel labelEmprestimo = new JLabel("Escolha o empréstimo:");
        JComboBox<Emprestimo> emprestimos = new JComboBox<>();

        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            emprestimos.addItem(emprestimo);
        }

        emprestimos.setSelectedIndex(-1);

        JLabel labelConfirma = new JLabel("Digite CONFIRME para encerrar:");
        JTextField campoConfirma = new JTextField(20);

        JButton encerrar = new JButton("Encerrar empréstimo");
        JButton cancelar = new JButton("Cancelar");
        JLabel aviso = new JLabel("");

        if (biblioteca.getEmprestimos().isEmpty()) {
            aviso.setText("Nenhum empréstimo ativo.");
        }

        encerrar.addActionListener(e -> {
            Emprestimo selecionado =
                    (Emprestimo) emprestimos.getSelectedItem();

            if (selecionado == null) {
                aviso.setText("Selecione um empréstimo!");
                return;
            }

            if (!campoConfirma.getText().trim().equals("CONFIRME")) {
                aviso.setText("Digite CONFIRME corretamente!");
                return;
            }

            biblioteca.getEmprestimos().remove(selecionado);
            janela.dispose();
        });

        cancelar.addActionListener(e -> {
            janela.dispose();
        });

        painel.add(labelEmprestimo);
        painel.add(emprestimos);
        painel.add(labelConfirma);
        painel.add(campoConfirma);
        painel.add(encerrar);
        painel.add(cancelar);
        painel.add(aviso);

        janela.add(painel, BorderLayout.NORTH);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}