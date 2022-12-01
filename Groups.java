package model;

import java.util.ArrayList;

public class Groups {
    ArrayList<Student> MainGroup = new ArrayList<>();
    String group_name;
    public ArrayList<Student> getMainGroup() {
        return MainGroup;
    }

    public void setMainGroup(ArrayList<Student> mainGroup) {
        MainGroup = mainGroup;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }


    public Groups(ArrayList<Student> mainGroup, String group_name) {
        MainGroup = mainGroup;
        this.group_name = group_name;
    }


}
