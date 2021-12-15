package ru.mirea.task27.opt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitiesMap {
    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("Москва", "Россия"),
                new City("Брянск", "Россия"),
                new City("Севастополь", "Россия"),
                new City("Берлин", "Германия"),
                new City("Мюнхен", "Германия"),
                new City("Рим", "Италия"),
                new City("Неаполь", "Италия")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();

        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
