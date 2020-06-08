package server.Netzwerk;

import java.net.ServerSocket;
import javax.swing.JTable;

public interface ServerInterface {

    public void spielerSuchen();
    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle);

    // Getter und Setter
    public ServerSocket getServer();
    public void setServer(ServerSocket server);
    public int getPort();
    public void setPort(int port);
    public String getName();
    public void setName(String name);
    public String getSpielername();
    public void setSpielername(String spielername);
}
