package client;

import client.Partie.*;
import client.Karte.KarteInterface;
import client.Netzwerk.NetzwerkInterface;
import client.Sound.SoundInterface;
import client.Spieler.SpielerInterface;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Controller {

    private ViewGUI viewGUI;
    private PartieInterface partieInterface;

    public Controller(ViewGUI viewGUI) {
        this.viewGUI = viewGUI;
        this.partieInterface = new Partie();
    }
    
    // Getter und Setter (Controller)
    public void jederZiehtZweiKarten() {
        partieInterface.jederZiehtZweiKarten();
    }

    public void kartenWerteRechnen() {
        partieInterface.kartenWerteRechnen();
    }

    public void deckEinlesen(String datei) {
        partieInterface.deckEinlesen(datei);
    }

    public void spielerNamenEingeben(String spielername) {
        partieInterface.spielerNamenEingeben(spielername);
    }

    public void nächsterSpieler() {
        partieInterface.nächsterSpieler();
    }

    public void highscoreAktuallisieren(JTable jTableTabelle) {
        partieInterface.highscoreAktuallisieren(jTableTabelle);
    }

    public void verschiebeKarte(JLabel karte, JLabel picDeck) {
        partieInterface.verschiebeKarte(karte, picDeck);
    }

    public NetzwerkInterface getEtc() {
        return partieInterface.getEtc();
    }

    public void setEtc(NetzwerkInterface etc) {
        partieInterface.setEtc(etc);
    }

    public ArrayList<KarteInterface> getDeck() {
        return partieInterface.getDeck();
    }

    public void setDeck(ArrayList<KarteInterface> deck) {
        partieInterface.setDeck(deck);
    }

    public ArrayList<SpielerInterface> getSpieler() {
        return partieInterface.getSpieler();
    }

    public void setSpieler(ArrayList<SpielerInterface> spieler) {
        partieInterface.setSpieler(spieler);
    }

    public int getAnzahlSpieler() {
        return partieInterface.getAnzahlSpieler();
    }

    public void setAnzahlSpieler(int anzahlSpieler) {
        partieInterface.setAnzahlSpieler(anzahlSpieler);
    }

    public int getAnzahlSpielerCounter() {
        return partieInterface.getAnzahlSpielerCounter();
    }

    public void setAnzahlSpielerCounter(int anzahlSpielerCounter) {
        partieInterface.setAnzahlSpielerCounter(anzahlSpielerCounter);
    }

    public int getAktuellerSpieler() {
        return partieInterface.getAktuellerSpieler();
    }

    public void setAktuellerSpieler(int aktuellerSpieler) {
        partieInterface.setAktuellerSpieler(aktuellerSpieler);
    }

    public int getRunde() {
        return partieInterface.getRunde();
    }

    public void setRunde(int runde) {
        partieInterface.setRunde(runde);
    }

    public SoundInterface getSound() {
        return partieInterface.getSound();
    }

    public void setSound(SoundInterface sound) {
        partieInterface.setSound(sound);
    }
}