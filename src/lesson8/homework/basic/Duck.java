package lesson8.homework.basic;

public class Duck implements CanFly {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() {
        {
            try {
                if(isInjured == true) {
                    throw new FlyException();
                }else {
                    System.out.println("Утка летит");
                }
            } catch (FlyException e) {
                System.out.println("Ошибка: утка ранена");
            }
        }
    }
}
