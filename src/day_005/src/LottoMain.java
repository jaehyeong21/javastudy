import java.util.Random;

public class LottoMain {
    public static void main(String[] args){
        int[] lottoNumbers = new int[7];
        //break : 가장 가까운 반복문 한개를 강제로 탈출
        for(int i = 0; i < lottoNumbers.length; i++){
            Random random = new Random();
            lottoNumbers[i] = random.nextInt(45) + 1;

            for(int j = 0; j < i; j++){
                if(lottoNumbers[j] == lottoNumbers[i]){
                    i--;
                    break;
                }
            }
        }
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        }
    }
}
