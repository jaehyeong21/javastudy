// 정보 : 변수
// 행위 : 메소드
// 메인 메소드가 포함된 파일이 아니라면 , static 안붙이고 메소드 생성 가능

public class Human {
    int age;
    String name;
    double height;
    String gender;

    //걷다
    public void walk(){
        System.out.println("사람이 걷는다.");
    }
    public void run(){
        System.out.println("뛴다");
    }

    public void information(){
        System.out.println("이름 : "+ name);
        System.out.println("나이 : "+ age);
        System.out.println("키 : "+ height);
        System.out.println("성별 : "+ gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }
}
