package ua.org.nmu.dmelnikov.lab_4.model;

import com.google.gson.annotations.JsonAdapter;
import ua.org.nmu.dmelnikov.lab_4.controller.HumanAdapter;

import java.util.Objects;

@JsonAdapter(HumanAdapter.class) // Додаємо адаптер для класу Human
public abstract class Human{
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected Sex sex;

    public Human(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public Sex getSex() {
        return sex;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setSex(Sex sex){
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(middleName, human.middleName) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, sex);
    }
}