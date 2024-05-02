/*
* Author: Jordan Cruz
* Student ID:2108779
* Date: 10/26/2020
*/
import java.util.Scanner;
public class Employee
{
 private String name;
 private int employeeId;
 private boolean Shift;
 private double HourlyPay;

 //constructors
 public Employee(){
 }

 public Employee(String n, int id, double pay, boolean shift){
 name = n;
 employeeId = id;
 HourlyPay = pay;
 Shift = shift;
 }

 public Employee(Employee e){
 this.name = e.name;
 this.employeeId = e.employeeId;
 this.Shift = e.Shift;
 this.HourlyPay = e.HourlyPay;
 }

 public String toString()
 {
 if(Shift){
 return "Name: " + name + ", Id: " + employeeId + " Shift: Day, Pay Rate: $
" + HourlyPay;
 }
 else{
 return "Name: " + name + ", Id: " + employeeId + " Shift: Night, Pay Rate:
$ " + HourlyPay;
 }
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
}