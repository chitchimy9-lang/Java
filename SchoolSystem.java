package co.istad.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {

        Person student = new Student(
                "DARA",
                "Female",
                168,
                new BigDecimal("90"),
                98.0
        );

        Person teacher = new Teacher(
                "KOKO",
                "Male",
                175.,
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

            if (person instanceof Student obj) {
                System.out.println("Score  : " + obj.getScore());
            } else if (person instanceof Teacher obj) {
                System.out.println("Salary : " + obj.getSalary());
            } else {
                System.out.println("Invalid information...!");
            }

            System.out.println("--------------------------");
        });
    }
}
