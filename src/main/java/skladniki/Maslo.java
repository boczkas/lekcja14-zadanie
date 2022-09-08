package skladniki;

public class Maslo extends Skladnik {
    public Maslo(String jednostka, int ilosc) {
        super(jednostka, ilosc);
    }

    @Override
    public void wypisz() {
        System.out.println("Maslo: " + ilosc + jednostka);
    }
}
