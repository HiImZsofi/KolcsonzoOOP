package hu.petrik.kolcsonzoop;

public class Ujsag implements Kolcsonozheto{
    private String cim;
    private int kiadasEv;
    private int kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s %d/%d.", this.cim, this.kiadasEv, this.kiadasHet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }

    public String getCim() {
        return cim;
    }

    public int getKiadasEv() {
        return kiadasEv;
    }

    public int getKiadasHet() {
        return kiadasHet;
    }
}
