import java.util.Scanner;

/**
 * Created by jc225828 on 25/08/17.
 */
public class CountByAnything {
    public static void main(String[] args) {
        int min = 3;
        int max = 300;
        int count;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to count by");
        count = input.nextInt();
        while (min<max){
            System.out.print(min + " ");
            if (min%10 == 0)
                System.out.println();
            min = min+count;
        }
    }
}