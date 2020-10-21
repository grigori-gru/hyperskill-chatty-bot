import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            String res = (num % 2 == 0) ? "even" : "odd";
            System.out.println(res);
        }

    }
}