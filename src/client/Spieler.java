package client;

import java.io.*;
import java.util.ArrayList;

public class Spieler implements SpielerInterface {

    /* Der Name wird direkt vergeben. */
    private String name;

    /* Jeder Spieler bekommt am Anfang einen Kontostand von 10. */
    private int kontostand = 10;
    
    /* Der Einsatz beträgt am Anfang 0 */
    private int einsatz = 0;

    /* Werden Karten aus dem Deck gezogen landen die Karten vom Deck auf die Hand.
    Die Anzahl der Karten, auf der ist auf drei begrenzt. */
    ArrayList<Karte> hand = new ArrayList<Karte>();
    
    /* Die Werte der Karten werden zusammengerechnet und in der Variable, "handPunkte"
    gespeichert. Anhand dieser Handpunkte wird am Ende der Gewinner errechnet.*/
    private int handPunkte = 0;

    /* Konstruktor */
    public Spieler(String name) {
        /* Der Spieler benötigt immer einen Namen, mit dem er im Spiel angesprochen wird. */
        this.name = name;
    }

    /* Der Spieler zieht eine Karte */
    public void karteZiehen(ArrayList<Karte> deck) {
        /* Nun wird eine Karte per Zufall aus dem Deck gezogen. Die Zufallszahl
        ist zwischen 1 und 52 bzw. der Anzahl der Karten. */
        int zufallszahl = (int) (Math.random() * deck.size());

        /* Diese Karte wird nun auf die Hand des Spielers bewegt */
        this.hand.add(deck.get(zufallszahl));

        /* Die gezogene Karte muss aus dem Deck entfernt werden, da sie nun
        auf der Hand des Spielers ist. Ansonsten wäre die Karte zwei Mal im Spiel*/
        deck.remove(zufallszahl);
    }

    /* Getter und Setter */
    @Override
    public String getSpielerName() {
        return name;
    }

    @Override
    public void setSpielerName (String name){
        this.name = name;
    }
    

    @Override
    public int getKontostand() {
        return kontostand;
    }

    @Override

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    @Override
    public int getEinsatz() {
        return einsatz;
    }

    @Override
    public void setEinsatz(int einsatz) {
        this.einsatz = einsatz;
    }

    @Override
    public ArrayList<Karte> getHand() {
        return hand;
    }

    @Override
    public void setHand(ArrayList<Karte> hand) {
        this.hand = hand;
    }

    @Override
    public int getHandPunkte() {
        return handPunkte;
    }

    @Override
    public void setHandPunkte(int handPunkte) {
        this.handPunkte = handPunkte;
    }
}