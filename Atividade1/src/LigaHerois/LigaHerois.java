package LigaHerois;

public class LigaHerois {
    public static void main(String args[]) {
        Goku goku = new Goku("Goku", 100, 100);
        Vegeta vegeta = new Vegeta("Vegeta", 100, 100);
        Piccolo piccolo = new Piccolo("Freeza", 100, 100);

        Herois[] herois = {goku, vegeta, piccolo};

        for (Herois heroi : herois) {
            heroi.apresentar();
            heroi.atacar();
            System.out.println();
        }
    }
}