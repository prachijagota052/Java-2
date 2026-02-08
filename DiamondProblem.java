interface Father {
    default void Fathershow() {
        System.out.println("Father");
    }
}

interface Mother {
    default void Mothershow() {
        System.out.println("Mother");
    }
}

class Child implements Father, Mother {

    // MUST override to resolve ambiguity
    public void show() {
       Fathershow();
        Mothershow();
        System.out.println("Child");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
