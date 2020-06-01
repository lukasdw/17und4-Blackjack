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
    @Override
    public int getWert() {
        return wert;
    }

    @Override
    public void setWert(int wert) {
        this.wert = wert;
    }

    @Override
    public String getKartenName() {
        return name;
    }

    @Override
    public void setKartenName(String name) {
        this.name = name;
    }

    @Override
    public String getFarbe() {
        return farbe;
    }

    @Override
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String getBilderPfad() {
        return bilderPfad;
    }

    @Override
    public void setBilderPfad(String bilderPfad) {
        this.bilderPfad = bilderPfad;
    }
}