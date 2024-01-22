public class Student {
    int age;
    String name;
    double height;

    //기본 생성자
    //메소드랑 비슷한 형태지만 , 반환형 자리가 없다. => 생성자 형태임
    public Student(){
        System.out.println("기본 생성자를 호출했어요");
    }
    //커스텀 생성자
    public Student(int _age, String _name, double _height){
        age = _age;
        name = _name;
        height = _height;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
