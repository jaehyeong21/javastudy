//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 객체 만드는법
        // 클래스이름 객체명 = new 생성자;
        // Human 클래스를 객체화
        Human h1 = new Human();
        h1.age = 20;
        h1.gender = "남자";
        h1.height = 190.2;
        h1.name = "참새";
        h1.walk();
        h1.run();
        h1.information();
        System.out.println(h1.toString());
    }
}