package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.Objects;

public class Dean extends Human {
    public Dean(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dean dean = (Dean) obj;
        return Objects.equals(firstName, dean.firstName) &&
                Objects.equals(lastName, dean.lastName) &&
                Objects.equals(middleName, dean.middleName) &&
                sex == dean.sex;
    }

    // Override hashCode() to maintain consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, sex);
    }

    @Override
    public String toString() {
        return "Rector{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", sex=" + sex +
                '}';
    }

}
