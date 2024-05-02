/*
* Author: Jordan Cruz
* Student ID:2108779
* Date: 10/31/2020
*/
import java.io.*;
import java.util.Scanner;
public class WordCounter{
public static void main(String [] args) throws IOException {
countWords("CerritosCollege.txt");
}
public static void countWords(String fileName) throws IOException{
int wordCount = 0;
//get input file
File wordFile = new File(fileName);
Scanner inputFile = new Scanner(wordFile);
while (inputFile.hasNext()){
String line = inputFile.nextLine();
String[] words = line.split(" ");
wordCount += words.length;
}
System.out.println("Total words in file: " + wordCount);
inputFile.close();
}
}