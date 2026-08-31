public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livroFisico = new LivroFisico("Harry Potter", "J. K. Rowling", 200, 1.5);
        Ebook ebook = new Ebook("Percy Jackson", "Rick Riordan", 200, 500);
        Membros membro = new Membros(
                "Joao Silva",
                "Rua Principal, 100",
                119999999,
                20,
                "123.456.789-00",
                1,
                "29/08/2026"
        );

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        biblioteca.listarLivros();
        biblioteca.buscarLivroPorTitulo("Harry Potter");

        exibirDescricao(livroFisico);
        exibirDescricao(ebook);

        biblioteca.cadastrarMembro(membro);
        biblioteca.editarMembro(
                1,
                "Joao da Silva",
                "Rua Principal, 200",
                119999999,
                21,
                "123.456.789-00"
        );
        biblioteca.listarMembros();

        Membros membroEncontrado = biblioteca.buscarMembroPorId(1);
        if (membroEncontrado != null) {
            System.out.println("Membro encontrado: " + membroEncontrado.getNome());
        }

        biblioteca.realizarEmprestimo(1, livroFisico);
        biblioteca.listarEmprestimos();
        biblioteca.encerrarEmprestimo(livroFisico);
        biblioteca.listarEmprestimos();

        biblioteca.removerLivro(ebook);
    }

    private static void exibirDescricao(Livro.Descritivel item) {
        item.descricao();
    }
}
