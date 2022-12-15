package lesson10.homework.advanced;

import java.io.IOException;

import static lesson10.homework.advanced.FinancialRecord.*;

public class Runner {
    private static final String FILEPATH = "/home/ivan/Projects/Java_Core_5/src/lesson10/homework/advanced/report_2.txt";

    public static void main(String[] args) throws IOException {
        doReport(FILEPATH);

        System.out.println("Общие доходы - " + sumIncomes(FILEPATH) + ", общие расходы - " + sumOutcomes(FILEPATH));
    }
}
