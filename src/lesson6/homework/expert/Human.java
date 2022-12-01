package lesson6.homework.expert;

public class Human {
    private int age;
    private String name;
    private int weigh;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
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
