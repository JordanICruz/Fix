import java.util.Scanner;
public class SalaryCalcUpdated
{
public static void main(String[] args)
{
String SentinalValue = "";
SalaryCalc mySalaryCalc = new SalaryCalc();
System.out.println("Enter Employee info to calculate salary?");
System.out.println("Enter Yes to continue or No to quit.");
Scanner keyboard = new Scanner(System.in);
SentinalValue = keyboard.nextLine();
while (!SentinalValue.equalsIgnoreCase("No")){
mySalaryCalc.calculateEmployeeSalary();
}
}
public void calculateEmployeeSalary(){
double hoursWorked = 0;
double hourlyRate = 0;
double regularHoursPaid = 0;
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
//Calculate Overtime
if(hoursWorked > 40){
overtimeHoursPaid += (hoursWorked - 40) * hourlyRate * overtimeRate;
hoursWorked = 40;
}
regularHoursPaid = hoursWorked*hourlyRate;
totalHoursPaid = regularHoursPaid + overtimeHoursPaid;
if (DayNight.equalsIgnoreCase("DAY"))
{
System.out.println("Employee: " + EmployeeName);
System.out.println("Regular Pay: $" + regularHoursPaid);
System.out.println("Overtime Pay: $" + overtimeHoursPaid );
System.out.println("Total gross pay: $" + totalHoursPaid);
System.out.println("Friday Pay Period");
}
else if (DayNight.equalsIgnoreCase("NIGHT"))
{
System.out.println("Employee: " + EmployeeName);
System.out.println("Regular Pay: $" + regularHoursPaid);
System.out.println("Overtime Pay: $" + overtimeHoursPaid );
System.out.println("Total gross pay: $" + totalHoursPaid);
System.out.println("Saturday Pay Period");
}
}
}