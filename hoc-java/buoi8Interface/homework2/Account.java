package homework2;

public class Account implements IAccount {

    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;

    private double rechargeNum;
    private String newEmail;

    public Account(double rechargeNum, String newEmal) {
        this.rechargeNum = rechargeNum;
        this.newEmail = newEmal;
    }

    @Override
    public void recharge() {
        // TODO Auto-generated method stub

        System.out.println("So du tai khoan " + accountNumber + " : " + accountBalance + ". Ban da nap: " + rechargeNum + ". Tong so tien hien tai: " + ((accountBalance) + (rechargeNum) ));
    }

    @Override
    public void changeEmail() {
        // TODO Auto-generated method stub
        System.out.println("Email hien tai: " + email + ". Ban da doi sang " + newEmail + " thanh cong!");
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println("Ten chu tai khoan: " + name + ".\n So tai khoan: " + accountNumber + ". So du hien tai: " + ((accountBalance) + (rechargeNum)) + ".\n Email moi: " + newEmail);
    }
    
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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
     * @return double return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * @return double return the accountRecharged
     */
    public double getrechargeNum() {
        return rechargeNum;
    }

    /**
     * @param rechargeNum the accountRecharged to set
     */
    public void setrechargeNum(double rechargeNum) {
        this.rechargeNum = rechargeNum;
    }

}
