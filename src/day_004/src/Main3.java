import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("몇명?");
        int count = scan.nextInt();

        scan.nextLine();

        Human[] humans = new Human[count];
        for (int i = 0; i < count; i++) {
            humans[i] = new Human();

            System.out.println("이름 :");
            humans[i].name = scan.nextLine();

            System.out.println("나이 :");
            humans[i].age = scan.nextInt();

            scan.nextLine();

            System.out.println("성별 :");
            humans[i].gender = scan.nextLine();
        }

        for (int i = 0; i < count; i++) {
            if (humans[i].age >= 20) {
                System.out.println(humans[i].toString());
            }
        }
    }
}