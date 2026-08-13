package LigaHerois;

public class Vegeta extends Herois{
    public Vegeta(String nome, int vida, int energia) {
        super(nome, vida, energia);
    }

    @Override
    public void atacar(){
        System.out.println("FINAL...FLASH!");
    }

    @Override
    public void apresentar(){
        System.out.println("Eu sou o Vegeta! O principe dos Saiyajins!");
    }
}
