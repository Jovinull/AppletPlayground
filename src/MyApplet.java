package src;

import java.applet.*;
import java.awt.*;

/*
<applet code="src.MyApplet" codebase=".." width="200" height="100"></applet>
*/

public class MyApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawLine(20, 20, 180, 80);
    }
}
