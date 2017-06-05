import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Sequence_2k_plus_1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int k = 1;
        while (k <= n) {
            System.out.println(k);
            k = k * 2 + 1;
        }
    }
}
