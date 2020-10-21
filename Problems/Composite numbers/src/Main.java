import java.util.Scanner;

public class Main {
    private static boolean iterator(long number, long divider) {
        if (divider >= number) {
            return false;
        }
        boolean isDivided = number % divider == 0;
        return isDivided || iterator(number, divider + 1);
    }

    public static boolean isComposite(long number) {
        return iterator(number, 2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}