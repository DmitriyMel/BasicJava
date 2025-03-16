package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.Objects;

public class Rector extends Human{
    public Rector(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rector rector = (Rector) obj;
        return Objects.equals(firstName, rector.firstName) &&
                Objects.equals(lastName, rector.lastName) &&
                Objects.equals(middleName, rector.middleName) &&
                sex == rector.sex;
    }

    // Override hashCode() to maintain consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, sex);
    }
}
