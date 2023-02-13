import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(4,4));
        System.out.println(subtraction(6,2));
        System.out.println(multiplication(8,7));
        System.out.println(division(56,6));
        System.out.println(modulus(80,6));

        System.out.println(sayName("Luke"));
        System.out.println(sayName("Luke", "Calderon"));
        System.out.println(addition(4.5,6.5));
        System.out.println(subtraction(6.5,2.5));
        System.out.println(multiplication(8.2,7.6));
        System.out.println(division(56.5,6.5));
        System.out.println(modulus(80.5,6.5));

        int userInput = getInteger(1, 10);
        System.out.println("You entered: " + userInput);

    }
    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.

// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"
    public static String sayName(String firstName){
        return "Hi " + firstName;
    }
    public static String sayName(String firstName, String lastName){
        return "Hi " + firstName + " " + lastName;
    }

// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles


    public static int addition(int a, int b){
        return a + b;
    }
    public static double addition(double a, double b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static double subtraction(double a, double b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static double multiplication(double a, double b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }
    public static double division(double a, double b){
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }
    public static double modulus(double a, double b){
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                if (userInput >= min && userInput <= max) {
                    sc.close();
                    return userInput;
                }
            }
            System.out.println("Invalid input, please try again.");
            sc.nextLine();
        }
    }


}
