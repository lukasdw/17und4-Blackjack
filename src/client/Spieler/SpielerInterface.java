package client.Spieler;

// Interfaces der anderen Klassen
import client.Karte.KarteInterface;

import java.util.ArrayList;

public interface SpielerInterface {

    /* Methoden und Funktionen */
    public void karteZiehen(ArrayList<KarteInterface> deck);

    /* Getter und Setter */
    public String getSpielerName();
    public void setSpielerName(String spielerName);
    public int getKontostand();
    public void setKontostand(int kontostand);
    public int getEinsatz();
    public void setEinsatz(int einsatz);
    public ArrayList<KarteInterface> getHand();
    public void setHand(ArrayList<KarteInterface> hand);
    public int getHandPunkte();
    public void setHandPunkte(int handPunkte);
}
