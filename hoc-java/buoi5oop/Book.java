package buoi5oop;

public class Book {

    //mã sách, tên sách, tác giả, thể loại, nhà xuất bản, năm xuất bản
    String maSach;
    String tenSach;
    String tacGia;
    String theLoai;
    String nhaXB;
    int namXB;

    public Book (String maSach, 
                String tenSach,
                String tacGia,
                String theLoai,
                String nhaXB,
                int namXB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
                }

    //Tìm sách theo tên
    public boolean hasKeyword(String keyword) {
        boolean result = this.tenSach.contains(keyword);
        return result;
    }
    
    //Liệt kê các sách xuất bản trong năm nay
    public boolean checkPubYear(int year) {
        boolean result = this.namXB == year;
        return result;
    }

    }


