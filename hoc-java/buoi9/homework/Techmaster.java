package homework;

import java.util.List;

public class Techmaster {
    
    Workers admin;
    Workers teacher;
    TechClass classTech;
    Techmaster techMaster;
   
    public Techmaster(Workers admin, Workers teacher, TechClass classTech) {
        this.admin = admin;
        this.teacher = teacher;
        this.classTech = classTech;
    }

    @Override
    public String toString() {
        return "Nhan su cua Techmaster: \nQuan ly: " + admin + teacher +  ".\n Lop hoc: " + classTech + ".";
    }

    // add students

    public Techmaster addStudent(Students students) {
        classTech.addStudent(students);
        return this.techMaster;
        
    }

    public boolean ID (int usedStudentID) {
        boolean isBoolean = classTech.ID(usedStudentID);
        return isBoolean;
    }

    public Students findID (int usedStudentID){
        Students studentByID = classTech.findID(usedStudentID);
        if (studentByID == null) {
            System.out.println("Hoc vien voi ID nay khong ton tai.");
        } else {
            System.out.println((studentByID.toString()));
        }
        return studentByID;
        }
    }

