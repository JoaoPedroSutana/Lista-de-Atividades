import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();



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
}
