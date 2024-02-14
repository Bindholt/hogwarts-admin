package edu.hogwarts.model;
import edu.generic.Student;
import edu.generic.Person;


public class HogwartsStudent extends Student {
    private final EmpType role = EmpType.STUDENT;
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent(House house, boolean prefect, String[] teams, int enrollmentYear, int graduationYear, boolean graduated, String fullName) {
        super(enrollmentYear, graduationYear, graduated, fullName);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(House house, boolean prefect, String[] teams, Person person) {
        super(person);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent() {
        super();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public EmpType getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{\n" +
                "fullName: " + getFullName() + "\n" +
                "house: " + house.getName() + "\n" +
                "prefect: " + prefect + "\n" +
                "teams: " + teams + "\n" +
                "enrollmentYear: " + getEnrollmentYear() + "\n" +
                "graduationYear: " + getGraduationYear() + "\n" +
                "graduated: " + isGraduated() + "\n" +
                "}";
    }
}
