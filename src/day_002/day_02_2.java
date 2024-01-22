import java.util.Scanner;

public class day_02_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A_arr = {4,5,2,1,3,5,5,2,2,1};
        int[] B_arr = {4,5,2,1,3,5,5,2,2,1};
        int[] C_arr = {4,5,2,1,3,5,5,2,2,1};
        int[] D_arr = {4,5,2,1,3,5,5,2,2,1};

        int Asum = 0;
        int Bsum = 0;
        int Csum = 0;
        int Dsum = 0;
        int allSum = 0;

        for(int i = 0; i < 10; i++){
            Asum += A_arr[i];
            Bsum += B_arr[i];
            Csum += C_arr[i];
            Dsum += D_arr[i];
        }
        allSum = Asum + Bsum + Csum + Dsum;

        System.out.println("A동 :" + Asum);
        System.out.println("B동 :" + Bsum);
        System.out.println("C동 :" + Csum);
        System.out.println("D동 :" + Dsum);
        System.out.println("총 거주 인원 : " + allSum);
    }
}
