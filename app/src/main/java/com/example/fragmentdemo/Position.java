package com.example.fragmentdemo;

public class Position {


    private  String title;
    private  String description;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public  static final  Position[] positions = {new Position("ios developer","developing ios appplication"),
                    new Position("android developer","android devloper application"),
                    new Position("java developer","developing java"),
                    new Position("Hotel manager","managing hotel"),
                   new Position("Python devloper","managing hotel")};
}
