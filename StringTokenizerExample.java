import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java programming.";
        StringTokenizer tokenizer = new StringTokenizer(str, " ,.!");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}