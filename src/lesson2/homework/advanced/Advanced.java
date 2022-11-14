package lesson2.homework.advanced;

public class Advanced {

    public static void main(String[] args) {
        System.out.println("Задание №1 - уровень 'Продвинутый'");
        Task1();

        System.out.println("\nЗадание №2 - уровень 'Продвинутый'");
        Task2();

        System.out.println("\nЗадание №3 - уровень 'Продвинутый'");
        Task3();

    }

    public static void Task1 () {
        String strNum = "234";

        int intNum = Integer.parseInt(strNum) + "some_text".length();

        System.out.println(intNum);
    }

    public static void Task2 () {
        System.out.println(Math.pow((3+5),2));
    }

    public static void Task3 () {
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;

        int cost = 0;
        int counter = 0;

        if (!hasFuel&& (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasTransmissionProblem)){
            System.out.println("Консультация бесплатна");
        }
        if (!hasFuel){
            counter+=1;
            cost+=1000;
            System.out.println("Нет топлива. Стоимость ремонта 1000 руб.");
        }
        if (hasMotorProblem) {
            counter+=1;
            cost+=10_000;
            System.out.println("Проблемы с мотором. Стоимость ремонта 10000 руб.");
        }
        if (hasElectricsProblem) {
            counter+=1;
            cost+=5000;
            System.out.println("Проблемы с электрикой. Стоимость ремонта 5000 руб.");
        }
        if (hasTransmissionProblem) {
            counter+=1;
            cost+=4000;
            System.out.println("Проблемы с КПП. Стоимость ремонта 4000 руб.");
        }
        if (hasWheelsProblem) {
            counter+=1;
            cost+=2000;
            System.out.println("Проблемы с колесами. Стоимость ремонта 2000 руб.");
        }


        if (counter >= 2) {
            System.out.println("Полная стоимость ремонта: " + (cost * 0.90));
        }
    }
}
