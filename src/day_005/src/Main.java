//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.height = 180.9;
        s1.name = "참새";
        System.out.println(s1.toString());

        Student s2 = new Student(15, "재형", 180.5 );
        System.out.println(s2.toString());
    }
}