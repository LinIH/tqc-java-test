class PaymentProcessor{
    public static double calculateFee(Payment payment){
        return switch (payment) {
            case CreditCard cc -> cc.amount() * 0.02;
            case Cash c -> 0;
        };
    }
}