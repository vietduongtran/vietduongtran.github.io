package buoi4;

import java.util.Scanner;

// import java.util.Scanner;

public class homework41 {
    public static void main(String[] args) {

    public static void bai1() {
        
        int height;
        int width;

        ///////// bai 1

    // tao hinh vuong 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tạo hình vuông với *");
         
        // set width=height cho hình vuông
        System.out.printf("\n\nNhập chiều cao và chiều rộng cho hình vuông: ");
        height = width = scanner.nextInt();
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        //tao hinh tam giac voi chieu cao nhap

        System.out.println("Tạo hình tam giác với *");

        System.out.printf("\n\nNhập chiều cao cho hình tam giác: ");
        height = scanner.nextInt();
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

        /////////// bai 2
        public static void bai2() {
// Cho chuỗi sau : You only live once, but if you do it right, once is enough

// Thực hiện:

// Đếm số từ trong chuỗi
// Đếm và in ra index của các ký tự o

String str = "You only live once, but if you do it right, once is enough\n";
System.out.println("Quote: " + str);

// Dem so tu trong chuoi, dung regex chon " "
String[] array = str.split(" ");
System.out.println("Số từ trong chuỗi là: " + array.length);

// Chon thu tu 'o' dau tien va cuoi cung
int index = str.indexOf('o');
int lastIndex = str.lastIndexOf('o');


// In 'o' dau tien
int num = 1;
System.out.println("So thu tu cua 'o': " + num);

  // Dem + in 'o' tiep theo
do {
  index = str.indexOf('o', index + 1);
  System.out.println("So thu tu cua 'o': " + index);
  num = num + 1;

// Den 'o' cuoi cung - stop
} while (index != lastIndex);

// Tinh tong 'o'
System.out.println("Tong ky tu 'o' = " + num + "\n");
        }


    ////////// bai3
    
    public static void bai3() {
        // chon so random qua math

int randomNum = (int) (Math.random() * 100);
System.out.println("So ngau nhien = " + randomNum);
System.out.println(isPrimeNumber(randomNum) + "\n");
    
}
public static boolean isPrimeNumber(int n) {
    if (n < 2) {
    return false;
    }
    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
    if (n % i == 0) {
    return false;
    }
    }
    return true;
}

public static void bai4() {
    // Viết chương trình thực hiện:

// Liệt kê 10 số nguyên tố đầu tiên
// Liệt kê các số nguyên tố nhỏ hơn 10

Scanner scanner = new Scanner(System.in);
 
// liet ke muon tim bao nhieu so nguyen to

        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("%d so nguyen to dau tien la: \n", n);
        int count = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while  (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
             count++;
            }
            i++;
        }
        scanner.close();
    }
 
         public static boolean isPrime(int n) {
                // so nguyen n < 2 khong phai la so nguyen to
                if (n < 2) {
                    return false;
                }
                // check so nguyen to khi n >= 2
                int squareRoot = (int) Math.sqrt(n);
                for (int i = 2; i <= squareRoot; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return false;
                 
            }

        }
   
    