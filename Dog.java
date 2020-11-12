
package home;

import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

public class Dog {
    public int x;
    public int y;
  
    public Rectangle2D getbound() {
        return (new Rectangle2D.Double(x, y, 250, 250));
    }
}
