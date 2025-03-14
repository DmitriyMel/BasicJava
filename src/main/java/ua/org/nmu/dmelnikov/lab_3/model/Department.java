package ua.org.nmu.dmelnikov.lab_3.model;

public class Department implements Head {
    private String name;
    private Human head;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public Human getHead() {
        return head;
    }

    @Override
    public void setHead(Human head) {
    }
}
