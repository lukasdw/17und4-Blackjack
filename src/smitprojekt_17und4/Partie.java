package smitprojekt_17und4;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Partie {

    /* Am Anfang sind immer 52 Karten im Deck */
    private ArrayList<Karte> deck = new ArrayList<Karte>();

    /* Die Spieler werden in dieser ArrayListe gespeichert. Dazu werden am
    Anfang immer zwei Spieler benötigt. Den Bänker und den Spieler */
    private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

    /* Dem Einsatzpool fügt jeder Spieler pro Runde seinen Einsatz hinzu. */
    private int einsatzPool = 0;

    /* Gibt die Anzahl der Spieler an */
    private int anzahlSpieler = 0;

    // Konstruktor
    public Partie() {
        this.deckEinlesen();
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

    public void highscoreAktuallisieren(JTable jTableTabelle) {
        /* Die Zeile wird nun in die Tabelle (jTableTabelle) hinzugefügt.
        Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
        die nötigen Funktionen benutzen zu können */
        DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
        Object spalte[] = new Object[2];

        /* Nun werden die Werte der Spieler in ein Array, was als Zeile
        fungiert, gespeichert. Diese Zeile wird dann als Zeile in der Tabelle
        hinzugefügt. */
        for (int i = 0; i <= spieler.size()+1; i++) {
            spalte[0] = spieler.get(i).getName();
            spalte[1] = spieler.get(i).getPunktestand();
            model.addRow(spalte);
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

    public int getAnzahlSpieler() {
        return anzahlSpieler;
    }

    public void setAnzahlSpieler(int anzahlSpieler) {
        this.anzahlSpieler = anzahlSpieler;
    }
}
