package smitprojekt_17und4;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JTextField;

public class Partie {

    // Am Anfang immer 52 Karten
    private ArrayList<Karte> deck = new ArrayList<Karte>();

    // Am Anfang jedes Spiels muss es mindestens zwei Spieler geben. Den Bänker und den Spieler
    private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

    // Dies ist der Pool dem der Spieler pro Runde, Geld hinzufügen kann.
    private int einsatzPool;

    public Partie() {
    }

    public void spielStarten(JTextField jTextFieldEinsatz) throws IOException{
        // Das Deck mit den 52 Karten wird eingelesen
        this.deckEinlesen();

        // Spieler werden hinzugefügt. Bisher erstmal 5. Eine Abfrage dazu folgt.
        spielerHinzufuegen(5);

        // Der Spieler ziehen eine Karte
        getSpieler().get(1).karteZiehen(deck);

        // Ein Spieler setzt seinen Einsatz
        this.einsatzPool = getSpieler().get(1).einsatzSetzen(einsatzPool, Integer.parseInt(jTextFieldEinsatz.getText()));
    }

    // Hier wird ein Spieler hinzugefügt. Am Anfang muss man seinen Namen angeben.
    public void spielerHinzufuegen(int anzahlSpieler) throws IOException {
        for (int i = 0; i < anzahlSpieler; i++) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Geben Sie ihren Namen ein.");
            String name = input.readLine();
            this.spieler.add(new Spieler(name));
        }
    }

    /* Diese Funktion liest das Deck aus der CSV-Datei ein und speichert
    die Felder in die ArrayListe, "deck".*/
    public void deckEinlesen() {
        String lineTemp = "";
        try (BufferedReader br = new BufferedReader(new FileReader("./Karten (png)/klein/deck.csv"))) {
            while ((lineTemp = br.readLine()) != null) {
                String[] spalte = lineTemp.split(";");
                this.deck.add(new Karte(Integer.parseInt(spalte[0]), spalte[1], spalte[2], spalte[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Karte> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Karte> deck) {
        this.deck = deck;
    }

    public ArrayList<Spieler> getSpieler() {
        return spieler;
    }

    public void setSpieler(ArrayList<Spieler> spieler) {
        this.spieler = spieler;
    }

    public int getEinsatzPool() {
        return einsatzPool;
    }

    public void setEinsatzPool(int einsatzPool) {
        this.einsatzPool = einsatzPool;
    }
}