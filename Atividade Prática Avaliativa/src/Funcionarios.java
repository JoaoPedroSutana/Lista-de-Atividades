public class Funcionarios extends Pessoa {
    private int matricula;
    private String cargo;

    public Funcionarios(String nome, String endereço, int telefone, int idade, String cpf, int matricula, String cargo) {
        super(nome, endereço, idade, telefone, cpf);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
