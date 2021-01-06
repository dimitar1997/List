import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;

            }
            String[] tokens = line.split(" ");
            switch (tokens[0]){
                case "Add":
                    int numberToADD = Integer.parseInt(tokens[1]);
                    numbers.add(numberToADD);
                    break;
                case "Remove":
                case "RemoveAt":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexGiven = Integer.parseInt(tokens[2]);
                    numbers.add(indexGiven, numberToInsert);
                    break;
            }

        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
