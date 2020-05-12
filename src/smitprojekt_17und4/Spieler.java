package smitprojekt_17und4;

import java.io.*;
import java.util.ArrayList;

public class Spieler {

    /* Der Name wird direkt vergeben. */
    private String name;

    /* Jeder Spieler bekommt am Anfang einen Kontostand von 10. */
    private int kontostand = 10;

    /* Am Anfang hat jeder Spieler 0 Punkte */
    private int punktestand = 0;
    private int einsatz = 0;

    /* Werden Karten aus dem Deck gezogen landen die Karten vom Deck auf die Hand.
    Die Werte der Karten werden zusammengerechnet und in der Variable, "handPunkte"
    gespeichert. Die Anzahl der Karten ist auf der Hand nicht begrenzt. */
    ArrayList<Karte> hand = new ArrayList<Karte>();
    private int handPunkte = 0;

    // Konstruktor
    public Spieler(String name) {
        /* Der Spieler benötigt immer einen Namen, mit dem er im Spiel angesprochen wird. */
        this.name = name;
    }

    // Der Spieler zieht eine Karte
    public void karteZiehen(ArrayList<Karte> deck) {
        /* Nun wird eine Karte per Zufall aus dem Deck gezogen. Die Zufallszahl
        ist zwischen 1 und 52. */
        int zufallszahl = (int) (Math.random() * deck.size()) + 1;

        /* Diese Karte wird nun auf die Hand des Spielers bewegt */
        this.hand.add(deck.get(zufallszahl));

        /* Die gezogene Karte muss aus dem Deck entfernt werden, da sie nun
        auf der Hand des Spielers ist */
        deck.remove(zufallszahl);

        /* Die Wertigkeit der aktuellen Hand wird errechnet */
        for (int i = 0; i < hand.size(); i++) {
            handPunkte = handPunkte + hand.get(i).getWert();
        }
    }

    /* Der Einsatz wird aus dem JTextfeld, jTextFieldEinsatz eingelesen
    und dem einsatzPool hinzugefügt. */
    public int einsatzSetzen(int einsatzPool, javax.swing.JTextField jTextFieldEinsatz) {
        /* Der Wert des Textfeldes wird in eine Ganzzahl umgewandelt und in
        der Variable Einsatz des Spielers gespeichert.*/
        this.einsatz = Integer.parseInt(jTextFieldEinsatz.getText());
        /* Der Einsatz wird dem Einsatzpool hinzugefügt. Dies macht
        jeder Spieler nacheinander */
        einsatzPool = +this.einsatz;
        /* Der Einsatzpool wird zurückgegeben. */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
