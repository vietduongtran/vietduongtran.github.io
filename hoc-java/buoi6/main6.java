package buoi6;

public class main6 {

    import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;

public class HomeWork {
    static Scanner scanner = new Scanner(System.in);
    static boolean check = false;
    static Employee employee[] = new Employee[5];
    static String id[] = new String[5];
    static String name[] = new String[5];
    static LocalDate birthDay[] = new LocalDate[5];
    static GENDER gender[] = new GENDER[5];
    static double salary[] = new double[5];
    static String str[] = new String[5];
    static Employee findEmployee = new Employee(null, null, null, null, 0);
    static Employee findByName[] = new Employee[5];
    static Employee findMale[] = new Employee[5];
    static Employee findFeMale[] = new Employee[5];

    public static int selectMonth() {       // set cho so thang nhap vao trong khoang 0-12

        System.out.println("Hay nhap 1 thang bat ky");
        int month = scanner.nextInt();
        while (month < 0 || month >= 13) {
            System.out.println("Thang khong phu hop\nVui long chon lai");
            System.out.println("Hay nhap 1 thang bat ky");
            month = scanner.nextInt();
        }
        if (month > 0 && month < 13) {
            System.out.println("Thang ban chon la: " + month);
        }
        return month;
    }

    public static void main(String[] args) {
        // Khai báo class nhiên viên (Employee) gồm các thông tin :

        // id (String, bắt đầu là NV, ví dụ: NV01, NV02)
        // tên (String)
        // ngày sinh (LocalDate)
        // giới tính (Sử dụng enum)
        // lương tháng (double)
        // Tạo một mảng danh sách gồm 5 nhân viên bất kỳ.

        // Thực hiện:

        // Tìm nhân viên theo id ( tìm chính xác)
        // Tìm nhân viên theo tên ( tìm theo từ khoá, ví dụ: Nguyễn Văn A -> nhập A hoặc
        // Văn => đều tìm ra được)
        // Đếm số nhân viên nam, nữ
        // Liệt kê các nhân viên trên 30 tuổi
        // Nhập từ bàn phím tháng bất kỳ trong năm; kiểm tra xem trong tháng đó có những
        // nhân viên nào có ngày sinh nhật
        // In ra top 3 người có lương tháng cao nhất

        for (int i = 0; i < 5; i++) {
            int x = i - 1;
            System.out.println("Hay nhap thong tin nhan vien " + (i + 1));
            // Nhap ID attribute
            System.out.println("ID cua nhan vien la:[NV...] ");
            id[i] = scanner.nextLine();
            if (i >= 1) { // Dieu kien de cac ID khong bi trung
                while (x > -1) {
                    while ((id[i]).equals(id[x])) {
                        System.out.println("So ID bi trung");
                        System.out.println("Hay nhap lai so ID: ");
                        id[i] = scanner.nextLine();
                    }
                    x--;
                }
            }

            // ID theo mau pattern
            String patternID = "^NV[0-9][0-9]$";
            System.out.println(Pattern.matches(patternID, id[i]));

            if (Pattern.matches(patternID, id[i]) == false) { // Nhap lai id neu id khong dung pattern

                System.out.println("ID cua nhan vien khong dung ");
                System.out.println("Hay nhap lai so ID: ");
                id[i] = scanner.nextLine();

            } else {

                System.out.println("ID cua nhan vien " + (i + 1) + " la " + id[i]);

            }

            // Name
            System.out.println("Hay nhap ten cua nhan vien: ");
            name[i] = scanner.nextLine();

            // BirthDay
            System.out.println("Hay nhap ngay sinh cua nhan vien [dd-MM-yyyy]: ");
            String patternDay = "\\d{2}[-|/]\\d{2}[-|/s]\\d{4}"; // birthday co the nhap bang "-" hoac "/"
            str[i] = scanner.nextLine();
            if (Pattern.matches(patternDay, str[i])) {
                str[i] = str[i].replace('/', '-');
            } else {        // Neu ngay sinh khong chinh xac se nhap lai
                System.out.println("Thong tin khong chinh xac\nHay nhap lai [dd-MM-yyyy]: ");

                str[i] = scanner.nextLine();
            }
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");          
            birthDay[i] = LocalDate.parse(str[i], dtf);

            // Gender
            System.out.println("Hay nhap gioi tinh cua nhan vien [male/female]");
            String sex = scanner.nextLine();

            if (sex.equals("male")) { // doi gender tu string sang enum GENDER
                gender[i] = GENDER.MALE;
                System.out.println(gender[i]);

            } else {
                gender[i] = GENDER.FEMALE;
                System.out.println(gender[i]);
            }

            // Salary
            System.out.println("Hay nhap luong cua nhan vien");
            salary[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("luong cua nhan vien la: " + salary[i]);

            // Khai bao attribute cho cac employee
            employee[i] = new Employee(id[i], name[i], birthDay[i], gender[i], salary[i]);

        }
       

        // CAC MUC TIM KIEM
        findID();            //Tim theo ID

        findWithName();      //Tim theo ten

        findWithGender();    //Liet ke theo GENDER

        findHighestSalary(); // TIm 3 nhan vien luong cao nhat

        birthDayInMonth();   // Tim sinh nhat trong thang

        employeeOver30();    // Tim nhan vien tren 30

        scanner.close();
    }
    // Tim theo ten
    public static void findWithName() {
        System.out.println("Hay nhap ten tim kiem: ");
        String keyword = scanner.nextLine();
        int j = 0;
        int k = 0;
        for (int i = 0; i < 5; i++) {
            check = employee[i].findName(keyword);          // method findName
            if (check == true) {

                findByName[j] = employee[i];
                j++;
            } else {

                k++;
            }
        }
        for (j = 0; j < 5; j++) {
            if (findByName[j] != null) {
                System.out.println(findByName[j].toString());
            }
        }

        if (k == 5) {
            System.out.println("Khong co ten nay");
        }
    }

    public static void findID() { // Tim nhan vien theo ID
        System.out.println("\nTim nhan vien");
        System.out.println("Hay nhap so ID: ");
        String findID = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            check = employee[i].findID(findID);         //method findID
            if (check == true) {
                findEmployee = employee[i];
                break;
            }
        }

        if (check = true) {
            System.out.println(findEmployee.toString() +"\n");
        } else {
            System.out.println("Khong co so ID nay\n");
        }

    }

