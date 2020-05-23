package smitprojekt_17und4;

import javax.swing.JTable;

public interface NetzwerkverbindungInterface {

    public void verbinden(String ip, int port, String spielername);

    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle);
}
