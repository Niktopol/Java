package task4n1;

import java.util.Scanner;

public class Matrix {
    private double[][] contents;

    private int longest = -1;
    private int lines;
    private int columns;

    private void setLongest(){
        longest = -1;
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                Double num = contents[i][j];
                if (num.toString().length() > longest){
                    longest = num.toString().length();
                }
            }
        }
    }
    public Matrix(double[][] contents){
        this.contents = contents;
        lines = contents.length;
        columns = contents[0].length;
        setLongest();
    }
    public void makeMatrix(int lines, int columns){
        this.lines = lines-1;
        this.columns = columns-1;
        Scanner scanner = new Scanner(System.in);
        contents = new double[lines-1][columns-1];
        for (int i = 0; i < lines-1; i++){
            for (int j = 0; j < columns-1; j++){
                contents[i][j] = scanner.nextDouble();
            }
        }
        setLongest();
    }
    public void addMatrix(Matrix matrix){
        if (matrix.lines == this.lines && matrix.columns == this.columns){
            for (int i = 0; i < lines; i++){
                for (int j = 0; j < columns; j++){
                    this.contents[i][j] += matrix.contents[i][j];
                }
            }
            setLongest();
        }
    }
    public void multMatrix(Matrix matrix){
        if (this.columns == matrix.lines){
            double[][] res = new double[this.lines][matrix.columns];
            for (int i = 0; i < lines; i++){
                for (int j = 0; j < matrix.columns; j++){
                    double sm = 0;
                    for (int g = 0; g < columns; g++){
                        sm += contents[i][g]*matrix.contents[g][j];
                    }
                    res[i][j] = sm;
                }
            }
            columns = matrix.columns;
            contents = res;
            setLongest();
        }
    }
    public void multMatrix(double num){
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                contents[i][j] *= num;
            }
        }
        setLongest();
    }
    @Override
    public String toString(){
        String s = "\n";
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                s += String.format("%"+(longest+3)+".3f", contents[i][j]);
            }
            s += "\n";
        }
        return s;
    }
}
