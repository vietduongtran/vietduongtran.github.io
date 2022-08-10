package buoi5oop;

import java.util.Scanner;

public class Lab5 {
    
    public static void main(String[] args) {

        Book [] bookList = new Book[5];

        bookList[0] = new Book("Book1", 
                              "Toan", 
                               "Tran Van A", 
                              "theLoai1", 
                                "nhaXB1", 
                                1992);

        bookList[1] = new Book("Book2", 
                              "Ly", 
                               "Nguyen Thi C", 
                              "theLoai2", 
                                "nhaXB2", 
                                1994);

        bookList[2] = new Book("Book3", 
                              "Hoa", 
                               "tacGia3",
                              "theLoai3", 
                                "nhaXB3", 
                                2002);

        bookList[3] = new Book("Book4", 
                              "Sinh hoc",
                               "Hoang Van S", 
                              "theLoai4", 
                                "nhaXB4", 
                                1499);

        bookList[4] = new Book("Book5", 
                              "Vat ly", 
                               "T A V", 
                              "theLoai5", 
                                "nhaXB5", 
                                2011);

        // bookList[5] = new Book("Book6", 
        //                       "Gi gi do", 
        //                        "C S S", 
        //                       "theLoai6", 
        //                         "nhaXB6", 
        //                         2021);

        for (Book book : bookList) {
            System.out.println(book.tenSach);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu khoa ten sach: ");
        String keyword = scanner.nextLine();
        scanner.close();

        for (int index = 0; index < bookList.length; index++) {
            Book book = bookList[index];
            String tenSach = book.tenSach;
            if (tenSach.contains(keyword)) {
                System.out.println("Tim thay sach: " + tenSach);
            }
        }
        
        public boolean hasKeyword(String keyword) {
            Book book = bookList[index];
            if (book.hasKeyword(keyword)) {
                System.out.println("Ten sach " + book.tenSach);
            }
            
        }
    
    //Liệt kê các sách xuất bản trong năm nay
    int checkYear = 2021;
    for (Book book : bookList) {
        if (book.checkPubYear(checkYear)) {
            System.out.println("Sach xuat ban nam " + checkYear + ": " + book.tenSach);
        }
    }

        
}
}