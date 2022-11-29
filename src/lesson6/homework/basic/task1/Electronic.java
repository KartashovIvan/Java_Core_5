package lesson6.homework.basic.task1;

public abstract class Electronic {
    boolean working;

    public static void onOff () {
        System.out.println("Включен/Выключен");
    }

    public abstract void work ();
}
