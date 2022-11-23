package lesson4.homework.advanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Advanced {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        Task1 task1 = new Task1();
        task1.circle();

        System.out.println("\nЗадание №2");
        //Случайная длина массива
        Random rnd = new Random();
        task2(rnd.nextInt(1,30));

        System.out.println("\nЗадание №3");
        task3();

        System.out.println("\nЗадание №4");
        task4();
    }

    public static void task2 (int lengthMass) {

        //цикл для заполнение массива еденицами
        int[] array = new int[lengthMass];
        for (int i = 0;i < array.length;i++){
            array[i] = 1;
        }
        //цикл для замены нечетных элементов на ноль
        for (int i=0;i< array.length; i++){
            if (i%2==0){
                array[i] = 0;
            }
        }

        System.out.println("Массив после обработки - " + Arrays.toString(array));
    }

    public static void task3 () {
        int[] arrayOne = {1,2,5,7,10};
        int[] arrayTwo = {2,3,2,17,15};
        int[] generalArray = new int[15];

        int counter = 0;

        //цикл для записи первого массива в общий
        for(int i =0;i< arrayOne.length;i++){
            counter ++;
            generalArray[i] = arrayOne[i];
        }
        //цикл для записи второго массива в общий
        for(int i =0;i< arrayTwo.length;i++){
            generalArray[counter] = arrayTwo[i];
            counter++;
        }
        //цикл для перемножения первого и второго массива в общий
        for (int i =0; i <5; i++){
            generalArray[counter +i] = arrayOne[i] * arrayTwo[i];
        }

        System.out.println(Arrays.toString(generalArray));
    }

    public static void task4 () {
        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

        String hw = "Hello world!";

        System.out.println(hw.replace("l","r").toUpperCase().substring(0,8));
    }
}
