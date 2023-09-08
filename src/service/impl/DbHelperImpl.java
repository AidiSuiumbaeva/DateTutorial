package service.impl;

import service.DbHelper;

import java.util.*;

public class DbHelperImpl implements DbHelper {
    Map<String,String> countryCapital=new HashMap<>();
    List<String> cities=new ArrayList<>();
    List<String> countries =new ArrayList<>();

    @Override
    public void getMap() {
        countryCapital.put("Франция", "Париж");
        countryCapital.put("Германия", "Берлин");
        countryCapital.put("Италия", "Рим");
        countryCapital.put("Россия", "Москва");
        countryCapital.put("США", "Вашингтон");
        countryCapital.put("Канада", "Оттава");
        countryCapital.put("Бразилия", "Бразилиа");
        countryCapital.put("Австралия", "Сидней");
        countryCapital.put("Китай", "Пекин");
        countryCapital.put("Япония", "Токио");
        countryCapital.put("Индия", "Нью-Дели");
        countryCapital.put("Южная Корея", "Сеул");
        countryCapital.put("Греция", "Афины");
        countryCapital.put("Египет", "Каир");
        countryCapital.put("Турция", "Анкара");
        countryCapital.put("Мексика", "Мехико");
        countryCapital.put("Колумбия", "Богота");
        countryCapital.put("Аргентина", "Буэнос-Айрес");
        countryCapital.put("Чили", "Сантьяго");
        countryCapital.put("Швеция", "Стокгольм");
        countryCapital.put("Норвегия", "Осло");
        countryCapital.put("Финляндия", "Хельсинки");
        countryCapital.put("Дания", "Копенгаген");
        countryCapital.put("Нидерланды", "Амстердам");
        countryCapital.put("Бельгия", "Брюссель");

        for (Map.Entry<String,String> item:countryCapital.entrySet()){
            cities.add(item.getValue());
            countries.add(item.getKey());
        }
        Collections.shuffle(cities);
        Collections.shuffle(countries);
    }

    @Override
    public HashMap getQuestion() {
        HashMap<String,HashMap<String,Boolean>> result=new HashMap<>();
        String country= countries.get(0);
        countries.remove(country);
        Collections.shuffle(countries);
        String capital=countryCapital.get(country);

        HashMap<String,Boolean> options=new HashMap<>();

        options.put(capital,true);
        cities.remove(capital);
        for (int i=0;i<3;i++){
            options.put(cities.get(i),false);
        }
        cities.add(capital);
        result.put(country,options);
        Collections.shuffle(cities);
        Collections.shuffle(countries);
        return result;
    }


}
