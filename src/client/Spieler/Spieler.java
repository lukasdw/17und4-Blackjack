package client.Spieler;

import client.Karte.*;
import client.Sound.*;
import client.Spieler.*;
import client.Netzwerk.*;
import client.Partie.*;

import java.io.*;
import java.util.ArrayList;

public class Spieler implements SpielerInterface {

    /* Der Name wird direkt vergeben. */
    private String spielerName;

    /* Jeder Spieler bekommt am Anfang einen Kontostand von 10. */
    private int kontostand = 10;

    /* Der Einsatz beträgt am Anfang 0 */
    private int einsatz = 0;

    /* Werden Karten aus dem Deck gezogen landen die Karten vom Deck auf die Hand.
    Die Anzahl der Karten, auf der ist auf drei begrenzt. */
    ArrayList<KarteInterface> hand = new ArrayList<KarteInterface>();

    /* Die Werte der Karten werden zusammengerechnet und in der Variable, "handPunkte"
    gespeichert. Anhand dieser Handpunkte wird am Ende der Gewinner errechnet.*/
    private int handPunkte = 0;

    /* Konstruktor */
    public Spieler(String spielerName) {
        /* Der Spieler benötigt immer einen Namen, mit dem er im Spiel angesprochen wird. */
        this.spielerName = spielerName;
    }

    /* Der Spieler zieht eine Karte */
    public void karteZiehen(ArrayList<KarteInterface> deck) {
        /* Nun wird eine Karte per Zufall aus dem Deck gezogen. Die Zufallszahl
        ist zwischen 1 und 52 bzw. der Anzahl der Karten. */
        int zufallszahl = (int) (Math.random() * deck.size());

        /* Diese Karte wird nun auf die Hand des Spielers bewegt */
        this.hand.add(deck.get(zufallszahl));

        /* Die gezogene Karte muss aus dem Deck entfernt werden, da sie nun
        auf der Hand des Spielers ist. Ansonsten wäre die Karte zwei Mal im Spiel*/
        deck.remove(zufallszahl);

        /* Hier werden die Handpunkte der aktuell gezogenen Karte addiert */
        this.handPunkte = this.handPunkte + this.hand.get(this.hand.size()-1).getWert();
    }

    /* Getter und Setter */
    public String getSpielerName() {
        return this.spielerName;
    }

    public void setSpielerName(String spielerName) {
        this.spielerName = spielerName;
    }

    public int getKontostand() {
        return this.kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getEinsatz() {
        return this.einsatz;
    }

    public void setEinsatz(int einsatz) {
        this.einsatz = einsatz;
    }

    public ArrayList<KarteInterface> getHand() {
        return this.hand;
    }

    public void setHand(ArrayList<KarteInterface> hand) {
        this.hand = hand;
    }

    public int getHandPunkte() {
        return this.handPunkte;
    }

    public void setHandPunkte(int handPunkte) {
        this.handPunkte = handPunkte;
    }
}
