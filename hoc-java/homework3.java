import java.util.Scanner;

public class homework3 {

    public static void main(String[] args) {

        // bai 1
            
        // Scanner scanner = new Scanner(System.in);
        // int number, sum = 0, i = 1;

        // System.out.println("Nhap nguyen so: ");
        // number = scanner.nextInt(); 

        // while (number > sum) {
        //     for (number = 1; i <= number; i++ );
        // }
        // System.out.println("Tong tu" + i + " -> " + number + ": " + sum);

        // scanner.close();

        
       // bai 2

    //     int primeCount = 0;
    //     int primeTotal = 0;
    //     int num = 0;
    //     boolean isPrime = true;
    //     while (primeCount < 100) {
    //       num++;
    //       if (num < 2) {
    //         isPrime = false;
    
    //       } else if (num == 2) {
    //         primeCount = 1;
    //         primeTotal = primeTotal + num;
          
    //       } else if (num > 2) {
    //         for (int i = 2; i < num; i++) {
    //           int temp = num % i;
    //           if (temp == 0) {
    //             break;
    //           }
    
    //           if (primeCount < 100 && temp != 0 && i == num - 1) {
    //             primeCount++;
    //             primeTotal = primeTotal + num;
    
    //           }
    //     }
    //     System.out.println("Tong 100 so nguyen to dau tien la: " + primeTotal);
    //   }
    //     }

        // bai 3
    //     int positiveNumber;
    //     int digitSum = 0;
    //     int so;

    //        // can lam gi?
    //        Scanner scanner = new Scanner(System.in);
    //        System.out.println("Nhap so nguyen duong: ");
    //        positiveNumber = scanner.nextInt();

    //         do
    //         {
    //             System.out.println("Nhap lai, so nguyen duong >0 ");
    //             System.out.println("Nhap so nguyen duong: ");
    //             positiveNumber = scanner.nextInt();
    //         }
    //         while (positiveNumber < 0);
           
    //         so = positiveNumber;
    //         while (so != 0)
    //         {
    //             digitSum = digitSum + so%10;
    //             so = so / 10;
    //         }
    //         System.out.println("Tong cac chu so = " + digitSum);
    //         scanner.close();

        // // bai 4

        //     int numberMulti;
        //     int num2;

        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("Chon so: ");
        //     numberMulti = scanner.nextInt();

         

        //     for (num2 = 1; num2 <= 10; num2++) 
        //     {
        //         int sum = (numberMulti)*(num2);
        //         System.out.println(numberMulti + " * " + num2 + " = " + sum);
        //     }


        // bai 5

        //     String str, reverse="";

        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("Nhap 1 cau bat ky: ");
        //     str = scanner.nextLine();

        //     int length = str.length();
        //     for(int i=length-1; i >= 0; i--)
        //     reverse=reverse + str.charAt(i);
        //   System.out.println("Reverse string: "+ reverse);


        // bai 6

    //     String str;
    //     String newStr = "";

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Input a sentence: ");
    //     str = scanner.nextLine();
            
    //     for (int i = 1; i < str.length(); i++)
        
    //     if (" ".equals(str.substring(i-1, i)))
    //     newStr = newStr + str.substring(i, i+1).toUpperCase();
    //     else
    //     newStr = newStr + str.substring(i, i+1);
    //     {
    //         System.out.println("First letter uppercase: " + newStr);
    //     }

        // bai 7

    //     int second;

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Input seconds: ");
    //     second = scanner.nextInt();

    //     long hour = second / 3600,
    //     min = second / 60 % 60,
    //     sec = second / 1 % 60;
       
    //    String.format("%02d:%02d:%02d", hour, min, second);

    //     System.out.printf("Thoi gian la: " + "%02d:%02d:%02d", hour, min, sec);

    // bai 8

    Scanner scanner = new Scanner(System.in);
    System.out.println("Original String: ");
    String str = scanner.nextLine();
    boolean check = true;

    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      for(int j = i + 1; j < str.length(); j++){     
        if(check == false){
          check = false;
          break;
        }
        if (character != str.charAt(j)) {
          check = true;
          
        }else{
          check = false;
          break;
        }
     
      }
    }
  System.out.println("Result String : " + check);
}
}
        
    
