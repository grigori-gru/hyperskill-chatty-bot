import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = scanner.nextInt();

        int num = 1;
        while ((num * num) <= maxNum) {
            System.out.println(num * num);
            num++;
        }
    }
}