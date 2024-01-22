//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//캐스팅 : 자료 형 간의 변환 (객체 형 간의 변환)
//일반 자료형 : int, double , char , byte, float
//객체형 : String , Student

//int -> double : 묵시적(암시적) 캐스팅 : implicit
//double -> int : 명시적 캐스팅 : explicit

public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        double castedNum1 = num1;
        System.out.println(castedNum1);

        double num2 = 3.14;
        int castedNum2 = (int) num2;
        System.out.println(castedNum2);

        String num3 = "3.15";
        double castedNum3 = Double.parseDouble(num3);
        System.out.println(castedNum3);

        String num4 = "3";
        int castedNum4 = Integer.parseInt(num4);
        System.out.println(castedNum4);
    }
}