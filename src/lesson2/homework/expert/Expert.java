package lesson2.homework.expert;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expert {
    //Экспертный уровень
    //Задача №1
    //Создать метод маскирования персональных данных, который:
    //Телефон (до/после маскирования): 79991113344 / 7999***3344
    //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
    //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
    //
    //Входящие параметры: String text
    //Возвращаемый результат: String
    //
    //Примеры возможного текста:
    //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
    // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
    //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
    //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

    //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
    //Регулярные выражения, класс StringBuilder

    public static void main(String[] args) {
        String inputData = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";

        String emailUser = "";
        String phoneUser = "";
        String fioUser = "";

        int indexStart = inputData.indexOf("<data>");
        int indexEnd = inputData.indexOf("</data>");

        String noDisguisedData = inputData.substring(indexStart +6,indexEnd);

        String [] arrayData = noDisguisedData.split(";");

        for ( String str : arrayData){
             if (str.matches("7\\d{10}")){
                 phoneUser = str;
             }
             if(Pattern.matches("\\w\\({А-Я}\\)  ",str));

        }




//        for (String str : arrayData){
//            Pattern patternPhone = Pattern.compile("7\\d{10}");
//            Matcher matcherPhone = patternPhone.matcher(str);
//            if (matcherPhone.matches()){
//                phoneUser = str;
//            }
//            Pattern patternFioUser = Pattern.compile("  ")
//        }

        System.out.println(phoneUser);



    }
}
