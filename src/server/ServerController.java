package server;

import client.Partie.*;
import java.net.ServerSocket;
import javax.swing.JTable;
import server.Netzwerk.*;

public class ServerController {

    private GUI view;
    private PartieInterface model;
    private ServerInterface etc;
    
    public ServerController(GUI view) {
        this.view = view;
    }

    // Getter und Setter
    public void spielerSuchen() {
        etc.spielerSuchen();
    }

    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle) {
        etc.spieleZurLobbyTabelleHinzugefuegen(jTableTabelle);
    }

    public ServerSocket getServer() {
        return etc.getServer();
    }

    public void setServer(ServerSocket server) {
        etc.setServer(server);
    }

    public int getPort() {
        return etc.getPort();
    }

    public void setPort(int port) {
        etc.setPort(port);
    }

    public String getName() {
        return etc.getName();
    }

    public void setName(String name) {
        etc.setName(name);
    }

    public String getSpielername() {
        return etc.getSpielername();
    }

    public void setSpielername(String spielername) {
        etc.setSpielername(spielername);
    }   
}