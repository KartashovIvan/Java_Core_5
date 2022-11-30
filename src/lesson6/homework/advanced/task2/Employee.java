package lesson6.homework.advanced.task2;

public class Employee {
    private static int countWorkers=0;
    private String name;
    private int employeeJournal=0;

    public Employee (String name){
        this.name = name;
        countWorkers++;
    }

    public static int getCountWorkers() {
        return countWorkers;
    }

    public String getName() {
        return name;
    }
    public int getEmployeeJournal(){
        return this.employeeJournal;
    }

    public void takeVodka () {
        if (Stock.getVodka() > 0) {
            Stock.setVodka(Stock.getVodka() - 1);
            employeeJournal++;
            System.out.println("Ура я испортил водку!");
            System.out.println("Остаток на складе " + Stock.getVodka());
            System.out.println(this.name + " испортил " + this.employeeJournal + " шт" + "\n_________________________");
        } else {
            System.out.println(this.name +" говорит что больше нечего портить");
        }
    }
}
