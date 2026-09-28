package Membro;

import Base.*;

import javax.swing.*;
import java.awt.*;

public class TelaMembros  {
    public TelaMembros(Biblioteca biblioteca) {
        JFrame janelaMembros = new JFrame("Membros");

        JPanel painelMembros = new JPanel();
        painelMembros.setLayout(new GridLayout(3, 1, 0, 10));

        painelMembros.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JButton addMembro = new JButton("Adicionar membro");
        JButton editMembro = new JButton("Editar membro");
        JButton listMembro = new JButton("Listar membros");

        painelMembros.add(addMembro);
        addMembro.addActionListener(e -> {new AdicionarMembro(biblioteca);});
        painelMembros.add(editMembro);
        editMembro.addActionListener(e -> {new EditarMembro(biblioteca);});
        painelMembros.add(listMembro);
        listMembro.addActionListener(e -> {
            biblioteca.listaMembros();
        });
        janelaMembros.add(painelMembros);
        janelaMembros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaMembros.setSize(500, 300);
        janelaMembros.setLocationRelativeTo(null);
        janelaMembros.setVisible(true);

    }
}
