/*
* Author: Jordan Cruz
* Student Number:
* Date: 10/17/20
*/
import java.util.Random;
public class DiceRoll{
 public static void main(String[] args){
 Random rand = new Random();

 int[] diceRolls = new int[12];
 double totalRolls = 36000;

 int diceOneRoll;
 int diceTwoRoll;

 for(int i = 0; i < totalRolls; i++){
 diceOneRoll = rand.nextInt(6) + 1;
 diceTwoRoll = rand.nextInt(6) + 1;

 diceRolls[diceOneRoll + diceTwoRoll - 1]++;
 }

 System.out.printf("%s%14s%15s", "Sum", "Frequency", "Percentage");
 System.out.println();

 for(int i = 1; i < diceRolls.length; i++){
 double currentRollCount = diceRolls[i];
 double currentRollFrequency = currentRollCount/totalRolls * 100;

 System.out.printf("%d%12d%15.2f", i+1, diceRolls[i],
currentRollFrequency);
 System.out.println();
 }
 }
}