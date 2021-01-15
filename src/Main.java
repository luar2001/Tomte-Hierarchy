import java.util.Arrays;
import java.util.List;

/*
  Created by Lukas Aronsson
  Date: 14/01/2021
  Time: 13:59
  Project: Tomte-Hierarchy
  Copyright: MIT
 */

/**
 * Main class that starts the program and calls all the other classes.
 */
public class Main {
    public static void main(String[] args) {
        List<String> directions = Arrays.asList("higher", "lower"); //list that holds the 2 directions the user can check in the hierarchy of Tomtar

        UserInput name = new UserInput("name");
        UserInput direction = new UserInput("direction");

        System.out.println(name.getInput());

        System.out.println(direction.getInput() + " is " + ((direction.inList(directions)) ? "" : "not ") + "on the list");

    }
}