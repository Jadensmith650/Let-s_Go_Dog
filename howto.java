
package home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class howto extends JPanel {
    
     private final ImageIcon feild = new ImageIcon(this.getClass().getResource("howto.jpg"));
     private final ImageIcon starts = new ImageIcon(this.getClass().getResource("back.png"));
     public JButton Bbackk = new JButton(starts);
     
      howto(){

            setLayout(null);
            Bbackk.setBounds(990,690,300,100);
            add(Bbackk);
            Bbackk.setBackground ( Color.BLACK );
            add(Bbackk);
            Bbackk.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
            add(Bbackk);
	}
      
      public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(feild.getImage(),0,0,getWidth(),getHeight(),this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
            
	}
}
