package com.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> book;

    public PhoneBook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Добвлен новый контакт %s, с номером: %s.", surname, number));
            } else {
                System.out.println(String.format("Контакт с номером %s и фамилией %s уже существует.", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Добвлен новый контакт %s, с номером: %s.", surname, number));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("В контактах не найден номер с фамилией %s", surname));
            return new ArrayList<>();
        }
    }
}
