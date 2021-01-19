/*
 * Created by Lukas Aronsson
 * Date: 15/01/2021
 * Time: 15:03
 * Project: Tomte-Hierarchy
 * Copyright: MIT
 */

import java.util.List;

/**
 * Class that holds the blueprints for a Tomte
 */
public class Tomte {
    private String name; //name of the Tomte
    private Tomte boss; //Tomtens boss
    private List<Tomte> workers; //list of the Tomtar that is directly under this tomte.

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

}
