package lesson6.homework.expert;

public class Human {
    private int age;
    private String name;
    private int weigh;

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getWeigh() {
        return weigh;
    }

    private void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public static HumanBilder builder (){
        return new HumanBilder();
    }

    public void info (){
        System.out.println(getName() + " - возраст "+ getAge() + ", вес "+ getWeigh());
    }

    public static class HumanBilder{
        private Human human;

        public HumanBilder(){
            this.human = new Human();
        }

        public HumanBilder age (int age) {
            this.human.setAge(age);
            return this;
        }

        public HumanBilder name (String name) {
            this.human.setName(name);
            return this;
        }

        public HumanBilder weigh (int weigh) {
            this.human.setWeigh(weigh);
            return this;
        }

        public Human build () {
            return human;
        }

    }
}
