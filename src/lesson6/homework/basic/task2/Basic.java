package lesson6.homework.basic.task2;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

//       Ссылки можно сделать типом Car
        PickUp pickUp = new PickUp();
        Sedan sedan = new Sedan();

        Car[] cars = {pickUp,sedan,new PickUp(),new Sedan()};
    }
}
