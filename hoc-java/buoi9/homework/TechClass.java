package homework;

import java.util.ArrayList;
import java.util.List;

public class TechClass {
    private String subject;
    List<Students> students = new ArrayList<>();

    public TechClass(String subject, List<Students> students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nCac sinh vien: " + students + ".\n Mon hoc:" + subject + ".";
    }

    
    // add student to class via add
    public void addStudent(Students students) {
    }

    public boolean ID(int usedStudentID){
        boolean isBoolean = false;
        for (Students temp : students) {
            if (temp.getID() == usedStudentID ) {
                isBoolean = true;
            }
        }
        return isBoolean;
    }
    
    // find student by id
    public Students findID(int usedStudentID){
        Students findStudentID = null;
        for (Students temp : students) {
            if (temp.getID() == usedStudentID) {
                findStudentID = temp;
            }
        }
        return findStudentID;
       } 
}
