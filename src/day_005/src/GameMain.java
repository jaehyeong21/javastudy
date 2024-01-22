// 사람 두명 만들기
// 게임기에 두명이 참가
// 게임 시작하면, 랜덤하게 두명중에 한명 선택
// 선택된 사람한테 10000원 입금

public class GameMain {
    public static void main(String[] args){
        System.out.println("게임장에 오신것을 환영합니다.");

        Human h1 = new Human("도박왕1", 1000);
        Human h2 = new Human("도박왕2", 1000);

        // 게임기에 h1, h2 객체. 사람 두명을 파라미터로 넘길 것.
        // 게임기에서 받은 사람 두명중에 한명 골라서 돈 넣어주기
        // 메인에서 사람정보 출력
        Machine machine = new Machine("인생을 걸어라");
        machine.dobak1(h1, h2);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
    }
}
