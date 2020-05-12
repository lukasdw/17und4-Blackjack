package smitprojekt_17und4;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class Partie {

    /* Am Anfang sind immer 52 Karten im Deck */
    private ArrayList<Karte> deck = new ArrayList<Karte>();

    /* Die Spieler werden in dieser ArrayListe gespeichert. Dazu werden am
    Anfang immer zwei Spieler benötigt. Den Bänker und den Spieler */
    private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

    /* Dem Einsatzpool fügt jeder Spieler pro Runde seinen Einsatz hinzu. */
    private int einsatzPool;

    /* Gibt die Anzahl der Spieler an */
    private int anzahlSpieler;
    private int anzahlSpielerCounter;
    private int aktuellerSpieler = 1;

    /* Konstruktor */
    public Partie() {
        this.deckEinlesen();
    }

    public void deckEinlesen() {
        /* Diese Funktion liest das Deck aus der CSV-Datei ein und speichert
        die Felder in die ArrayListe, "deck". */
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

    public void spielerNamenEingeben(JTextField SpielernameTextField, JLabel SpielernameText, JFrame SpielerNameJFrame) {
        /* Die Namen der Spieler werden nacheinander eingelesen. Wird der Button
        bestätigt, aktualisiert sich das Fenster und der nächste Spieler wird abgefragt.*/
        if ((anzahlSpielerCounter < anzahlSpieler) && (SpielernameTextField.getText() != "")) {
            spieler.add(new Spieler(SpielernameTextField.getText()));
            /* Wurde ein neuer Spieler hinzugefügt, wird der nächste Spieler eingelesen */
            anzahlSpielerCounter++;
            SpielernameTextField.setText("");
            SpielernameText.setText("Wie heißt Spieler " + (anzahlSpielerCounter + 1) + "?");
        }
        if (anzahlSpielerCounter == anzahlSpieler) {
            // Sind alle Spielernamen eingegeben, wird das Fenster geschlossen.
            SpielerNameJFrame.setVisible(false);
        }
    }

    // Wenn der Spieler die Runde beendet, ist der nächste Spieler am Zug.
    public void nächsterSpieler(JLabel jPanelAktuellerSpieler){
        aktuellerSpieler++;
        jPanelAktuellerSpieler.setText("Spieler " + aktuellerSpieler + " ist am Zug!");
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
        for (int i = 0; i < spieler.size(); i++) {
            spalte[0] = spieler.get(i).getName();
            spalte[1] = spieler.get(i).getPunktestand();
            model.addRow(spalte);
        }
    }

    /* Funktion zum Setzen der Einsätze ALLER Spieler */
    public void einsatzSetzenAlleSpieler(JTextField jTextFieldEinsatz) {
        for (int i = 0; i < anzahlSpieler; i++) {
            spieler.get(i).einsatzSetzen(einsatzPool, jTextFieldEinsatz);
        }
    }

    /* Funktion zum Ziehen einer Karte für ALLE Spieler */
    public void karteZiehenAlleSpieler() {
        for (int i = 0; i < anzahlSpieler; i++) {
            spieler.get(i).karteZiehen(deck);
        }
    }

    /* Getter und Setter */
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

    public int getAnzahlSpielerCounter() {
        return anzahlSpielerCounter;
    }

    public void setAnzahlSpielerCounter(int anzahlSpielerCounter) {
        this.anzahlSpielerCounter = anzahlSpielerCounter;
    }

    public int getAktuellerSpieler() {
        return aktuellerSpieler;
    }

    public void setAktuellerSpieler(int aktuellerSpieler) {
        this.aktuellerSpieler = aktuellerSpieler;
    }
}