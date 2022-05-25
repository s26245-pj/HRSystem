package employees;

import java.util.List;

public abstract class Employee implements ICanBeEmployee {
    protected String name;
    protected String surname;
    protected String dateOfBirth;

    @Override
    public abstract double countSalary();

    public abstract void printOutEmployee();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
