package model;

public class Student {
    String Name;
    int Roll_no;
    String Gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }



    public Student(String name, int roll_no, String gender) {
        Name = name;
        Roll_no = roll_no;
        Gender = gender;
    }



}
