package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

        public String getString(){
            return scanner.nextLine();
        }

        public boolean yesNo(){
            String input = scanner.nextLine();
            return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        }

        public int getInt(int min, int max){
            int num = getInt();
            while(num < min || num > max){
                System.out.printf("enter a number between %d and %d:", min, max);
                num = getInt();
            }
            return num;
        }

        public int getInt() {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Enter a valid number: ");
            }
            return scanner.nextInt();
        }
//        double

        public double getDouble(double min, double max) {
            double num = getDouble();
            while (num < min || num > max) {
                System.out.printf("Please enter a decimal number between %f and %f: ", min, max);
                num = getDouble();
            }
            return num;
        }

        public double getDouble() {
            while (!scanner.hasNextDouble()) {
                scanner.nextLine();
                System.out.print("Enter a decimal number: ");
            }
            return scanner.nextDouble();
        }


}
