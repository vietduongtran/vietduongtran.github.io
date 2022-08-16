package buoi7.homework7;

import java.time.LocalDate;

public class Student extends User {
    String background;
    String isOnline;

public Student (String id, String name, Gender gender, String birthday, String email, String phoneNumber, String background, String isOnline) {
   super(id, name, gender, birthday, email, phoneNumber);
   this.background = background;
   this.isOnline = isOnline;
}

public void setIsOnline(String isOnline) {
    this.isOnline = isOnline;
}

public void getBackground(String background){
    this.background = background;
}

 // thêm thông tin của Student bằng cách Override
@Override
public String printResult() {

    String result = super.printResult() + " background: " + background + " Online: " + isOnline;

    return result;
}

public static void printInfo(Student student) {
    System.out.println(student.printResult());
}

}