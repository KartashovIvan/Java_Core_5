package lesson10.homework.advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Runner {
    //Продвинутый уровень
    //Задача №1
    // 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать 10 отчетов (объектов класса FinancialRecord),
    // с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
    // 4. Записать в файл "report_2.txt" все данные из отчетов.
    // 5. Прочитать файл report_2.txt, просуммировать все доходы и вывести на экран,
    // то же самое с расходами
    // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

    public static void main(String[] args) throws IOException {
        String filePath = "/home/ivan/Projects/Java_Core_5/src/lesson10/homework/advanced/report_2.txt";
        new FinancialRecord().doReport(filePath);
        int incomes =0;
        int outcomes =0;

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader (fileReader);
        while (bufferedReader.ready()){
            String[]massSTR = new String[2];
            massSTR = bufferedReader.readLine().split(",");
            incomes +=Integer.parseInt(massSTR[0].substring(8,massSTR[0].length()));
            outcomes += Integer.parseInt(massSTR[1].substring(10, massSTR[1].length()));

        }
        System.out.println("общие доходы - " + incomes + ", общие расходы - " + outcomes);
    }
}
