package lesson4.homework.expert;

import org.w3c.dom.ls.LSOutput;

public class Expert {
    // Задача №1: узнать сколько всего машин со спец номерами(вывести на экран): начинаются на M
    // и заканчиваются на АВ (русские буквы).
    // Не повторяющиеся
    //Для генерации данных воспользоваться GeneratorExpertHomework.getData()

    //Входящие данные
    // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
    // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
    // { 1 : {
    //      "out" : ["К474СЕ178"],
    //      "input": ["А222РТ178"]
    //    },
    //   2 : {
    //        "out" : ["К722АВ12", "А222РТ178"],
    //        "input" : ["М001АВ01", "А023РВ73"],
    //   }
    // ..
    //  }

    //Список технологий:
    // Set (HashSet) - узнать что это, set.contains(), set.put()
    // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
    // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
    // Регулярные выражения - вытащить регион авто
    public static void main(String[] args) {
        System.out.println(GeneratorExpertHomework.getData());
    }
}
