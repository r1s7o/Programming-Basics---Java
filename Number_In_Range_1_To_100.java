import java.util.Scanner;

/**
 * Created by Hristo on 03/03/2017.
 */
public class Number_In_Range_1_To_100 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            num = Integer.parseInt(console.nextLine());
        }
        System.out.println("The number is: " + num);
    }
}
