
package home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class musicselect extends JPanel {
    private final ImageIcon bg = new ImageIcon(this.getClass().getResource("musicse.jpg"));
    private final ImageIcon music1 = new ImageIcon(this.getClass().getResource("music1.jpg"));
    public JButton Bmusic = new JButton(music1);
    private final ImageIcon music22 = new ImageIcon(this.getClass().getResource("music2.jpg"));
    public JButton Bmusic2 = new JButton(music22);
    private final ImageIcon music2= new ImageIcon(this.getClass().getResource("namemusic.png"));
    private final ImageIcon music3= new ImageIcon(this.getClass().getResource("namemusic2.png"));
    private final ImageIcon back = new ImageIcon(this.getClass().getResource("back.png"));
    public JButton Bback = new JButton(back);
    
    musicselect(){

            setLayout(null);
            Bmusic.setBounds(310,260,300,300);
            add(Bmusic);
            Bmusic.setBackground ( Color.BLACK );
            add(Bmusic);
            Bmusic.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
            add(Bmusic);
            Bback.setBounds(490,690,300,100);
            add(Bback);
            Bback.setBackground ( Color.BLACK );
            add(Bback);
            Bback.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
            add(Bback);
            setLayout(null);
            Bmusic2.setBounds(700,260,300,300);
            add(Bmusic2);
            Bmusic2.setBackground ( Color.BLACK );
            add(Bmusic2);
            Bmusic2.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
            add(Bmusic2);
	}
    
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(bg.getImage(),0,0,getWidth(),getHeight(),this);
            g.drawImage(music2.getImage(),310,455,300,300,this);
            g.drawImage(music3.getImage(),700,455,300,300,this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
            
	}
}
