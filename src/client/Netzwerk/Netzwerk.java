package client.Netzwerk;

import client.Karte.*;
import client.Sound.*;
import client.Spieler.*;
import client.Netzwerk.*;
import client.Partie.*;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Netzwerk implements NetzwerkInterface {

    // Hier wird der Server-Port abgespeichert, mit dem sich der Client verbindet
    private int port;

    // Hier wird die Server-IP abgespeichert, mit dem sich der Client verbindet
    private String serverIP;
    
    // Hier wird der Servername abgespeichert, mit dem sich der Client verbindet
    private String servername;

    // Diese IP zeigt die HostIP im internen Netz
    private String localIP = "keine Verbindung";

    // Diese IP zeigt die HostIP im internen Netz
    private String internetIP = "keine Verbindung";

    // Hier befindet sich zurzeit der Spielername, mit dem sich der Client verbindet
    private String spielername;

    // Keine Ahnung hab ich so im Internet gefunden.
    private Socket client;

    public void verbinden(String ip, int port, String spielername) {
        this.serverIP = ip;
        this.port = port;
        this.spielername = spielername;
        try {
            client = new Socket(ip, port);

            // Der DataOutputStream sendet Daten zum Server
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF(spielername);
            System.out.println(spielername);

            // Der DataInputStream empfängt Daten zum Server
            DataInputStream input = new DataInputStream(client.getInputStream());
            servername = input.readUTF();
            System.out.println(input.readUTF());

            /* Sind alle Daten empfangen werden die Verbindung zwischen Server
            und Client geschlossen */
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getLocalIP() {
        try {
            this.localIP = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
        }
        return this.localIP;
    }

    public String getInternetIP() {
        try {
            URL url_name = new URL("http://bot.whatismyipaddress.com");
            BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
            this.internetIP = sc.readLine().trim();
        } catch (Exception e) {
        }
        return internetIP;
    }

    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle) {
        /* Die Zeile wird nun in die Tabelle (jTableTabelle) hinzugefügt.
        Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
        die nötigen Funktionen benutzen zu können */
        DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
        Object spalte[] = new Object[3];

        /* Nun werden die Werte der Spieler in ein Array, was als Zeile
        fungiert, gespeichert. Dieses Array wird dann als Zeile in der Tabelle
        hinzugefügt. */
        spalte[0] = "Spieler 1";
        spalte[1] = spielername;
        spalte[2] = client.getRemoteSocketAddress();
        model.addRow(spalte);
    }

    // Getter und Setter
    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Socket getClient() {
        return client;
    }

    public void setClient(Socket client) {
        this.client = client;
    }

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }
}
