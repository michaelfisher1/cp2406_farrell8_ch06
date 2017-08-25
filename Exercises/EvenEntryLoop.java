import java.util.Scanner;

/**
 * Created by jc225828 on 25/08/17.
 */
public class EvenEntryLoop {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number, or 999 to end.");
        num = input.nextInt();
        while (num != 999) {
            if (num % 2 == 0) {
                System.out.println("Good Job");
            }
            else
                System.out.print("Error, not an even number.");
                System.out.println("Enter an even number, or 999 to end.");
                num = input.nextInt();
        }
    }
}
