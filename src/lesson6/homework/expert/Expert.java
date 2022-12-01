package lesson6.homework.expert;

public class Expert {
    public static void main(String[] args) {
        Human human = Human.builder().age(20).name("Ivan").weigh(70).build();
        human.info();
    }
}
