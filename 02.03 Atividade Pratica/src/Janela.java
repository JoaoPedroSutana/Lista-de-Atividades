import javax.swing.*;

public class Janela extends JFrame {

    private JLabel jlAgencia, jlConta, jlNome;
    private JLabel jlEndereco, jlTelefone, jlCpf;

    private JTextField jtfAgencia, jtfConta, jtfNome;
    private JTextField jtfEndereco, jtfTelefone, jtfCpf;

    private JSeparator jSeparator01, jSeparator02;
    private JRadioButton jrbCorrente, jrbPoupanca;
    private ButtonGroup bgContas;
    private JButton jbConsultar, jbAtualizar, jbFechar;

    public Janela() {
        setTitle("Laboratório de Programação");
        setSize(400, 255);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        jlAgencia = new JLabel("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        add(jlAgencia);

        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        add(jtfAgencia);

        jlConta = new JLabel("Número da Conta:");
        jlConta.setBounds(205, 10, 105, 18);
        add(jlConta);

        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        add(jtfConta);

        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        add(jSeparator01);

        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlNome);

        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        add(jtfNome);

        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlEndereco);

        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        add(jtfEndereco);

        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlTelefone);

        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        add(jtfTelefone);

        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlCpf);

        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        add(jtfCpf);

        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C');
        jrbCorrente.setSelected(true);
        add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P');
        add(jrbPoupanca);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        add(jSeparator02);

        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S');
        add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A');
        jbAtualizar.setEnabled(false);
        add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic('F');
        jbFechar.addActionListener(e -> System.exit(0));
        add(jbFechar);
    }
}