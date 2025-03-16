package ua.org.nmu.dmelnikov.lab_4.model;

public class Group implements Head {
    private String name;
    private Human head;

    public Group(String name, Human head) {
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
