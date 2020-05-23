package smitprojekt_17und4;

import javax.swing.JTable;

public interface PartieInterface {

    public void deckEinlesen();

    public void jederZiehtZweiKarten();

    public void nächsterSpieler();

    public void spielerNamenEingeben(String spielername);

    public void highscoreAktuallisieren(JTable jTableTabelle);
}
