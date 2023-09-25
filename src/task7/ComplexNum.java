package task7;

public class ComplexNum {
    private double real;
    private double complex;
    public ComplexNum(double real, double complex){
        this.real = real;
        this.complex = complex;
    }
    public void modifyReal(double num){
        real += num;
    }
    public void modifyComplex(double num){
        complex += num;
    }
    public void modifyNum(double real, double complex){
        this.real += real;
        this.complex += complex;
    }
    public double getReal(){
        return real;
    }
    public double getComplex(){
        return complex;
    }
}
