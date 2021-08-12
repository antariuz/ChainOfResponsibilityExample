package handler;

public class BatteryLevelChecker extends Checker{

    public BatteryLevelChecker() {
    }

    @Override
    public boolean check(double moneyReceived, double batteryLevel) {
        if (batteryLevel <=10) {
            System.out.println("Unfortunately, you can't use this scooter due to low battery charge");
            return false;
        }
        System.out.println("Battery Leve OK...");
        return checkNext(moneyReceived, batteryLevel);
    }
}
