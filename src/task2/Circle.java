package task2;
public class Circle {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    public double gelLength(){
        return 2*Math.PI*radius;
    }
    public double gelSpace(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getCenterX(){
        return center.getX();
    }
    public double getCenterY(){
        return center.getY();
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setCenterX(double x){
        center.setX(x);
    }
    public void setCenterY(double y){
        center.setY(y);
    }
    public boolean isSimilar(Circle circle){
        if (circle.getRadius() == radius && circle.getCenterX() == center.getX() && circle.getCenterY() == center.getY()){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Center: "+center.toString() + " Radius: "+radius;
    }

}