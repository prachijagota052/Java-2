class SuperClass {
    void method() {
        System.out.println("This is a method in the superclass.");
    }
}

class Subclass extends SuperClass {
    @Override
    void method() throws ArithmeticException {
        System.out.println("Subclass method executed.");
        throw new ArithmeticException("This is an arithmetic exception from the subclass.");
    }
    public static void main(String[] args) {
        SuperClass s = new Subclass();
        try {
            s.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}