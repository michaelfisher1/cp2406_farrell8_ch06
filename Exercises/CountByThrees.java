/**
 * Created by jc225828 on 25/08/17.
 */
public class CountByThrees {
    public static void main(String[] args) {
        int min = 3;
        int max = 300;
        while (min<max){
                System.out.print(min + " ");
            if (min%30 == 0)
                System.out.println();
            min = min+3;
        }
    }
}
