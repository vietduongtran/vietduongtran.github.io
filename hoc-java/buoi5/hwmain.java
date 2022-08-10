package buoi5;

import java.util.Scanner;

import buoi5.employee.Gender;
import buoi6.Employee;

public class hwmain {

public static void main(String[] args) {

    employee[] employeeList = new employee[5];
    
    employeeList[0] = new employee("NV01", 
                                  "Tran Van A", 
                             "10/02/1991",
                                 22.000,
                                Gender.NAM);    

    employeeList[1] = new employee("NV02", 
                                "Nguyen Van B", 
                           "12/03/1983",
                               21.000,
                              Gender.NAM);    

    employeeList[2] = new employee("NV03", 
                                  "Tran Thi C", 
                             "10/02/1998",
                                 80.000,
                                Gender.NU);    

    employeeList[3] = new employee("NV04", 
                                  "Hoang D", 
                             "10/02/1993",
                                 17.000,
                                Gender.NU);    

    employeeList[4] = new employee("NV05", 
                                  "Ngo Abc", 
                             "10/02/1993",
                                 9.000,
                                Gender.NAM);    
 
        for (employee employee : employeeList) {
            System.out.println(employee.id);
        }

        Scanner scanner = new Scanner(System.in);

        // Tim ten NV theo id

        System.out.println("Nhap ID cua nhan vien: ");
        String keywordID = scanner.nextLine();
        

        for (int index = 0; index < employeeList.length; index++) {
            employee employee = employeeList[index];
            if (employee.hasKeywordID(keywordID)) {
                System.out.println("ID " + keywordID + " la: " + employee.ten);        
            }        
        }
        
        // tim nv theo ten

        System.out.println("Nhap ten nhan vien can tim: ");
        String keywordName = scanner.nextLine();

        for (employee employee : employeeList) {
            if (keywordName.hasKeywordName(keywordName)) {
                
            }
            
        }
        }

    }


