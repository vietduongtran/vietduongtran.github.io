import java.util.ArrayList;
import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nha: ");
        String houseNumber = scanner.nextLine();

        System.out.println("So thanh vien: ");
        int numberOfMembers = scanner.nextInt();

        Person person = new Person("L V A", "1-1-1991", "HR");
        Person person2 = new Person("N T A", "12-3-1992", "Manager");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);

        HoDan hoDan = new HoDan();    
        hoDan.setHouseNumber(houseNumber);
        hoDan.setNumberOfMembers(numberOfMembers);
        hoDan.setPeople(people);

        System.out.println(hoDan.toString());
    }
}