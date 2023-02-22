package grades;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Luke", new ArrayList<>(Arrays.asList(75.0, 69.0, 88.0)));

        System.out.println(student1.getGradeAverage());

        student1.addGrade(96);
        System.out.println(student1.getGrades());

    }

}
