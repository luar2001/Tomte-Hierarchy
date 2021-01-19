import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Lukas Aronsson
 * Date: 14/01/2021
 * Time: 13:59
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 * <p>
 * Main class that starts the program and calls all the other classes.
 **/
public class Main {
    public static void main(String[] args) {
        List<String> directions = Arrays.asList("higher", "lower"); //list that holds the 2 directions the user can check in the hierarchy of Tomtar
        Tomtar.setWorkers(); //Gives the Tomtar workers
        System.out.println("First Input Name || Then Input a Direction (Higher or Lower) ");
        UserInput name = new UserInput("name"); //calls for the UserInput Class
        UserInput direction = new UserInput("direction"); //calls for the UserInput Class
        Tomte selectedTomte = Tomtar.selectedTomte((name.getInput()));
        if (Objects.equals(Objects.requireNonNull(direction.getInput()).toLowerCase(), "higher") && selectedTomte.getBoss() == null || Objects.equals(Objects.requireNonNull(direction.getInput()).toLowerCase(), "lower") && selectedTomte.getWorkers() == null) {
            System.out.println(selectedTomte.getName() + " is the end of the Hierarchy");
        } else {
            if (direction.inList(directions)) {
                System.out.println(Hierarchy.hierarchyCreator(Objects.requireNonNull(direction.getInput()), selectedTomte));
            } else {
                System.out.println("Please try again :) ");
            }
        }
    }
}