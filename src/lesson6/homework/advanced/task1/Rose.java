package lesson6.homework.advanced.task1;

public class Rose extends Plant implements MayBloom, CanSmell{
    private String name;

    public Rose(String name){
        this.name = name;
    }

    public void bloom() {
        System.out.println(this.name + " : умеет цвести");
    }

    public void canSmell() {
        System.out.println(this.name + " : умеет пахнуть");
    }
}
