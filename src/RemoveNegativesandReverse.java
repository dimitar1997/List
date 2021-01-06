import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = numbers.size() - 1; i >= 0 ; i--) {

            if (numbers.get(i) < 0){
                numbers.remove(i);
            }
        }
        Collections.reverse(numbers);
        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.print(numbers.toString().replaceAll("[\\[\\],]",  ""));
        }
    }
}
