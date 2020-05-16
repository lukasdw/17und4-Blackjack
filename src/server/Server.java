package server;


import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    // Quelle: https://www.youtube.com/watch?v=O7TuxKJXBII
    private ServerSocket server;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
            server.setSoTimeout(1000000);
        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void laufen() {
        while (true) {
            try {
                System.out.println("Waiting for client ..." + server.getLocalPort());
                Socket client = server.accept();
                DataInputStream input = new DataInputStream(client.getInputStream());
                System.out.println(input.readUTF());
                System.out.println(client.getRemoteSocketAddress());
                DataOutputStream output = new DataOutputStream(client.getOutputStream());
                output.writeUTF("Verbindung erfolgreich.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server s = new Server(174);
        s.laufen();
    }
}
