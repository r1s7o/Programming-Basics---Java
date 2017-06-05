import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int f0 = 1;
        int f1 = 1;
        if (n < 2) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) {
                int fNext = f0 + f1;
                f0 = f1;
                f1 = fNext;
            }
            System.out.println(f1);
        }
    }
}
