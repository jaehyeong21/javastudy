import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Monster Dragon = new Monster();
        Monster Zombie = new Monster();

        Dragon.hp = scan.nextInt();
        Dragon.mp = scan.nextInt();
        scan.nextLine();
        Dragon.type = scan.nextLine();


        System.out.println(Dragon.toString());
    }
}
