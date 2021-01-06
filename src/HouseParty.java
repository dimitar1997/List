import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();


        for (int i = 1; i <= commands ; i++) {
            String input = scanner.nextLine();
           String[] currentInput = input.split(" ");

           if (currentInput[1].equals("is") && currentInput[2].equals("going!")){
               if (names.contains(currentInput[0])){
                   System.out.println(currentInput[0] + " is already in the list!");
               }else {
                   names.add(currentInput[0]);
               }
           }else if (currentInput[1].equals("is") && currentInput[2].equals("not") && currentInput[3].equals("going!")){
               if (!names.contains(currentInput[0])){
                   System.out.println(currentInput[0] + " is not in the list!");
               }else {
                   names.remove(currentInput[0]);
               }
           }
        }
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));
        }
    }
}
