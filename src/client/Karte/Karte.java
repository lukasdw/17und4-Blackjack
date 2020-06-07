package client.Karte;

import client.Karte.*;
import client.Sound.*;
import client.Spieler.*;
import client.Netzwerk.*;
import client.Partie.*;

public class Karte implements KarteInterface {

    private int wert;
    private String karteName;
    private String farbe;
    private String bilderPfad;

    /* Konstruktor */
    public Karte(String karteName, int wert, String farbe, String bilderPfad) {
        this.farbe = farbe;
        this.karteName = karteName;
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

    public String getKarteName() {
        return karteName;
    }

    public void setKarteName(String karteName) {
        this.karteName = karteName;
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