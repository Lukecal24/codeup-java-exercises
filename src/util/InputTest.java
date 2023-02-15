package util;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();

        // Test getString() method
        System.out.print("Please enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        // Test yesNo() method
        System.out.print("Do you like Java? (y/n): ");
        boolean answer = input.yesNo();
        System.out.println("Your answer: " + answer);

        // Test getInt() method
        System.out.print("Please enter an integer between 1 and 10: ");
        int num = input.getInt(1, 10);
        System.out.println("You entered: " + num);

        // Test getDouble() method
        System.out.print("Please enter a decimal number between 0.0 and 1.0: ");
        double dnum = input.getDouble(0.0, 1.0);
        System.out.println("You entered: " + dnum);

    }
}
