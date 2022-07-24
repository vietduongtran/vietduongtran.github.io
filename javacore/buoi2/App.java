package buoi2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

        public class App {
            public static void main(String[] args) {
                LocalDateTime currentTime = LocalDateTime.now();
                System.out.println(currentTime);

                LocalDate Birthday = LocalDate.of(1997, 11, 7);
                System.out.println("Ngay sinh nhat: " + Birthday);

                LocalDate currentDate = LocalDate.now();

                //tinh ra tuoi

                int birthdayYear = Birthday.getYear();
                int currentYear = currentDate.getYear();

                int age = currentYear - birthdayYear;
                System.out.println("tuoi: " + age);

                int month = Birthday.getMonthValue();
                System.out.println("month " + month);

                int day = Birthday.getDayOfMonth();
                System.out.println("day:  " + day);

                LocalDate newDate = Birthday.plusDays(177);
                System.out.println(newDate);

                System.out.println(Birthday.isLeapYear());

                System.out.println(Birthday.minusMonths(11));

                LocalTime startTime = LocalTime.of(8, 12, 54);

                LocalTime newTime = startTime.minusMinutes(30);
                System.out.println(newTime);

                LocalDateTime birthTime = LocalDateTime.of (
                                                            LocalDate.of(1988, 2, 11),
                                                            LocalTime.of(4, 15, 30)
                                                            );
                System.out.println(birthTime);

                boolean compareResult = currentTime.isEqual(birthTime);
                System.out.println("is equal: " + compareResult);

                boolean isAfter = currentTime.isAfter(birthTime);
                System.out.println("is After: " + isAfter);

                boolean isBefore = currentTime.isBefore(birthTime);
                System.out.println("is Before: " + isBefore);

                //muc tieu: hien thi ngay theo dang nam/thang/ngay, gio theo dang gio-pphut-giay

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd E W hh:mm:ss.SSS");
                String display = formatter.format(birthTime);
                System.out.println("hien thi: " + display);


                /////// SCANNER /////////////

                Scanner scanner = new Scanner(System.in);
                System.out.println("Hay nhap so nguyen ");
                int intNumber;
                intNumber = scanner.nextInt();
                //them 1 dong o Terminal viet duoc
                System.out.println("ban da nhap: " + intNumber);
                scanner.nextLine();

                System.out.println("Hay nhap textto ");
                String inputText;
                inputText = scanner.nextLine();
                System.out.println("ban da nhap: " + inputText);
                scanner.nextLine();
                
                System.out.println("hay nhap so tu ban phim:");
                int number = scanner.nextInt();

                int randNumber = (int)(Math.random() * 100);

                System.out.println("random number: " + randNumber);

                String compare = number > randNumber ? "so nhap tu ban phim lon hon" : "so nhap tu ban phim nho hon";

                System.out.println("so sanh: " + compare);

                scanner.close();

                String text = "Toi la \"la\" coder";
                System.out.println(text);
            }   

        }
        
