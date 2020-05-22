package smitprojekt_17und4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Netzwerkverbidung {

    private String ip;
    private int port;
     
    public void verbinden(String ip, int port){
        try {
            /* Die 62.171.167.37 ist mein privater Windows-Server mit
            einer öffentlichen IP. Die entsprechende Firewallregel für den
            Port 174 ist geöffnet. */
            Socket client = new Socket(ip, port);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF("Verbindung erfolgreich.");
            output.writeUTF("Das ist: " + client.getLocalAddress());
            DataInputStream input = new DataInputStream(client.getInputStream());
            System.out.println(input.readUTF());
            client.close();
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
}