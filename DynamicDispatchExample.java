class Parent{
    void show()
    {
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    @override
    void show()
    {
        System.out.println("Child class");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args)
    {
        Parent obj = new Child();
        obj.show(); // This will call the overridden method in Child class
    }
}