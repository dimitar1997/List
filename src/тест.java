import java.util.Scanner;

public class тест {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int prime = 0;
        int noPrime = 0;


        while (!command.equals("stop")) {
            int n = Integer.parseInt(command);
            if (n < 0) {
                System.out.println("Number is negative");
                command = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                prime = prime + n;
            } else if (count > 2) {
                noPrime = noPrime + n;
            }
            command = scanner.nextLine();
        }
        System.out.println(prime);
        System.out.println(noPrime);
    }
}
