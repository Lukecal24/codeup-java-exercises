package substring;

public class SubstringTest {


    public static void main(String[] args) {
        String str = "Hello, world!";

        try {
            // Find the length of the string
            int length = str.length();
            System.out.println("Length of string: " + length);

            // Attempt to create a substring that is out of bounds
            String substr = str.substring(20, 30);
            System.out.println("Substring: " + substr);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
