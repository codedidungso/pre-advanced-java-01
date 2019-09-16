/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author thiennd
 */
class MainFrame extends JFrame implements KeyListener {

   
    GraphicPanel graphic;

    public MainFrame() {
        graphic = new GraphicPanel();
        add(graphic);
        graphic.repaint();

        addKeyListener(this);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                graphic.ss.up();
                break;
            case KeyEvent.VK_DOWN:
                graphic.ss.down();
                break;
            case KeyEvent.VK_LEFT:
                graphic.ss.left();
                break;
            case KeyEvent.VK_RIGHT:
                graphic.ss.right();
                break;

        }
        graphic.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
