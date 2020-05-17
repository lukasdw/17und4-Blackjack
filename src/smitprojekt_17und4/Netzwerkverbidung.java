package smitprojekt_17und4;

import java.io.*;
import java.net.Socket;

public class Netzwerkverbidung {

    public void verbinden(){
        try {
            /* Die 62.171.167.37 ist mein privater Windows-Server mit
            einer öffentlichen IP. Die entsprechende Firewallregel für den
            Port 174 ist geöffnet. */
            Socket client = new Socket("62.171.167.37", 174);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF("Verbindung erfolgreich.");
            output.writeUTF("Das ist: " + client.getLocalSocketAddress());
            DataInputStream input = new DataInputStream(client.getInputStream());
            System.out.println(input.readUTF());
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
