package client.Sound;

import client.Karte.*;
import client.Sound.*;
import client.Spieler.*;
import client.Netzwerk.*;
import client.Partie.*;

import javax.sound.sampled.*;
import java.io.*;
import java.util.ArrayList;

public class Sound implements SoundInterface {
    
    /* Die Klasse + Funktion ist ungetestet. Ein Sound soll zum Einsatz
    kommen, wenn Karten gemischt, ausgeteilt oder gelegt werden. → Version 4.0 */
    public void abspielen(String soundDateiname) {
        
        String root = System.getProperty("user.dir");
        String filePath = root + File.separator + "src\\sounds\\";
        
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath + soundDateiname + ".wav"));
            AudioFormat af = audioInputStream.getFormat();
            int size = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
            byte[] audio = new byte[size];
            DataLine.Info info = new DataLine.Info(Clip.class, af, size);
            audioInputStream.read(audio, 0, size);

            for (int i = 0; i < 1; i++) {
                Clip clip = (Clip) AudioSystem.getLine(info);
                clip.open(af, audio, 0, size);
                clip.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}