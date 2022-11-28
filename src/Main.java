import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number greater than three ");
        int number;
        do {
            System.out.println(" Your number must be odd and greater than three!");
            number = scanner.nextInt();
        }
        while (number <= 3 || number % 2 == 0);
        System.out.println(" Enter a number greater than three");
        int i;
        int j;
        for (j = 1; j <= number; j++) {
            for (i = j; i <= number; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}