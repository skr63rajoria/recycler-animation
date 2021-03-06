package com.rajouriya.shubham.recyclerview_animation.model;

public class Country {
    private String countryName;
    private String capitalName;

    public Country(String countryName, String capitalName) {
        this.countryName = countryName;
        this.capitalName = capitalName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
}
