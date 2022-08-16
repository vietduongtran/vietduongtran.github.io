import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai cua rectangle: ");
        double rectangleLength = scanner.nextDouble();
       

        System.out.println("Nhap chieu ngan cua rectangle: ");
        double widthLength = scanner.nextDouble();
        
        Rectangle rectangle = new Rectangle(rectangleLength, widthLength);

        rectangle.display();
        rectangle.calArea();
        

        System.out.println("Nhap chieu dai cua square: ");
        double squareLength = scanner.nextDouble();
        Square square = new Square(squareLength);
        square.display();
        square.calArea();
    }
}
