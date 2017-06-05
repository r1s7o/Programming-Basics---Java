import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Sum_Digits {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        do {
            sum = sum + (n % 10);
            n = n / 10;
        } while (n != 0);
        System.out.println(sum);
    }

}
