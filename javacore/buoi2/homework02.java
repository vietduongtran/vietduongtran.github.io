package buoi2;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.text.ParseException;
import java.text.DateFormat;

public class homework02 {
    public static void main(String[] args) {
        String letter = "Thân gửi các bạn,\nDưới đây là câu nói nổi tiếng\n \t \"A journey of a thousand miles begins with a single step\" \nNó có nghĩa là \n \t \"Hành trình ngàn dặm bắt đầu từ một bước chân\" \nChúc các bạn thành công !!!";
        System.out.println(letter);

        //// Bai 2 /////

        double distant = 0.0;
        String startTimeString = "";
        String finishTimeString = "";
        Scanner scanner = new Scanner(System.in);
           // nhập khoảng cách từ bàn phím, gán vào biến distant

        System.out.println("Nhap khoang cach: ");
        distant = scanner.nextDouble();
        scanner.nextLine();

        // nhập thời gian bắt đầu, gán vào biên startTimeStr
        System.out.println("Nhap thoi gian bat dau (yyyy-MM-dd HH:mm:ss): ");
        startTimeString = scanner.nextLine();

        System.out.println("Nhập thời gian kết thúc (yyyy-MM-dd HH:mm:ss): ");
        finishTimeString = scanner.nextLine();

        scanner.close();

        // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.parse(startTimeString, formatter);
        LocalDateTime finishTime = LocalDateTime.parse(finishTimeString, formatter);

        Duration duration = Duration.between(startTime, finishTime);
        // Tính và in ra thời gian chạy của bạn
        System.out.printf("Thời gian chạy %s phút\n", duration.toMinutes());
        // Tính và in ra vận tốc trung bình của bạn (km/h)
        System.out.printf("Vận tốc trung bình %s km/h\n", (distant / (duration.toMinutes()/60)));
   
    }

    
}

