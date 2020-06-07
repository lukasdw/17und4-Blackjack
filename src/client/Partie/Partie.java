package client.Partie;

import client.Netzwerk.*;
import client.Karte.*;
import client.Spieler.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class Partie implements PartieInterface {

    /* Objekt der Klasse Netzwerkverbindung baut Netzwerkverbindung zum Server */
    private NetzwerkInterface etc = new Netzwerk();

    /* Am Anfang sind immer 52 Karten in einem Deck */
    private ArrayList<KarteInterface> deck = new ArrayList<KarteInterface>();

    /* Die Spieler werden in dieser ArrayListe gespeichert. Dazu werden am
    Anfang immer zwei Spieler benötigt. Der Dealer und die Spieler */
    private ArrayList<SpielerInterface> spieler = new ArrayList<SpielerInterface>();

    /* Gibt die Anzahl der Spieler an */
    private int anzahlSpieler;

    /* Ein Counter zum hochzählen */
    private int anzahlSpielerCounter;

    /* Zeigt den aktuellen Spieler an */
    private int aktuellerSpieler;

    /* Gibt an in welcher Runde man sich momentan befindet */
    private int runde = 1;

    /* Konstruktor */
    public Partie() {
        /* Der Client baut die Verbindung zum Server auf. */
        this.deckEinlesen();
    }

    /* Nachdem der Einsatz der Spieler gesetzt wurde, muss jeder Spieler
    zwei Karten ziehen. Diese Funktion wird also genau zwischen Runde 1
    und 2 ausgeführt. */
    public void jederZiehtZweiKarten() {
        // Alle Spieler(i) ...
        for (int i = 0; i < spieler.size(); i++) {
            // ziehen zwei Karten(j).
            for (int j = 0; j < 2; j++) {
                spieler.get(i).karteZiehen(this.deck);
            }
        }
    }

    /* Hier wird der Wert der Karten berechnet. Zurzeit passiert dies erst am
    Ende jeder Partie. Theoretisch könnte man auch beim Ziehen einer Karte
    direkt den Wert addieren. Optional könnte man dann mit diesen Informationen,
    den Noobs eine Live-Anzeige mit der aktuellen Punktzahl bereitstellen. */
    public void kartenWerteRechnen() {
        // Alle Spieler(j) ..
        for (int j = 0; j < anzahlSpieler; j++) {
            // Alle Karten(i), die auf der Hand(i) des Spielers sind, werden dazuaddiert.
            for (int i = 0; i < spieler.get(j).getHand().size(); i++) {
                spieler.get(j).setHandPunkte(spieler.get(j).getHandPunkte() + spieler.get(j).getHand().get(i).getWert());
            }
        }
    }

    public void deckEinlesen() {
        /* Diese Funktion liest das Deck aus der CSV-Datei ein und speichert
        die Felder in die ArrayListe, "deck". Theoretisch könnte man nun eine
        CSV mit 32 Karten einfach dazu anlegen. Der Spieler könnte unter den
        Optionen das Deck auswählen.*/

        // Workaround für relativen Pfad → läuft noch nicht wirklich
        String root = System.getProperty("user.dir");
        String filePath = root + File.separator + "src\\";

        String lineTemp = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath + "Karten\\deck.csv"))) {
            while ((lineTemp = br.readLine()) != null) {
                String[] spalte = lineTemp.split(";");
                /* this.deck.add(new Karte(String name, int wert, String farbe, String bilderPfad) */
                this.deck.add(new Karte(spalte[0], Integer.parseInt(spalte[1]), spalte[2], spalte[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Mit dieser Funktion wird ein Spieler hinzugefügt.
    public void spielerNamenEingeben(String spielername) {
        spieler.add(new Spieler(spielername));
    }

    /* Wenn der Spieler die Runde beendet, ist der nächste Spieler am Zug. */
    public void nächsterSpieler() {
        aktuellerSpieler++;
    }

    public void highscoreAktuallisieren(JTable jTableTabelle) {
        /* Die Spieler werden nun in die Tabelle (jTableTabelle) hinzugefügt.
        Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
        die nötigen Funktionen benutzen zu können */
        DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
        Object spalte[] = new Object[4];

        /* Hier wird überprüft, ob bereits Einträge in der Tabelle angelegt sind.
        Falls dies der Fall ist, müssen zuerst diese Einträge wieder entfernt werden.
        Leider fügt die Funktion nicht fehlende Einträge in die Tabelle hinzu, sondern
        fügt immer alle Einträge wieder neu hinzu. Kommentiert diese drei Zeilen
        und ihr seht das Spektakel :)*/
        if (model.getRowCount() > 0) {
            model.setRowCount(0);
        }

        /* Nun werden die Werte der Spieler in ein Array, was als Zeile
        fungiert, gespeichert. Dieses Array wird dann als Zeile in der Tabelle
        hinzugefügt. Die erste Spalte ist die Spielerart (Bank, Spieler 1, usw.).
        Danach kommt der Name des Spielers, sein aktueller Kontostand und sein
        Einsatz während der Partie.*/
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
    public NetzwerkInterface getEtc() {
        return etc;
    }

    public void setEtc(NetzwerkInterface etc) {
        this.etc = etc;
    }

    public ArrayList<KarteInterface> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<KarteInterface> deck) {
        this.deck = deck;
    }

    public ArrayList<SpielerInterface> getSpieler() {
        return spieler;
    }

    public void setSpieler(ArrayList<SpielerInterface> spieler) {
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