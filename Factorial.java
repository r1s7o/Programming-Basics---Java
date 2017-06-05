import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Factorial {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int k = 1;
        int fact = 1;
        while (k <= n) {

            fact = fact * k;
            k++;

        }
        System.out.println(fact);
    }
}
