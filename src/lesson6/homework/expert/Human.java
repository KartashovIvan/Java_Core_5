package lesson6.homework.expert;

//Экспертный уровень:
//Задача №1
// Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
// Для этого шаблона характерно:
// 1. приватный конструктор,
// 2. вложенный статический класс (HumanBuilder)
// 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
// Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
// 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
// которые вызывают сеттеры у экземпляра класса Human.
// 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
// Ожидаемый результат
// Human human = Human.builder().name("Петр").age(20).weight(80).build();
// human.info()
// Петр - возраст 20, вес 80

public class Human {
    private int age;
    private String name;
    private int weigh;

    private Human(HumanBuilder humanBuilder) {
        this.age = humanBuilder.age;
        this.name = humanBuilder.name;
        this.weigh = humanBuilder.weigh;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeigh() {
        return weigh;
    }

    public static HumanBuilder bilder(){
        return new HumanBuilder();
    }

    public void info (){
        System.out.println(getName() + " - возраст "+ getAge() + ", вес "+ getWeigh());
    }

    public static class HumanBuilder {
        private Human human;
        private int age;
        private String name;
        private int weigh;

        public HumanBuilder age(int age) {
            this.age = age;
            return this;
        }

        public HumanBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder weigh(int weigh) {
            this.weigh = weigh;
            return this;
        }

        private HumanBuilder(){
            this.human = new Human(this);
        }

        public Human build(){
            return new Human(this);
        }

    }
}
