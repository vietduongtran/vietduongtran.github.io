import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class main {
    
        static Scanner scanner = new Scanner(System.in);
        static boolean isQuit = false;

        //regex
        public static boolean Password(String password){
            String PASSWORD = "^(?=.*[a-zA-Z])(?=.*[@#$%^&+=]).{7,15}$";
            boolean result = Pattern.matches(PASSWORD, password);
            return result;
        }
        public static boolean Email(String email){
            String EMAIL = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
            boolean result = Pattern.matches(EMAIL, email);
            return result;
        }

        //add users 

        static List<User> users = new ArrayList<>(Arrays.asList(
        new User("xyz", "xyz@gmail.com", ".1234ABbc"),
        new User("abcd", "abcdb@gmail.com", ".1234ABbc")));

 
    // check username
        public static boolean checkUsername(String  username){
        boolean isUsername = false;
        for(User user: main.users){
            if(user.checkName(username)){
                isUsername = true;
            }
        }
        return isUsername;
    }

    //check email
    public static boolean checkEmail(String  email){
        boolean isEmail = false;
        for(User user: main.users){
            if(user.checkEmail(email)){
                isEmail = true;
            }
        }
        return isEmail;
    }

    public static void loginOrRegister(){
        while (true) {
            menu();
            System.out.printf("Login_1 ; SignUp_2: \n");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1://login
                Login.login();
                Login.updateInfo();
                    break;
                case 2://register
                Register.register();
                    break;
                
                default:
                    break;
            }
            if(isQuit == true){
                break;
            }
        }
    }

    private static void menu() {
        System.out.println("Sign In");
        System.out.println("Sign Up");
    }
    
    public static void main(String[] args) {

        loginOrRegister();
    }

}