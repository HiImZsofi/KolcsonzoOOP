package hu.petrik.kolcsonzoop;

public class DVD implements Kolcsonozheto{
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
}
