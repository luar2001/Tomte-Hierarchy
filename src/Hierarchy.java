import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lukas Aronsson
 * Date: 18/01/2021
 * Time: 16:27
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 **/
public class Hierarchy {

    private static final List<Tomte> higherRanked = new ArrayList<>();
    private static final List<Tomte> lowerRanked = new ArrayList<>();

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

    public static List<String> getNames(List<Tomte> tomtar) {
        return tomtar.stream()
                .map(Tomte::getName)
                .collect(Collectors.toList());
    }

    public static void makeHigherHierarchyList(Tomte tomte) {

        higherRanked.add(tomte.getBoss());
        if (!tomte.getBoss().equals(Tomtar.tomten)) {
            makeHigherHierarchyList(tomte.getBoss());
        }
    }

    public static List<Tomte> makeLowerHierarchyList(Tomte tomte) {
        while (true) {
            lowerRanked.addAll(tomte.getWorkers());
            // makeLowerHierarchyList(); //Workers here ?
        }
    }

}