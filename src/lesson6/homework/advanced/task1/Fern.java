package lesson6.homework.advanced.task1;

public class Fern extends Plant implements MayBloom{
    private String name;

    public Fern(String name){
        this.name = name;
    }

    public void bloom() {
        System.out.println(this.name + " : умеет цвести");
    }
}
