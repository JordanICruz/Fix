import java.util.Scanner;
public class SalaryCalcModularized
{
public static void main(String[] args)
{
String SentinalValue = "";
SalaryCalc mySalaryCalc = new SalaryCalc();
Scanner keyboard = new Scanner(System.in);
while (!SentinalValue.equalsIgnoreCase("No")){
System.out.println("Would you like to enter Employee info to calculate
salary?");
System.out.println("Enter Yes to continue or No to quit.");
SentinalValue = keyboard.nextLine();
if(SentinalValue.equalsIgnoreCase("No")){
break;
}
mySalaryCalc.calculateEmployeeSalary();
}
}
public void calculateEmployeeSalary(){
double hoursWorked = 0;
double hourlyRate = 0;
double regularHoursPaid = 0.0;
double overtimeRate = 1.5;
double overtimeHoursPaid = 0;
double totalHoursPaid = 0;
String EmployeeName;
String DayNight;
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter employee name");
EmployeeName = keyboard.nextLine();
System.out.println("Enter employee shift (day/night)");
DayNight = keyboard.nextLine();
System.out.println("Enter hours worked");
hoursWorked = keyboard.nextInt();
System.out.println("Enter hourly pay rate");
hourlyRate = keyboard.nextInt();
System.out.println("Calculate total pay");
//calculate overtime pay
overtimeHoursPaid = this.calculateOvertime(hoursWorked, hourlyRate,
overtimeRate);
//calculate regular pay
regularHoursPaid = this.calculateRegular(hoursWorked, hourlyRate);
//calculate total pay
totalHoursPaid = regularHoursPaid + overtimeHoursPaid;
//display employee pay stub
this.DisplayEmployeePayStub(EmployeeName, regularHoursPaid,
overtimeHoursPaid, totalHoursPaid, DayNight);
}
public double calculateRegular(double hoursWorked, double hourlyRate){
double regularHoursPaid = 0.0;
if(hoursWorked > 40){
regularHoursPaid = 40 * hourlyRate;
}
else{
regularHoursPaid = hoursWorked * hourlyRate;
}
return regularHoursPaid;
}
public double calculateOvertime(double hoursWorked, double hourlyRate, double
overtimeRate){
if(hoursWorked > 40){
double overtimeHoursPaid = (hoursWorked - 40) * hourlyRate * overtimeRate;
return overtimeHoursPaid;
}
return 0.0;
}
public void DisplayEmployeePayStub(String EmployeeName, double regularHoursPaid,
double overtimeHoursPaid, double totalHoursPaid, String DayNight){
System.out.println("Employee: " + EmployeeName);
System.out.println("Regular Pay: $" + regularHoursPaid);
System.out.println("Overtime Pay: $" + overtimeHoursPaid);
System.out.println("Total gross pay: $" + totalHoursPaid);
if(DayNight.equalsIgnoreCase("DAY")){
System.out.println("Friday Pay Period");
}
else if(DayNight.equalsIgnoreCase("NIGHT")){
System.out.println("Saturday Pay Period");
}
}
}