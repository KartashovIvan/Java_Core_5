package lesson8.homework.expert;

public class Runner {
    public static void main(String[] args) throws NegativeCostCarException {
        CostCarValue costCarValue = new CarShop(new Car(5000));
        costCarValue.printCost();
    }
}
