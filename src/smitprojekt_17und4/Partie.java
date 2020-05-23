package smitprojekt_17und4;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class Partie implements PartieInterface {

    /* Objekt der Klasse Netzwerkverbindung baut Netzwerkverbindung zum Server */
    Netzwerkverbidung etc = new Netzwerkverbidung();

    /* Am Anfang sind immer 52 Karten in einem Deck */
    private ArrayList<Karte> deck = new ArrayList<Karte>();

    /* Die Spieler werden in dieser ArrayListe gespeichert. Dazu werden am
    Anfang immer zwei Spieler benötigt. Der Dealer und die Spieler */
    private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

    /* Gibt die Anzahl der Spieler an */
    private int anzahlSpieler;
    private int anzahlSpielerCounter;
    private int aktuellerSpieler;

    /* Gibt an in welcher Runde man sich momentan befindet */
    private int runde = 1;

    /* Konstruktor */
    public Partie() {
        /* Der Client baut die Verbindung zum Server auf. */
        this.deckEinlesen();
    }

    public void jederZiehtZweiKarten() {
        for (int i = 0; i < spieler.size(); i++) {
            for (int j = 0; j < 2; j++) {
                spieler.get(i).karteZiehen(deck);
            }
        }
    }

    public void deckEinlesen() {
        /* Diese Funktion liest das Deck aus der CSV-Datei ein und speichert
        die Felder in die ArrayListe, "deck". */

 /* Workaround für relativen Pfad */
        String root = System.getProperty("user.dir");
        String filePath = root + File.separator + "src\\Karten\\";

        String lineTemp = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath + "deck.csv"))) {
            while ((lineTemp = br.readLine()) != null) {
                String[] spalte = lineTemp.split(";");
                /* this.deck.add(new Karte(String name, int wert, String farbe, String bilderPfad) */
                this.deck.add(new Karte(spalte[0], Integer.parseInt(spalte[1]), spalte[2], filePath + spalte[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void spielerNamenEingeben(String spielername) {
        /* Die Namen der Spieler werden nacheinander eingelesen. Wird der Button
        bestätigt, aktualisiert sich das Fenster und der nächste Spieler wird abgefragt.*/
        if ((anzahlSpielerCounter < anzahlSpieler)) {
            spieler.add(new Spieler(spielername));
            /* Wurde ein neuer Spieler hinzugefügt, wird der nächste Spieler eingelesen */
            anzahlSpielerCounter++;
        }
    }

    /* Wenn der Spieler die Runde beendet, ist der nächste Spieler am Zug. */
    public void nächsterSpieler() {
        aktuellerSpieler++;
        if (aktuellerSpieler == spieler.size()) {
            anzahlSpielerCounter = 0;
        }
    }

    public void highscoreAktuallisieren(JTable jTableTabelle) {
        /* Die Zeile wird nun in die Tabelle (jTableTabelle) hinzugefügt.
        Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
        die nötigen Funktionen benutzen zu können */
        DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
        Object spalte[] = new Object[4];

        /* Nun werden die Werte der Spieler in ein Array, was als Zeile
        fungiert, gespeichert. Diese Zeile wird dann als Zeile in der Tabelle
        hinzugefügt. */
        for (int i = 0; i < spieler.size(); i++) {
            if (i == 0) {
                spalte[0] = "Bank";
            } else {
                spalte[0] = "Spieler " + i;
            }
            spalte[1] = spieler.get(i).getName();
            spalte[2] = spieler.get(i).getKontostand();
            spalte[3] = spieler.get(i).getEinsatz();
            model.addRow(spalte);
        }
    }

    /* Getter und Setter */
    public Netzwerkverbidung getEtc() {
        return etc;
    }

    public void setEtc(Netzwerkverbidung etc) {
        this.etc = etc;
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

    public int getRunde() {
        return runde;
    }

    public void setRunde(int runde) {
        this.runde = runde;
    }
}
