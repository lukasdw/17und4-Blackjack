package client;

public class Karte implements KarteInterface {

    private int wert;
    private String name;
    private String farbe;
    private String bilderPfad;

    /* Konstruktor */
    public Karte(String name, int wert, String farbe, String bilderPfad) {
        this.farbe = farbe;
        this.name = name;
        this.wert = wert;
        this.bilderPfad = bilderPfad;
    }

    /* Getter und Setter */
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

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getBilderPfad() {
        return bilderPfad;
    }

    public void setBilderPfad(String bilderPfad) {
        this.bilderPfad = bilderPfad;
    }
}