import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<String>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        Collections.reverse(words);
        words.forEach(System.out::println);
    }
}