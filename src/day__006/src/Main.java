import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //클래스명 객체명 = new 생성자;
        LocalTime now = LocalTime.now();
        int minute = now.getMinute();
        System.out.println("현재 분 :" + minute);

        User user1;
        User user2;
        User user3;

        Casher Casher = new Casher();

        int initHpMedicineCounts = 0;

        if(minute % 5 == 0){
            initHpMedicineCounts = 10;
        }
        user1 = new User(100, "유저1", 500, 0, 0);
        user2 = new User(50, "유저2", 0,0,0);
        user3 = new User(70, "유저3" , 0 , 0, 0);

        Random random = new Random();
        int hpZombie1 = random.nextInt(101) + 50;
        int hpZombie2 = random.nextInt(101) + 50;

        Zombie zombie1 = new Zombie(hpZombie1, "좀비1");
        Zombie zombie2 = new Zombie(hpZombie2, "좀비2");

        System.out.println(zombie1.toString());
        System.out.println(zombie2.toString());

        Scanner scan = new Scanner(System.in);
        int select = -1;
        while(true){
            System.out.println("메뉴를 입력해주세요");
            System.out.println("[1]전투 [2]상점 [3]아이템 가방 [4]로그아웃");
            select = scan.nextInt();
            if(select == 1){
                System.out.println("전투시작");
                //랜덤하게 숫자 뽑아서 홀수면 유저 -> 좀비
                //짝수면 좀비 -> 유저
                int attackTurn = random.nextInt(12) + 1;
                if(attackTurn % 2 == 0){
                    System.out.println("좀비가 먼저 공격합니다.");
                    while(true){
                        int attackPower = random.nextInt(30) + 1;
                        //좀비 -> 유저공격 성공
                        user1.hp -= attackPower;

                        attackPower = random.nextInt(30) + 1;
                        System.out.println("현재 유저의 체력 :" + user1.hp);

                        if(user1.hp <= 0){
                            System.out.println(user1.name + "죽었습니다.");
                            if(user1.money < 10){
                                System.out.println("소지금이 적어 패널티 없이 부활합니다.");
                                user1.hp = 100;
                            }else{
                                user1.money = user1.money * 0.9;
                                user1.hp = 100;
                            }
                            break;
                        }
                        //유저 -> 좀비공격 성공
                        zombie1.hp -= attackPower;
                        System.out.println("현재 좀비의 체력 :" + zombie1.hp);
                        if(zombie1.hp <= 0){
                            System.out.println(zombie1.name + "죽었습니다.");
                            int zombieMoney = random.nextInt(9) + 1;
                            user1.money += zombieMoney;
                            System.out.println("소지금 :" + user1.money);
                            break;
                        }
                    }
                }else{
                    System.out.println("유저가 먼저 공격합니다.");
                    while(true){
                        int attackPower = random.nextInt(30) + 1;
                        //유저 -> 좀비공격 성공
                        zombie1.hp -= attackPower;

                        System.out.println("현재 좀비의 체력 :" + zombie1.hp);
                        if(zombie1.hp <= 0){
                            System.out.println(zombie1.name + "죽었습니다.");
                            int zombieMoney = random.nextInt(9) + 1;
                            user1.money += zombieMoney;
                            System.out.println("소지금 :" + user1.money);
                            break;
                        }
                        attackPower = random.nextInt(30) + 1;
                        //좀비 -> 유저공격 성공
                        user1.hp -= attackPower;

                        System.out.println("현재 유저의 체력 :" + user1.hp);
                        if(user1.hp <= 0){
                            System.out.println(user1.name + "죽었습니다.");
                            System.out.println("소지금 :" + user1.money);
                            if(user1.money < 10){
                                System.out.println("소지금이 적어 패널티 없이 부활합니다.");
                                user1.hp = 100;
                            }else{
                                user1.money = user1.money * 0.9;
                                user1.hp = 100;
                            }
                            break;
                        }
                    }
                }
            }else if(select == 2){
                while(true){
                    int casherSelect = 0;
                    System.out.println("상점에 오신 것을 환영합니다!");
                    System.out.println("[1]체력물약 " + Casher.hpPortion + "[2]이름변경쿠폰 " + Casher.reNameCupon + "[3]상점 나가기 ");
                    casherSelect = scan.nextInt();
                    if(casherSelect == 1 && user1.money >= 50){
                        System.out.println("포션 구매에 성공 했습니다!");
                        user1.money -= Casher.hpPortion;
                        user1.hpMedicineCounts++;
                        System.out.println("현재 포션 개수 :" + user1.hpMedicineCounts);
                        System.out.println("현재 소지금 :" + user1.money);
                        break;
                    }else if (casherSelect == 1){
                        System.out.println("소지금이 부족합니다.");
                        System.out.println("현재 소지금 :" + user1.money);
                    }

                    if(casherSelect == 2 && user1.money >= 200){
                        System.out.println("이름 변경권 구매 성공!");
                        user1.money -= Casher.reNameCupon;
                        user1.changeNameCouponeCounts++;
                        System.out.println("현재 소지금 :" + user1.money);
                        break;
                    }else if(casherSelect == 2){
                        System.out.println("소지금이 부족합니다.");
                        System.out.println("현재 소지금 :" + user1.money);
                    }
                    if(casherSelect == 3){
                        break;
                    }
                }

            }else if(select == 3){
                while(true){
                    System.out.println("아이템 창을 열었습니다!");
                    System.out.println("현재 소지금 :" + user1.money);
                    System.out.println(" 포션 개수 : " + user1.hpMedicineCounts);
                    System.out.println("닉네임 변경권 개수 : " + user1.changeNameCouponeCounts);
                    System.out.println("[1] 포션 팔기(30원) [2] 닉네임 변경권 팔기(100원) [3] 닉네임 변경하기 [4] 나가기");
                    int bagSelect = 0;
                    bagSelect = scan.nextInt();
                    if(bagSelect == 1 && user1.hpMedicineCounts >= 1){
                        System.out.println("포션을 성공적으로 팔았습니다!");
                        user1.money += 30;
                        System.out.println("현재 소지금 " + user1.money);
                        break;
                    }else if(bagSelect == 1){
                        System.out.println("포션을 소지하고 있지 않습니다.");
                        System.out.println("포션 보유량 : " + user1.hpMedicineCounts);
                    }
                    if(bagSelect == 2 && user1.changeNameCouponeCounts >= 1){
                        System.out.println("닉네임 변경권을 성공적으로 팔았습니다!");
                        user1.money += 100;
                        System.out.println("현재 소지금 " + user1.money);
                        break;
                    }else if(bagSelect == 2){
                        System.out.println("닉네임 변경권을 소유하고 있지 않습니다.");
                        System.out.println("포션 보유량 : " + user1.changeNameCouponeCounts);
                    }
                    if(bagSelect == 3 && user1.changeNameCouponeCounts >= 1){
                        System.out.println("정말로 닉네임을 변경 하시겠습니까? [1] Y [2] N");
                        int rename = scan.nextInt();
                        if(rename == 1){
                            System.out.println("변경하실 닉네임을 입력해주세요");
                            String a = scan.nextLine();
                            String reName = scan.nextLine();
                            user1.name = reName;
                            System.out.println("앞으로 유저1의 이름은 " + user1.name + "입니다!");
                            break;
                        }else{
                            System.out.println("취소하셨습니다!");
                        }
                    }
                    if(bagSelect == 4){
                        break;
                    }
                }

            }else if(select == 4){
                System.out.println("게임을 종료합니다.");
                break;
            }else{
                System.out.println("로그아웃");
            }
        }
    }
}