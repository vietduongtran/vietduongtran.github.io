package buoi01;

public class homework01 {
    
    public static void main (String [] args) {

        System.out.println("Bai 1: Khi i=10, n=i++5% thi ket qua la");
        int i = 10;
        int n = (i++%5);
  
        System.out.println(i);
        System.out.println("va");
        System.out.println(n);

        System.out.println("con khi ++i%5:");
        int m = (++i%5);

        System.out.println(m);

        // bai 2 // 
        System.out.println("Bai 2: chuyen doi tu do F sang C: Vi du F la 40 do, thi C=");

        int F = 40;
        double C = ((F-32)/1.8000);

        System.out.println(C);

        // bai 3 //
        System.out.println("Bai 3:");
        double d = 9.0 / 5;
        System.out.println(d);  
        
        // bai 4 //
        int x = 145871;
        double y = 6.177;
        boolean c = true;

        System.out.println("Bai 4.1:");
        System.out.println(x > 0);

        System.out.println("Bai 4.2:");
        Boolean result2 = (x%y==0);
        System.out.println(result2);

        System.out.println("Bai 4.3:");
        Boolean result3 = (x > 2 && x < 15);
        System.out.println(result3);

        System.out.println("Bai 4.4:");
        Boolean result4 = (x < 5 && y < 5);
        System.out.println (result4);

        System.out.println("Bai 4.5:");
        Boolean result5 = (x < 10 && x > 30);
        System.out.println (result5);

        System.out.println("Bai 4.6:");
        System.out.println(c = x>=1000);

        System.out.println("Bai 4.7:");
        System.out.println(c = x>=100000 && x <= 999999);
    

    }
}
