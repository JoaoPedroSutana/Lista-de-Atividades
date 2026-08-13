package LigaHerois;

public class Goku extends Herois{
    public Goku(String nome, int vida, int energia) {
        super(nome, vida, energia);
    }

    @Override
    public void atacar(){
        System.out.println("KA...ME...HA...ME...HA!!!!!!!");
    }

    @Override
    public void apresentar(){
        System.out.println("Oi, Eu sou o Goku!");
    }
}
