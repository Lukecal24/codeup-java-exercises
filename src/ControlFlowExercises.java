import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){


//        1
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        2
//        int count = 100;
//        do {
//            System.out.println(count);
//            count -= 5;
//        } while (count >= -10);


//        long count = 2;
//        do {
//            System.out.println(count);
//            count *= count;
//        } while (count < 1000000);


//        for (int count = 100; count >= -10; count -= 5) {
//            System.out.println(count);
//        }
//
//
//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

//3
        for(long i = 0; i <=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else
            System.out.println(i);
        }

//        table
        Scanner scan = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter an integer: ");
            int n = scan.nextInt();

            System.out.println("Number | Squared | Cubed");
            System.out.println("------- | ------- | -----");
            for (int i = 1; i <= n; i++) {
                System.out.println(String.format("%6d | %7d | %5d", i, i * i, i * i * i));
            }

            System.out.print("Do you want to continue (y/n)? ");
            userInput = scan.next();
        } while (userInput.equals("y"));
//        scan.close();

//4

        String userGrade;
        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scan.nextInt();
            char letterGrade;
            if (grade >= 88) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 67) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("The corresponding letter grade is " + letterGrade);

            System.out.print("Do you want to continue (y/n)? ");
            userGrade = scan.next();
        } while (userGrade.equals("y"));
        scan.close();


    }
}
