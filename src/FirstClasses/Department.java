package FirstClasses;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class Department implements Comparable<Department> {

    public static TreeSet<Department> employees = new TreeSet<>();
    private final String name;
    private final List<Teacher> listOfLectures;

    public Department(String name, List<Teacher> listOfLectures) {
        this.name = name;
        this.listOfLectures = listOfLectures;
        employees.add(this);
    }

    public static TreeSet<Department> getEmployees() {
        return employees;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return Objects.equals(name, that.name) &&
                Objects.equals(listOfLectures, that.listOfLectures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listOfLectures);
    }

    @Override
    public int compareTo(Department otherDepartment) {
        return this.name.compareTo(otherDepartment.name);
    }


}
