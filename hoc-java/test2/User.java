public class User {
    private String username;
    private String email;
    private String password;
    

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

    }
public User() {}
    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkName(String username){
        boolean result = this.username.equals(username);
        return result;
    }
    public boolean checkPassword(String password){
        boolean result = this.password.equals(password);
        return result;
    }
    public boolean checkEmail(String email){
        boolean result = this.email.equals(email);
        return result;
    }
}

