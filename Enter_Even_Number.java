import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Enter_Even_Number {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = 0;
        while (true) {

            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    break;
                }
                System.out.println("The number is not even");
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
