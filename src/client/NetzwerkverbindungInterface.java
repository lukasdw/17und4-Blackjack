package client;

import java.net.Socket;
import javax.swing.JTable;

public interface NetzwerkverbindungInterface {

    public void verbinden(String ip, int port, String spielername);

    public void spieleZurLobbyTabelleHinzugefuegen(JTable jTableTabelle);
    
    public String getIp(); 
        
    public void setIp(String ip);
        
    public int getPort();

    public void setPort(int port);
          
    public Socket getClient();
    
    public void setClient(Socket client);
   
    public String getServername();
    
    public void setServername(String servername);
        
}
