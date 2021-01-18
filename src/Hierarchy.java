import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lukas Aronsson
 * Date: 18/01/2021
 * Time: 16:27
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 * <p>
 * Class that takes in a name and checks if it correlates to one of the Tomtar and then sends a tomte back.
 **/
public class Hierarchy {
    private static final List<Tomte> higherRanked = new ArrayList<>();
    private static final List<Tomte> lowerRanked = new ArrayList<>();

    /**
     * Method that takes in a direction and then a tomte to start the hierarchy from then returns a list of the hierarchy in the inputted direction
     *
     * @param direction Higher = UP in the hierarchy || Lower = DOWN in the hierarchy
     * @param tomte     a Tomte object that refers to one of the Tomtar
     * @return A list of all the names in the hierarchy up or down depending on the direction from the inputted tomte based on the direction
     */
    public static List<String> hierarchyCreator(String direction, Tomte tomte) {
        if (direction.equals("higher")) {
            makeHigherHierarchyList(tomte);
            return getNames(higherRanked);
        } else if (direction.equals("lower")) {
            System.out.println("That is currently not a feature...");
            //return getNames(tomte.getLowerRanked());
            return null;
        } else {
            System.out.println("Please input a valid direction");
            return null;
        }
    }

    /**
     * Gets all the Tomte names and puts them in a list it then returns
     *
     * @param tomtar a list of Tomte objects
     * @return a list of strings that represents the Tomte objects names.
     */
    public static List<String> getNames(List<Tomte> tomtar) {
        return tomtar.stream()
                .map(Tomte::getName)
                .collect(Collectors.toList());
    }

    /**
     * Makes the hierarchy in the upwards direction form the tomte it takes in.
     *
     * @param tomte a Tomte object
     */
    public static void makeHigherHierarchyList(Tomte tomte) {
        higherRanked.add(tomte.getBoss());
        if (!tomte.getBoss().equals(Tomtar.tomten)) {
            makeHigherHierarchyList(tomte.getBoss());
        }
    }

    /**
     * Makes the hierarchy in the downwards direction form the tomte it takes in.
     *
     * @param tomte a Tomte object
     */
    public static List<Tomte> makeLowerHierarchyList(Tomte tomte) {
        while (true) {
            lowerRanked.addAll(tomte.getWorkers());
            // makeLowerHierarchyList(); //Workers here ?
        }
    }

}