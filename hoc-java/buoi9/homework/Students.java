package homework;

import buoi7.homework7.Student;

public class Students {
    private int studentID;
    private String name;
    private int age;
    private String hocLuc;

    

    
    public Students(int studentID, String name, int age, String hocLuc) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.hocLuc = hocLuc;
    }

    @Override
    public String toString() {
        return "ID: " + studentID + "\nHo ten: " + name + ". Tuoi: " + age + ".\n Hoc luc: " + hocLuc ;
    }

    public void add(Students students) {
    }

    public int getID() {
        return studentID;
    }

    
    public String setHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }

}
