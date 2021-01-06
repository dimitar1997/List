import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class trii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i <numbers.size() ; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElements(numbers, " ");
        System.out.print(output);
    }
    private static String joinElements(List<Double> numbers, String delimiter) {
        String output = "";
        for (int i = 0; i < numbers.size(); i++){
            output += new DecimalFormat("0.#").format(numbers) + delimiter;
        }
        return output;
    }
}
