package model;

import java.util.ArrayList;

public class Class {
    ArrayList<Groups> FinalGroup = new ArrayList<>();
    String class_name;
    public ArrayList<Groups> getFinalGroup() {
        return FinalGroup;
    }

    public void setFinalGroup(ArrayList<Groups> finalGroup) {
        FinalGroup = finalGroup;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }



    public Class(ArrayList<Groups> finalGroup, String class_name) {
        FinalGroup = finalGroup;
        this.class_name = class_name;
    }


}
