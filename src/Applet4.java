package src;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="src.Applet4" codebase=".." width="500" height="500"></applet>
*/

public class Applet4 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawOval(20, 20, 160, 200);
        g.fillOval(60, 300, 50, 150);
    }
}
