package employees;

import java.util.List;

public class ManualWorker extends Employee{
    protected int hourlyRate;
    private int hoursWorked;
    private int overTime;
    private Manager manager;
    private List<String> skills;


    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }


    @Override
    public double countSalary() {
        return (this.hourlyRate * this.hoursWorked) + (1.5 * this.hourlyRate * this.overTime);
    }

    @Override
    public void printOutEmployee() {
        System.out.println("************Manual Worker************");
        System.out.println("|Name: " + this.name);
        System.out.println("|Surname: " + this.surname);
        System.out.println("|Date of Birth: " + this.dateOfBirth);
        System.out.println("|Hourly Rate: " + this.hourlyRate);
        System.out.println("|Hours worked: " + this.hoursWorked);
        System.out.println("|Overtime: " + this.overTime);
        System.out.println("|Manager: " + this.manager.getName() + " " + this.manager.getSurname());
        System.out.println("|Skills: "+ this.skills);
    }
}
