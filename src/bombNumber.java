import java.util.*;
import java.util.stream.Collectors;

public class bombNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bombNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> arrayAsNum = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bomb = arrayAsNum.get(0);
        int power = arrayAsNum.get(1);

        for (int i = 0; i < bombNumbers.size(); i++) {
            if (bombNumbers.get(i) == bomb) {
                int from = Math.max(i - power, 0);
                //int from = i - power > 0 ? i - power : 0;
                //int from = i - power;
                //if (from < 0) from = 0;
                int to = Math.min(i + power, bombNumbers.size() - 1);
                for (int j = from; j <= to; j++) {
                    bombNumbers.remove(from);
                }
                i = from;
            }

        }

        for (int i : bombNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        //int sum = bombNumbers.stream().reduce(0, (a, b) -> a + b);
        int sum = 0;
        for (int i : bombNumbers) sum += i;
        System.out.println("Sum = " + sum);


    }
}
