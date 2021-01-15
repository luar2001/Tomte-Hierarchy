import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukas Aronsson
 * Date: 14/01/2021
 * Time: 13:59
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 **/
public class Main {
    public static void main(String[] args) {

        List<String> directions = Arrays.asList("higher", "lower");

        UserInput name = new UserInput("name");
        UserInput direction = new UserInput("direction");

        if (direction.inList(directions)) {
            System.out.println(direction.getInput() + " is on the list");
        } else {
            System.out.println(direction.getInput() + " is not on the list");
        }

        System.out.println(name.getInput());

    }
}