    public static void findHighestSalary() {
        // 3 nguoi co muc luong cao nhat
        Arrays.sort(salary);                       // sap xep lai nhan vien theo thu tu salary tang
        System.out.println("3 nguoi co muc luong cao nhat la");
        for (int i = 0; i < 5; i++) {     // tao loop de thu tu duoc sap xep theo: muc luong thu 3 - muc luong thu 2 - muc luong thu nhat
            if (salary[2] == employee[i].salary) { // Muc luong nguoi cao thu 3 
                System.out.println("Muc luong nguoi cao thu 3 la " + employee[i].name + " " + employee[i].salary);
            }
        }
        for (int i = 0; i < 5; i++) {
            if (salary[3] == employee[i].salary) { // Muc luong nguoi cao thu 2
                System.out.println("Muc luong nguoi cao thu 2 la " + employee[i].name + " " + employee[i].salary);
            }
        }
        for (int i = 0; i < 5; i++) {
            if (salary[4] == employee[i].salary) { // Muc luong nguoi cao thu nhat
                System.out.println("Muc luong nguoi cao nhat la: " + employee[i].name + " " + employee[i].salary);
            }
        }

    }

    // Nhap thang bat ky va kiem tra trong thang co ai sinh nhat
    public static void birthDayInMonth() {
        int j = 0;
        int month = selectMonth();
        Employee findBirthDayInMonth[] = new Employee[5];
        for (int i = 0; i < 5; i++) {
            if (month == employee[i].findMonth()) {
                findBirthDayInMonth[j] = employee[i];       // Them nhung nhan vien co ngay sinh trong thang vao array
                j++;
            }
        }
        if (j > 0) {
            System.out.println("Nhung nhan vien co sinh nhat trong thang " + month + " la: ");
            for (j = 0; j < 5; j++) {
                if(findBirthDayInMonth[j] != null){         // tranh loi null pointer
                System.out.println(findBirthDayInMonth[j].name + "\n");         
                }
            }
        } else {
            System.out.println("Khong co nhan vien nao sinh nhat trong thang " + month);
        }

    }

    // Liet ke cac nhan vien tren 30
    public static void employeeOver30() {
        int age[] = new int[5];
        System.out.println("Cac nhan vien tren 30 la: ");
        int k = 0;
        for (int i = 0; i < 5; i++) {
            age[i] = employee[i].findAge(employee[i]);          // tinh tuoi cua nhan vien
            if (age[i] > 30) {                                  // nhan vien tren 30
                System.out.println(employee[i].name);
                System.out.println(age[i] + "tuoi");
                System.out.println(employee[i].toString() + "\n");
            } else {
                k++;
            }
        }

        if (k == 5) {       // so luong nhan vien duoi 30
            System.out.println("Khong co nhan vien nao tren 30");
        }

    }

    // Tim va dem so nhan vien theo GENDER

    public static void findWithGender() { // Tim va dem so nhan vien nu
        int j = 0;
        int k = 0;
        for (int i = 0; i < 5; i++) {
            if ((employee[i].gender) == (GENDER.FEMALE)) {          // nhan vien co GENDER FEMALE
                findFeMale[j] = employee[i];
                j++;        // j la so nu
            } else {                                                // con lai la nhan vien GENDER MALE
                findMale[k] = employee[i];
                k++;        // k la so nam
            }
        }
        System.out.println("So nhan vien nu la: " + j);
        // System.out.println("Cac nhan vien nu la: ");

        // for (int i = 0; i < 5; i++) {
        // if (findFeMale[i] != null) {
        // System.out.println(findFeMale[i].toString());
        // }
        // }

        if (k == 5) {
            System.out.println("Khong co nhan vien nu");
        }

        // Tim va dem so nhan vien nam

      
        System.out.println("So nhan vien nam la: " + k);
        // System.out.println("Cac nhan vien nam la: ");

        // for (int i = 0; i < 5; i++) {
        // if (findFeMale[i] != null) {
        // System.out.println(findMale[i].toString());
        // }
        // }
        if (j == 5) {
            System.out.println("Khong co nhan vien nam");
        }
    }

}

}