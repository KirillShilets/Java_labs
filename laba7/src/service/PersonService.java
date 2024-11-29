package service;

import entity.Person;
import entity.enums.PersonGender;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {
    public static void createPerson() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите фамилию для человека: ");
        String lastName = "";
        do {
            String temp = sc.nextLine();

            for (char c : temp.toCharArray()) {
                if (Character.isLetter(c)) {
                    lastName += c;
                }
            }
            if(lastName.length() <= 0) {
                System.err.println("Ошибка: Введите человеку фамилию");
            }

        } while (lastName.isEmpty());

        int age = -1;
        System.out.println("Введите возраст для человека: ");
        do {
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine();
                if (age < 0) {
                    System.err.println("Ошибка: Введите корректный возраст человека (неотрицательное число)");
                }
            } else {
                System.err.println("Ошибка: Введите корректный возраст (целое число)");
                sc.next();
            }
        } while (age < 0);

        System.out.println("Введите пол (MALE/FEMALE): ");
        PersonGender gender;
        do {
            String genderStr = sc.nextLine();
            try {
                gender = PersonGender.valueOf(genderStr.toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: Неверный пол. Пожалуйста, введите MALE или FEMALE.");
            }
        } while (true);

        Person person = new Person(lastName, age, gender);
        List<Person> people = new ArrayList<>();
        people.add(person);
        serializePerson(person, "person.dat");

        Person deserializedPerson = deserializePerson("person.dat");
        if (deserializedPerson != null) {
            System.out.println("Информация о человеке: " + deserializedPerson.getLast_name() + ", "
                    + deserializedPerson.getAge() + ", " + deserializedPerson.getGender());
            System.out.println("Средний возраст: "+ calculateMiddleAge(people));
            System.out.println("Количество мужчин: " + calculateMen(people));
        }
    }

    public static Integer calculateMiddleAge(List<Person> people) {
        return (int) people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    public static long calculateMen(List<Person> people) {
        return people
                .stream()
                .filter(person -> person.getGender() == PersonGender.MALE)
                .count();
    }

    public static void serializePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
        } catch (IOException e) {
            System.err.println("Ошибка сериализации: " + e.getMessage());
        }
    }

    public static Person deserializePerson(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка десериализации: " + e.getMessage());
            return null;
        }
    }
}
