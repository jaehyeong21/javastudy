import java.util.Scanner;

public class day01_project {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int avg;
        System.out.println("국어 점수 : ");
        int koreanScore = scan.nextInt();
        System.out.println("영어 점수 : ");
        int englishScore = scan.nextInt();
        System.out.println("수학 점수 : ");
        int mathScore = scan.nextInt();

        avg = (koreanScore + englishScore + mathScore) / 3;

        if(avg >= 90){
            System.out.println("A+");
        }
        else if(avg >= 80){
            System.out.println("B+");
        }
        else if(avg >= 70){
            System.out.println("C+");
        }
        else{
            System.out.println("F");
        }
    }
}
