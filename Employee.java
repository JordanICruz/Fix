/*
* Author: Jordan Cruz
* Student ID:2108779
* Date: 10/04/2020
*/
import java.util.Scanner;
public class Employee
{
 private String name;
 private int employeeId;
 private boolean Shift;
 private double HourlyPay;

 //constructor
 public Employee(){
 }

 public void setName(String n){
 name = n;
 }

 public void setemployeeId(int i){
 employeeId = i;
 }

 public void setShift(boolean i){
 Shift = i;
 }

 public void setHourlyPay(double p){
 HourlyPay = p;
 }

 public String getname(){
 return name;
 }

 public int getemployeeId(){
 return employeeId;
 }

 public boolean getShift(){
 return Shift;
 }
 public double getHourlyPay(){
 return HourlyPay;
 }

 public double calculateOvertimePay(double hours){
 if(hours > 40){
 double overtimeHoursPaid = (hours - 40) * this.getHourlyPay() * 1.5;
 return overtimeHoursPaid;
 }
 return 0.0;
 }

 public double calculateRegPay(double hours){
 double regularHoursPaid = 0.0;
 if(hours >= 40){
 regularHoursPaid = 40 * this.getHourlyPay();
 }
 else{
 regularHoursPaid = hours * this.getHourlyPay();
 }
 return regularHoursPaid;
 }

 public void PrintPayStub (double hours){
 System.out.println("Employee: " + this.getname());
 System.out.println("Employee ID: " + this.getemployeeId());
 System.out.println("Regular Pay: $" + this.calculateRegPay(hours));
 System.out.println("Overtime Pay: $" + this.calculateOvertimePay(hours));
 System.out.println("Total gross pay: $" + (this.calculateRegPay(hours) +
this.calculateOvertimePay(hours)));
 if (Shift){
 System.out.println("Friday Pay Period");
 }
 else{
 System.out.println("Saturday Pay Period");

 }
 }
}