import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Factorial2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int fact = 1;
        do {
            fact = fact * n;
            n--;
        }while (n > 1);
        System.out.println(fact);
    }
}
