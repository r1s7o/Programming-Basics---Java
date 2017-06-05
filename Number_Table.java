import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Number_Table {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                num = row + col +1;
                if (num > n){
                    num = 2*n - num;
                }
                if (col == n-1){
                    System.out.print(num);
                    continue;
                }
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
