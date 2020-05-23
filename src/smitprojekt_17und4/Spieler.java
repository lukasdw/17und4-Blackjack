package smitprojekt_17und4;

import java.io.*;
import java.util.ArrayList;

public class Spieler implements SpielerInterface {

    /* Der Name wird direkt vergeben. */
    private String name;

    /* Jeder Spieler bekommt am Anfang einen Kontostand von 10. */
    private int kontostand = 10;
    private int einsatz = 0;
    private int platz; 

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

    /* Der Spieler zieht eine Karte */
    public void karteZiehen(ArrayList<Karte> deck) {
        /* Nun wird eine Karte per Zufall aus dem Deck gezogen. Die Zufallszahl
        ist zwischen 1 und 52. */
        int zufallszahl = (int) (Math.random() * deck.size());

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

    /* Getter und Setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
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
