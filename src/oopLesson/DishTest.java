package oopLesson;

import oopLesson.Dish;

public class DishTest {
    public static void main(String[] args){
        Dish dish1 = new Dish();
        dish1.costInCents = 1200;
        dish1.nameOfDish = "Spaghetti";
        dish1.wouldRecommend = true;

        Dish dish2 = new Dish();
        dish2.costInCents = 1600;
        dish2.nameOfDish = "Steak";
        dish2.wouldRecommend = true;




        dish1.printSummary();
        System.out.println(DishTools.shoutDishName(dish1));
        DishTools.analyzeDishCost(dish2);
        System.out.println(DishTools.flipRecommendation(dish1));

    }
}
