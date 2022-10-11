package hu.petrik.kolcsonzoop;

public class DVD implements Kolcsonozheto, Comparable<DVD>{
    private String cim;
    private int hossz;

    public DVD(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s (%d perc)", this.cim, this.hossz);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }

    public String getCim() {
        return cim;
    }

    public int getHossz() {
        return hossz;
    }

    @Override
    public int compareTo(DVD masikdvd) {
        return this.hossz - masikdvd.hossz;
    }
}
