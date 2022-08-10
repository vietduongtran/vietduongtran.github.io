package buoi5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class employee {
    
        public String id, resultName, ten;
        public LocalDate sinhNhat;
        public double luong;
        public Gender gender;
        public int birtYear, birthDay, birthMonth;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formate thời gian sang dd mm yy

    
        public employee(String id, String ten, String sinhNhat, double luong, Gender gender) {
            this.id = id;
            this.ten = ten;
            this.sinhNhat = LocalDate.parse(sinhNhat, formatter);
            this.luong = luong;
            this.gender = gender;
        }

        enum Gender {
            NAM,
            NU,
        }

        // tim nhan vien theo ID

        public boolean hasKeywordID(String keywordID) {
            boolean result = this.id.contains(keywordID);
            return result;
        }

        public boolean hasKeywordName(String keywordName) {
            boolean result = this.id.contains(keywordName);
            return result;
        }

        // tim nhan vien theo  

        // public static boolean hasKeywordName(String keywordName) {
        //     boolean resultName = this.ten.contains(keywordName);
        //     return resultName;
        // }

      
}

