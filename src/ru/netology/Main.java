package ru.netology;

public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Иванова")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын " + son);

        try {
            // не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            //возврат недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
