/*
* Author: Jordan Cruz
* Student ID:2108779
* Date: 10/04/2020
*/
import java.util.Scanner;
public class EmployeeTest {
 public static void main(String[] args)
 {
 String SentinalValue = "";
 Employee myEmployee = new Employee();

 Scanner keyboard = new Scanner(System.in);
 System.out.println("Enter employee name or press enter to exit");
 String EmployeeName = keyboard.nextLine();

 while (!EmployeeName.equals(SentinalValue)){
 myEmployee.setName(EmployeeName);

 System.out.println("Enter employee shift (day/night)");
 String DayNight = keyboard.nextLine();
 myEmployee.setShift(DayNight.equalsIgnoreCase("day"));

 System.out.println("Enter employee ID");
 int employeeId = keyboard.nextInt();
 myEmployee.setemployeeId(employeeId);

 System.out.println("Enter hourly pay rate");
 int hourlyRate = keyboard.nextInt();
 myEmployee.setHourlyPay(hourlyRate);

 System.out.println("Enter hours worked");
 int hoursWorked = keyboard.nextInt();
 myEmployee.PrintPayStub(hoursWorked);

 System.out.println("Enter employee name or press enter to exit");
 keyboard.nextLine();
 EmployeeName = keyboard.nextLine();
 }
 }
}