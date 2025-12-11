
import fri.shapesge.Kruh;
import fri.shapesge.Manazer;
import fri.shapesge.Obrazok;

public class Hrac {
    private Kruh kruh;
    private Manazer manazer;
    private Poloha poloha;
    private Obrazok obrazok;

    public Hrac(Manazer manazer, Poloha poloha) {
        this.manazer = manazer;
        this.poloha = poloha;

        // create and configure the visual circle before using it
        this.kruh = new Kruh(); // adjust if your Kruh API requires parameters
        this.kruh.zmenPriemer(20);
        this.kruh.zmenFarbu("modra");
        this.kruh.zmenPolohu(this.poloha.getX(), this.poloha.getY());
        this.kruh.zobraz();

        // register with manager at the end of constructor
        this.manazer.spravujObjekt(this);
    }

    public Poloha getPoloha() {
        return poloha;
    }

    public void setPoloha(Poloha poloha) {
        this.poloha = poloha;
        // Update visual position
        this.kruh.zmenPolohu(this.poloha.getX(), this.poloha.getY());
    }
}