package smitprojekt_17und4;

public class Karte {

    private int wert;
    private String name;
    private String farbe;
    private String bilderPfad;

    // Konstruktor
    public Karte(String name, int wert, String farbe, String bilderPfad) {
        this.farbe = farbe;
        this.name = name;
        this.wert = wert;
        this.bilderPfad = bilderPfad;
    }

    // Getter und Setter
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
