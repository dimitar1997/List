import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
       List<Integer> newList = new ArrayList<>();

       int n = 0;
       int f = 0;
       int s = 0;

       while (firstNumbers.size() > n || secondNumbers.size() > n){
            if (firstNumbers.size()  > 0){
                for (int i = f; i < firstNumbers.size();) {
                    int num = firstNumbers.get(i);
                    newList.add(num);
                    f++;
                    break;
                }
            }
            if (secondNumbers.size()  > 0){
                for (int i = s; i < secondNumbers.size() ;) {
                    int num2 = secondNumbers.get(i);
                    newList.add(num2);
                    s++;
                    break;
                }
            }
            n++;
        }
        for (int i = 0; i <newList.size() ; i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
}
