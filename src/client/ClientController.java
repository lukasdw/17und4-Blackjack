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
        this.model.jederZiehtZweiKarten();
    }

    public void deckEinlesen(String datei) {
        this.model.deckEinlesen(datei);
    }

    public void spielerNamenEingeben(String spielername) {
        this.model.spielerNamenEingeben(spielername);
    }

    public void naechsterSpieler() {
        this.model.nächsterSpieler();
    }

    public void highscoreAktuallisieren(JTable jTableTabelle) {
        this.model.highscoreAktuallisieren(jTableTabelle);
    }

    public NetzwerkInterface getEtc() {
        return this.model.getEtc();
    }

    public void setEtc(NetzwerkInterface etc) {
        this.model.setEtc(etc);
    }

    public ArrayList<KarteInterface> getDeck() {
        return this.model.getDeck();
    }

    public void setDeck(ArrayList<KarteInterface> deck) {
        this.model.setDeck(deck);
    }

    public ArrayList<SpielerInterface> getSpieler() {
        return this.model.getSpieler();
    }

    public void setSpieler(ArrayList<SpielerInterface> spieler) {
        this.model.setSpieler(spieler);
    }

    public int getAnzahlSpieler() {
        return this.model.getAnzahlSpieler();
    }

    public void setAnzahlSpieler(int anzahlSpieler) {
        this.model.setAnzahlSpieler(anzahlSpieler);
    }

    public int getAnzahlSpielerCounter() {
        return this.model.getAnzahlSpielerCounter();
    }

    public void setAnzahlSpielerCounter(int anzahlSpielerCounter) {
        this.model.setAnzahlSpielerCounter(anzahlSpielerCounter);
    }

    public int getAktuellerSpieler() {
        return this.model.getAktuellerSpieler();
    }

    public void setAktuellerSpieler(int aktuellerSpieler) {
        this.model.setAktuellerSpieler(aktuellerSpieler);
    }

    public int getRunde() {
        return this.model.getRunde();
    }

    public void setRunde(int runde) {
        this.model.setRunde(runde);
    }

    public SoundInterface getSound() {
        return this.model.getSound();
    }

    public void setSound(SoundInterface sound) {
        this.model.setSound(sound);
    }
}
