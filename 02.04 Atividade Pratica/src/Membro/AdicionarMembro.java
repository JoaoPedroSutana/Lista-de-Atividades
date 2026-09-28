package Membro;

import Base.*;

import javax.swing.*;
import java.awt.*;

public class AdicionarMembro {
    public AdicionarMembro(Biblioteca biblioteca) {
        JFrame janelaCadastroMembro = new JFrame("Cadastrar membro");
        JPanel painelCadastroMembro = new JPanel();
        painelCadastroMembro.setLayout(new GridLayout(3, 1, 0, 10));
        painelCadastroMembro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton cadMembro = new JButton("Cadastrar Membro");
        JButton cancelar = new JButton("Cancelar");

        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(20);

        JLabel labelEndereço = new JLabel("Endereço:");
        JTextField campoEndereço = new JTextField(20);

        JLabel labelIdade = new JLabel("Idade:");
        JTextField campoIdade = new JTextField(20);

        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField campoTelefone = new JTextField(20);

        JLabel labelCPF = new JLabel("CPF:");
        JTextField campoCPF = new JTextField(20);

        JLabel labelId = new JLabel("Id:");
        JTextField campoId = new JTextField(20);

        JLabel labelData = new JLabel("Data de cadastro:");
        JTextField campoData = new JTextField(20);

        painelCadastroMembro.setLayout(new GridLayout(0, 2, 10, 10));
        painelCadastroMembro.add(labelNome);
        painelCadastroMembro.add(campoNome);
        painelCadastroMembro.add(labelEndereço);
        painelCadastroMembro.add(campoEndereço);
        painelCadastroMembro.add(labelIdade);
        painelCadastroMembro.add(campoIdade);
        painelCadastroMembro.add(labelTelefone);
        painelCadastroMembro.add(campoTelefone);
        painelCadastroMembro.add(labelCPF);
        painelCadastroMembro.add(campoCPF);
        painelCadastroMembro.add(labelId);
        painelCadastroMembro.add(campoId);
        painelCadastroMembro.add(labelData);
        painelCadastroMembro.add(campoData);
        painelCadastroMembro.add(cadMembro);
        painelCadastroMembro.add(cancelar);
        cancelar.addActionListener(e -> {janelaCadastroMembro.dispose();});
        cadMembro.addActionListener(e -> {
            Membro novoMembro = new Membro(
                    campoNome.getText().trim(),
                    campoEndereço.getText().trim(),
                    Integer.parseInt(campoIdade.getText().trim()),
                    Integer.parseInt(campoTelefone.getText().trim()),
                    campoCPF.getText().trim(),
                    Integer.parseInt(campoId.getText().trim()),
                    campoData.getText().trim()
            );

            biblioteca.getMembros().add(novoMembro);
            janelaCadastroMembro.dispose();
        });
        janelaCadastroMembro.add(painelCadastroMembro);
        janelaCadastroMembro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaCadastroMembro.setSize(500, 300);
        janelaCadastroMembro.setLocationRelativeTo(null);
        janelaCadastroMembro.setVisible(true);
    }
}
