//추상클래스 (Abstract)

public class AbstractMain {
    public static void main(String[] args){
        Chamsae chamsae = new Chamsae();
        chamsae.fly();
        chamsae.airEat();
        chamsae.jump();

        Tiger t = new Tiger();
        t.airEat();
    }
//    public static void main(String[] args){
//        Bird[] birds = new Bird[3];
//        birds[0] = new Chamsae();
//        birds[1] = new Chicken();
//        birds[2] = new Chamsae();
//
//        for(int i = 0; i<birds.length; i++){
//            birds[i].fly();
//            birds[i].speak();
//            birds[i].walk();
//        }
//    }
}
