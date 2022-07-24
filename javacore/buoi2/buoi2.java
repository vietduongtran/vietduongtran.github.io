package buoi2;

public class buoi2 {
    public static void main(String[] args) {
        
        String s1 = "cat";
        System.out.println(s1);

        String s2 = "cat";
        System.out.println(s2);

        String s3 = new String("cat"); 
        System.out.println(s3);

        String s4 = new String("cat");
        System.out.println(s4);
        
        String s5 = "dog";
        System.out.println(s5);

        String s6 = new String("dog");
        System.out.println(s6);

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
        System.out.println(s5==s6);

        System.out.println(s3.equals(s4));
        // .equals - so sánh giá trị (value); !! dùng equals trên string
        // == so sánh tổng thể trong pool; new String ("")

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s1));
        System.out.println(s1.equals(s2));

        String txt = "Toi la coder";
        //chieu dai
        System.out.println("length: " + txt.length());
        //chuyen thanh chu hoa
        System.out.println("chu hoa: " + txt.toUpperCase());
        //chuyenh thanh chu thuong
        System.out.println("chu thuong: " + txt.toLowerCase());
        

        char ch = txt.charAt(5);
        System.out.println("ky tu: " + ch);

        //tim chu o

        int firstIndex = txt.indexOf("o");
        System.out.println(firstIndex);

        int lastIndex = txt.lastIndexOf("o");
        System.out.println("lastIndex: " + lastIndex);

        firstIndex = txt.indexOf("k");
        System.out.println("first index: " + firstIndex);

        String subString = txt.substring(1);
        System.out.println("substring: " + subString);
        subString = txt.substring(1, 8);
        System.out.println("substring 2: " + subString);

        int index = txt.indexOf("la");
        System.out.println(index);


        

    }
    
}
