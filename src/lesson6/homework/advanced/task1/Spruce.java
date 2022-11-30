package lesson6.homework.advanced.task1;

public class Spruce extends Wood implements CanSmell{

    private String name;

    public Spruce(String name){
        this.name = name;
    }

    public void canSmell() {
        System.out.println(this.name + " : умеет пахнуть");
    }
}
