public class Account {
    private String accountNumber;
    private int pin;
    private double balance;

    public Account(String accountNumber, int pin, double balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean withdraw(double amount){
        if (amount > 0 && balance >= amount){
            balance -=amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public double getBalance(){return balance;}
    public String getAccountNumber(){return accountNumber; }
    public int getPin(){return  pin;}

}
