/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remake;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static remake.GraphicPanel.H;
import static remake.GraphicPanel.W;

/**
 *
 * @author thiennd
 */
class SpaceShip {

    int x;
    int y;
    Color color;

    public SpaceShip() {
        x = 250;
        y = 250;
        color = BLUE;
    }

    void up() {
        y = y - 10 + H;
        y %= H;
    }

    void down() {
        y = y + 10 + H;
        y %= H;
    }

    void left() {
        x = x - 10 + W;
        x %= W;
    }

    void right() {
        x = x + 10 + W;
        x %= W;
    }
}
