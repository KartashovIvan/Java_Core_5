package lesson4.homework.advanced;

public class Task1 {

    private double increment = 0.01123;
    private double result = 0;
    private int counter; // переменная для подсчета количества прибавлений increment к result

    //сеттер для изменения increment, по умолчанию равна 0.01123
    public void setIncrement(double increment){
        this.increment = increment;
    }
    //метод для прибавления к result переменной increment
    public void circle () {
        for (int i =0;result < 1_000_000;i++){
            result += increment;
            counter ++;
        }
        System.out.println("Колличество прибавлений increment " + counter + "\nЗначение result " + result);
    }

}
