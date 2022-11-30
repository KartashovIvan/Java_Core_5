package lesson6.homework.advanced.task2;

public abstract class Stock {
    private static int vodka;

    public static int getVodka() {
        return vodka;
    }

    public static void setVodka(int vodka) {
        Stock.vodka = vodka;
    }
}
