package buoi3;

import java.text.BreakIterator;
import java.util.Scanner;

public class buoi3 {
    public static void main(String [] args) {

     //   double kg = 0.0;
    //  double height = 0.0;
    //    Scanner scanner = new Scanner(System.in);

    //    System.out.println("Nhap can nang: ");
    //    kg = scanner.nextDouble();
    //    scanner.nextLine();

    //    System.out.println("Nhap chieu cao: ");
    //    height = scanner.nextDouble();

    //    scanner.close();

    //    double BMI = (kg / (Math.pow(height, 2.0)));
    //    System.out.println("Chi so BMI cua ban la: " + BMI);

    //    if (BMI < 18.5) {
    //            System.out.println("Thieu can!");
            
    //        } else if (BMI <= 24.9) { 
    //            System.out.println("Can doi");
            
    //        } else if (BMI > 24.9) {
    //        System.out.println("Thua can");
    //    }


    // String season = new String("SUMMER");
    // switch (season) {
    //     case "SPRING": {
    //         System.out.println("Mua xuan!");
    //         break; 
    //     }
    //     case "SUMMER": {
    //         System.out.println("Mua he");
    //         break;
    //     }
    //     case "AUTUMN": {
    //         System.out.println("Mua thu");
    //         break;
    //     }
    //     case "Winter": {
    //         System.out.println("Mua dong");
    //         break;
    //     }
    //     default:
    //         System.out.println("Khong co mua nao ca");
    //         break;
    // }

    // Scanner scanner1 = new Scanner(System.in);
    // System.out.println();
    // int thang = scanner1.nextInt();
    // switch (thang) {
    //     case 1:
    //     case 3:
    //     case 5:
    //     case 7:
    //     case 8:
    //     case 10:
    //     case 12: {
    //         System.out.println("Thang" + thang + "Co 31 ngay");
    //         break;
    //     }
    
    //     case 2: {
    //         System.out.println("Thang " + thang + "Co 28 hoac 29 ngay");
    //     }

    //     case 4:
    //     case 6:
    //     case 9:
    //     case 11: {
    //         System.out.println("Thang" + thang + "Co 30 ngay");
    //     }

    //     default:
    //         break; 
    // }
    // }
    
    // for (int index = 10; index >= 0; index--) {
    //     System.out.println("vong la thu " + index);
    // }

    for (int index = 1; index < 10; index++) {
        System.out.println("vong lap: " + index);
        index = index + 2;
    }

    int count = 0;
    String text = "Toi la java coder";
    for (int index = 0; index <text.length(); index++) {
        // System.out.println("ky tu: " + text.charAt(index));
        char character = text.charAt(index);
        if (character == 'a') {
            System.out.println("ky tu A");
            count = count + 1;
        }
    }
        System.out.println("So ky tu A: " + count);

        for (int index = text.length() - 1; index >=0; index--) {
            char character = text.charAt(index);
            if (character == 'o') {
                System.out.println("O xuat hien o vi tri: " + index);
            }
        
        switch (character) {
            case 'a':
            case 'u':
            case 'i':
            case 'o':
            case 'e': {
                System.out.println("nguyen am " + character + "o vi tri thu " + (index));
                break;
            }
            default:

        }
        }

        int index = 0; 
        while (index < text.length()) {
            System.out.println("ky tu o vi tri " + index + " la " + text.charAt(index));
            index = index + 1;
        }

        index = text.length() -1;
        while (index >= 0) {
            System.out.println("index" + index + " ky tu " + text.charAt(index));
            index--;
        }

        // lam menu tren man hinh
        // nhan vao menu 1 so bat ky
        // exit
        // neu nhap vao 10 thi thoat
        // neu nhap vao so khac 10 thi cho user chon lai menu
        // neu nhap vao exit thi thoat

        // in ra tren man hinh cau hoi
        // hay nhap mot so bat ky
        // neu so nhap la so chan thi in ra
        // neu so nhap la si le thi yeu cau user nhap lai

        Scanner scanner = new Scanner(System.in);
        
        boolean isEven = false;
        do {
            System.out.println("Hay nhap 1 so bat ky: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber % 2 == 0) {
                System.out.println("ba da nhap dung");
                isEven = true;
            }

        } while(isEven == false);

        // scanner.close();

        // System.out.println("Hay nhap so: ");
        // isEven = false;
        // while(isEven == false) {

        //     int inputNumber = scanner.nextInt();
        //     if (inputNumber % 2 == 0) {
        //         System.out.println("ban da nhao dung");
        //         isEven = true;
        //     } else {
        //         System.out.println("Hay nhap 1 so bat ky: ");
        //     }
        //     scanner.close();
        // }

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == 'o') {
                System.out.println("ky tu O dau tien o: " + i);
                break;
            }
            System.out.println("ky tu " + character);

        }

        int j = 0;
        while (j < text.length()) {
            char character = text.charAt(j);
            if (character == 'o') {
                j++;
                continue;
            }
            System.out.println("ky tu " + character);
            j++;
        }

        while (true) {
            System.out.println("nhap so chan");
            int number = scanner.nextInt();
            if (number %2 == 0) {
                System.out.println(" ban nhap dung roi");
                break;
            }
        }
    }
}
