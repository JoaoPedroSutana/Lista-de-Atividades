public class Main {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Scooby doo", 5, "Marrom");
        Gato gato = new Gato("Frajola", 3, "Branco e preto");
        Coelho coelho = new Coelho("Pernalonga", 2, "Cinza");
        Passaro passaro = new Passaro("Piu Piu", 2, "Amarelo");
        Taz taz = new Taz("Taz", 4, "Marrom");
        PicaPau picaPau = new PicaPau("Pica-Pau", 3, "Vermelho e azul");

        veterinario.adicionarAnimal(cachorro);
        veterinario.adicionarAnimal(gato);
        veterinario.adicionarAnimal(coelho);
        veterinario.adicionarAnimal(passaro);
        veterinario.adicionarAnimal(taz);
        veterinario.adicionarAnimal(picaPau);

        System.out.println("Animais cadastrados:");
        for (Animal animal : veterinario.getAnimais()) {
            System.out.printf(
                    "%s - Nome: %s, Idade: %d, Cor: %s%n",
                    animal.getClass().getSimpleName(),
                    animal.getNome(),
                    animal.getIdade(),
                    animal.getCor()
            );
        }

        System.out.println("\nSons dos animais:");
        veterinario.examinarAnimaisELevarParaCarrocinha();
        System.out.println("Animais na carrocinha: "
                + veterinario.getCarrocinha().size());
    }
}
