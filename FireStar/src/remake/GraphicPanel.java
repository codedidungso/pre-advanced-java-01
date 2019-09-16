/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remake;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author thiennd
 */
class GraphicPanel extends JPanel {

    public static final int W = 500;
    public static final int H = 500;

    SpaceShip ss = new SpaceShip();
    Planet pl1;
    Planet pl2;

    public GraphicPanel() {
        setSize(W, H);
        ss = new SpaceShip();
        pl1 = new Planet(100, 100, Color.BLACK);
        pl2 = new Planet(200, 200, Color.GRAY);

    }

    @Override
    public void paint(Graphics g) {
        // draw background 
        super.paint(g);
        g.setColor(Color.pink);
        g.fillRect(0, 0, 500, 500);

        // draw spaceship 
        g.setColor(ss.color);
        g.fillRect(ss.x, ss.y, 20, 40);

        // draw planets
        g.setColor(pl1.color);
        g.fillOval(pl1.x, pl1.y, 30, 50);

        g.setColor(pl2.color);
        g.fillOval(pl2.x, pl2.y, 70, 20);

    }

}
