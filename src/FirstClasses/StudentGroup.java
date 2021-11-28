package FirstClasses;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class StudentGroup implements Comparable<StudentGroup> {

    private final String name;
    private static int id;
    private List<Student> studentList;
    private TreeSet<StudentGroup> studentGroupTreeSet = new TreeSet<>();


    public StudentGroup(String name,List<Student> studentList){
        this.name = name;
        this.studentList = studentList;
        studentGroupTreeSet.add(this);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentGroup that = (StudentGroup) obj;
        return id == that.id &&
                name == that.name &&
                Objects.equals(studentList, that.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, studentList);
    }

    @Override
    public int compareTo(StudentGroup otherStudentGroup) {
        return this.name.compareTo(otherStudentGroup.name);
    }
}
