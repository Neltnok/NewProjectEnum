package com.company;

public enum Color {


    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green");

    String  name = "";


    Color(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name();
    }



}
