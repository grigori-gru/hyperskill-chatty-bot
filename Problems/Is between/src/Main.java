import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int left = scanner.nextInt();
        int right = scanner.nextInt();

        boolean res = left >= num && right <= num;
        boolean res1 = left <= num && right >= num;

        System.out.println(res || res1);
    }
}