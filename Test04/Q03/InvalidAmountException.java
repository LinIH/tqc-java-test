
class InvalidAmountException extends Exception{
    InvalidAmountException(double amount){
        super("Error: Invalid amount: " + String.format("%.1f", amount));
    }
}