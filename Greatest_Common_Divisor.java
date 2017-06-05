import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Greatest_Common_Divisor {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        while (b != 0) {
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        System.out.println("GCD = " + a);
    }
}
