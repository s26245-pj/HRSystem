package employees;

public class BoardMember extends Employee implements ICanBeEmployee{
    private int monthSalary;
    private Employee assistant;
    private int boardMeetings;
    private int perMeet;



    public int getPerMeet() {
        return perMeet;
    }

    public void setPerMeet(int perMeet) {
        this.perMeet = perMeet;
    }


    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Employee getAssistant() {
        return assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public int getBoardMeetings() {
        return boardMeetings;
    }

    public void setBoardMeetings(int boardMeetings) {
        this.boardMeetings = boardMeetings;
    }

    @Override
    public double countSalary() {
        return (this.monthSalary + (this.boardMeetings * this.perMeet));
    }

    @Override
    public void printOutEmployee() {
        System.out.println("************Board member************");
        System.out.println("|Name: " + this.name);
        System.out.println("|Surname: " + this.surname);
        System.out.println("|Date of Birth: " + this.dateOfBirth);
        System.out.println("|Month salary: " + this.monthSalary);
        System.out.println("|Assistant: " + this.assistant.getName() + " " + this.assistant.getSurname());
        System.out.println("|Board meetings: " + this.boardMeetings);
    }
}
