import java.util.Scanner;

public class day_02_Challenge1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] kors = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            kors[i] = scan.nextInt();
            sum = sum + kors[i];
        }
        sum = sum / 5;
        System.out.println(sum);
    }
}
