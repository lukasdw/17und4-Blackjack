package smitprojekt_17und4;

import java.io.*;
import java.util.*;

public class Partie {

    // Am Anfang immer 52 Karten
    private ArrayList<Karte> deck = new ArrayList<Karte>();

    // Am Anfang jedes Spiels muss es mindestens zwei Spieler geben. Den Bänker und den Spieler
    private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

    public Partie() {
        deckEinlesen();
    }

    // Hier wird ein Spieler hinzugefügt. Am Anfang muss man seinen Namen angeben.
    public void spielerHinzufuegen() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie ihren Namen ein.");
        String name = input.readLine();
        this.spieler.add(new Spieler(name));
    }

    /* Diese Funktion liest das Deck aus der CSV-Datei ein und speichert
    die Felder in die ArrayListe, "deck".*/
    public void deckEinlesen() {
        String lineTemp = "";
        try (BufferedReader br = new BufferedReader(new FileReader("Karten (png)/deck.csv"))) {
            while ((lineTemp = br.readLine()) != null) {
                String[] spalte = lineTemp.split(";");
                this.deck.add(new Karte(Integer.parseInt(spalte[0]), spalte[1], spalte[2], spalte[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* Falls eine Karte nicht mehr im Spiel ist, wird diese Funktion aufgerufen */
    public void karteEntfernen() {
    }
}