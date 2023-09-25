package task7;

public class MathSet implements MathCalculatable{
    @Override
    public double power(double num, int pow) {
        if (pow == 0){
            return 1;
        }else if (pow >= 1){
            double n = 1;
            for (int i = 0; i < pow; i++){
                n *= num;
            }
            return n;
        }else{
            double n = 1;
            for (int i = 0; i < pow; i++){
                n /= num;
            }
            return n;
        }
    }

    @Override
    public double compAbs(ComplexNum complexNum) {
        return Math.sqrt(complexNum.getReal()*complexNum.getReal() + complexNum.getComplex()*complexNum.getComplex());
    }
    public double getCircArea(double radius){
        return radius*radius*PI;
    }
}
