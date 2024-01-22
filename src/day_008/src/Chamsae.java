public class Chamsae extends Bird implements LandAnimalBehavior, TwoLegsAnimalBehavior{
    @Override
    public void fly() {
        System.out.println("참새가 날아요~");
    }

    @Override
    public void speak() {
        System.out.println("쨱짹짹");
    }

    @Override
    public void walk() {
        System.out.println("참새가 걸어요");
    }

    @Override
    public void airEat() {
        System.out.println("참새가 숨쉬어요");
    }

    @Override
    public void jump() {
        System.out.println("참새가 뛰어요");
    }
}
