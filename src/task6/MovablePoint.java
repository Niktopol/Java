package task6;

public class MovablePoint implements Movable, Nameable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        y+= ySpeed;
    }

    @Override
    public void moveDown() {
        y-= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String getName() {
        return "Point";
    }
    @Override
    public String toString(){
        return getName() + ", X: "+x + ", Y: " + y;
    }
}
