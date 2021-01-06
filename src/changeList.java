import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")){

            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Delete")){
                Integer numDel = Integer.parseInt(tokens[1]);
                for (int i = numbers.size() - 1; i >= 0 ; i--) {
                    if (numbers.contains(numDel)){
                        numbers.remove(numDel);
                    }
                }

            }
            if (tokens[0].equals("Insert")){
                int numIn = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()){
                    numbers.add(index,numIn);
                }
            }
            input = scanner.nextLine();

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
