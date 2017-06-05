import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Powers_of_Two {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num = num * 2;
        }
    }
}
