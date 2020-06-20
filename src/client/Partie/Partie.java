package client.Partie;

import client.*;

import client.Karte.*;
import client.Sound.*;
import client.Spieler.*;
import client.Netzwerk.*;

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

    private SoundInterface sound = new Sound();

    public Partie() {
    }

    /* Nachdem der Einsatz der Spieler gesetzt wurde, muss jeder Spieler
    zwei Karten ziehen. Diese Funktion wird also genau zwischen Runde 1
    und 2 ausgeführt. */
    public void jederZiehtZweiKarten() {
        // Alle Spieler(i) ...
        for (int i = 0; i < this.spieler.size(); i++) {
            // ziehen zwei Karten(j).
            for (int j = 0; j < 2; j++) {
                this.spieler.get(i).karteZiehen(this.deck);
            }
        }
        this.sound.abspielen("card");
    }

    public void deckEinlesen(String datei) {
        /* Diese Funktion liest das Deck aus der CSV-Datei ein und speichert
        die Felder in die ArrayListe, "deck". Theoretisch könnte man nun eine
        CSV mit 32 Karten einfach dazu anlegen. Der Spieler könnte unter den
        Optionen das Deck auswählen.*/

        // Workaround für relativen Pfad → läuft noch nicht wirklich
        String root = System.getProperty("user.dir");
        String filePath = root + File.separator + "src\\";

        String lineTemp = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath + "Karten\\" + datei + ".csv"))) {
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
        this.spieler.add(new Spieler(spielername));
    }

    /* Wenn der Spieler die Runde beendet, ist der nächste Spieler am Zug. */
    public void nächsterSpieler() {
        this.aktuellerSpieler++;
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
        for (int i = 0; i < this.spieler.size(); i++) {
            if (i == 0) {
                spalte[0] = "Bank";
            } else {
                spalte[0] = "Spieler " + i;
            }
            spalte[1] = this.spieler.get(i).getSpielerName();
            spalte[2] = this.spieler.get(i).getKontostand();
            spalte[3] = this.spieler.get(i).getEinsatz();
            model.addRow(spalte);
        }
    }

    /* Getter und Setter */
    public NetzwerkInterface getEtc() {
        return this.etc;
    }

    public void setEtc(NetzwerkInterface etc) {
        this.etc = etc;
    }

    public ArrayList<KarteInterface> getDeck() {
        return this.deck;
    }

    public void setDeck(ArrayList<KarteInterface> deck) {
        this.deck = deck;
    }

    public ArrayList<SpielerInterface> getSpieler() {
        return this.spieler;
    }

    public void setSpieler(ArrayList<SpielerInterface> spieler) {
        this.spieler = spieler;
    }

    public int getAnzahlSpieler() {
        return this.anzahlSpieler;
    }

    public void setAnzahlSpieler(int anzahlSpieler) {
        this.anzahlSpieler = anzahlSpieler;
    }

    public int getAnzahlSpielerCounter() {
        return this.anzahlSpielerCounter;
    }

    public void setAnzahlSpielerCounter(int anzahlSpielerCounter) {
        this.anzahlSpielerCounter = anzahlSpielerCounter;
    }

    public int getAktuellerSpieler() {
        return this.aktuellerSpieler;
    }

    public void setAktuellerSpieler(int aktuellerSpieler) {
        this.aktuellerSpieler = aktuellerSpieler;
    }

    public int getRunde() {
        return this.runde;
    }

    public void setRunde(int runde) {
        this.runde = runde;
    }

    public SoundInterface getSound() {
        return this.sound;
    }

    public void setSound(SoundInterface sound) {
        this.sound = sound;
    }
}