public class ArrayExample{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Alternatively, using an enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}