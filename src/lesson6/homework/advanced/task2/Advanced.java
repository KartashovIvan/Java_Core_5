package lesson6.homework.advanced.task2;

// Задание №2:
// Написать систему управления складскими запасами. Создать класс склад, создать класс работники
// (написать геттеры на все аттрибуты).
// Количество работников минимум 3.
// Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
// Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
// "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
// У склада есть только одна позиция - Водка.

public class Advanced {
    public static void main(String[] args) {
        Stock.setVodka(10);
        Employee Ivan = new Employee("Ivan");
        Employee Jon = new Employee("Jon");
        Employee Ban = new Employee("Ban");

        Employee[] employees = {Ivan, Jon, Ban};


        while (Stock.getVodka()>0){

            for (Employee employee : employees){
                employee.takeVodka();
            }
        }
        /**
         Можно выполнить в цикле обьеденив в массив
         */
//        Employee[] employees = {Ivan, Jon, Ban};
//        for (Employee employee : employees){
//            employee.takeVodka();
//        }
/**
 Можно просто вызывать у каждого метод
 */
//        Ivan.takeVodka();
//        Jon.takeVodka();
//        Jon.takeVodka();
//        Ban.takeVodka();
//        Ban.takeVodka();
//        Ban.takeVodka();
//        Ivan.takeVodka();
//        Ivan.takeVodka();
//        Jon.takeVodka();
//        Ban.takeVodka();
    }
}
