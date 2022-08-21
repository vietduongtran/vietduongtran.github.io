package hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static List<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // create products 

        Product product1 = new Product(1, "Sprite", "Drinks", 100, 30.000, "bottles");
        Product product2 = new Product(2, "Coca-Cola", "Drinks", 80, 29.000, "bottles");
        Product product3 = new Product(3, "Choco-pie", "Food", 3, 60, "box");
        Product product4= new Product(4, "Orange", "Fruits", 49, 120.000, "kg");
        Product product5 = new Product(5, "Chicken", "Food", 100, 79.000, "kg");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        // 1 - Xem danh sách sản phẩm
        System.out.println(products.toString());

        // 2 - Tìm sản phẩm theo tên
        findByName();

        // 3 - Tìm sản phẩm theo id:
// 3.1: Xóa sản phẩm
// 3.2: Cập nhật số lượng sản phẩm
        findByID();
        deleteProd();
        updateProd();

        // 4 - Tìm các sản phẩn có số lượng dưới 5
        findBelow5();

        // 5 - Tìm sản phẩm theo mức giá:
        findByPrice();
// 5.1: Dưới 50.000
// 5.2: Từ 50.000 đến dưới 100.000
// 5.3: Từ 100.000 trở lên
    }
    
    // 2 tim sp theo ten

    public static Product findByName() {
        Product ListName = null;
        System.out.println("Tim kiem san pham: ");
        String keyword = scanner.nextLine();

        //tim dc san pham
        for (Product productList : products) {
            if (productList.getName().equals(keyword)) {
                ListName = productList;
            }
        }

        //neu k tim dc san pham
            if (ListName == null) {
                System.out.println("Khong co san pham nay!");
            } else {
                System.out.println(ListName.toString());
            }

        return ListName;
    }

    // tim san pham theo ID

    public static Product findByID() {

        System.out.println("Tim kiem san pham theo ID: ");
        int prodIDscan = scanner.nextInt();
        Product productID = null;

        for (Product listID : products) {
            if (listID.getId() == prodIDscan) {
                productID = listID;
            }
            }
            if (productID == null) {
                System.out.println("Khong co san pham theo ID nay!");
            } else {
                System.out.println(productID.toString());
            }
        return productID;
        }

    // xoa san pham theo ID

        public static void deleteProd () {
            Product delID = null;   

            System.out.println("Xoa san pham theo ID");
            int delProdScan = scanner.nextInt();
            delID = findByID();
            products.remove(delID);

            System.out.println("Ban da xoa: " + delID.toString());
        }


     // cap nhat so luong sp theo ID 
     
        public static void updateProd() {
            Product updProd = null;
            System.out.println("Cap nhat san pham theo ID:");
            int updID = scanner.nextInt();
            
            updProd = findByID();
            System.out.println("Cap nhat so luong sp: ");
            int updAmount = scanner.nextInt();
            updProd.setAmount(updAmount);
            System.out.println(updProd.toString());
        }
     
        // tim san pham duoi 5

        public static void findBelow5() {
            System.out.println("Cac san pham co so luong duoi 5: ");
            List<Product> amountBelow5 = new ArrayList<>();

            for (Product below5 : products) {
                if (below5.getAmount() < 5) {
                    amountBelow5.add(below5);
                }
            }

            // neu ko co san pham nao duoi 5 
                if (amountBelow5.isEmpty()) {
                    System.out.println("Khong co san pham nao so luong duoi 5.");
                } else {
                    System.out.println(amountBelow5.toString());
                }
        }

        // tim san pham theo muc gia

            public static void findByPrice() {
                boolean isBoolean = false;
                List<Product> prodPrice = new ArrayList<>();

                // create cases 50.000< ; 50.000<x<100.000 ; >100.000

                while (true) {
                    System.out.println("Tim theo gia: 1) 50.000< ; 2) 50.000<x<100.000 ; 3) >100.000");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    switch (num) {
                        case 1: {
                            for (Product temp : products) {
                                if (temp.getPrice() < 50.000) {
                                    prodPrice.add(temp);
                                }
                            }
                            // neu k co gia tri nay
                            if (prodPrice.isEmpty()) {
                                System.out.println("Khong co san pham duoi 50.000");
                            } else {
                                System.out.println(prodPrice.toString());
                            }
                        }
                        case 2: {
                            for (Product temp : products) {
                                if (50.000 < temp.getPrice() && temp.getPrice() < 100.000) {
                                    prodPrice.add(temp);
                                }
                            }
                            // neu k co gia tri nay
                            if (prodPrice.isEmpty()) {
                                System.out.println("Khong co san pham nao phu hop");
                            } else {
                                System.out.println(prodPrice.toString());
                            }
                        }
                        case 3: {
                            for (Product temp : products) {
                                if (temp.getPrice() > 100.000) {
                                    prodPrice.add(temp);
                                }
                            }
                            // neu k co gia tri nay
                            if (prodPrice.isEmpty()) {
                                System.out.println("Khong co san pham nao phu hop");
                            } else {
                                System.out.println(prodPrice.toString());
                            }
                        return;

                    }
                    default: {
                        isBoolean = false;
                    }
                }
            }
        }
    }