public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livroFisico = new LivroFisico("Harry Potter", "Jay Key Rolling", 200, 1.5);

        Ebook ebook = new Ebook("Percy Jackson", "Rick Riordan", 200, 500);

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        biblioteca.listarLivros();
        biblioteca.buscarLivroPorTitulo("");
    }
}
