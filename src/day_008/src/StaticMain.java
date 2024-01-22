// static은 static끼리 논다~
// 공통적으로 가리켜야할 위치 또는 값이 바뀌어야 할 때 사용
//

public class StaticMain {
    public static void main(String[] args){
        System.out.println("안녕");
        StaticTest.num2 = 10;
        StaticTest st = new StaticTest();
        st.num = 10;
        StaticTest.go();

        StaticTest st1 = new StaticTest();
        st1.num = 10;
        System.out.println(st1.num);

        StaticTest st2 = new StaticTest();
        st2.num = 20;
        System.out.println(st2.num);

        StaticTest.num2 = 30;
        System.out.println(StaticTest.num2);
    }
}
