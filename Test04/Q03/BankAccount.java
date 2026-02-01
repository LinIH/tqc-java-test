
class BankAccount{
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this. balance = balance;
    }

    public void deposit(double amount) throws Exception{
        System.out.printf("Deposit %.1f\n", amount);
        if(amount < 0) throw new InvalidAmountException(amount);
        balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        System.out.printf("Withdraw %.1f\n", amount);
        if(amount < 0) throw new InvalidAmountException(amount);
        if(amount > balance) throw new InsufficientFundsException(this.balance);
        balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }
}