import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] people = new String[3];
        people[0] = "Luke";
        people[1] = "Carti";
        people[2] = "Summrs";

        for (String person : people) {
            System.out.println(person);
        }

        people = addPerson(people, "Chief Keef");
        System.out.println(Arrays.toString(people));
    }

    public static String[] addPerson(String[] people, String newPerson) {
        String[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }
}

