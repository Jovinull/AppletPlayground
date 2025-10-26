package src;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="src.Applet2" codebase=".." width="500" height="500"></applet>
*/

public class Applet2 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawRect(50, 50, 180, 80);
    }
}
