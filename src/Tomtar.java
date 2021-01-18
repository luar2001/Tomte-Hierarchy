/*
 * Created by Name Here
 * Date: 16/01/2021
 * Time: 22:39
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that when initialized will create all the tomtar.
 * give them a boss,workers and a name
 */
public class Tomtar {


        /*
        List<Tomte> workersTomten;
        List<Tomte> workersGlader;
        List<Tomte> workersButter;
        List<Tomte> workersTroger;
        List<Tomte> workersBlyger;
        List<Tomte> workersTrotter;
        List<Tomte> workersRadjuret;
        List<Tomte> workersNyckelpigan;
        List<Tomte> workersRaven;
        List<Tomte> workersHaren;
        List<Tomte> workersSkumtomten;
        List<Tomte> workersGrasuggan;
        List<Tomte> workersMyran;
        List<Tomte> workersDammrattan;
        List<Tomte> workersBladlusen;
        */

    static Tomte tomten = new Tomte("Tomten", null);
    static Tomte glader = new Tomte("Glader", tomten);
    static Tomte butter = new Tomte("Butter", tomten);
    static Tomte troger = new Tomte("Tröger", glader);
    static Tomte blyger = new Tomte("Blyger", glader);
    static Tomte trotter = new Tomte("Trötter", glader);
    static Tomte radjuret = new Tomte("Rådjuret", butter);
    static Tomte nyckelpigan = new Tomte("Nyckelpigan", butter);
    static Tomte raven = new Tomte("Räven", butter);
    static Tomte haren = new Tomte("Haren", butter);
    static Tomte skumtomten = new Tomte("Skumtomten", trotter);
    static Tomte grasuggan = new Tomte("Gråsuggan", raven);
    static Tomte myran = new Tomte("Myran", raven);
    static Tomte dammrattan = new Tomte("Dammråttan", skumtomten);
    static Tomte bladlusen = new Tomte("Bladlusen", myran);

    static List<Tomte> listOfTomtar = Arrays.asList(tomten, glader, butter, troger, blyger, trotter, radjuret, nyckelpigan, raven, haren, skumtomten, grasuggan, myran, dammrattan, bladlusen);

    /**
     * Checks if the name parameter is equal to any of the names of the tomtar and then returns a list of them.
     *
     * @param name name of one of the tomtar hopefully
     * @return returns a list of Tomte Objects
     */
    public static List<Tomte> selectTomte(String name) {
        try {
            return listOfTomtar.stream()
                    .filter(tomte -> tomte.getName().toLowerCase().equals(name))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * a method that calls for the selectTomte method and sends back the first value in the list it gets from selectTomte
     *
     * @param name name of one of the tomtar hopefully
     * @return returns a Tomte Object
     */
    public static Tomte selectedTomte(String name) {
        List<Tomte> tomte = selectTomte(name);
        assert tomte != null;
        return tomte.get(0);
    }
}
