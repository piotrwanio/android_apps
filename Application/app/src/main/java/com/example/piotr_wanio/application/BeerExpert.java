package com.example.piotr_wanio.application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotr_Wanio on 15.02.2018.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if(color.equals("bursztynowe")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
