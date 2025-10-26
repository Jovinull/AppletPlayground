package src;

import java.applet.*;
import java.awt.*;

/*
<applet code="src.MyApplet" codebase=".." width="100" height="200"></applet>
*/

public class MyApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        g.drawLine(20, 20, 180, 80);
    }
}
