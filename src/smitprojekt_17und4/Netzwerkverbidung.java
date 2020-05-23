package smitprojekt_17und4;

import java.io.*;
import java.net.Socket;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Netzwerkverbidung {

    private String ip;
    private int port;
    private String servername;
    private Socket client;

    public void verbinden(String ip, int port, String spielername, JTable jTableTabelle) {
        this.ip = ip;
        this.port = port;
        try {
            Socket client = new Socket(ip, port);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());           
            
            output.writeUTF(spielername);
            System.out.println(spielername);

            DataInputStream input = new DataInputStream(client.getInputStream());
            servername = input.readUTF();
            System.out.println(input.readUTF());

            client.close();

            /* Die Zeile wird nun in die Tabelle (jTableTabelle) hinzugefügt.
                Dazu müssen wir unser Model in ein "DefaultTableModel" umwandeln, um
                die nötigen Funktionen benutzen zu können */
            DefaultTableModel model = (DefaultTableModel) jTableTabelle.getModel();
            Object spalte[] = new Object[3];

            /* Nun werden die Werte der Spieler in ein Array, was als Zeile
                fungiert, gespeichert. Diese Zeile wird dann als Zeile in der Tabelle
                hinzugefügt. */
            spalte[0] = "Spieler 1";
            spalte[1] = spielername;
            spalte[2] = client.getRemoteSocketAddress();
            model.addRow(spalte);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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