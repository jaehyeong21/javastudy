// 메소드(method) = 함수(function)
// 뭔가 들어왔을 때 처리해서 결과 내주는 장치
/// 메소드 형태 4개
// 입구 : 매개변수, 파라미터, 인자, 인수
// 출구 : 리턴타입, 반환형, 반환타입
// 1) 입구 X, 출구 X == test1
// 2) 입구 O, 출구 X == test2
// 3) 입구 X, 출구 O == test3
// 4) 입구 O, 출구 O == test4

public class day_03 {
    public static void main(String[] args){
        //test1();
        //test2(5, 10);
        //int result = test3();
        //System.out.println(result);
        int result = test4(5,10);
        System.out.println(result);
    }

    //public 출구 메소드이름(입구)
    public static void test1(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    public static void test2(int num1 , int num2){
        System.out.println(num1);
        System.out.println(num2);
    }

    public static int test3(){
        int num = 10;
        System.out.println("숫자를 주겠습니다.");
        return num;
    }

    public static int test4(int num1, int num2){
        int sum = num1 * num2;
        System.out.println(sum);
        return sum;
    }
}
