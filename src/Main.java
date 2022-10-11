import hu.petrik.kolcsonzoop.DVD;
import hu.petrik.kolcsonzoop.Kolcsonozheto;
import hu.petrik.kolcsonzoop.Konyv;
import hu.petrik.kolcsonzoop.Ujsag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Kolcsonozheto> katalogus = new ArrayList<>();
    static List<DVD> dvdk = new ArrayList<>();
    public static void main(String[] args) {
        Kolcsonozheto konyv1 = new Konyv("A gyűrűk ura", "J. R. R. Tolkien", "AABBCC-1231");
        DVD dvd1 = new DVD("Star Wars V. rész - A birodalom visszavág", 134);
        DVD dvd2 = new DVD("Star Wars V. rész - A sithek bosszúja", 150);
        DVD dvd3 = new DVD("Star Wars V. rész - A jedi visszatér", 131);
        DVD dvd4 = new DVD("Gyűrűk ura - A gyűrűk szövetsége", 178);
        DVD dvd5 = new DVD("Gyűrűk ura - A király visszatér", 201);
        DVD dvd6 = new DVD("Gyűrűk ura - A két torony", 179);
        Ujsag ujsag1 = new Ujsag("Képes sport", 2007, 23);

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(dvd4);
        katalogus.add(dvd5);
        katalogus.add(dvd6);
        katalogus.add(ujsag1);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        dvdk.add(dvd4);
        dvdk.add(dvd5);
        dvdk.add(dvd6);

        for (int i = 0; i < katalogus.size(); i++) {
            System.out.println(konyv1.megjelenitendoNev() + " " + konyv1.meddigKolcsonozheto());
        }



        Collections.sort(dvdk);
        for (DVD d: dvdk){
            System.out.println(d.megjelenitendoNev() + " " + d.getHossz());
        }
    }
}