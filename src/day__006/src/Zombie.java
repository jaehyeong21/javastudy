public class Zombie {
    int hp;
    String name;

    public Zombie(){
        System.out.println("좀비가 생성 되었습니다.");
    }

    public Zombie(int _hp, String _name){
        hp = _hp;
        name = _name;
        System.out.println(name + "좀비 생성");
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}
