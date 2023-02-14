package oopLesson;

public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;


    public void printSummary(){
        System.out.printf("oopLesson.Dish name: %s%n", nameOfDish);
        System.out.printf("Cost: %d cents%n", costInCents);
        System.out.printf("Would recommend: %b%n", wouldRecommend);
    }
}
