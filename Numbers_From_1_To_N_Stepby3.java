import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Numbers_From_1_To_N_Stepby3 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
