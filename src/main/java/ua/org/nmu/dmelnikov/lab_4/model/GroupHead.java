package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.Objects;

public class GroupHead extends Human {
    public GroupHead(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GroupHead groupHead = (GroupHead) obj;
        return Objects.equals(firstName, groupHead.firstName) &&
                Objects.equals(lastName, groupHead.lastName) &&
                Objects.equals(middleName, groupHead.middleName) &&
                sex == groupHead.sex;
    }

    // Override hashCode() to maintain consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, sex);
    }
}
