import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int percent = scanner.nextInt();
        int goalMoney = scanner.nextInt();

        double acc = money;
        int years = 0;
        while (acc < goalMoney) {
            acc = (acc * percent / 100) + acc;
            years++;
        }
        double f = 20d + 20.02f; // 1
        long n = 10 + 2L;       // 2
        byte b = (byte) ((byte) n + 5);         // 3

        System.out.println(years);
    }
}