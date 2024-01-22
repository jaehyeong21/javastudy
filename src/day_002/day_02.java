import java.util.Scanner;

public class day_02 {
    public static void main(String[] args){
        //자로형[] 변수명 = new 자료형[방의갯수];
        double[] arr = new double[3];
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        for(int i = 0; i<3; i++){
            arr[i] = scan.nextDouble();
            sum = arr[i] + sum;
        }
        sum = sum / 3;

        if(sum > 100){
            System.out.println("성공");
        }
        else{
            System.out.println("실패");
        }
    }
}
