public class Register {
    User user = new User(null, null, null);

    public static void register() {
        while (true) {
            String username = addUsername();
            String email = addEmail();
            String password = addPassword();

            if (username.length() + email.length() + password.length() > 3) {
                main.users.add(new User(username, password, email));
                System.out.println("Add account - SUCCESS!");
                break;
            }
        }

    }
    private static String addUsername(){
        boolean isUsername = false;
        String result = "";
        while (true) {
            System.out.print("Username: ");
            String username = main.scanner.nextLine();
            if (main.checkUsername(username)) {
                System.out.println("This username has been registered. Please try another.");
            }else{ 
                result = username;
                isUsername = true;
            }

            if (isUsername == true) {
                System.out.println("Registration success");
                break;
            }
        }
        return result;
    }
    private static String addEmail(){

        Boolean isEmail = false;
        String result = "";

        while (true) {
            System.out.print("Email: ");
            String email = main.scanner.nextLine();
            if (main.Email(email)) {
                if (main.checkEmail(email)) {
                    System.out.println("This email has been registered. Please try another.");
                }else{
                    result = email;
                    isEmail = true;
                }

            }else{ 
                System.out.println("Wrong email. Try again");
            }

            if (isEmail == true) {
                System.out.println("Registration success");
                break;
            }
        }
        return result;
    }
    private static String addPassword(){
        boolean isPassword = false;
        String result = "";
        while (true) {
            System.out.print("Password (7-15 char, min. 1 uppercase, min. 1 symbol): ");
           
            String password = main.scanner.nextLine();
            if (main.Password(password)) {
                result = password;
                isPassword = true;
            }else{
                System.out.println("Wrong password. Try again");
            }

            if (isPassword == true) {
                System.out.println("Registration success");
                break;
            }
        }
        return result;
    }
}
