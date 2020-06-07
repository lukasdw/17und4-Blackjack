package client.Netzwerk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface NetzwerkInterface {

    /* Methoden und Funktionen */
    public void verbinden(String ip, int port, String spielername);
    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle);
    
    /* Getter und Setter */
    public String getIp();
    public void setIp(String ip);
    public int getPort();
    public void setPort(int port);
    public Socket getClient();
    public void setClient(Socket client);
    public String getServername();
    public void setServername(String servername);
}
