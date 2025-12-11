
import fri.shapesge.Manazer;

public class Arena {
    private Hrac hrac;
    private Manazer manazer;
    private Smer smer;

    private int tikCounter;
    private static int VELKOST = 35;
    private boolean zvacsi = false;

    public Arena() {
        this.tikCounter = 0;
        this.manazer = new Manazer();
        // pass the manager into Hrac so it can use the same instance
        this.hrac = new Hrac(this.manazer, new Poloha(VELKOST, VELKOST, 270));
        this.smer = Smer.DOLE;

        this.manazer.spravujObjekt(this);
    }

    public void tik() {
        if (this.tikCounter < 1) {
            this.tikCounter++;
            return;
        }
        this.tikCounter = 0;

        if (this.zvacsi) {
            this.zvacsi = false;
        } else {
            this.hrac.setPoloha(this.getNextPoloha());
        }
    }

    private Poloha getNextPoloha() {
        return this.hrac.getPoloha().getPosunutuPolohu(VELKOST, this.smer);
    }

    public void posunHore() {
        if (smer != Smer.DOLE) this.smer = Smer.HORE;
    }
    public void posunDole() {
        if (smer != Smer.HORE) this.smer = Smer.DOLE;
    }
    public void posunVlavo() {
        if (smer != Smer.VPRAVO) this.smer = Smer.VLAVO;
    }
    public void posunVpravo() {
        if (smer != Smer.VLAVO) this.smer = Smer.VPRAVO;
    }

    public void aktivuj() {
        this.zvacsi = true;
    }
}
