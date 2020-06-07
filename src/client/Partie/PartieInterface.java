package client.Partie;

// Interfaces der anderen Klassen
import client.Karte.KarteInterface;
import client.Netzwerk.NetzwerkInterface;
import client.Spieler.SpielerInterface;

import java.util.ArrayList;
import javax.swing.JTable;

public interface PartieInterface {

    /* Methoden und Funktionen */
    public void jederZiehtZweiKarten();
    public void kartenWerteRechnen();
    public void deckEinlesen();
    public void spielerNamenEingeben(String spielername);
    public void nächsterSpieler();
    public void highscoreAktuallisieren(JTable jTableTabelle);

    /* Getter und Setter */
    public NetzwerkInterface getEtc();
    public void setEtc(NetzwerkInterface etc);
    public ArrayList<KarteInterface> getDeck();
    public void setDeck(ArrayList<KarteInterface> deck);
    public ArrayList<SpielerInterface> getSpieler();
    public void setSpieler(ArrayList<SpielerInterface> spieler);
    public int getAnzahlSpieler();
    public void setAnzahlSpieler(int anzahlSpieler);
    public int getAnzahlSpielerCounter();
    public void setAnzahlSpielerCounter(int anzahlSpielerCounter);
    public int getAktuellerSpieler();
    public void setAktuellerSpieler(int aktuellerSpieler);
    public int getRunde();
    public void setRunde(int runde);
}