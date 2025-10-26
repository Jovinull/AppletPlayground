package src;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="src.Applet2" codebase=".." width="500" height="500"></applet>
*/

public class Applet3 extends Applet {
    @Override
    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        g.fillRect(50, 50, 200, 50);
    }
}
