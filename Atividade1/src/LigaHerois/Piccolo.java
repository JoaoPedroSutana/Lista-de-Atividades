package LigaHerois;

public class Piccolo extends Herois {
    public Piccolo(String nome, int vida, int energia) {
        super(nome, vida, energia);
    }

    @Override
    public void atacar(){
        System.out.println("MAKANKOSAPPO!");
    }

    @Override
    public void apresentar(){
        System.out.println("Me chamo Piccolo!");
    }
}
