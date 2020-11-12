
package home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class homebg extends JPanel{
        private final ImageIcon feild = new ImageIcon(this.getClass().getResource("homebg.jpg"));
	private final ImageIcon starts = new ImageIcon(this.getClass().getResource("Start.png"));
	public JButton BStart = new JButton(starts);
        private final ImageIcon startss = new ImageIcon(this.getClass().getResource("howtoB.png"));
        public JButton BHowto = new JButton(startss);
        
        homebg(){

            setLayout(null);
            BStart.setBounds(330,600,300,100);
            add(BStart);
            BStart.setBackground ( Color.BLACK );
            add(BStart);
            BStart.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
            add(BStart);
            setLayout(null);
            BHowto.setBounds(700,600,300,100);
            add(BHowto);
            BHowto.setBackground ( Color.BLACK );
            add(BHowto);
            BHowto.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
            add(BHowto);
	}
        
        @Override
	public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(feild.getImage(),0,0,getWidth(),getHeight(),this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
            
	}
}
