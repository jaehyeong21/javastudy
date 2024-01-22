// 암시적, 명시적
// 업캐스팅, 다운캐스팅 ( 객체들간의 캐스팅)

// 자바의 5대개념 (4개)
// 클래스
// 객체
// 상속
// 다형성 (객체가 다양한 형태로 변경될 수 있다
// 캡슐화

public class CastingMain2 {
    public static void main(String[] args){
        //Student student = new Student();
        //ChoStudent cho1 = new ChoStudent();
        //JoongStudent joong1 = new JoongStudent();

        //s1.study();
        //cho1.study();
        //joong1.study();

        Student s1 = new ChoStudent(); // 업캐스팅
        Student s2 = new JoongStudent(); //업캐스팅
        Student s3 = new JoongStudent(); //업캐스팅

        s1.study();
        s2.study();
        s3.study();

        Student[] students = new Student[3];
        students[0] = new ChoStudent();
        students[1] = new JoongStudent();
        students[2] = new JoongStudent();

        for(int i = 0; i < students.length; i++){
            students[i].study();
        }

        // 명시적(다운캐스팅)
        // 큰 개념 -> 작은 ( Student -> 초딩 ? 중딩?)
        // 업 캐스팅 된 객체를 다운 캐스팅으로 돌려 놓을때
        ChoStudent cho1 = (ChoStudent) students[0];
        cho1.study();
    }
}
