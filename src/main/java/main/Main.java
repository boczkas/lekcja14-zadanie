package main;

// !!! NIE ZMIENIAJ IMPORTOW !!!
import ciasto.Mazurek;
import skladniki.Cukier;
import skladniki.Jajko;
import skladniki.Maka;
import skladniki.Maslo;
import zwierzeta.Pies;

public class Main {
    public static void main(String[] args) {
//        Napraw kod, tak aby na konsoli pojawiło się:
//
//
//      Pieczemy mazurka z:
//      Maka: 300gramy
//      Maslo: 150gramy
//      Cukier: 12lyzeczki
//      Jajko: 1sztuki
//      To sa te same psy: true
//      Pies{imie='Burek', wiek=4}
//

        Mazurek mazurek = new Mazurek();

        mazurek.dodajSkladnik(new Maka("gramy", 300));
        mazurek.dodajSkladnik(new Maslo("gramy", 150));
        mazurek.dodajSkladnik(new Cukier("lyzeczki", 12));
        mazurek.dodajSkladnik(new Jajko("sztuki", 1));

        mazurek.upiecz();

        Pies burek = new Pies("Burek", 4);
        Pies tezBurek = new Pies("Burek", 4);

        System.out.println("To sa te same psy: " + burek.equals(tezBurek));

        System.out.println(burek);
    }
}
