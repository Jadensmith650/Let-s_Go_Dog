
package home;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Musicstuff {
    
    void playmusic(String musicLocation)
    {
        try
        {
            File musicPath = new File(musicLocation);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
            }
            else
            {
                System.out.println("Can't Open");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
