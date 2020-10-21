import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busH = scanner.nextInt();
        int countBridge = scanner.nextInt();
        boolean isCrashed = false;
        int breakeBridge = 0;

        for (int i = 1; i <= countBridge; i++) {
            if(isCrashed) {
                break;
            }
            int bridgeH = scanner.nextInt();
            if (bridgeH <= busH) {
                isCrashed = true;
                breakeBridge = i;
            }
            countBridge--;
        }

        if (breakeBridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + breakeBridge);
        }
    }
}