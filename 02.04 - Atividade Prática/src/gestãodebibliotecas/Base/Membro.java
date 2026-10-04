package Base;

public class Membro {
    private String nome;
    private String endereço;
    private int idade;
    private String telefone;
    private String cpf;
    private int id;
    private String dataCadastro;

    public Membro(String nome, String endereço, int idade, String telefone, String cpf, int id, String dataCadastro) {
        this.nome = nome;
        this.endereço = endereço;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.id = id;
        this.dataCadastro = dataCadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    @Override
    // Retorna o nome usado para identificar o membro nos componentes de seleção.
    public String toString() {
        return nome;
    }
}
