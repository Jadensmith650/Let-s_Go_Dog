
package home;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;

public class stonedown {
    Image img;
    public int x = 910;
    public int y = 0;
    public int count = 0;
    stonedown(){
                String imageLocation = "stone.png";
                URL imageURL = this.getClass().getResource(imageLocation);
        img = Toolkit.getDefaultToolkit().getImage(imageURL);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
            public void run() {
        while(true){
                    y += 2;
                    if(y >= 700){
            img = null;
            runner = null;
            x = -500;
            y = -500;
                    }
                    try{
            runner.sleep(10);
                    }catch(InterruptedException e){}
                }
            }
    });

    public Image getImage(){
            return img;
    }

    public int getX(){
            return x;
    }
    public int getY(){
            return y;
    }
    public Rectangle2D getbound(){
            return (new Rectangle2D.Double(x,y,45,45));
    }
}

