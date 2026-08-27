public class PicaPau extends Animal {
    public PicaPau(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Hehehehehehe!");
    }
}
