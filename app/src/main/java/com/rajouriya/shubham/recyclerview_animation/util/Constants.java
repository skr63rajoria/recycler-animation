package com.rajouriya.shubham.recyclerview_animation.util;

import com.rajouriya.shubham.recyclerview_animation.model.Country;

import java.util.ArrayList;

public class Constants {

    public static ArrayList<Country> getCountryList(){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("India","New Delhi"));
        countries.add(new Country("USA","WASHINGTON, D.C"));
        countries.add(new Country("AUSTRALIA","CANBERRA"));
        countries.add(new Country("UKRAINE","KIEV"));
        countries.add(new Country("UGANDA","KAMPALA"));
        countries.add(new Country("SWITZERLAND","BERN"));
        countries.add(new Country("SWEDEN","STOCKHOLM"));
        countries.add(new Country("SINGAPORE","SINGAPORE"));
        countries.add(new Country("SPAIN","MADRID"));
        countries.add(new Country("SOUTH KOREA","SEOUL"));
        countries.add(new Country("TURKEY","ANKARA"));
        countries.add(new Country("UNITED KINGDOM","LONDON"));
        countries.add(new Country("NEW ZEALAND","WELLINGTON"));
        countries.add(new Country("UNITED KINGDOM","LONDON"));
        countries.add(new Country("NETHERLANDS","AMSTERDAM"));
        return countries;
    }

}
