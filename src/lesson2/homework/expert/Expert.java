package lesson2.homework.expert;

public class Expert {
    public static void main(String[] args) {

        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
        // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        String inputData = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";

        //Переменная для записи выбранных данных из inputData
        String noDisguisedData;
        //Переменная для обьединение замаскированных данных в одну строку
        String disguisedData = "";

        int indexStart = inputData.indexOf("<data>"); //переменная для нахождения НАЧАЛЬНОГО индекса символа из которого будут забираться данные
        int indexEnd = inputData.indexOf("</data>"); //переменная для нахождения КОНЕЧНОГО индекса символа из которого будут забираться данные

        //Запись данных в noDisguisedData, которые нужно будет замаскировать
        noDisguisedData = inputData.substring(indexStart +6,indexEnd);

        //Проверка noDisguisedData если они пустые, то ничего не делается
        if (!noDisguisedData.equals("")) {

            String[] arrayData = noDisguisedData.split(";");

            for (int i = 0;i <arrayData.length;i++) {
                if (arrayData[i].matches("7\\d{10}")) {
                    arrayData[i] = arrayData[i].substring(0, 4) + "***" + arrayData[i].substring(7, 11);
                    //Обьединение в одну строку замаскированных данных
                    if (disguisedData.isEmpty()) {
                        disguisedData = arrayData[i];
                    }else {
                        disguisedData = String.join(";",disguisedData, arrayData[i]);
                    }
                }
                if (arrayData[i].matches("[A-Za-z0-9]+[\\-][A-Za-z0-9]+@(.+)|[A-Za-z0-9]+@(.+)")) {
                    //Маскировка почты
                    arrayData[i] = arrayData[i].substring(0, arrayData[i].indexOf("@") - 1) + "*@" + "*".repeat(arrayData[i].indexOf(".") - (arrayData[i].indexOf("@") + 1)) + arrayData[i].substring(arrayData[i].indexOf("."));
                    //Обьединение в одну строку замаскированных данных
                    if (disguisedData.isEmpty()) {
                        disguisedData = arrayData[i];
                    } else {
                        disguisedData = String.join(";", disguisedData, arrayData[i]);
                    }
                }
                if (arrayData[i].matches("[А-Я]{1}[а-яё]* [А-Я]{1}[а-яё]* [А-Я]{1}[а-яё]*")) {
                    //Разбиение ФИО на переменные Фамилия, имя, отчество
                    String[] stringsFIO = arrayData[i].split(" ");
                    String surname = stringsFIO[0];
                    String name = stringsFIO[1];
                    String patronymic = stringsFIO[2];
                    //Маскировка ФИО
                    arrayData[i] = surname.substring(0, 1) + "*".repeat(surname.length() - 2) + surname.substring(surname.length() - 1, surname.length()) + " " + name + " " + patronymic.substring(0, 1) + ".";
                    //Обьединение в одну строку замаскированных данных
                    if (disguisedData.isEmpty()) {
                        disguisedData = arrayData[i];
                    } else {
                        disguisedData = String.join(";", disguisedData, arrayData[i]);
                    }
                }
            }

            inputData = inputData.replace(noDisguisedData, disguisedData);
        }
        System.out.println(inputData);
    }
}
