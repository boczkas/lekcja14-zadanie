package skladniki;

public class Jajko extends Skladnik {
    public Jajko(String jednostka, int ilosc) {
        super(jednostka, ilosc);
    }

    @Override
    public void wypisz() {
        System.out.println("Jajko: " + ilosc + jednostka);
    }
}
