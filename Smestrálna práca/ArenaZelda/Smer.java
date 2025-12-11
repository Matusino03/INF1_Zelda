
public enum Smer {
    // Mame smery hore, dole, vlavo, vpravo
    HORE(90, 0, -1),
    DOLE(270, 0, 1),
    VLAVO(100, -1, 0),
    VPRAVO(0, 1, 0);

    // Smery potrebuju suradnice X a Y + uhol smery
    private int uhol;
    private int x;
    private int y;

    Smer (int uhol, int x, int y) {
        this.uhol = uhol;
        this.x = x;
        this.y = y;
    }

    public int getUhol() {
        return this.uhol;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}


