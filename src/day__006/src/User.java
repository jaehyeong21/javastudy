public class User {
    int hp;
    String name;
    double money;
    int hpMedicineCounts;
    int changeNameCouponeCounts;

    //생성자
    public User(){
        System.out.println("유저가 생성 되었습니다.");
    }

    public User(int _hp, String _name, double _money, int _hpMedicineCounts, int _changeNameCouponeCounts){
        hp = _hp;
        name = _name;
        money = _money;
        hpMedicineCounts = _hpMedicineCounts;
        changeNameCouponeCounts = _changeNameCouponeCounts;
        System.out.println(name + "생성했습니다.");
    }

    @Override
    public String toString() {
        return "User{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", hpMedicineCounts=" + hpMedicineCounts +
                ", changeNameCouponeCounts=" + changeNameCouponeCounts +
                '}';
    }
}
