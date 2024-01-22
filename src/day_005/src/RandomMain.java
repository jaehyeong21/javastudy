import java.util.Random;

public class RandomMain {
    public static void main(String[] args){
        Random random = new Random();
        int randomValue = random.nextInt(45);
        randomValue += 1;
        System.out.println(randomValue);
    }
}
