package Ebrada;

import java.util.Scanner;


public class main {

  public static void main(String[] args) {
 
   Scanner sc = new Scanner (System.in);
 System.out.println("1.What is TRUE about java programming language");
String Ans = sc.nextLine();
if(Ans.equals("A"))
System.out.println("Correct");
if(Ans.equals("B"))
System.out.println("Incorrect");
if(Ans.equals("C"))
System.out.println("Correct");
if(Ans.equals("D"))
System.out.println("Incorrect");
if(Ans.equals("E"))
System.out.println("Invalid");
  }
}
