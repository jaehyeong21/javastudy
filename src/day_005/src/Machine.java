import java.util.Random;

// 게임기에 h1, h2 객체. 사람 두명을 파라미터로 넘길 것.
// 게임기에서 받은 사람 두명중에 한명 골라서 돈 넣어주기
public class Machine {
    String name;

    public Machine(String _name){
        name = _name;
    }
    public void dobak1(Human h1, Human h2){
        Random random = new Random();
        int number = random.nextInt(12) + 1;
        if(number % 2 == 0){
            System.out.println("짝수에 행운이..");
            h2.money += 10000;
        }else {
            System.out.println("홀수에 행운이..");
            h1.money += 10000;
        }
    }
}
