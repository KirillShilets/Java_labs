import entity.Person;
import entity.enums.PersonGender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Ivanov",46, PersonGender.MALE);
        Person secondPerson = new Person("Petrov",19, PersonGender.MALE);
        Person thirdPerson = new Person("Sigizmudova",26, PersonGender.FEMALE);

        ArrayList<Person> people = new ArrayList<>();
        people.add(firstPerson);
        people.add(secondPerson);
        people.add(thirdPerson);

        System.out.println(calculateMiddleAge(firstPerson, secondPerson, thirdPerson));
        System.out.println(calculateMen(people));
    }

    public static Integer calculateMiddleAge(Person p1, Person p2, Person p3) {
        return (p1.getAge() + p2.getAge() + p3.getAge()) / 3;
    }

    public static long calculateMen(List<Person> people) {
        return people
                .stream()
                .filter(person -> person.getGender() == PersonGender.MALE)
                .count();
    }
}
