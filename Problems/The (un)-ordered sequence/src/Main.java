import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private static boolean isCorrectSeq(ArrayList<Integer> list) {
        boolean res = true;
        for (int i = 2; i < list.size(); i++) {
            if(!res) {
                break;
            }
            int first = list.get(i - 2);
            int prev = list.get(i - 1);
            int current = list.get(i);
            boolean delta1 = (prev - first)  >= 0;
            boolean delta2 = (current - prev)  >= 0;

            res = delta1 == delta2;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            list.add(num);
        }

        Boolean res = isCorrectSeq(list);
        System.out.println(res);
    }
}