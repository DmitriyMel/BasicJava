package ua.org.nmu.dmelnikov.lab_4.model;

import java.util.Objects;

public class DepartmentHead extends Human {
    public DepartmentHead(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DepartmentHead departmentHead = (DepartmentHead) obj;
        return Objects.equals(firstName, departmentHead.firstName) &&
                Objects.equals(lastName, departmentHead.lastName) &&
                Objects.equals(middleName, departmentHead.middleName) &&
                sex == departmentHead.sex;
    }

    // Override hashCode() to maintain consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, sex);
    }
}

