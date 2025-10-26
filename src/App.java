package src;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="src.App" codebase=".." width="500" height="500"></applet>
*/

public class App extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawArc(40, 40, 160, 60, 90, 180);
    }
}
