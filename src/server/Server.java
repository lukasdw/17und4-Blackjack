package server;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Server {

    // Quelle: https://www.youtube.com/watch?v=O7TuxKJXBII
    private ServerSocket server;
    private int port;
    private String name;
    private String spielername;

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

    public void laufen(JTable jTableTabelle) {
        while (true) {
            try {
                Socket client = server.accept();

                // Dies sind die gesendeten Daten
                DataOutputStream output = new DataOutputStream(client.getOutputStream());
                output.writeUTF(name);
                System.out.println(name);

                // Dies sind die empfangenen Daten
                DataInputStream input = new DataInputStream(client.getInputStream());
                System.out.println(input.readUTF());

                /* Die Zeile wird nun in die Tabelle (jTableTabelle) hinzugefügt.
                Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
                die nötigen Funktionen benutzen zu können */
                DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
                Object spalte[] = new Object[3];

                /* Nun werden die Werte der Spieler in ein Array, was als Zeile
                fungiert, gespeichert. Diese Zeile wird dann als Zeile in der Tabelle
                hinzugefügt. */
                spalte[0] = "Spieler 1";
                this.spielername = input.readUTF();
                spalte[1] = input.readUTF();
                spalte[2] = client.getRemoteSocketAddress();
                model.addRow(spalte);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
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