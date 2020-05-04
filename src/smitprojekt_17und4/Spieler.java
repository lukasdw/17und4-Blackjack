package smitprojekt_17und4;

import java.util.ArrayList;

public class Spieler {

    // Jeder Spieler bekommt am Anfang einen Einsatz von 10.
    private int kontostand = 10;
    private int punktestand;
    private int einsatz;
    
    ArrayList<Karte> hand = new ArrayList<Karte>();
    private int handPunkte;

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getPunktestand() {
        return punktestand;
    }

    public void setPunktestand(int punktestand) {
        this.punktestand = punktestand;
    }

    public int getEinsatz() {
        return einsatz;
    }

    public void setEinsatz(int einsatz) {
        this.einsatz = einsatz;
    }

    public ArrayList<Karte> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Karte> hand) {
        this.hand = hand;
    }

    public int getHandPunkte() {
        return handPunkte;
    }

    public void setHandPunkte(int handPunkte) {
        this.handPunkte = handPunkte;
    }
}