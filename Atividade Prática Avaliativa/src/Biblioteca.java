import java.util.ArrayList;
import java.time.LocalDate;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Membros> membros = new ArrayList<>();
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    private ArrayList<Membros> membrosDosEmprestimos = new ArrayList<>();
    private ArrayList<LocalDate> datasEmprestimos = new ArrayList<>();
    private ArrayList<LocalDate> datasDevolucoes = new ArrayList<>();



    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo() + " - " + "Autor: " + livro.getAutor() + " - " + "Páginas: " + livro.getNumeroPaginas());
            livro.descricao();
        }
    }

    public void buscarLivroPorTitulo(String livro) {
        for (Livro livro1 : livros) {
            if (livro1.getTitulo().equals(livro)) {
                System.out.println(livro1.getTitulo() + " - " + livro1.getAutor());
            }
        }
    }

    public boolean cadastrarMembro(Membros membro) {
        if (buscarMembroPorId(membro.getId()) != null) {
            System.out.println("Ja existe um membro com o ID " + membro.getId() + ".");
            return false;
        }
        membros.add(membro);
        return true;
    }

    public boolean editarMembro(int id, String nome, String endereco, int telefone, int idade, String cpf) {
        Membros membro = buscarMembroPorId(id);
        if (membro == null) {
            System.out.println("Membro nao encontrado.");
            return false;
        }
        membro.setNome(nome);
        membro.setEndereço(endereco);
        membro.setTelefone(telefone);
        membro.setIdade(idade);
        membro.setCpf(cpf);
        return true;
    }

    public void listarMembros() {
        if (membros.isEmpty()) {
            System.out.println("Nenhum membro cadastrado.");
            return;
        }
        for (Membros membro : membros) {
            System.out.println("ID: " + membro.getId() + " - Nome: " + membro.getNome()
                    + " - CPF: " + membro.getCpf() + " - Cadastro: " + membro.getDataCadastro());
        }
    }

    public boolean realizarEmprestimo(int idMembro, Livro livro) {
        Membros membro = buscarMembroPorId(idMembro);
        if (membro == null) {
            System.out.println("Membro nao encontrado.");
            return false;
        }
        if (!livros.contains(livro)) {
            System.out.println("Livro nao pertence ao acervo.");
            return false;
        }
        if (buscarIndiceEmprestimoAberto(livro) != -1) {
            System.out.println("Livro indisponivel para emprestimo.");
            return false;
        }
        livrosEmprestados.add(livro);
        membrosDosEmprestimos.add(membro);
        datasEmprestimos.add(LocalDate.now());
        datasDevolucoes.add(null);
        return true;
    }

    public boolean encerrarEmprestimo(Livro livro) {
        int indice = buscarIndiceEmprestimoAberto(livro);
        if (indice == -1) {
            System.out.println("Nao existe emprestimo aberto para este livro.");
            return false;
        }
        datasDevolucoes.set(indice, LocalDate.now());
        return true;
    }

    public void listarEmprestimos() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum emprestimo registrado.");
            return;
        }
        for (int i = 0; i < livrosEmprestados.size(); i++) {
            String situacao = datasDevolucoes.get(i) == null ? "Aberto"
                    : "Encerrado em " + datasDevolucoes.get(i);
            System.out.println("Livro: " + livrosEmprestados.get(i).getTitulo()
                    + " - Membro: " + membrosDosEmprestimos.get(i).getNome()
                    + " - Data: " + datasEmprestimos.get(i)
                    + " - Situacao: " + situacao);
        }
    }

    public Membros buscarMembroPorId(int id) {
        for (Membros membro : membros) {
            if (membro.getId() == id) {
                return membro;
            }
        }
        return null;
    }

    public int buscarIndiceEmprestimoAberto(Livro livro) {
        for (int i = 0; i < livrosEmprestados.size(); i++) {
            if (livrosEmprestados.get(i) == livro && datasDevolucoes.get(i) == null) {
                return i;
            }
        }
        return -1;
    }
}
