public class Monster {
    int hp;
    int mp;
    String type;
    public void walk(){
        System.out.println("몬스터가 걷는다");
    }

    public void attack(){
        System.out.println("몬스터가 공격한다.");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", type='" + type + '\'' +
                '}';
    }
}
