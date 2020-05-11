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

    // Dies ist der Pool, dem der Spieler pro Runde, Geld hinzufügen kann.
    private int einsatzPool;

    // Speichert die Anzahl der Spieler ab. Muss am Anfang abgefragt werden
    private int anzahlSpieler = 2;

    public Partie() {
    }

    public void spielStarten(JTextField jTextFieldEinsatz) throws IOException {
        // Das Deck mit den 52 Karten wird eingelesen
        this.deckEinlesen();

        // Spieler werden hinzugefügt. Bisher eine feste Anzahl.
        spielerHinzufuegen(anzahlSpieler);

        // Die Spieler ziehen eine Karte
        for (int i = 0; i < anzahlSpieler; i++) {
            this.spieler.get(i).karteZiehen(this.deck);
        }

        // Ein Spieler setzt seinen Einsatz
        for (int i = 0; i < anzahlSpieler; i++) {
            this.einsatzPool = getSpieler().get(1).einsatzSetzen(einsatzPool, Integer.parseInt(jTextFieldEinsatz.getText()));
        }
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
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\OneDrive\\Ausbildung zum Fachinformatiker für Systemintegration\\Programmieren II\\17 und 4 (Projekt)\\17und4\\src\\Karten (png)\\deck.csv"))) {
            while ((lineTemp = br.readLine()) != null) {
                String[] spalte = lineTemp.split(";");
                // this.deck.add(new Karte(String name, int wert, String farbe, String bilderPfad)
                this.deck.add(new Karte(spalte[0], Integer.parseInt(spalte[1]), spalte[2], spalte[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getter und Setter
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
