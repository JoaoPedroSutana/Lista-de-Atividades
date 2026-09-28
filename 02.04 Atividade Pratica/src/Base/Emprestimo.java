package Base;

public class Emprestimo {
    private Livro livro;
    private Membro membro;

    public Emprestimo(Livro livro, Membro membro) {
        this.livro = livro;
        this.membro = membro;
    }

    public Livro getLivro() {
        return livro;
    }

    public Membro getMembro() {
        return membro;
    }

    @Override
    public String toString() {
        return livro.getTitulo() + " — " + membro;
    }
}