public class Human {
    String name;
    int money;

    public Human(String _name, int _money){
        name = _name;
        money = _money;

        System.out.println(name + "이 생성되었습니다");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
