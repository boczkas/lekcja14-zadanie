package skladniki;

import java.util.Objects;

public abstract class Skladnik {
    String jednostka;
    int ilosc;

    public Skladnik(String jednostka, int ilosc) {
        this.jednostka = jednostka;
        this.ilosc = ilosc;
    }

    public abstract void wypisz();
}
