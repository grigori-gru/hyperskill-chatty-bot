import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        boolean isCorrectInput = year >= 1900 && year <= 3000;
        boolean isDivisibleBy400 = year % 400 == 0;
        boolean isDivisibleBy4 = (year % 4 == 0) && (year % 100 != 0);
        boolean isLeap = isDivisibleBy4 || isDivisibleBy400;

        if (isCorrectInput && isLeap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}