
class InsufficientFundsException extends Exception{
    InsufficientFundsException(double balance){
        super("Error: Insufficient funds. Current balance: " + String.format("%.1f", balance));
    }
}