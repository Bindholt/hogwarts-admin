package edu.hogwarts.model;

import java.time.LocalDate;
import edu.generic.Teacher;
import edu.hogwarts.model.House;
import edu.generic.Person;

public class HogwartsTeacher extends Teacher {
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(House house, boolean headOfHouse, LocalDate employmentStart, LocalDate employmentEnd, String fullName) {
        super(employmentStart, employmentEnd, fullName);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(Person person) {
        super(person);
        this.house = new House();
    }

    public HogwartsTeacher() {
        super();
        this.house = new House();
    }
}
