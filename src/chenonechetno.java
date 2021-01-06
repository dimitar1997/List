import java.util.Scanner;

public class chenonechetno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2 ; i++) {
        String currentNum = "" + i;
        int oddSum = 0;
        int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                 if (j % 2 == 0){
                     evenSum = evenSum +currentDigit;
                 }else {
                     oddSum = oddSum + currentDigit;
                 }
            }
            if (oddSum == evenSum){
                System.out.println(i + " ");
            }
        }
    }
}
