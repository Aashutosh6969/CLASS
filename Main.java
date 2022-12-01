import model.Class;
import model.Groups;
import model.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student1 = new Student("Ankit",23006,"Male");
        Student student2 = new Student("Biplop",23006,"Male");
        Student student3 = new Student("Aswin",23006,"Male");
        Student student4 = new Student("Anshu",23006,"female");
        Student student5 = new Student("Bikarsha",23006,"Male");
        Student student6 = new Student("Aashraya",23006,"Male");
        Student student7 = new Student("Aashutosh",23006,"Male");
        Student student8 = new Student("Shreebhisa",23006,"female");
        Student student9 = new Student("Aaditya",23006,"Male");
        Student student10 = new Student("Prasoon",23006,"Male");
        Student student11= new Student("Sambridhi",23006,"Male");
        Student student12 = new Student("Ishan",23006,"Male");

        ArrayList<Student> groupA = new ArrayList<>();
        groupA.add(student1);
        groupA.add(student2);
        groupA.add(student3);
        groupA.add(student4);

        ArrayList<Student> groupB = new ArrayList<>();
        groupB.add(student5);
        groupB.add(student6);
        groupB.add(student7);
        groupB.add(student8);

        ArrayList<Student> groupC = new ArrayList<>();
        groupC.add(student9);
        groupC.add(student10);
        groupC.add(student11);
        groupC.add(student12);

        Groups grp_A = new Groups(groupA,"A");
        Groups grp_B = new Groups(groupB,"B");
        Groups grp_C = new Groups(groupC,"C");

        ArrayList<Groups> newGroup = new ArrayList<>();
        newGroup.add(grp_A);
        newGroup.add(grp_B);
        newGroup.add(grp_C);

        Class section = new Class(newGroup,"Lobuche");
    }
}