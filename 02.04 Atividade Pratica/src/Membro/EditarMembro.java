package Membro;

import Base.*;

import javax.swing.*;
import java.awt.*;

public class EditarMembro {
    public EditarMembro(Biblioteca biblioteca) {
        JFrame janelaEditarMembro = new JFrame("Editar membro");
        JPanel painelEditarMembro = new JPanel();
        painelEditarMembro.setLayout(new GridLayout(3, 1, 0, 10));
        painelEditarMembro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel labelMembro = new  JLabel("Escolha o membro");

        String [] membro = {/*lista de membros que esta em biblioteca*/};

        JComboBox<String> Membros = new JComboBox<>(membro);

        JButton salvar = new JButton("Salvar");
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

        painelEditarMembro.setLayout(new GridLayout(0, 2, 10, 10));
        painelEditarMembro.add(labelMembro);
        painelEditarMembro.add(Membros);
        painelEditarMembro.add(labelNome);
        painelEditarMembro.add(campoNome);
        painelEditarMembro.add(labelEndereço);
        painelEditarMembro.add(campoEndereço);
        painelEditarMembro.add(labelIdade);
        painelEditarMembro.add(campoIdade);
        painelEditarMembro.add(labelTelefone);
        painelEditarMembro.add(campoTelefone);
        painelEditarMembro.add(labelCPF);
        painelEditarMembro.add(campoCPF);
        painelEditarMembro.add(labelId);
        painelEditarMembro.add(campoId);
        painelEditarMembro.add(labelData);
        painelEditarMembro.add(campoData);
        painelEditarMembro.add(salvar);
        painelEditarMembro.add(cancelar);
        salvar.addActionListener(e -> {janelaEditarMembro.dispose();});
        cancelar.addActionListener(e -> {janelaEditarMembro.dispose();});
        janelaEditarMembro.add(painelEditarMembro);
        janelaEditarMembro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaEditarMembro.setSize(500, 300);
        janelaEditarMembro.setLocationRelativeTo(null);
        janelaEditarMembro.setVisible(true);
    }
}
