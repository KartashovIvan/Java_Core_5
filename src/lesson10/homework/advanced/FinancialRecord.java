package lesson10.homework.advanced;

import java.io.*;
import java.util.Random;

public class FinancialRecord {
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

    private int incomes;
    private int outcomes;

    private FinancialRecord() {
        this.incomes = new Random().nextInt(10000);
        this.outcomes = new Random().nextInt(10000);
    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }


    public static void doReport (String filePath){
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (int i =0;i!=10;i++){
                FinancialRecord financialRecord = new FinancialRecord();
                fileWriter.write("Доход = " + financialRecord.getIncomes() + ", расход = " +financialRecord.getOutcomes()+ "\n" );
            }
        } catch (IOException e){
            System.out.println("Что то не так!");
        }
    }

    public static int sumIncomes (String filePath) throws IOException {
        int incomes =0;

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader (fileReader);
        while (bufferedReader.ready()){
            String[]massSTR = new String[2];
            massSTR = bufferedReader.readLine().split(",");
            incomes +=Integer.parseInt(massSTR[0].substring(8));
        }
        fileReader.close();
        bufferedReader.close();
        return incomes;
    }

    public static int sumOutcomes (String filePath) throws IOException {
        int outcomes =0;

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader (fileReader);
        while (bufferedReader.ready()){
            String[]massSTR = new String[2];
            massSTR = bufferedReader.readLine().split(",");
            outcomes += Integer.parseInt(massSTR[1].substring(10));
        }
        fileReader.close();
        bufferedReader.close();

        return outcomes;
    }
}
