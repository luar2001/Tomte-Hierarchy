/*
 * Created by Lukas Aronsson
 * Date: 15/01/2021
 * Time: 15:03
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 */

import java.util.List;

/**
 *
 */
public class Tomte {
    String name = null; //name of the Tomte
    Tomte boss = null; //Tomtens boss

    List<Tomte> workers = null; //list of the Tomtar that is directly under this tomte.

    List<Tomte> HigherRanked = null;
    List<Tomte> LowerRanked = null;

    public Tomte(String name, Tomte boss, List<Tomte> workers) {
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

    public void Hierarchy(String direction) {


    }

    public List<Tomte> makeHigherHierarchyList() {
        while (!(boss == null)) {
            HigherRanked.add(getBoss());
            boss.makeHigherHierarchyList();
        }
        return HigherRanked;
    }

    public void makeLowerHierarchyList() {
        LowerRanked.addAll(workers);
        makeLowerHierarchyList(); //Workers here ?

    }
}
