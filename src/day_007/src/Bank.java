public class Bank {
    private int money;
    private String address;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money, Human human) {
        if(human.name.equals("은행장")){
            this.money = money;
        } else{
            System.out.println("이놈!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
