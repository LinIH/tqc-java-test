
class Main{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("123", 5000);
        try{
            System.out.printf("Transaction 1: ");
            bankAccount.withdraw(6000);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.printf("Transaction 2: ");
            bankAccount.deposit(-100);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.printf("Transaction 3: ");
            bankAccount.withdraw(1000);
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.printf("Sucess. New Balance: %.1f\n", bankAccount.getBalance());
        }
    }
}