package lesson8.homework.expert;

public class Car implements CostCarValue {
    private double costCar;

    public Car(double costCar) {
        this.costCar = costCar;
    }

    public void printCost () throws NegativeCostCar {
        if  (this.costCar < 0){
            throw new NegativeCostCar();
        } else {
            System.out.println("Меня взяли из кар");}
    }
}
