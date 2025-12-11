
public enum Ikony {
    LINKHORE("pics/linkHore.png"),
    LINKDOLE("pics/linkDole.png"),
    LINKVPRAVO("pics/linkVpravo.png"),
    LINKVLAVO("pics/linkVlavo.png");
    //TODO> pridat dalsie ikony podla potreby (nepriatelia, projektily ...)

    private String suborObrazku;

    Ikony(String suborObrazku) {
        this.suborObrazku = suborObrazku;
    }

    public String getSuborObrazku() {
        return this.suborObrazku;
    }
}
