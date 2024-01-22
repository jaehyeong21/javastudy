import java.util.Scanner;

public class day_01_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 하나를 입력해주세요");
        int num = scan.nextInt();
        num = num % 2;

        if(num == 1){
            System.out.println("홀수입니다.");
        }
        else{
            System.out.println("짝수입니다.");
        }
    }
}
