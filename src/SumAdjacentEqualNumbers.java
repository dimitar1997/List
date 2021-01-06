import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        boolean search = true;
        while (search){
            search = false;
            for ( int i = 0; i < numbers.size() - 1;i++){
               double current = numbers.get(i);
                double next = numbers.get(i + 1);
                if (current == next){
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    search = true;
                    break;
                }
            }
        }

        String output = joinElements(numbers, " ");
        System.out.print(output);


    }

    private static String joinElements(List<Double> numbers, String delimiter) {
        String output = "";
        for (Double items : numbers){
            output += new DecimalFormat("0.#").format(items) + delimiter;
        }
        return output;
    }
}
