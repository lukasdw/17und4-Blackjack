package smitprojekt_17und4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public interface PartieInterface {
    public void deckEinlesen();
    public void spielerNamenEingeben(String spielername);
    public void highscoreAktuallisieren(JTable jTableTabelle);
}