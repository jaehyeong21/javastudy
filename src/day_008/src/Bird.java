//추상클래스 : abstract 연관
//메소드를 추상화 할 수 있음 : 접근 제한자 다음에 abstract붙이면 됨
//추상 메소드가 1개라도 있는 클래스는 추상클래스가 되어야함
//추상 클래스느 추상 메소드만 있는가? X
//일반함수, 일반 메소드
//추상클래스는 단독적으로 객체화 할 수 없음
// 1) 상속받아서 업캐스팅
// 2) 익명 클래스

//이거 왜 써요?
//메소드 오버라이딩을 강제할 수 있음
//Bird 상속 받는건 너희들 마음인데, fly랑 walk는 반드시 오바라이딩 해라
public abstract class Bird {
    String name;
    public abstract void fly();

    public abstract void walk();

    public void speak(){
        System.out.println("새가 말해요~");
    }


}
