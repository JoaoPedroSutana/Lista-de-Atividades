import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 500);
        janela.setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();

        abas.addTab("Aluno", criarTela("Nome", "E-mail", "aluno", "email"));
        abas.addTab("Professor", criarTela("Nome", "Disciplina", "professor", "disciplina"));
        abas.addTab("Curso", criarTela("Nome do curso", "Carga horária", "curso", "carga_horaria"));

        janela.add(abas);
        janela.setVisible(true);
    }

    private static JPanel criarTela(
            String rotulo1,
            String rotulo2,
            String tabela,
            String coluna2
    ) {
        JPanel tela = new JPanel(new BorderLayout(5, 10));
        JPanel formulario = new JPanel();
        formulario.setLayout(new BoxLayout(formulario, BoxLayout.Y_AXIS));

        JTextField campoNome = new JTextField(25);
        JTextField campo2 = new JTextField(25);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linha1.add(new JLabel(rotulo1 + ":"));
        linha1.add(campoNome);

        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linha2.add(new JLabel(rotulo2 + ":"));
        linha2.add(campo2);

        JTextArea lista = new JTextArea();
        lista.setEditable(false);

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoListar = new JButton("Listar");

        botaoSalvar.addActionListener(evento ->
                salvar(tabela, coluna2, campoNome.getText(), campo2.getText())
        );

        botaoListar.addActionListener(evento ->
                listar(tabela, coluna2, rotulo2, lista)
        );

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.LEFT));
        botoes.add(botaoSalvar);
        botoes.add(botaoListar);

        formulario.add(linha1);
        formulario.add(linha2);
        formulario.add(botoes);

        tela.add(formulario, BorderLayout.NORTH);
        tela.add(new JScrollPane(lista), BorderLayout.CENTER);

        return tela;
    }

    private static void salvar(
            String tabela,
            String coluna2,
            String nome,
            String valor2
    ) {
        nome = nome.trim();
        valor2 = valor2.trim();

        if (nome.isEmpty() || valor2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos.");
            return;
        }

        String sql = "INSERT INTO " + tabela
                + " (nome, " + coluna2 + ") VALUES (?, ?)";

        try (Connection conexao = ConnectionFactory.getConnection();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, nome);

            if (coluna2.equals("carga_horaria")) {
                comando.setInt(2, Integer.parseInt(valor2));
            } else {
                comando.setString(2, valor2);
            }

            comando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro salvo!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "A carga horária deve ser um número inteiro."
            );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private static void listar(
            String tabela,
            String coluna2,
            String rotulo2,
            JTextArea area
    ) {
        String sql = "SELECT id, nome, " + coluna2 + " FROM " + tabela;

        try (Connection conexao = ConnectionFactory.getConnection();
             PreparedStatement comando = conexao.prepareStatement(sql);
             ResultSet resultado = comando.executeQuery()) {

            area.setText("");

            while (resultado.next()) {
                area.append(
                        resultado.getInt("id")
                                + " - Nome: " + resultado.getString("nome")
                                + " - " + rotulo2 + ": " + resultado.getString(coluna2)
                                + "\n"
                );
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}