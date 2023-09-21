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
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    //@Override
    //public void ()
}
