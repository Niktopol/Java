package task2;

public class Circle {
    private Point center;
    private double radius;
    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Center: "+center.toString() + " Radius: "+radius;
    }

}