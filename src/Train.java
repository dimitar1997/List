import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());

        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String[] tokens = line.split("\\s+");

            if (tokens[0].equals("Add")){
                int num = Integer.parseInt(tokens[1]);
                numbers.add(num);
            }else {
                int num2 = Integer.parseInt(tokens[0]);
                for (int i = 0; i < numbers.size() ; i++) {
                    int sum = numbers.get(i) + num2;
                if (sum <= max){
                    numbers.set(i, sum);
                    break;
                }
                }
            }
        }
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
