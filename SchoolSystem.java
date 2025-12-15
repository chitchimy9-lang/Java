package co.istad.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        Person student = new Student(
                "DARA",
                "Female",
                168f,
                98.0
        );

        Person teacher = new Teacher(
                "KOKO",
                "Male",
                175f,
                new BigDecimal("1500")
        );

        List<Person> people = new ArrayList<>();
        people.add(student);
        people.add(teacher);

        School<Person> school = new School<>();
        school.setData(people);

        school.getData().forEach(person -> {
            System.out.println("Name   : " + person.getName());
            System.out.println("Gender : " + person.getGender());
            System.out.println("Height : " + person.getHeight());

            if (person instanceof Student s) {
                System.out.println("Score  : " + s.getScore());
            } else if (person instanceof Teacher t) {
                System.out.println("Salary : " + t.getSalary());
            }

            System.out.println("--------------------------");
        });
    }
}

