package server.Netzwerk;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Server implements ServerInterface {

    // Quelle: https://www.youtube.com/watch?v=O7TuxKJXBII
    private ServerSocket server;
    private Socket client;
    private int port;
    private String name;

    // Empfangener Spielername
    private String spielername;

    // Ein und Ausgabe des Servers
    private DataOutputStream output;
    private DataInputStream input;

    // Diese IP zeigt die HostIP im internen Netz
    private String localIP = "keine Verbindung";

    // Diese IP zeigt die HostIP im internen Netz
    private String internetIP = "keine Verbindung";

    public Server(int port, String name) {
        this.port = port;
        this.name = name;
        try {
            server = new ServerSocket(port);
            server.setSoTimeout(1000000);
        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void spielerSuchen() {
        while (true) {
            try {
                client = server.accept();
                // Dies sind die gesendeten Daten
                DataOutputStream output = new DataOutputStream(client.getOutputStream());
                output.writeUTF(name);
                System.out.println(name);
                // Dies sind die empfangenen Daten
                DataInputStream input = new DataInputStream(client.getInputStream());
                System.out.println(input.readUTF());
                client.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle) {
        /* Die Zeile wird nun in die Tabelle (jTableTabelle) hinzugefügt.
        Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
        die nötigen Funktionen benutzen zu können */
        DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
        Object spalte[] = new Object[3];

        /* Nun werden die Werte der Spieler in ein Array, was als Zeile
        fungiert, gespeichert. Diese Zeile wird dann als Zeile in der Tabelle
        hinzugefügt. */
        try {
            spalte[0] = "Spieler 1";
            this.spielername = input.readUTF();
            spalte[1] = input.readUTF();
            spalte[2] = client.getRemoteSocketAddress();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addRow(spalte);
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

    // Getter und Setter
    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpielername() {
        return spielername;
    }

    public void setSpielername(String spielername) {
        this.spielername = spielername;
    }
}
