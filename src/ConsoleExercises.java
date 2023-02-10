import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){



//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + String.format("%.2f", pi) + ".");
////1
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a integer");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered " + userInput);
////
//////        2
//        System.out.print("Enter the first word: ");
//        String word1 = scanner.next();
//        System.out.print("Enter the second word: ");
//        String word2 = scanner.next();
//        System.out.print("Enter the third word: ");
//        String word3 = scanner.next();
//        System.out.println("The three words are:");
////        System.out.print(word1 + "\n" + word2 + "\n" + word3);
//        System.out.printf("%s\n%s\n%s", word1, word2, word3);

//        3
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        System.out.print("Enter a sentence");
//        String userSentence = scanner.nextLine();
//        System.out.println("You're sentence was:");
//        System.out.println(userSentence);



//        last one
        System.out.println("Enter the length of codeup");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the width");
        double width = Double.parseDouble(scanner.nextLine());

        double perimeter = (length + width) * 2;
        double area = length * width;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);




    }
}
