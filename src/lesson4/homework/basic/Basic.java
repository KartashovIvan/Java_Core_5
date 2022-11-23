package lesson4.homework.basic;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Задание 1 Базовый уровень");
        Task1();

        System.out.println("\nЗадание 2 Базовый уровень");
        Task2();
    }

    public static void Task1(){
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        for (int i=0; i<3;i++){
            System.out.print(hi.trim()+ world.toLowerCase()+newLine);
        }
    }

    public static void Task2() {
        for (int i = 1;i < 101;i++){
            System.out.print(i+"a"+" ");
        }
    }
}
