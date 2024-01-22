package day__007_Class;

import java.util.*;

public class day__007 {
    public static void main(String[] args){
        List<String> fruit = new ArrayList<>();
        Set<String> peoples = new HashSet<>();
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruits apple = new fruits("apple", 1);
        fruits banana = new fruits("banana", 2);
        fruits peach = new fruits("peach", 3);

        fruitPrices.put(apple.name, apple.key);
        fruitPrices.put(banana.name, banana.key);
        fruitPrices.put(peach.name, peach.key);

        People p1 = new People("유리");
        People p2 = new People("짱구");
        People p3 = new People("짱구");

        fruit.add(apple.name);
        fruit.add(banana.name);
        fruit.add(peach.name);System.out.println(peoples);
        System.out.println(fruit);

        peoples.add(p1.name);
        peoples.add(p2.name);
        peoples.add(p3.name);
        System.out.println(peoples); //중복 된 데이터는 무시

        System.out.println(fruitPrices);
    }
}