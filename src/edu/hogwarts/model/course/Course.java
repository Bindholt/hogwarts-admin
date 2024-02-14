package edu.hogwarts.model.course;

import edu.hogwarts.model.course.Subject;
import edu.generic.Teacher;
import edu.hogwarts.model.HogwartsStudent;

import java.util.ArrayList;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private ArrayList<HogwartsStudent> students;
    private TeachingMaterial[] materials;

    public Course(Subject subject, Teacher teacher, ArrayList<HogwartsStudent> students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    public Course() {
        this(new Subject(), new Teacher(), new ArrayList<>(), new TeachingMaterial[0]);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<HogwartsStudent> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<HogwartsStudent> students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial... materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        StringBuilder studentString = new StringBuilder();
        for (HogwartsStudent student : students) {
            studentString.append(student).append(", ");
        }
        studentString.replace(studentString.lastIndexOf(", "), studentString.length() - 1, ".");

        StringBuilder materialString = new StringBuilder();
        for (TeachingMaterial material : materials) {
            materialString.append(material).append(", ");
        }
        materialString.replace(materialString.lastIndexOf(", "), materialString.length() - 1, ".");

        return "Course{\n" +
                "subject: " + subject + "\n" +
                "teacher: " + teacher + "\n" +
                "students: " + studentString + "\n" +
                "materials: " + materialString + "\n" +
                "}";
    }
}
