import java.util.Date;

public class Membros extends Pessoa {
    private int id;
    private String dataCadastro;

    public Membros(String nome, String endereço, int telefone, int idade, String cpf, int id, String dataCadastro) {
        super(nome, endereço, idade, telefone, cpf);
        this.id = id;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
