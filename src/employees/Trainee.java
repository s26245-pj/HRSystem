package employees;

public class Trainee extends Employee implements ICanBeEmployee{
    private Employee mentor;
    private boolean scholarship;
    private final int amount = 500;

    @Override
    public double countSalary() {
        if(scholarship){
            return amount;
        }
        else return 0.0;
    }

    public Employee getMentor() {
        return mentor;
    }

    public void setMentor(Employee mentor) {
        this.mentor = mentor;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }


    @Override
    public void printOutEmployee() {
        System.out.println("************Trainee************");
        System.out.println("|Name: " + this.name);
        System.out.println("|Surname: " + this.surname);
        System.out.println("|Date of Birth: " + this.dateOfBirth);
        System.out.println("|Mentor: " + this.mentor.getName() + " " + this.mentor.getSurname());
        if(scholarship){
            System.out.println("|Scholarship: " + amount);
        } else {
            System.out.println("|Scholarship: 0");
        }


    }
}
