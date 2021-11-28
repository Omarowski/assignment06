package FirstClasses;

import ENUMS.Nationality;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;


public class Student extends Person {


    private final int bookNum;
    private final TreeSet<Student> students = new TreeSet<>();


    public Student(String socialSecurityNo, String firstName, String surname, Date dateOfBirth, Nationality nationality, int bookNum) {
        super(socialSecurityNo, firstName, surname, dateOfBirth, nationality);
        this.bookNum = bookNum;
        students.add(this);

    }

    public int getBookNum() {
        return bookNum;
    }

    public TreeSet<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Student student = (Student) obj;
        return bookNum == student.bookNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bookNum);
    }

    @Override
    public int compareTo(Person otherPerson) {
        return super.compareTo(otherPerson);
    }
}
