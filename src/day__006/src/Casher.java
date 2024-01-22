public class Casher {
    int hpPortion = 50;
    int reNameCupon = 200;

    public Casher(){
        System.out.println("상점이 생성 되었습니다.");
    }

    @Override
    public String toString() {
        return "Casher{" +
                "hpPortion=" + hpPortion +
                ", reNameCupon=" + reNameCupon +
                '}';
    }
}
