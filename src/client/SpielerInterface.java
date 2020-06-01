package client;

import java.util.ArrayList;

public interface SpielerInterface {

    public void karteZiehen(ArrayList<Karte> deck);
    
     /* Getter und Setter */
    public String getSpielerName();
    public void setSpielerName(String name);
    public int getKontostand();
    public void setKontostand(int kontostand);
    public int getEinsatz();
    public void setEinsatz(int einsatz);
    public ArrayList<Karte> getHand();
    public void setHand(ArrayList<Karte> hand);
    public int getHandPunkte();
    public void setHandPunkte(int handPunkte);
}
