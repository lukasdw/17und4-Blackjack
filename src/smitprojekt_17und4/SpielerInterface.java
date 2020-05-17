package smitprojekt_17und4;

import java.util.ArrayList;

public interface SpielerInterface {
    public void karteZiehen(ArrayList<Karte> deck);
    public int einsatzSetzen(int einsatzPool, int einsatz);
}
