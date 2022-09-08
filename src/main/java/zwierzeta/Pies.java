package zwierzeta;

import java.util.Objects;

public class Pies {
    String imie;
    int wiek;

    public Pies(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pies pies = (Pies) o;
        return wiek == pies.wiek && Objects.equals(imie, pies.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek);
    }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
