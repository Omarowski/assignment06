package FirstClasses;

import ENUMS.AcademicDegrees;
import ENUMS.Nationality;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

public class Teacher extends Person{
    private AcademicDegrees academicDegrees;
    private LocalDate hireDate;

    private TreeSet<Teacher> teachers = new TreeSet<>();

    public Teacher(String socialSecurityNo, String firstName, String surname, Date dateOfBirth, Nationality nationality, AcademicDegrees academicDegrees, LocalDate hireDate) {
        super(socialSecurityNo, firstName, surname, dateOfBirth, nationality);
        this.academicDegrees = academicDegrees;
        this.hireDate = hireDate;
        teachers.add(this);

    }

    public AcademicDegrees getAcademicDegrees() {
        return academicDegrees;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public TreeSet<Teacher> getTeachers() {
        return teachers;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        if (!super.equals(obj)) return false;
        Teacher teacher = (Teacher) obj;
        return academicDegrees == teacher.academicDegrees &&
                Objects.equals(hireDate, teacher.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), academicDegrees, hireDate);
    }

    @Override
    public int compareTo(Person otherPerson) {
        return super.compareTo(otherPerson);
    }
}
