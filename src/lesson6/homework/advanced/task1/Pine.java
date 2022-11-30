package lesson6.homework.advanced.task1;

public class Pine extends Wood implements CanSmell{
    private String name;

    public Pine(String name){
        this.name = name;
    }

    public void canSmell() {
        System.out.println(this.name + " : умеет пахнуть");
    }
}
