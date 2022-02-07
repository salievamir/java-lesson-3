package com.geekbrains;

import java.util.*;

public class Main { /*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
        2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
    Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/

    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Samsung", "iPhone", "Acer", "Asus", "iPhone",
                "Apple", "Galaxy", "Xiaomi", "Redme", "Lenovo",
                "Asus", "Dell", "Realme", "OnePlus", "Nokia",
                "Siemens", "Apple", "Samsung", "Lg", "Oppo"
        );

        Set<String> unique = new HashSet<String>(words);
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Количество повторов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
        phoneBook();
    }
    public static void phoneBook(){
        System.out.println("Создаем справочник");
        PhoneBook phonebook = new PhoneBook();

        System.out.println("Добавляем контакты");
        phonebook.add("Солиев", "992927753353");
        phonebook.add("Еремин", "8776665554");
        phonebook.add("Туйчиев", "992937770080");
        phonebook.add("Солиев", "992000073353");
        phonebook.add("Почоев", "992927662723");

        System.out.println("Получаем номера");
        System.out.println("Солиев");
        System.out.println(phonebook.get("Солиев"));
        System.out.println("Еремин");
        System.out.println(phonebook.get("Еремин"));
        System.out.println("Туйчиев");
        System.out.println(phonebook.get("Туйчиев"));

        phonebook.add("Солиев", "992927753353"); //пробуем добавить существующий контакт

        System.out.println(phonebook.get("Почоева")); //пробуем вызвать несуществующий контакт

    }
}