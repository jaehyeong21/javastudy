import java.util.Scanner;

public class day_03_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        x = scan.nextInt();

        for(int i = 0; i <= x; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}