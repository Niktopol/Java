package task6;

import java.awt.*;

public class MovableCircle implements Movable, Nameable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public void draw(Graphics g) {
        g.setColor(new Color(0));
        g.fillOval(center.x, center.y, radius * 2, radius * 2);
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String getName() {
        return "Circle";
    }
    @Override
    public String toString(){
        return getName() + ", X: "+center.x + ", Y: " + center.y;
    }
}
