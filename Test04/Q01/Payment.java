
sealed interface Payment permits CreditCard, Cash{
    public default String getName(){
        return this.getClass().getSimpleName();
    }
}
