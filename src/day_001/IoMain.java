import java.util.Scanner;

// Input(입력) : 프로그램에서 들어오는 데이터 (키보드, 카메라, 파일..)
// Output(출력) : 프로그램에서 보내는 데이터(모니터 , 스피커)
public class IoMain {
    public static void main(String[] args){
        //키보드 입력 받으려면 무조건 한 줄 작성
        Scanner scan = new Scanner(System.in);

        // 키보드에서 입력받은걸 변수에 넣기
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);


    }
}
