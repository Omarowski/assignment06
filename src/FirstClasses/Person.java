package FirstClasses;

import ENUMS.Nationality;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

public abstract class Person implements Comparable<Person> {


    public String socialSecurityNo;
    public String firstName;
    public String surname;
    public Date dateOfBirth;
    public Nationality nationality;

    public TreeSet<Person> people = new TreeSet<>();


    public Person(String socialSecurityNo, String firstName, String surname, Date dateOfBirth, Nationality nationality) {
        this.socialSecurityNo = socialSecurityNo;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        people.add(this);
    }

    //    Let us assume that social security no. will be a valid Polish PESEL
    public String getSocialSecurityNo() {
        return getSocialSecurityNo();
    }

    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNo, firstName, surname, dateOfBirth, nationality);
    }

    @Override
    public int compareTo(Person otherPerson) {
        int result = this.getFirstName().compareTo(otherPerson.getFirstName());
        if (result != 0) return result;
        result = this.getSurname().compareTo(otherPerson.getSurname());
        if (result != 0) return result;
        return this.getSocialSecurityNo().compareTo(otherPerson.getSocialSecurityNo());
    }

    @Override
    public String toString() {
        return "Person[" +
                "socialSecurityNo='" + socialSecurityNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationality=" + nationality +
                ", people=" + people +
                ']';
    }


}
