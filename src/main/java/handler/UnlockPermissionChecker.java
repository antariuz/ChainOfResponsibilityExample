package handler;

public class UnlockPermissionChecker extends Checker{

    public UnlockPermissionChecker() {
    }

    @Override
    public boolean check(double moneyReceived, double batteryLevel) {
        System.out.println("Permission to unlock granted!");
        return true;
    }
}
