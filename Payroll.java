/*
* Author: Jordan Cruz
* Student ID:2108779
* Date: 10/26/2020
*/
public class Payroll {
 private Employee e;
 private int dependents;
 private static double STATE_TAX = .10;
 private static double FED_TAX = .05;
 public Payroll(){
 }

 public Payroll(String n, int id, double pay, boolean s, int d){
 e = new Employee(n, id, pay, s);
 dependents = d;
 }

 public Payroll(Employee emp, int d){
 e = emp;
 dependents = d;
 }

 public void setEmployee(Employee emp){
 e = emp;
 }

 public void setDependents(int d){
 dependents = d;
 }

 public Employee getEmployee(){
 return e;
 }

 public int getDependents(){
 return dependents;
 }

 public double calculateStateTax(double pay){
 return pay * STATE_TAX;
 }

 public double calculateFedTax(double pay){
 return pay * FED_TAX;
 }

 public void PrintPayStub (double hours){
 double regPay = e.calculateRegPay(hours);
 double regNetPay = regPay - (regPay * STATE_TAX) - (regPay * FED_TAX) +
(dependents * .03 * regPay);

 double overtimePay = e.calculateOvertimePay(hours);
 double overtimeNetPay = overtimePay - (overtimePay * STATE_TAX) -
(overtimePay * FED_TAX) + (dependents * .02 * overtimePay);

 double totalGrossPay = regPay + overtimePay;

 double overTimeStateTax = calculateStateTax(overtimePay);
 double overTimeFederalTax = calculateFedTax(overtimePay);
 double totalOverTimeTax = overTimeStateTax + overTimeFederalTax;

 double regStateTax = calculateStateTax(regPay);
 double regFederalTax = calculateFedTax(regPay);
 double totalRegTax = regStateTax + regFederalTax;

 double totalStateTax = calculateStateTax(totalGrossPay);
 double totalFederalTax = calculateFedTax(totalGrossPay);
 double totalTax = totalStateTax + totalFederalTax;

 System.out.println("Employee: " + e.getname());
 System.out.println("Employee ID: " + e.getemployeeId());
 System.out.println("Hourly Pay: $" + e.getHourlyPay());
 if (e.getShift()){
 System.out.println("Shift: Days");
 }
 else{
 System.out.println("Shift: Night");
 }
 System.out.println("Dependents: " + dependents);
 System.out.println("Hours Worked: " + hours);
 System.out.println("RegGrossPay: $" + regPay + " OvertimeGrossPay: $" +
overtimePay + " TotalGrossPay: $" + totalGrossPay);
 System.out.println("RegTaxes Deducted: $" + (regStateTax + regFederalTax) + "
($" + regStateTax + " State " + "$" + regFederalTax + " Federal )");
 System.out.println("OvertimeTaxes Deducted: $" + (overTimeStateTax +
overTimeFederalTax) + " ($" + overTimeStateTax + " State " + " $" +
overTimeFederalTax + " Federal )");
 System.out.println("TotalTaxes Deducted: $" + (totalStateTax +
totalFederalTax) + " ($" + totalStateTax + " State " + " $" + totalFederalTax + "
Federal )");
 System.out.println("Tax Deductions: $" + (totalRegTax) + " RegPay, " + "$" +
totalOverTimeTax + " Overtime, $" + (totalRegTax + totalOverTimeTax) + " total
deductions");
 System.out.println("NetRegPay: $" + regNetPay + " RegPay, NetOvertimePay: $"
+ overtimeNetPay + " TotalNetPay: $" + (regNetPay + overtimeNetPay));

 if (e.getShift()){
 System.out.println("payday: Friday");
 }
 else{
 System.out.println("payday: Saturday");
 }
 }
}