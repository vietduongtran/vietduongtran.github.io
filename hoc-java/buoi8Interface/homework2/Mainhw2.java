package homework2;

import java.util.Scanner;

public class Mainhw2 {
    public static void main(String[] args) {
        
        // tao scanner de nhap du lieu moi
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so tien nap: ");
        double rechargeNum = scanner.nextDouble();    
       
        System.out.println("Nhap email moi: ");
        String newEmail = scanner.next();
        
        Account account = new Account(rechargeNum, newEmail);
        account.setName("Le Van A");
        account.setAccountNumber(66668888);
        account.setEmail("levana@gmail.com");
        account.setAccountBalance(26266.12);

 
        account.recharge();
        account.changeEmail();
        System.out.println("=================================");
        account.displayInfo();

        scanner.close();
    }

}
