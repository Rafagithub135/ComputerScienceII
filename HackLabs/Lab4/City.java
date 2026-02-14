package HackLabs.Lab4;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private int population;

    public City(String n, int p) {
        this.name = n;
        this.population = p;
    }

    public String toString() {
        return String.format("City:  %s | Population: %d", this.name, this.population);
    }
}