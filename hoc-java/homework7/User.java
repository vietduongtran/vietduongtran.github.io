package homework7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum Gender {
    NAM,
    NU
}

public class User {
    protected String id;
    protected String name;
    protected Gender gender;
    protected LocalDate birthday;
    protected String email;
    protected String phoneNumber;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
    public User(String id, String name, Gender gender, String birthday, String email, String phoneNumber){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = LocalDate.parse(birthday, formatter);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String printResult() {
        String result = "id: " + this.id + " name: " + this.name + " gender: " + this.gender + " birthday: " + this.birthday + " email: " + email + " phoneNumber: " + phoneNumber;
        return result;
    }

    public static void printInfo(User printUser) {
        System.out.println(printUser.printResult());
    }

    // tìm theo keyword tên/mail/sdt
    public static void hasKeyWord(String keyword, User user) {

        //chọn theo tên hoặc sđt hoặc email
        if ((user.name).contains(keyword) || (user.phoneNumber).contains(keyword) || (user.email).contains(keyword)) {
            printInfo(user);
        }

    //sắp xếp theo tên A-Z

}

}