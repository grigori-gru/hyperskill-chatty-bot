import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        int dailyUp = up - down;
        int enoughRise = h - up;
        int remainder = enoughRise % dailyUp;
        int div = enoughRise / dailyUp;
        int days = (remainder > 0 ? (div + 1) : div) + 1;

        System.out.println(days);
    }
}