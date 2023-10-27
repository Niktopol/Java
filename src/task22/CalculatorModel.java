package task22;

import java.util.Stack;

public class CalculatorModel{
    Stack<String> numbers;
    Stack<String> operations;
    public CalculatorModel(){
        numbers = new Stack<>();
        operations = new Stack<>();
    }
    public String calculate(String expr){
        String[] parts = expr.split(" +");
        Stack<Double> numbers = new Stack<>();
        double res = 0;
        for(String i:parts){
            try{
                numbers.push(Double.parseDouble(i));
            }catch (NumberFormatException e){
                double first = numbers.pop();
                double second = numbers.pop();
                if(i.equals("/")){
                    numbers.push(second/first);
                }else if(i.equals("*")){
                    numbers.push(second*first);
                }else if(i.equals("-")){
                    numbers.push(second-first);
                }else if(i.equals("+")){
                    numbers.push(second+first);
                }
            }
        }
        return String.valueOf(numbers.pop());
    }
}
