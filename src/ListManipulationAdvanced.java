import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;

            }
            String[] tokens = line.split(" ");
            if (tokens[0].equals("Print") && tokens[1].equals("even")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 0) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }if (tokens[0].equals("Print") && tokens[1].equals("odd")){
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 1) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }if (tokens[0].equals("Get") && tokens[1].equals("sum")){
                int sum = 0;
                for (int j = 0; j < numbers.size(); j++) {
                    sum = sum + numbers.get(j);
                }
                System.out.println(sum);
            }if (tokens[0].equals("Filter") && tokens[1].equals("<")){
                int num1 = Integer.parseInt(tokens[2]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (num1 > numbers.get(i)) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }if (tokens[0].equals("Filter") && tokens[1].equals(">")){
                int num2 = Integer.parseInt(tokens[2]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (num2 < numbers.get(i)) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }if (tokens[0].equals("Filter") && tokens[1].equals(">=")){
                int num3 = Integer.parseInt(tokens[2]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (num3 <= numbers.get(i)) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }if (tokens[0].equals("Filter") && tokens[1].equals("<=")){
                int num4 = Integer.parseInt(tokens[2]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (num4 >= numbers.get(i)) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }if (tokens[0].equals("Contains")){
                int num = Integer.parseInt(tokens[1]);
                boolean  noNumber = true;
                for (int i = 0; i < numbers.size(); i++) {
                    if (num == numbers.get(i)) {
                        System.out.println("Yes");
                        noNumber = false;
                    }
                }
                if (noNumber){
                    System.out.println("No such number");
                }
            }
        }
    }
}

