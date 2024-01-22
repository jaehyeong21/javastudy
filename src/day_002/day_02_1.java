import java.util.Scanner;

public class day_02_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int burger = 5000;
        int chicken = 12000;
        int coke = 2000;
        int sum = 0;
        int i = 1;

        System.out.println("[1]햄버거 [2]치킨 [3]콜라 [0]프로그램 종료");

        while(i > 0){
            System.out.println("--주문중--");
            i = scan.nextInt();
            if(i == 1){
                sum += burger;
            }
            else if(i == 2){
                sum += chicken;
            }
            else if(i == 3){
                sum += coke;
            }
        }
        System.out.println(sum + "원");
    }
}
