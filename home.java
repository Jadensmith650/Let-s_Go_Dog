
package home;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class home extends JFrame implements ActionListener {
    
    homebg homegames1 = new homebg();
    musicselect music = new musicselect();
    playgame play = new playgame();
    howto how = new howto();
    playgame2 play2 = new playgame2();
    
    public home() {
        this.setSize(1355, 888);
        this.add(homegames1);
        homegames1.BStart.addActionListener(this);
        music.Bback.addActionListener(this);
        music.Bmusic.addActionListener(this);
        play.Bbacktostart.addActionListener(this);
        homegames1.BHowto.addActionListener(this);
        how.Bbackk.addActionListener(this);
        music.Bmusic2.addActionListener(this);
        play2.Bbacktostart2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
             if(e.getSource()== homegames1.BStart){
		this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(1355,888);
                this.add(music);
                music.requestFocusInWindow();
                play.scor = 0;
                play.times = 100;
                play.timestart=false;
                play.startball=false;
                play2.scorr = 0;
                play2.timess = 100;
                play2.timestartt=false;
                play2.startballl=false;
               }
             
             else if(e.getSource() == music.Bback)
               {
                 this.setLocationRelativeTo(null);
                 this.remove(music);
                 this.setSize(1355,888);
                 this.add(homegames1);
                 homegames1.requestFocusInWindow();
             }
             else if(e.getSource() == music.Bmusic)
             {
                 this.setLocationRelativeTo(null);
                 this.remove(music);
                 this.setSize(1355,888);
                 this.add(play);
                 play.requestFocusInWindow();
             }
             else if(e.getSource() == play.Bbacktostart)
             {
                 this.setLocationRelativeTo(null);
                 this.remove(play);
                 this.setSize(1355,888);
                 this.add(music);
                 music.requestFocusInWindow();
             }
             else if(e.getSource() == homegames1.BHowto)
             {
                 this.setLocationRelativeTo(null);
                 this.remove(homegames1);
                 this.setSize(1355,888);
                 this.add(how);
                 how.requestFocusInWindow();
             }
             else if(e.getSource() == how.Bbackk)
             {
                 this.setLocationRelativeTo(null);
                 this.remove(how);
                 this.setSize(1355,888);
                 this.add(homegames1);
                 homegames1.requestFocusInWindow();
             }
             else if(e.getSource() == music.Bmusic2)
             {
                 this.setLocationRelativeTo(null);
                 this.remove(music);
                 this.setSize(1355,888);
                 this.add(play2);
                 play2.requestFocusInWindow();
             }
             else if(e.getSource() == play2.Bbacktostart2)
             {
                 this.setLocationRelativeTo(null);
                 this.remove(play2);
                 this.setSize(1355,888);
                 this.add(music);
                 music.requestFocusInWindow();
             }
            this.validate();
            this.repaint();
    }
    
 public static void main(String[] args){
     JFrame jf = new home();
     jf.setTitle("Let's Go Dog");
     jf.setSize(1355,888);
     jf.setLocationRelativeTo(null);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setVisible(true);
     String filepath = "ES_Socialite.wav";
     Musicstuff musicObject = new Musicstuff();
     musicObject.playmusic(filepath);
 }  

}
