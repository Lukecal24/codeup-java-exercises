public class ArrayPractice {

    /* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
    Find the sum of all five double values using an enhanced for loop.
 */
    public static void main(String[] args) {


        double[] numbers = new double[3];
        numbers[0] = 1.5;
        numbers[1] = 2.5;
        numbers[2] = 3.5;

        double total = 0;

        for(double number : numbers){
          total += number;
        }
        System.out.println(total);

    }

}
