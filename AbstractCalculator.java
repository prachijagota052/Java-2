abstract class Calculator{
    abstract int result(int a, int b);
}

class Addition extends Calculator{
    int result(int a, int b){
        return a+b;
    }
}
    
class Subtraction extends Calculator{
    int result(int a, int b){
        return a-b;
    }
}

class multiplication extends Calculator{
    int result(int a, int b){
        return a*b;
    }
}
class division extends Calculator{
    int result(int a, int b){
        return a/b;
    }
}

public class AbstractCalculator{
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        multiplication mul = new multiplication();
        division div = new division();

        System.out.println("Addition: "+add.result(10, 5));
        System.out.println("Subtraction: "+sub.result(10, 5));
        System.out.println("Multiplication: "+mul.result(10, 5));
        System.out.println("Division: "+div.result(10, 5));
        // Expression: 5 + 8 - (9*2)/5
        int x = add.result(5, 8) - mul.result(9, 2) / div.result(10, 5);
        System.out.println("Result: " + x);
        
    }
}