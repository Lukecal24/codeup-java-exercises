package movies;

import java.util.Scanner;

public class Movie {
    private static String name;
    private static String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

//Getters
    public static String getName() {
        return name;
    }

    public static String getCategory(){
        return category;
    }

//Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }




}
