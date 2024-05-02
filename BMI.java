import java.util.Scanner;
public class BMI
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int hight;
int weight;
double conversionMetricw;
double conversionMetrich;
conversionMetricw = 0.45;
conversionMetrich = 0.025;
double step;
double step1;
double step2;
double step3;
double BMI;
System.out.println("Enter your weight");
weight = keyboard.nextInt();
step = weight*conversionMetricw;
System.out.println("Enter your hight");
hight = keyboard.nextInt();
step1 = hight * conversionMetrich;
step2 = step1*step1;
step3 = step1/step2;
System.out.println(step3);
}
}
