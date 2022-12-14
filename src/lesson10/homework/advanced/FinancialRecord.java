package lesson10.homework.advanced;

import java.io.FileWriter;
import java.io.IOException;
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

    public FinancialRecord() {
        this.incomes = new Random().nextInt(10000);
        this.outcomes = new Random().nextInt(10000);
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }


    public void doReport (String filePath){
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (int i =0;i!=10;i++){
                FinancialRecord financialRecord = new FinancialRecord();
                fileWriter.write("Доход = " + financialRecord.getIncomes() + ", расход = " +financialRecord.getOutcomes()+ "\n" );
            }
        } catch (IOException e){
            System.out.println("Что то не так!");
        }
    }
}
