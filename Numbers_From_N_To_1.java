import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Numbers_From_N_To_1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
