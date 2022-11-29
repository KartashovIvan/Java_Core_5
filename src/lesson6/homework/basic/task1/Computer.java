package lesson6.homework.basic.task1;

public class Computer extends Electronic{
    public void loadSystem () {
        System.out.println("загрузка компьютера");
    }

    @Override
    public void work() {
        System.out.println("выполняет вычисления");
    }

}
