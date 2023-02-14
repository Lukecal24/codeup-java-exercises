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

//        int userInput = getInteger(1, 10);
//        System.out.println("You entered: " + userInput);

        System.out.println(factorial(1)); //1
        System.out.println(factorial(2)); //2
        System.out.println(factorial(3)); //6
        System.out.println(factorial(4)); //24
        promptFactorials();

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
//      2

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        } else {
            System.out.println("Input out of range!");
            return getInteger(min,max);
        }
    }

//    3
//    public static long factorial(int num){ //loop version
//        long output =1;
//        for (int i = 1; i <= num; i +=1){
//              output *= i;
//        }
//        return output;
//    }

    public static long factorial(int num){
        if(num == 1) return 1;
        return factorial(num - 1) * num;
    }
    public static void promptFactorials(){
        Scanner scanner = new Scanner(System.in);
        boolean continueMessage = true;
        System.out.println("Welcome to factorial calculator");
        do{
            System.out.println("What number should we calculate?");
            int userInt = getInteger(1,10);
            System.out.println("Factorial of " + userInt + " is " + factorial(userInt) + ".");
            System.out.println("Would you like to enter another number? Enter:[y/n]");
            String respone = scanner.next();
            if (respone.equalsIgnoreCase("n")){
                continueMessage = false;
            }
        }while (continueMessage);
    }



}
