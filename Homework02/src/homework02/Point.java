/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework02;

/**
 *
 * @author thiennd
 */
public class Point {
    double x,y,z;
    Point(){
        x = 0;
        y = 0;
        z = 0;
    }
    Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
}
