import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean isDividedByM = (k % m == 0) && ((k / m) <= n);
        boolean isDividedByN = (k % n == 0) && ((k / n) <= m);

        if (isDividedByM || isDividedByN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}