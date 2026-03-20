class A{
    final int x=9;
    final void display(){
        System.out.println("Value of x: "+x);
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}