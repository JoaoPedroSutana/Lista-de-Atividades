// João Pedro Furiati Sutana


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Formulário para cadastro de Pessoa");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField cpf = new JTextField();
        JTextField nome = new JTextField();
        JTextField endereco = new JTextField();

        //determinar quais dados são necessários

        String[] estados = {
                "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
                "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão",
                "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
                "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima",
                "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"
        };
        JComboBox<String> estado = new JComboBox<>(estados);
        
        String[] cargos = {"Gerente de Marketing", "Programador", "Professor", "Vendedor", "Analista", "Psicologo", "Influencer",
                           "Medico", "Piloto", "Cozinheiro", "Quimico", "Biologo", "Fisico", "Agricultor", "Pescador", "Padeiro"
        };
        JComboBox<String> cargo = new JComboBox<>(cargos);

        //Os codigos acima servem para criar um botão de opções a ser selecionada
        //'cargos' e 'estados' armazenam as opçoes que podem ser selecionadas
        
        JButton botao = new JButton("Imprimir Dados"); //Botão para confirmar os dados a serem salvos

        JPanel painel = new JPanel(new GridLayout(6, 2, 10, 10)); //cria um painel
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painel.add(new JLabel("Informe CPF:"));
        painel.add(cpf);
        painel.add(new JLabel("Nome:"));
        painel.add(nome);
        painel.add(new JLabel("Endereço:"));
        painel.add(endereco);
        painel.add(new JLabel("Estado:"));
        painel.add(estado);
        painel.add(new JLabel("Cargo:"));
        painel.add(cargo);
        painel.add(new JLabel());
        painel.add(botao);

        //adiciona os campos para inserir os dados

        botao.addActionListener(e -> {
            String dados = "CPF: " + cpf.getText()
                    + "\nNome: " + nome.getText()
                    + "\nEndereço: " + endereco.getText()
                    + "\nEstado: " + estado.getSelectedItem()
                    + "\nCargo: " + cargo.getSelectedItem();

            JOptionPane.showMessageDialog(janela, dados, "Mensagem",
                    JOptionPane.INFORMATION_MESSAGE);

            //evento para criar uma nova janela com os dados inseridos anteriormente
        });

        janela.add(painel);
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

        //dados da janela (tamanho, posição)
    }
}
