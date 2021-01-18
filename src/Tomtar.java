/*
 * Created by Name Here
 * Date: 16/01/2021
 * Time: 22:39
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that when initialized will create all the tomtar.
 * give them a boss,workers and a name
 */
public class Tomtar {

    private static final List<Tomte> workersTroger = Collections.singletonList(null);
    private static final List<Tomte> workersBlyger = Collections.singletonList(null);
    private static final List<Tomte> workersRadjuret = Collections.singletonList(null);
    private static final List<Tomte> workersNyckelpigan = Collections.singletonList(null);
    private static final List<Tomte> workersHaren = Collections.singletonList(null);
    private static final List<Tomte> workersGrasuggan = Collections.singletonList(null);
    private static final List<Tomte> workersDammrattan = Collections.singletonList(null);
    private static final List<Tomte> workersBladlusen = Collections.singletonList(null);
    public static Tomte tomten = new Tomte("Tomten", null);
    public static Tomte glader = new Tomte("Glader", tomten);
    public static Tomte butter = new Tomte("Butter", tomten);
    private static final List<Tomte> workersTomten = Arrays.asList(glader, butter);
    public static Tomte troger = new Tomte("Tröger", glader);
    public static Tomte blyger = new Tomte("Blyger", glader);
    public static Tomte trotter = new Tomte("Trötter", glader);
    private static final List<Tomte> workersGlader = Arrays.asList(troger, blyger, trotter);
    public static Tomte radjuret = new Tomte("Rådjuret", butter);
    public static Tomte nyckelpigan = new Tomte("Nyckelpigan", butter);
    public static Tomte raven = new Tomte("Räven", butter);
    public static Tomte haren = new Tomte("Haren", butter);
    private static final List<Tomte> workersButter = Arrays.asList(radjuret, nyckelpigan, raven, haren);
    public static Tomte skumtomten = new Tomte("Skumtomten", trotter);
    private static final List<Tomte> workersTrotter = Collections.singletonList(skumtomten);
    public static Tomte grasuggan = new Tomte("Gråsuggan", raven);
    public static Tomte myran = new Tomte("Myran", raven);
    public static Tomte dammrattan = new Tomte("Dammråttan", skumtomten);
    private static final List<Tomte> workersSkumtomten = Collections.singletonList(dammrattan);
    public static Tomte bladlusen = new Tomte("Bladlusen", myran);
    private static final List<Tomte> workersRaven = Arrays.asList(grasuggan, myran, bladlusen);
    private static final List<Tomte> workersMyran = Collections.singletonList(bladlusen);
    public static List<Tomte> listOfTomtar = Arrays.asList(tomten, glader, butter, troger, blyger, trotter, radjuret, nyckelpigan, raven, haren, skumtomten, grasuggan, myran, dammrattan, bladlusen);

    /**
     * Method that sets the Tomtars Workers aka the tomtar directly under the tomte in the Hierarchy
     */
    public static void setWorkers() {
        tomten.setWorkers(workersTomten);
        glader.setWorkers(workersGlader);
        butter.setWorkers(workersButter);
        troger.setWorkers(workersTroger);
        blyger.setWorkers(workersBlyger);
        trotter.setWorkers(workersTrotter);
        radjuret.setWorkers(workersRadjuret);
        nyckelpigan.setWorkers(workersNyckelpigan);
        raven.setWorkers(workersRaven);
        haren.setWorkers(workersHaren);
        skumtomten.setWorkers(workersSkumtomten);
        grasuggan.setWorkers(workersGrasuggan);
        myran.setWorkers(workersMyran);
        dammrattan.setWorkers(workersDammrattan);
        bladlusen.setWorkers(workersBladlusen);

    }

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
