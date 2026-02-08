import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Hello");
        vector.add("World");
        vector.add("Java");
        vector.add("Vector");

        // Print the elements of the Vector
        System.out.println("Elements in the Vector: " + vector);

        // Access an element by index
        String elementAtIndex1 = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Remove an element from the Vector
        vector.remove("Java");
        System.out.println("Elements after removing 'Java': " + vector);

        // Check if the Vector contains a specific element
        boolean containsHello = vector.contains("Hello");
        System.out.println("Does the Vector contain 'Hello'? " + containsHello);

        // Get the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);
    }
}