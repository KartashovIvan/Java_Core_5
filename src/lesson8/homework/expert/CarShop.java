package lesson8.homework.expert;

public class CarShop implements CostCarValue{
    private CostCarValue costCarValue;
    public CarShop(CostCarValue costCarValue) {
        this.costCarValue = costCarValue;
    }

    public void printCost (){
        System.out.println("Здравствуй клиент, цена этого авто");
        try {
            costCarValue.printCost();
            System.out.println("Хочешь купить авто?");
        } catch (NegativeCostCarException e) {
            System.out.println("Неизвестна мне");
            System.out.println("Давайте посмотрим другое авто?");
        }
    }
}
