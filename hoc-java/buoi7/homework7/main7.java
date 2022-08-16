package buoi7.homework7;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main7 {

    static Scanner scanner = new Scanner(System.in);

    static User [] user = new User[8];

    static Student [] student = new Student[6];

    static Teacher [] teacher = new Teacher[2];

    public static void main(String[] args) {
        

        student [0] = new Student("SV01", "Tran Van A", Gender.NAM, "20/11/2000", "tva@gmail.com", "+8417654123", "di lam", "Online");
        
        student [1] = new Student("SV02", "Nguyen Van B", Gender.NAM, "12/02/2001", "nvb@gmail.com", "+8490437589","di lam", "Online");
        
        student [2] = new Student("SV03", "Luong Thi C", Gender.NU, "06/12/2002", "ltc@gmail.com", "+841893928","di hoc", "Online");

        student [3] = new Student("SV04", "Nguyen Thi D", Gender.NU, "30/01/2001", "ntd@gmail.com", "+84425366", "di hoc", "Online");

        student [4] = new Student("SV05", "Dang Van E", Gender.NAM, "21/07/1999", "dve@gmail.com", "+841648456", "di lam", "Offline");

        student [5] = new Student("SV06", "Dao Thi F", Gender.NU, "16/09/2000", "dtf@gmail.com", "+8423645756", "di lam", "Offline");
        

        // cho Student vào array và superclass lại
        for (int i = 0; i < 6; i++) {
            user[i] = (User) student[i];     
        }

        teacher [0] = new Teacher("GV01", "Cao Van G", Gender.NAM, "28/11/1992", "cvg@gmail.com", "+84425367", 20, "Everything");

        teacher [1] = new Teacher("GV02", "Vu H", Gender.NU, "20/11/1978", "vh@gmail.com", "+84154325366", 5, "Something");

        // cho Teachers vào array và superclass lại, sắp xếp sau student 

        for (int i = 0; i < 2; i++) {
            user[i + 6] = (User) teacher[i];

        }
        
        printInfo();

        findKeyword();

        arrangeName();

        
     
    }
        //Chỉ dùng 1 mảng để lưu các đối tượng trên (printInfo)

        public static void printInfo() {
            for (User printUser : user) {
                User.printInfo(printUser);
            }
        }
        

        // tìm theo keyword

      

        public static void findKeyword() {
            System.out.println("Tim theo keyword: ");
            Scanner scanner = new Scanner(System.in);
            String keyword = scanner.nextLine();

            for (User printUser : user) {
                    User.hasKeyWord(keyword, printUser);
            }

            scanner.close();
    }


    public static void arrangeName() {
       
        System.out.println("Arrange names (A-Z): ");


        String userName[] = new String[8];
        for (int i = 0; i < 8; i++) {
                userName[i] = user[i].name; // Choose all names
        }
        
        Arrays.sort(userName); // Sort names
        for (int i = 0; i < 8; i++) { 
                for (int j = 0; j < 8; j++) { 
                        if (userName[i] == user[j].name) {
                                System.out.println(user[j].name);
                                User.printInfo(user[j]);
                        }
                }
        }
}
    
}


