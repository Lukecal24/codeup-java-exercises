import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){



        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + String.format("%.2f", pi) + ".");
//1
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a integer");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered " + userInput);
//
////        2
//        System.out.print("Enter the first word: ");
//        String word1 = scanner.next();
//        System.out.print("Enter the second word: ");
//        String word2 = scanner.next();
//        System.out.print("Enter the third word: ");
//        String word3 = scanner.next();
//        System.out.println("The three words are:");
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        3
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        System.out.println("Enter a sentence");
        String userSentence = scanner.nextLine();
        System.out.println("You're sentence was:");
        System.out.println(userSentence);
    }
}
