/*
 * Created by Lukas Aronsson
 * Date: 15/01/2021
 * Time: 15:03
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 */

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Tomte {
    String name; //name of the Tomte
    Tomte boss = null; //Tomtens boss

    List<Tomte> workers = null; //list of the Tomtar that is directly under this tomte.

    List<Tomte> HigherRanked = null;
    List<Tomte> LowerRanked = null;

    public Tomte(String name, Tomte boss) {
        setName(name);
        setBoss(boss);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tomte getBoss() {
        return boss;
    }

    public void setBoss(Tomte boss) {
        this.boss = boss;
    }

    public List<Tomte> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Tomte> workers) {
        this.workers = workers;
    }

    public List<String> Hierarchy(String direction) {
        if (direction.equals("higher")) {
            return getNames(makeHigherHierarchyList());
        } else if (direction.equals("lower")) {
            System.out.println("That is currently not a feature...");
            //return getNames(makeLowerHierarchyList());
            return null;
        } else {
            System.out.println("Please input a valid direction");
            return null;
        }
    }

    public List<String> getNames(List<Tomte> tomtar) {

        return tomtar.stream()
                .map(Tomte::getName)
                .collect(Collectors.toList());
    }

    public List<Tomte> makeHigherHierarchyList() {
        while (!(boss == null)) {
            HigherRanked.add(getBoss());
            boss.makeHigherHierarchyList();
        }
        return HigherRanked;
    }

    public List<Tomte> makeLowerHierarchyList() {
        while (true) {
            LowerRanked.addAll(workers);
            makeLowerHierarchyList(); //Workers here ?
        }

    }
}
