import java.util.Scanner;


public class Login {

    private static Scanner scanner = new Scanner(System.in);
    private static User user = new User();

    public static void login(){
    while (true) {
        boolean isUsername = false;
        
        // check co username nay chua
        while (true) { 
            if(isUsername == false){
                System.out.print("Username: ");
                String username = scanner.nextLine();
                for(User us : main.users){
                    if(main.checkUsername(username)){
                        isUsername = true;
                        user = us;
                    }
                }

            // neu chua co thi dang nhap lai
            } else {
                System.out.println("Invalid username!");
            }

            if(isUsername==true){
                break;
            }
        }

        // password

        Boolean islogin = false;

        System.out.print("Password: ");
        String password = scanner.nextLine();
            
        if(user.checkPassword(password)){
            islogin = true;
        } else{
            System.out.println("Wrong password! \n 1-Try again; \n2-Forgot password;");
            int key = Integer.parseInt(scanner.nextLine());

            //back 
            if (key==1) {
            }else if(key == 2){//hien thi mat khau
                forgetPassword();
            }
        }
        
        if (islogin == true) {
            System.out.println("Login successful!");
            break;
        }
    }

}
        public static void updateInfo(){
        while (true) {
            
            menu();
            System.out.print("Menu: ");
            int key = Integer.parseInt(scanner.nextLine());
            switch (key) {
                case 1:
                    changeUsername();
                    break;
                case 2:
                    changeEmail();
                    break;
                case 3:
                    changePassword();
                    break;
                case 4:
                main.loginOrRegister();
                    break;
                case 0:
                main.isQuit = true;
                    break;
            
                default:
                    break;
            }
            if (main.isQuit==true) {
                break;
            }
        }


    
}

    private static void changePassword() {
    boolean isChange = false;

    while (true) {
        System.out.print("Change password to: ");
        String password = scanner.nextLine();

        //check mail regex

        if(main.Password(password)){
            for(User us: main.users){
                if (us.getUsername().equals(user.getUsername())) {
                    us.setPassword(password);
                    isChange = true;
                }
            }
        }else {
            System.out.println("Invalid password type, try again");
        }


        if(isChange == true){
            System.out.println("Change successful");
            break;
        }

    }
}

private static void changeEmail() {
    boolean isChange = false;
    while (true) {
        System.out.print("Change mail to: ");
        String email = scanner.nextLine();

//check email regex
        if(main.Email(email)){

            //check is email available
            if (main.checkEmail(email)) {
                System.out.println("This email has been registred. Please try another.");
            }else {
                for(User us: main.users){
                    if (us.getUsername().equals(user.getUsername())) {
                        us.setEmail(email);
                        isChange = true;
                    }
                }
            }
        }else {
            System.out.println("Wrong email");
        }
        if(isChange == true){
            System.out.println("Change successful");
            break;
        }

    }
}

private static void changeUsername() {
    boolean isChange = false;

    while (true) {
        System.out.print("Change username to: ");
        String username = scanner.nextLine();
        if(main.checkUsername(username)){//kiem tra username da ton tai hay chua
            System.out.println("This username has been registered. Please try another.");
        } else{
            for(User us: main.users){
                if (us.getUsername().equals(user.getUsername())) {
                    us.setUsername(username);
                    isChange = true;
                }
            }
        }

        if(isChange == true){
            System.out.println("Change successful");
            break;
        }
    }

    
}

private static void menu() {
    System.out.println("1 - Change username");
    System.out.println("2 - Change email");
    System.out.println("3 - Change mat khau");
    System.out.println("4 - Log out ");
    System.out.println("0 - Exit ");
}


private static void forgetPassword(){
    boolean isForget = true;
    while (true) {
        System.out.print("Email: ");
        String email = main.scanner.nextLine();
        for(User userEmail : main.users){

            //check if this email registered
            if(userEmail.checkEmail(email)){
                System.out.println("New password: ");
                String password = main.scanner.nextLine();

                //check email regex
                if (main.Password(password)) {
                    userEmail.setPassword(password);
                    isForget = false;
                }
            }
        }
        if (isForget== false) {
            System.out.println("Change successful");
            break;
        }

    }

}
}

