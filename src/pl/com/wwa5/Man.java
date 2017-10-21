package pl.com.wwa5;

import java.util.ArrayList;
import java.util.List;

public class Man implements Comparable<Man> {
    private String nameAge;
    private String lastName;
    private String firstName;
    private String age;
    ArrayList parts = new ArrayList();

    public Man() {
    }

    public Man(String nameAge) {
        this.nameAge = nameAge;
    }

    public void seperatingNamesToFractionalParts() {
        String[] parts = this.nameAge.split(" ", 3);
        this.lastName = parts[0];
        this.firstName = parts[1];
        this.age = parts[2];
    }

    @Override
    public String toString() {
        return "Man{" +
                "lastName='" + this.lastName + '\'' +
                ", firstName='" + this.firstName + '\'' +
                ", age='" + this.age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Man o) {
        int porownaneNazwiska = this.lastName.compareTo(o.lastName);
        if(porownaneNazwiska == 0) {
        int porownaneImiona = this.firstName.compareTo(o.firstName);
        if(porownaneImiona == 0) {
            return o.age.compareTo(this.age);
        }
        return porownaneImiona;
        }
        return porownaneNazwiska;
    }

//    @Override
//    public String toString() {
//        if (age % 10 == 1 || age == 1 || age != 11) {
//            return "Man " + lastName + " " + firstName + " have " + age + " year";
//        }
//        return "Man " + lastName + " " + firstName + " have " + age + " years";
//
//    }

    public String getNameAge() {
        return nameAge;
    }

    public void setNameAge(String nameAge) {
        this.nameAge = nameAge;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

