package FirstClasses;

import ENUMS.AllSubjects;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class Subject {

    private AllSubjects name;
    private Department supervisingDept;
    private Teacher lecturer;
    private List<Student> students;

    private static TreeSet<Subject> subjects = new TreeSet<>();

    public Subject(AllSubjects _name, Department supervisingDept, Teacher lecturer, List<Student> students) {
        this.name = _name;
        this.supervisingDept = supervisingDept;
        this.lecturer = lecturer;
        this.students = students;
        subjects.add(this);
    }

    public TreeSet<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Subject subject = (Subject) obj;
        return name == subject.name &&
                Objects.equals(supervisingDept, subject.supervisingDept) &&
                Objects.equals(lecturer, subject.lecturer) &&
                Objects.equals(students, subject.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supervisingDept, lecturer, students);
    }
}
