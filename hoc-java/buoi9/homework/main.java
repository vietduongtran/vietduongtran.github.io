package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        // use scanner to make student list
        
        Scanner scanner = new Scanner(System.in);
        Students student1 = new Students(1, "Mr.A", 19, "Good");
        Students student2 = new Students(2, "Mrs.B", 19, "Excellent");
        Students student3 = new Students(3, "Mr.C", 19, "Great");
        Students student4 = new Students(4, "Mrs.D", 19, "Good");
        Students student5 = new Students(5, "Mr.E", 19, "So so");
        Students student6 = new Students(6, "Mr.O", 19, "Good");

        // add student to List

        List<Students> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);


    // create teacher and admin

    Workers admin = new Workers("LTH", "Admin");
    Workers teacher = new Workers("ABC", "Giao vien");
    // create class of Techamster

    TechClass classTech = new TechClass("Lop Java", studentList);

    Techmaster techmaster = new Techmaster(admin, teacher, classTech);
    
    System.out.println(techmaster.toString());

    // add new Student
        System.out.println("======================================");
    System.out.println("Them hoc vien moi");
    System.out.println("Nhap ten hoc vien: ");

    String newStudentName = scanner.nextLine();
    int newStudentID;
   
    //create unique ID , if ID unavaible - return
    System.out.println("Hay nhap ID hoc vien moi: ");
            while (true) {
                newStudentID = scanner.nextInt();
                if (techmaster.ID(newStudentID) == false) {
                    break;
                }
            }
    
    System.out.println("Hay nhap tuoi: ");
    int ageNewStudent = scanner.nextInt();
    
    System.out.println("Hay nhap trinh do (Good, Excellent, So So): ");
    String hocLucNewStudent = scanner.next();

    Students newStudent = new Students(newStudentID, newStudentName, ageNewStudent, hocLucNewStudent);
    techmaster.addStudent(newStudent);
    System.out.println(techmaster.toString() + newStudent);

    // find student by id, then change hocLuc of student

    System.out.println("Tim hoc vien (theo ID): ");
    int findStudentID = scanner.nextInt();
    Students hocLucNew = techmaster.findID(findStudentID);

    System.out.println("Thay hoc luc cua sinh vien (good, excellent, so-so): ");
    String setHocLucNew = scanner.next();
    hocLucNew.setHocLuc(setHocLucNew);
    System.out.println(techmaster.toString() + newStudent);

    // delete student from list by remove (find by id)

    System.out.println("Xoa hoc vien khoi danh sach theo ID. Nhap ID: ");
    int deleteStudentID = scanner.nextInt();
    Students removeStudent = techmaster.findID(deleteStudentID);
    studentList.remove(removeStudent);
    System.out.println(techmaster.toString() + newStudent);
}
}
