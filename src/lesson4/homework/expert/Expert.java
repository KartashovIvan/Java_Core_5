package lesson4.homework.expert;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

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

//        int cout=0;
//        String[] str = GeneratorExpertHomework.getData().get(256).get("input");
//        for (String s : str){
////            System.out.println(s);
//
//            if (s.matches("М[\\d]{3}АВ[\\d]{3}")){
//                System.out.println(s);
//                cout++;
//            }
//        }
//        System.out.println(cout);
        int cout =0;
        Map<Integer, Map<String, String[]>> data= GeneratorExpertHomework.getData();
        for (var da: data.values()) {
            for(var d : da.values()){
                for (String str : d){
                    if (str.matches("М[\\d]{3}АВ[\\d]{3}")){
                        cout++;
                    }
                }
            }
        }

        System.out.println(cout);
    }
}