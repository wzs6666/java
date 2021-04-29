import java.applet.*;
import java.awt.*;

public class firstApplet extends Applet {
    public String s;
    public void init() {
        s = new String("applet");
    }
    public void paint(Graphics g) {
        g.drawString(s, 25,25);
    }
}

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
   FreshJuiceSize size;
}
 
public class FreshJuiceTest {
   public static void main(String[] args){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
   }
}
// aa