package client;

import java.util.ArrayList;
import javax.swing.JTable;

public interface PartieInterface {

    public void deckEinlesen();

    public void jederZiehtZweiKarten();

    public void nächsterSpieler();

    public void spielerNamenEingeben(String spielername);

    public void highscoreAktuallisieren(JTable jTableTabelle);
    
    public Netzwerkverbidung getEtc();

    public void setEtc(Netzwerkverbidung etc);

    public ArrayList<Karte> getDeck();

    public void setDeck(ArrayList<Karte> deck);

    public ArrayList<Spieler> getSpieler();

    public void setSpieler(ArrayList<Spieler> spieler);

    public int getAnzahlSpieler();

    public void setAnzahlSpieler(int anzahlSpieler);

    public int getAnzahlSpielerCounter();

    public void setAnzahlSpielerCounter(int anzahlSpielerCounter);

    public int getAktuellerSpieler();

    public void setAktuellerSpieler(int aktuellerSpieler);

    public int getRunde();

    public void setRunde(int runde);
}
