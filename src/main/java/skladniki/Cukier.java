package skladniki;

public class Cukier extends Skladnik {
    public Cukier(String jednostka, int ilosc) {
        super(jednostka, ilosc);
    }

    @Override
    public void wypisz() {
        System.out.println("Cukier: " + ilosc + jednostka);
    }
}
