import java.util.Random;
import java.util.Scanner;

public class AnimalGameMain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Farmer farmer = new Farmer();
        Casher casher = new Casher();
        AppleTree appleTree = new AppleTree();
        System.out.println("모여봐요 ! 동물의숲");
        int select;

        while(true) {

            System.out.println("[1]사과나무 흔들기 [2]상인에게 사과 팔기 [3]종료하기");
            select = scan.nextInt();
            if(select == 1){
                System.out.println("농부가 사과나무를 흔듭니다!");
                int apple = random.nextInt(3) + 1;
                farmer.apple += apple;
                System.out.println("사과" + apple + "개 획득!");
                System.out.println("농부의 사과 소지 개수 : " + farmer.apple);
            }else if(select == 2){
                if(farmer.apple <= 0){
                    System.out.println("현재 보유 중인 사과가 없습니다!");
                    System.out.println("사과 개수 : " + farmer.apple);
                    break;
                }
                System.out.println("상인에게 몇 개의 사과를 판매 하나요?(개수를 입력해주세요)");
                int num = scan.nextInt();
                if(num <= farmer.apple){
                    farmer.apple -= num;
                    farmer.money = farmer.money + (num * 100);
                    System.out.println(num + "개 판매 완료!");
                    System.out.println("현재 소지금 : " + farmer.money);
                }else{
                    System.out.println("사과 개수가 부족합니다. 다시 입력해주세요!");
                }

            }else{
                System.out.println("게임을 종료합니다!");
                break;
            }
        }
    }
}
