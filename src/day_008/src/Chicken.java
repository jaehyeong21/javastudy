// 자바는 1개의 클래스만 상속받을 수 있음

public class Chicken extends Bird implements LandAnimalBehavior{
    @Override
    public void fly() {
        System.out.println("닭이 날아요~");
    }

    @Override
    public void speak() {
        System.out.println("꼬꼬댁");
    }

    @Override
    public void walk() {
        System.out.println("닭이 걸어요");
    }

    @Override
    public void airEat() {
        System.out.println("닭이 숨쉬어요");
    }
}
