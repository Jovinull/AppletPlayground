package src;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="src.AppletPolygon" codebase=".." width="500" height="500"></applet>
*/

public class AppletPolygon extends Applet {
    @Override
    public void paint(Graphics g) {
        int[] x = { 20, 180, 180, 20, 100, 20 };
        int[] y = { 20, 20, 80, 80, 50, 20 };
        int n = 6;
        g.drawPolygon(x, y, n);
    }
}
