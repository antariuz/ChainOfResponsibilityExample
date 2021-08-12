package handler;

public abstract class Checker {
    private Checker next;

    public Checker nextLink(Checker next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(double moneyReceived, double batteryLevel);

    public boolean checkNext(double moneyReceived, double batteryLevel) {
        if (next == null) {
            return true;
        }
        return next.check(moneyReceived, batteryLevel);
    }

}
