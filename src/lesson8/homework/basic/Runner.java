package lesson8.homework.basic;

public class Runner {
    public static void main(String[] args) throws FlyException {
        Duck duck = new Duck(true);
        Duck duck2 = new Duck(false);
        Plane plane = new Plane(10);
        Plane plane2 = new Plane(0);

        duck.fly();
        duck2.fly();
        plane.fly();
        plane2.fly();
    }
}
