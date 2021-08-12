import handler.BatteryLevelChecker;
import handler.Checker;
import handler.PaymentChecker;
import handler.UnlockPermissionChecker;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Checker checker1 = new PaymentChecker();
        Checker checker2 = new BatteryLevelChecker();
        Checker checker3 = new UnlockPermissionChecker();

        checker1.nextLink(checker2).nextLink(checker3);

        checker1.check(50,100);

    }
}
