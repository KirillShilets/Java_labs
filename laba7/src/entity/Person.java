package entity;

import entity.enums.PersonGender;

import java.io.Serializable;

public class Person implements Serializable {
    private String last_name;
    private Integer age;
    private PersonGender gender;

    private static final long serialVersionUID = 1L;

    public Person(String last_name, Integer age, PersonGender gender) {
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public PersonGender getGender() {
        return gender;
    }

    public void setGender(PersonGender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "last_name='" + last_name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
