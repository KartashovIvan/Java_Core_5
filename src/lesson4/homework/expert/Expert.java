package lesson4.homework.expert;

import java.util.*;

public class Expert {
    public static void main(String[] args) {

        Set<String> setGosNumberCar = new HashSet<>();

        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();

        for (Map<String, String[]> mapString : data.values()) {
            for (String[] arrayValue : mapString.values()) {
                for (String str : arrayValue) {
                    if (str.matches("М[\\d]{3}АВ[\\d]{3}")) {
                        setGosNumberCar.add(str);
                    }
                }
            }
        }
        System.out.println(setGosNumberCar.size());

    }
}