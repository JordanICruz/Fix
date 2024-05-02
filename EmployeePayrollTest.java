/*
* Author: Jordan Cruz
* Student ID:2108779
* Date: 10/26/2020
*/
import java.util.Scanner;
public class EmployeePayrollTest{

 public static void main(String[]args){

 // declare a Employee array that holds 5 workers
 Employee [] workers = new Employee[5];

 // declare a Payroll array that hols 5 Payrolls
 Payroll [] Payrolls = new Payroll[5];

 // loop 5 times and get input from user for each employee and add to our
Employee[] array
 // prompt and input each employee's name, id, pay and shift
 // add employee to our array
 Scanner keyboard = new Scanner(System.in);

 for(int i = 0; i < 5; i++){
 System.out.println("Enter employee name");
 String employeeName = keyboard.nextLine();

 System.out.println("Enter employee ID");
 int employeeId = keyboard.nextInt();

 System.out.println("Enter hourly pay rate");
 int hourlyRate = keyboard.nextInt();

 keyboard.nextLine();

 System.out.println("Enter employee shift (day/night)");
 String DayNight = keyboard.nextLine();
 boolean dayShift = DayNight.equalsIgnoreCase("day");

 workers[i] = new Employee(employeeName, employeeId, hourlyRate, dayShift);
 }


 // loop 5 times and get input for each Payroll
 // output employee information (toString() ) and ask for their number of
dependents
 // Create Payroll object and add to our Payroll[] array - use Employee copy
constructor from the Payroll constructor: +Payroll(emp : Employee, d : int)
 for(int i = 0; i < 5; i++){
 System.out.println("Employee Information - " + workers[i].toString());
 System.out.println("Enter dependents for Employee");
 int dependents = keyboard.nextInt();

 keyboard.nextLine();

 Payrolls[i] = new Payroll(workers[i], dependents);
 }

 // is it payday?
 System.out.println("Is it payday? (yes/no)");
 String payDay = keyboard.nextLine();

 //yes
 // loop 5 times and print Payroll
 // display Employee and their number of dependents
 // ask their total hours worked for the week
 // Print Paystub (remember to print their PayDay (Friday or Saturday)
 if(payDay.equalsIgnoreCase("yes")){
 for(int i = 0; i < 5; i++){
 System.out.println(Payrolls[i].getEmployee().toString());
 System.out.println("Dependents: " + Payrolls[i].getDependents());

 System.out.println("Enter hours worked");
 int hoursWorked = keyboard.nextInt();

 Payrolls[i].PrintPayStub(hoursWorked);
 }
 }

 //else
 //done - exit


/**********************************************************************************
************/
 // an alternative is to modularize our Test Driver program

 //createAndIntialize our WorkerArray(Worder w[])
 //createAndInitliaze our PayrollArray(Payroll p[])
 //is is Payday?
 //PrintPayStubs(Payroll[] p)
 //else
 //exit()


 }
}