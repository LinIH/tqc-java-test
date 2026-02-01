
class MainProcessor{
    public static void main(String[] args){
        CreditCard creditCard = new CreditCard("1234", 1000);
        Cash cash = new Cash(500);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.printf("Payment Type: %s, Amount: %.1f, Fee: %.1f\n", creditCard.getClass().getSimpleName(), creditCard.amount(), paymentProcessor.calculateFee(creditCard));
        System.out.printf("Payment Type: %s, Amount: %.1f, Fee: %.1f\n", cash.getClass().getSimpleName(), cash.amount(), paymentProcessor.calculateFee(cash));
    }
}
