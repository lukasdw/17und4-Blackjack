package client;

import client.Partie.*;
import client.Karte.KarteInterface;
import client.Netzwerk.NetzwerkInterface;
import client.Spieler.SpielerInterface;
import java.util.ArrayList;
import javax.swing.JTable;

public class Controller {

    private ViewGUI viewGUI;
    private PartieInterface partieInterface;

    public Controller(ViewGUI viewGUI) {
        this.viewGUI = viewGUI;
        this.partieInterface = new Partie();
    }
    
    // Getter und Setter (Controller)
    public ViewGUI getViewGUI() {
        return viewGUI;
    }

    public void setViewGUI(ViewGUI viewGUI) {
        this.viewGUI = viewGUI;
    }

    public PartieInterface getPartieInterface() {
        return partieInterface;
    }

    public void setPartieInterface(PartieInterface partieInterface) {
        this.partieInterface = partieInterface;
    }

    // Getter und Setter (Partie)
    public void jederZiehtZweiKarten() {
        partieInterface.jederZiehtZweiKarten();
    }

    public void kartenWerteRechnen() {
        partieInterface.kartenWerteRechnen();
    }

    public void deckEinlesen() {
        partieInterface.deckEinlesen();
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
}