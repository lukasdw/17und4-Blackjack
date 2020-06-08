package client;

import client.Partie.*;
import client.Karte.KarteInterface;
import client.Netzwerk.NetzwerkInterface;
import client.Sound.SoundInterface;
import client.Spieler.SpielerInterface;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ClientController {

    private GUI view;
    private PartieInterface model;

    public ClientController(GUI view) {
        this.view = view;
        this.model = new Partie();
    }
    
    // Getter und Setter (Controller)
    public void jederZiehtZweiKarten() {
        model.jederZiehtZweiKarten();
    }

    public void kartenWerteRechnen() {
        model.kartenWerteRechnen();
    }

    public void deckEinlesen(String datei) {
        model.deckEinlesen(datei);
    }

    public void spielerNamenEingeben(String spielername) {
        model.spielerNamenEingeben(spielername);
    }

    public void nächsterSpieler() {
        model.nächsterSpieler();
    }

    public void highscoreAktuallisieren(JTable jTableTabelle) {
        model.highscoreAktuallisieren(jTableTabelle);
    }

    public void verschiebeKarte(JLabel karte, JLabel picDeck) {
        model.verschiebeKarte(karte, picDeck);
    }

    public NetzwerkInterface getEtc() {
        return model.getEtc();
    }

    public void setEtc(NetzwerkInterface etc) {
        model.setEtc(etc);
    }

    public ArrayList<KarteInterface> getDeck() {
        return model.getDeck();
    }

    public void setDeck(ArrayList<KarteInterface> deck) {
        model.setDeck(deck);
    }

    public ArrayList<SpielerInterface> getSpieler() {
        return model.getSpieler();
    }

    public void setSpieler(ArrayList<SpielerInterface> spieler) {
        model.setSpieler(spieler);
    }

    public int getAnzahlSpieler() {
        return model.getAnzahlSpieler();
    }

    public void setAnzahlSpieler(int anzahlSpieler) {
        model.setAnzahlSpieler(anzahlSpieler);
    }

    public int getAnzahlSpielerCounter() {
        return model.getAnzahlSpielerCounter();
    }

    public void setAnzahlSpielerCounter(int anzahlSpielerCounter) {
        model.setAnzahlSpielerCounter(anzahlSpielerCounter);
    }

    public int getAktuellerSpieler() {
        return model.getAktuellerSpieler();
    }

    public void setAktuellerSpieler(int aktuellerSpieler) {
        model.setAktuellerSpieler(aktuellerSpieler);
    }

    public int getRunde() {
        return model.getRunde();
    }

    public void setRunde(int runde) {
        model.setRunde(runde);
    }

    public SoundInterface getSound() {
        return model.getSound();
    }

    public void setSound(SoundInterface sound) {
        model.setSound(sound);
    }
}