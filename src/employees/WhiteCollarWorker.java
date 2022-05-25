package employees;

public class WhiteCollarWorker extends Employee{
    private int monthSalary;
    private double bonusPercentage;
    private Manager manager;
    private String phoneNumber;
    private String mobileNumber;
    private int roomNumber;

    @Override
    public double countSalary() {
        return (this.monthSalary + (this.bonusPercentage * monthSalary));
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void printOutEmployee() {
        System.out.println("************White-Collar Worker************");
        System.out.println("|Name: " + this.name);
        System.out.println("|Surname: " + this.surname);
        System.out.println("|Date of Birth: " + this.dateOfBirth);
        System.out.println("|Month salary: " + this.monthSalary);
        System.out.println("|Bonus: " + this.bonusPercentage);
        System.out.println("|Manager: " + this.manager.getName() + " " + this.manager.getSurname());
        System.out.println("|Phone number: " + this.phoneNumber);
        System.out.println("|Mobile number: " + this.mobileNumber);
        System.out.println("|Room: " + this.roomNumber);
    }
}
