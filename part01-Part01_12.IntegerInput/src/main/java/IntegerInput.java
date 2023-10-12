
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("You gave the number " + number);


     /*   System.out.println("Give a number:");
          int number = scan.nextInt();

          System.out.println("You gave the number " + number);
     */
    }
}
