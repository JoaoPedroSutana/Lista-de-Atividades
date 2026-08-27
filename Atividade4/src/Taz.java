public class Taz extends Animal {
    public Taz(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grrr! Blá-blá-blá-blá!");
    }
}
