package lesson8.homework.basic;

public class Plane implements CanFly{
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() {
        {
            try {
                if (countPassengers <= 0){
                    throw new FlyException();
                }else {
                    System.out.println("Самолет летит");
                }
            } catch (FlyException e) {
                System.out.println("Ошибка: пассажиров в самолете меньше 0");
            }
        }
    }
}
