/**
 * Trieda reprezentujuca polohu objektu v 2D priestore
 * s urcenym uhlom natočenia
 */

public class Poloha {

    private final int x;
    private final int y;
    private final int uhol;

    public Poloha(int x, int y, int uhol) {
        this.x = x;
        this.y = y;
        this.uhol = uhol;
    }

    /*
     * Gettery
     */
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getUhol() {
        return this.uhol;
    }

    /*
     * Metoda na posunutie polohy o dany krok v danom smere
     */
    public Poloha getPosunutuPolohu(int krok, Smer smer) {
        
        return new Poloha(
            this.x + (krok * smer.getX()),
            this.y + (krok * smer.getY()),
            smer.getUhol()
        );
    }
}
