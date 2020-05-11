package smitprojekt_17und4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Spieler {

    /* Jeder Spieler bekommt am Anfang einen Einsatz von 10. */
    private String name;

    /* Der Name wird direkt vergeben. Automatisch bekommt der Spieler, 10 Punkte
    auf sein Kontostand */
    private int kontostand = 10;

    /* Der Kontostand ist zu aller Anfang auf 0 gesetzt */
    private int punktestand = 0;
    private int einsatz = 0;

    /* Es können belibig viel Karten gezogen werden. */
    ArrayList<Karte> hand = new ArrayList<Karte>();
    private int handPunkte = 0;

    public Spieler(String name) {
        /* Der Spieler benötigt immer einen Namen, mit dem er angesprochen wird. */
        this.name = name;
    }

    public void karteZiehen(ArrayList<Karte> deck) {
        /* Nun wird eine Karte per Zufall aus dem Deck gezogen */
        int zufallszahl = (int) (Math.random() * deck.size()) + 0;

        /* Diese Karte wird nun auf die Hand des Spielers bewegt */
        this.hand.add(deck.get(zufallszahl));
        
        /* Die gezogene Karte muss aus dem Deck entfernt werden, da sie nun
        auf der Hand des Spielers ist */
        deck.remove(zufallszahl);

        /* Die Wertigkeit der aktuellen Hand wird errechnet */
        handPunkte =+ hand.get(zufallszahl).getWert();
    }

    /* Der Einsatz wird eingelesen und dem einsatzPool hinzugefügt */
    public int einsatzSetzen(int einsatzPool, int einsatz) throws IOException {
        this.einsatz = einsatz;
        einsatzPool =+ this.einsatz;
        return einsatzPool;
    }

    /* Getter und Setter */
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