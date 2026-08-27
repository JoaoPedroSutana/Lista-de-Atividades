public class Passaro extends Animal {
    public Passaro(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Acho que vi um gatinho!");
    }
}
