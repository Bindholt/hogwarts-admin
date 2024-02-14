package edu.generic;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person() {
        this("Unknown", "Unknown", "Unknown");
    }

    public Person(Person person) {
        this(person.getFirstName(), person.getMiddleName(), person.getLastName());
    }

    public Person(String fullName) {
        setFullName(fullName);
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        if (hasMiddleName() && hasLastName()) {
            return firstName + " " + middleName + " " + lastName;
        } else if (hasMiddleName()) {
            return firstName + " " + middleName;
        } else if (hasLastName()) {
            return firstName + " " + lastName;
        } else {
            return firstName;
        }
    }

    public void setFullName(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length == 3) {
            this.firstName = names[0];
            this.middleName = names[1];
            this.lastName = names[2];
        } else if (names.length == 2) {
            this.firstName = names[0];
            this.middleName = names[1];
        } else {
            this.firstName = names[0];
        }
    }

    public boolean hasMiddleName() {
        return middleName != null;
    }

    public boolean hasLastName() {
        return lastName != null;
    }

}
