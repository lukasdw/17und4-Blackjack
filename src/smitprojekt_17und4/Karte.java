package smitprojekt_17und4;

public class Karte {

    private int wert;
    private String name;
    private String farbe;

    public Karte(int wert, String name, String farbe) {
        this.farbe = farbe;
        this.name = name;
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
