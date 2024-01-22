package day007Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();

        while (true) {
            int select = 0;
            System.out.println("[1]학생 추가 [2] 조회");
            select = scan.nextInt();
            scan.nextLine(); // 엔터 처리
            if (select == 1) {
                System.out.println("추가 할 학생 이름을 입력해주세요");
                String name = scan.nextLine();
                System.out.println("추가 할 학생의 학번을 입력해주세요");
                int number = scan.nextInt();
                studentsList.add(new Student(name, number));
                System.out.println("학생이 추가되었습니다.");
            } else if (select == 2) {
                System.out.println("학생을 조회합니다. 조회 할려는 학생 번호를 입력해주세요");
                int number = scan.nextInt();
                for(Student student : studentsList){
                    if(number == student.getNumber()){
                        System.out.println("조회한 학생 : " + student.getName());
                        break;
                    }else{
                        System.out.println("해당하는 학생이 없습니다.");
                    }
                }
            }
        }
    }
}
