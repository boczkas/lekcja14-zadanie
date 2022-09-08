package skladniki;

public class Maka extends Skladnik {

    public Maka(String jednostka, int ilosc) {
        super(jednostka, ilosc);
    }

    @Override
    public void wypisz() {
        System.out.println("Maka: " + ilosc + jednostka);
    }
}
