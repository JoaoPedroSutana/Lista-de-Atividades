import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("MENU, ITENS DE MENU, FONTES");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 400);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        Font fonteMenu = new Font("Arial", Font.PLAIN, 14);
        Font fonteTitulo = new Font("Arial", Font.BOLD, 20);

        // Barra de menus
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(new Color(220, 230, 240));

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuRelatorio = new JMenu("Relatório");
        JMenu menuSobre = new JMenu("Sobre");

        menuArquivo.setFont(fonteMenu);
        menuRelatorio.setFont(fonteMenu);
        menuSobre.setFont(fonteMenu);

        JMenuItem itemNovo = new JMenuItem("Novo");
        JMenuItem itemSair = new JMenuItem("Sair");
        JMenuItem itemCliente = new JMenuItem("Cliente");
        JMenuItem itemFornecedor = new JMenuItem("Fornecedor");
        JMenuItem itemInfo = new JMenuItem("Info");

        itemNovo.setFont(fonteMenu);
        itemSair.setFont(fonteMenu);
        itemCliente.setFont(fonteMenu);
        itemFornecedor.setFont(fonteMenu);
        itemInfo.setFont(fonteMenu);

        menuArquivo.add(itemNovo);
        menuArquivo.addSeparator();
        menuArquivo.add(itemSair);

        menuRelatorio.add(itemCliente);
        menuRelatorio.add(itemFornecedor);

        menuSobre.add(itemInfo);

        barraMenu.add(menuArquivo);
        barraMenu.add(menuRelatorio);
        barraMenu.add(menuSobre);
        janela.setJMenuBar(barraMenu);

        // Painel que permite trocar de tela
        CardLayout trocaPaineis = new CardLayout();
        JPanel painelPrincipal = new JPanel(trocaPaineis);

        // Painel inicial
        JPanel painelInicial = new JPanel(new BorderLayout());
        painelInicial.setBackground(Color.YELLOW);

        JLabel tituloInicial = new JLabel("CONTROLE DE CLIENTES", SwingConstants.CENTER);
        tituloInicial.setFont(fonteTitulo);
        tituloInicial.setForeground(new Color(0, 100, 0));
        tituloInicial.setBorder(BorderFactory.createEmptyBorder(60, 0, 20, 0));

        JLabel labelLogo = new JLabel("", SwingConstants.CENTER);
        ImageIcon logoOriginal = new ImageIcon("logo.png");

        if (logoOriginal.getIconWidth() > 0) {
            Image imagem = logoOriginal.getImage().getScaledInstance(
                    170, 170, Image.SCALE_SMOOTH);
            labelLogo.setIcon(new ImageIcon(imagem));
        } else {
            labelLogo.setText("LOGO UNIFAGOC");
            labelLogo.setFont(new Font("Arial", Font.BOLD, 24));
            labelLogo.setForeground(new Color(53, 125, 111));
        }

        painelInicial.add(tituloInicial, BorderLayout.NORTH);
        painelInicial.add(labelLogo, BorderLayout.CENTER);

        // Painel de cadastro
        JPanel painelCadastro = new JPanel(new BorderLayout(10, 10));
        painelCadastro.setBackground(new Color(235, 245, 250));
        painelCadastro.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel tituloCadastro = new JLabel("CADASTRO DE CLIENTE", SwingConstants.CENTER);
        tituloCadastro.setFont(fonteTitulo);
        tituloCadastro.setForeground(new Color(0, 90, 120));

        JTextField campoNome = new JTextField();
        JTextField campoCpf = new JTextField();
        JTextField campoEmail = new JTextField();

        JPanel formulario = new JPanel(new GridLayout(3, 2, 10, 15));
        formulario.setOpaque(false);
        formulario.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        formulario.add(new JLabel("Nome:"));
        formulario.add(campoNome);
        formulario.add(new JLabel("CPF:"));
        formulario.add(campoCpf);
        formulario.add(new JLabel("E-mail:"));
        formulario.add(campoEmail);

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoCancelar = new JButton("Cancelar");

        botaoSalvar.setBackground(new Color(60, 150, 90));
        botaoSalvar.setForeground(Color.WHITE);
        botaoSalvar.setFont(new Font("Arial", Font.BOLD, 14));

        botaoCancelar.setBackground(new Color(190, 70, 70));
        botaoCancelar.setForeground(Color.WHITE);
        botaoCancelar.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel painelBotoes = new JPanel();
        painelBotoes.setOpaque(false);
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoCancelar);

        painelCadastro.add(tituloCadastro, BorderLayout.NORTH);
        painelCadastro.add(formulario, BorderLayout.CENTER);
        painelCadastro.add(painelBotoes, BorderLayout.SOUTH);

        painelPrincipal.add(painelInicial, "inicio");
        painelPrincipal.add(painelCadastro, "cadastro");
        janela.add(painelPrincipal);

        // Eventos dos menus
        itemNovo.addActionListener(e -> trocaPaineis.show(painelPrincipal, "cadastro"));
        itemSair.addActionListener(e -> System.exit(0));

        itemCliente.addActionListener(e ->
                JOptionPane.showMessageDialog(janela, "Relatório de clientes"));

        itemFornecedor.addActionListener(e ->
                JOptionPane.showMessageDialog(janela, "Relatório de fornecedores"));

        itemInfo.addActionListener(e ->
                JOptionPane.showMessageDialog(janela,
                        "Aluno: Joao furiati",
                        "Sobre",
                        JOptionPane.INFORMATION_MESSAGE));

        // Eventos dos botões
        botaoSalvar.addActionListener(e -> {
            String mensagem = "Cliente salvo!"
                    + "\nNome: " + campoNome.getText()
                    + "\nCPF: " + campoCpf.getText()
                    + "\nE-mail: " + campoEmail.getText();

            JOptionPane.showMessageDialog(janela, mensagem);
        });

        botaoCancelar.addActionListener(e -> {
            campoNome.setText("");
            campoCpf.setText("");
            campoEmail.setText("");
            trocaPaineis.show(painelPrincipal, "inicio");
        });

        trocaPaineis.show(painelPrincipal, "inicio");
        janela.setVisible(true);
    }
}
