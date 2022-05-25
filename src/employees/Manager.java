package employees;

public class Manager extends Employee implements ICanBeEmployee{
    private int monthSalary;
    private double bonusPercentage;
    private int managementAllowance;
    private String phoneNumber;
    private String mobileNumber;
    private int roomNumber;
    private String departmentName;

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

    public int getManagementAllowance() {
        return managementAllowance;
    }

    public void setManagementAllowance(int managementAllowance) {
        this.managementAllowance = managementAllowance;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public double countSalary() {
        return this.monthSalary + (this.bonusPercentage *this.monthSalary) + this.managementAllowance;
    }

    @Override
    public void printOutEmployee() {
        System.out.println("************MANAGER************");
        System.out.println("|Name: " + this.name);
        System.out.println("|Surname: " + this.surname);
        System.out.println("|Date of Birth: " + this.dateOfBirth);
        System.out.println("|Month salary: " + this.monthSalary);
        System.out.println("|Bonus: " + this.bonusPercentage);
        System.out.println("|Management Allowance: " + this.managementAllowance);
        System.out.println("|Phone number: " + this.phoneNumber);
        System.out.println("|Mobile number: " + this.mobileNumber);
        System.out.println("|Room: " + this.roomNumber);
        System.out.println("|Department: " + this.departmentName);
    }
}
