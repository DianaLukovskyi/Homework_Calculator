import homework.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.twoAddNum(2.1,3.5);
        System.out.println("Add two numbers " + result1);
        double result2 = calculator.twoSubNum(9,6.1);
        System.out.println("Subtract two numbers " + result2);
        double result3 = calculator.treeAddNum(2.3, 2.1,1.0);
        System.out.println("Add tree numbers " + result3);
        double result4 = calculator.treeSubNum(1,3,7);
        System.out.println("Subtract tree numbers " + result4);





    }

       }




















