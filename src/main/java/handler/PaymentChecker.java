package handler;

public class PaymentChecker extends Checker {

    private final double PRICE = 50d;

    public PaymentChecker() {
    }

    @Override
    public boolean check(double moneyReceived, double batteryLevel) {
        if (moneyReceived < PRICE) {
            System.out.println("The price of this scooter is " + PRICE +
                    "$\nYour deposit is " + moneyReceived +
                    "$\nYou should deposit at least " + (PRICE-moneyReceived) + "$ more");
            return false;
        }
        System.out.println("Payment OK...");
        return checkNext(moneyReceived, batteryLevel);
    }
}
