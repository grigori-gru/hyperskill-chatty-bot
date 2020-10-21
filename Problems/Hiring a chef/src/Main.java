import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String age = scanner.next();
        String educationStage = scanner.next();
        String exp = scanner.next();
        String cuisine = scanner.next();

        String output = "The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cuisine + " dishes.";

        System.out.println(output);
    }
}