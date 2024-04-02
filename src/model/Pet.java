package model;

import java.time.LocalDate;

public class Pet {
    private String Name;
    private LocalDate dob;

    public Pet() {
    }

    public Pet(String name, LocalDate dob) {
        Name = name;
        this.dob = dob;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Name='" + Name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
