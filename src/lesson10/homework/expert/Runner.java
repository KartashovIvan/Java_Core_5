package lesson10.homework.expert;

import java.io.*;

public class Runner {
    private static final String PATH = "/home/ivan/Projects/Java_Core_5/src/lesson10/homework/expert/reports/";

    public static void main(String[] args) throws IOException {

        DataGenerator.createReports(PATH);
        reportFive(generatePathReports());
        System.out.println("-----------------------------------------");
        outComeAllShops(generatePathReports());
    }

    public static String[] generatePathReports (){
        String[] massMonth = new String[12];
        for (int i =0;i!=12;i++){
            String report = String.format("report_%s_2012.txt",String.format("%02d",i+1));
            massMonth[i]=PATH+report;
        }
        return massMonth;
    }

    public static void reportFive (String[] array) {

        double income = 0;
        int month =1;

        for (String pathReport : array) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathReport))) {

                while (bufferedReader.ready()) {
                    String[] reportArray = bufferedReader.readLine().split(";");
                    if (reportArray[0].equals("pyterochka")) {
                        income += Double.parseDouble(reportArray[1]) - Double.parseDouble(reportArray[2]);
                    }
                }

                System.out.println(String.format("%02d", month) + ".2012: " + income);
                month++;
            } catch (IOException e){
                System.out.println("Что то не так!");
            }
        }
    }

    public static void outComeAllShops (String[] array){
        double outComeFive=0;
        double outComeOkey=0;
        double outComeYdoma=0;
        double outComePerekrestok=0;

        for (String pathReport : array){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathReport))) {
                while (bufferedReader.ready()) {
                    String[] reportArray = bufferedReader.readLine().split(";");
                    if (reportArray[0].equals("pyterochka")) {
                        outComeFive += Double.parseDouble(reportArray[2]);
                    }
                    if (reportArray[0].equals("perekrestok")) {
                        outComePerekrestok += Double.parseDouble(reportArray[2]);
                    }
                    if (reportArray[0].equals("ydoma")) {
                        outComeYdoma += Double.parseDouble(reportArray[2]);
                    }
                    if (reportArray[0].equals("okey")) {
                        outComeOkey += Double.parseDouble(reportArray[2]);
                    }
                }
            } catch (IOException e){
                System.out.println("Что то не так!");
            }
        }

        System.out.println("Расходы pyterochka за весь период: " + outComeFive + "\n"
                +"Расходы perekrestok за весь период: " + outComePerekrestok + "\n"
                +"Расходы ydoma за весь период: " + outComeYdoma + "\n"
                +"Расходы okey за весь период: " + outComeOkey);
    }
}
