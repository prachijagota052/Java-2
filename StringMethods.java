public class StringMethods{
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println("Length of str: " + str.length()); // Output: 11
        System.out.println("Uppercase of str: " + str.toUpperCase()); // Output: HELLO WORLD
        System.out.println("Lowercase of str: " + str.toLowerCase()); // Output: hello world
        System.out.println("Character at index 0: " + str.charAt(0)); // Output: H
        System.out.println("Index of 'o': " + str.indexOf("o")); // Output: 4
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5)); // Output: Hello
    System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Output: Hello Java
    System.out.println("Trimmed str: " + str.trim()); // Output: Hello World
    }
}