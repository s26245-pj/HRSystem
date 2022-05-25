import employees.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager();
        manager1.setName("Bad");
        manager1.setSurname("Manager");
        manager1.setDateOfBirth("06.06.2000");
        manager1.setMonthSalary(20000);
        manager1.setBonusPercentage(0.06);
        manager1.setManagementAllowance(5000);
        manager1.setPhoneNumber("+11 111 11 11");
        manager1.setMobileNumber("111 111 111");
        manager1.setRoomNumber(1);
        manager1.setDepartmentName("very important department");


        manager1.printOutEmployee();
        System.out.println("|Full Cost Per Month: " + manager1.countSalary());
        System.out.println("\n\n");

        ManualWorker manualWorker = new ManualWorker();
        List<String> skills1 = Arrays.asList("skill1", "skill2", "fireballs");
        manualWorker.setName("Josh");
        manualWorker.setSurname("Joshua");
        manualWorker.setDateOfBirth("24.03.1980");
        manualWorker.setHourlyRate(15);
        manualWorker.setHoursWorked(100);
        manualWorker.setManager(manager1);
        manualWorker.setOverTime(20);
        manualWorker.setSkills(skills1);

        manualWorker.printOutEmployee();
        System.out.println("|Full Cost Per Month: " + manualWorker.countSalary());
        System.out.println("\n\n");

        WhiteCollarWorker whiteCollarWorker = new WhiteCollarWorker();
        whiteCollarWorker.setName("Dude");
        whiteCollarWorker.setSurname("White");
        whiteCollarWorker.setDateOfBirth("12.12.1960");
        whiteCollarWorker.setMonthSalary(4000);
        whiteCollarWorker.setBonusPercentage(0.03);
        whiteCollarWorker.setPhoneNumber("+58 456 22 32");
        whiteCollarWorker.setMobileNumber("666 222 333");
        whiteCollarWorker.setRoomNumber(6);
        whiteCollarWorker.setManager(manager1);

        whiteCollarWorker.printOutEmployee();
        System.out.println("|Full Cost Per Month: " + whiteCollarWorker.countSalary());
        System.out.println("\n\n");

        BoardMember boardMember = new BoardMember();
        boardMember.setName("Member");
        boardMember.setSurname("Memberowski");
        boardMember.setDateOfBirth("15.15.1995");
        boardMember.setMonthSalary(4000);
        boardMember.setAssistant(manualWorker);
        boardMember.setBoardMeetings(15);
        boardMember.setPerMeet(100);

        boardMember.printOutEmployee();
        System.out.println("|Full Cost Per Month: " + boardMember.countSalary());
        System.out.println("\n\n");

        Trainee trainee = new Trainee();
        trainee.setName("Noob");
        trainee.setSurname("Newbie");
        trainee.setDateOfBirth("01.01.2002");
        trainee.setMentor(whiteCollarWorker);
        trainee.setScholarship(true);

        trainee.printOutEmployee();
        System.out.println("|Full Cost Per Month: " + trainee.countSalary());
        System.out.println("\n\n");


    }
}
