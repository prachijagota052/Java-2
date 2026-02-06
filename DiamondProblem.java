interface Father {
    default void show() {
        System.out.println("Father");
    }
}

interface Mother {
    default void show() {
        System.out.println("Mother");
    }
}

class Child implements Father, Mother {

    // MUST override to resolve ambiguity
    public void show() {
        Father.super.show();
        Mother.super.show();
        System.out.println("Child");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
