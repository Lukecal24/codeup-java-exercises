package grades;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Luke", new ArrayList<>(Arrays.asList(75.0, 69.0, 88.0)));
        Student student2 = new Student("Randy", new ArrayList<>(Arrays.asList(90.0, 85.0, 93.0)));
        Student student3 = new Student("Lonnie", new ArrayList<>(Arrays.asList(80.0, 85.0, 90.0)));
        Student student4 = new Student("Said", new ArrayList<>(Arrays.asList(70.0, 60.0, 75.0)));

        students.put("dripreed", student1);
        students.put("chuChu", student2);
        students.put("lonald", student3);
        students.put("shaman", student4);

        Scanner input = new Scanner(System.in);
        String choice;

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }

        do {
            System.out.print("\n\nWhat student would you like to see more information on? ");
            String username = input.next();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                String name = student.getName();
                double average = student.getGradeAverage();

                System.out.println("\nName: " + name + " - GitHub Username: " + username);
                System.out.println("Current Average: " + average);
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + username + "\".");
            }

            System.out.print("\nWould you like to see another student? (y/n) ");
            choice = input.next();
        } while (choice.equals("y"));

        System.out.println("\nGoodbye, and have a wonderful day!");


    }
}
