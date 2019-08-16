package org.ohmstheresistance.gameonandroidchallenge.model;

public class Games {

    private String id;
    private String name;
    private String logo;

    public Games(String id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }
}

