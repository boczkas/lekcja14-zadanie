package ciasto;

import skladniki.Skladnik;

import java.util.ArrayList;
import java.util.List;

public class Mazurek {
    List<Skladnik> skladniki;

    public Mazurek() {
        this.skladniki = new ArrayList<>();
    }

    public void dodajSkladnik(Skladnik skladnik) {
        skladniki.add(skladnik);
    }

    public void upiecz() {
        System.out.println("Pieczemy mazurka z:");
        for (Skladnik skladnik : skladniki) {
            skladnik.wypisz();
        }
    }
}
