/*
 * Created by Name Here
 * Date: 16/01/2021
 * Time: 22:39
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 */

/**
 * Class that when initialized will create all the tomtar.
 * give them a boss,workers and a name
 */
public class CreateTomtar {

    public CreateTomtar() {

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


        Tomte tomten = new Tomte("Tomten", null);
        Tomte glader = new Tomte("Glader", tomten);
        Tomte butter = new Tomte("Butter", tomten);
        Tomte troger = new Tomte("Tröger", glader);
        Tomte blyger = new Tomte("Blyger", glader);
        Tomte trotter = new Tomte("Trötter", glader);
        Tomte radjuret = new Tomte("Rådjuret", butter);
        Tomte nyckelpigan = new Tomte("Nyckelpigan", butter);
        Tomte raven = new Tomte("Räven", butter);
        Tomte haren = new Tomte("Haren", butter);
        Tomte skumtomten = new Tomte("Skumtomten", trotter);
        Tomte grasuggan = new Tomte("Gråsuggan", raven);
        Tomte myran = new Tomte("Myran", raven);
        Tomte dammrattan = new Tomte("Dammråttan", skumtomten);
        Tomte bladlusen = new Tomte("Bladlusen", myran);

    }
}
