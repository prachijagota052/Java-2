import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);
        fruits.remove("Apple");
        System.out.println("fruits after removal: " + fruits);
        System.out.println("Size of fruits list: " + fruits.size());
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
    }
}