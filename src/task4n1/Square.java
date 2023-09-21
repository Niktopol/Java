package task4n1;

public class Square extends Rectangle{
    public Square(){
        super(0,0);
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    @Override
    public void setLength(double length){
        this.length = length;
        this.width = length;
    }
    @Override
    public void setWidth(double width){
        this.length = width;
        this.width = width;
    }
    @Override
    public String getType(){
        return "Square";
    }
    @Override
    public String toString(){
        return "Square with side: " + length + " is "+color+ " and"+(filled? " ":" not ")+"filled";
    }
}
