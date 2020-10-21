import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int acc = 0;
        for (; a <= b; a++) {
            if (a % n == 0) {
                acc++;
            }
        }

        System.out.println(acc);
    }
}