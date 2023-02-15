package oopLesson;

public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

//Getters & Setters

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;

    }

//    Constructor creator
    public Dish(int cents, String food, boolean recommend){
        this.costInCents = cents;
        this.nameOfDish = food;
        this.wouldRecommend = recommend;
    }



    public void printSummary(){
        System.out.printf("oopLesson.Dish name: %s%n", nameOfDish);
        System.out.printf("Cost: %d cents%n", costInCents);
        System.out.printf("Would recommend: %b%n", wouldRecommend);
    }
}
/*

-- SHORT ASSIGNMENT #3 --
        Refactor your Dish and DishTest classes...
        1) Change all properties in the Dish class to private visibility (printSummary should remain public)
  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
          3) Refactor code as needed in DishTest to access and modify dish object property values
          4) Add a constructor method to Dish that will assign all properties
          5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
*/
