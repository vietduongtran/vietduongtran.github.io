package buoi7.homework7;

import java.time.LocalDate;


public class Teacher extends User {
    int yearOfExperiences;
    String speciality;

public Teacher(String id, String name, Gender gender, String birthday, String email, String phoneNumber, int yearOfExperiences, String speciality) {
    super(id, name, gender, birthday, email, phoneNumber);
    this.yearOfExperiences = yearOfExperiences;
    this.speciality = speciality;
}


public void getYearOfExperiences(int yearOfExperiences) {
    this.yearOfExperiences = yearOfExperiences;
    
}

public void getSpeciality(String speciality) {
    this.speciality = speciality;
}

 // thêm thông tin của teacher bằng cách Override
@Override
public String printResult() {
    String result = super.printResult() + " yearOfExperiences: "
            + yearOfExperiences + " So nam kinh nghiem:" + " speciality:" + speciality;

    return result;
}

public static void printInfo(Teacher teacher) {
    System.out.println(teacher.printResult());
}
}
