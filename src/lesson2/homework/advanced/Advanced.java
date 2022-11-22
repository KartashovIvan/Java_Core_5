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

    public static void Task1() {
        String strNum = "234";

        int intNum = Integer.parseInt(strNum) + "some_text".length();

        System.out.println(intNum);
    }

    public static void Task2() {
        System.out.println(Math.pow((3 + 5), 2));
    }

    public static void Task3() {
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;

        double cost = 0;
        int counterProblem = 0;
        double discount = 1;

        if (!hasFuel && (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem)) {
            System.out.println("Консультация бесплатна");
        }
        if (!hasFuel) {
            cost += 1000;
            System.out.println("Нет топлива. Стоимость за консультацию 1000 руб.");
        }
        if (hasMotorProblem) {
            counterProblem += 1;
            cost += 10_000;
            System.out.println("Проблемы с мотором. Стоимость ремонта 10000 руб.");
        }
        if (hasElectricsProblem) {
            counterProblem += 1;
            cost += 5000;
            System.out.println("Проблемы с электрикой. Стоимость ремонта 5000 руб.");
        }
        if (hasTransmissionProblem) {
            counterProblem += 1;
            cost += 4000;
            System.out.println("Проблемы с КПП. Стоимость ремонта 4000 руб.");
        }
        if (hasWheelsProblem) {
            counterProblem += 1;
            cost += 2000;
            System.out.println("Проблемы с колесами. Стоимость ремонта 2000 руб.");
        }

        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            discount -= 0.2;
        }
        if (counterProblem == 2){
            discount -= 0.1;
        }

        System.out.println("Полная стоимость: " + (cost * discount));
    }
}

