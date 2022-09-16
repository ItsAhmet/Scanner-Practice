//Name: Ahmet Yesilbas
//Project Name: Scanner Practice
//Date: 10/7/2021
//Project Description: Utilizing the scanner class to input values into variables we have created while using printf statements.

import java.util.Scanner;

public class ScannerPractice {
	 public static void main(String[] args) {
		 
		 // 1st Question
		 double cansR;
		 double cansT;
		 double rate;
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.print("How many cans are there? ");
		 cansT = keyboard.nextInt();
		 
		 System.out.print("How many cans were recycled? ");
		 cansR = keyboard.nextInt();
 
		 rate = (cansR/cansT)*100;
		 System.out.printf("Hello %.2f percent of the cans were recycled.\n\n", rate);
	
		 // 2nd Question 
		 double fossils;
		 double snailShells;
		 double fossilAmnt;
		 System.out.println("How many fossils does Elmer have?");
		 fossils = keyboard.nextInt();
		 
		 System.out.print("What is the percentage of snail shells out of the fossil collection?");
		 snailShells = keyboard.nextInt();
		 
		 fossilAmnt = fossils*(snailShells/100.0);
		 System.out.printf("Elmer has %.2f snail shell fossils\n\n", fossilAmnt);
		 
		 //3rd Question
		 
		 double total;
		 double Maria;
		 double Bill;
		 double Mark;
		 double MariaP;
		 double BillP;
		 double MarkP;

		
		 
		 
		 System.out.println("How many students voted for Maria?");
		 Maria = keyboard.nextInt();
		 
		 System.out.println("How many students voted for Bill?");
		 Bill = keyboard.nextInt();
		 
		 System.out.println("How many students voted for Mark?");
		 Mark = keyboard.nextInt();
		 
		 total = Maria+Bill+Mark;
		 
		 
		 MariaP = (Maria/total)*(100.0);
		 BillP = (Bill/total)*(100.0);
		 MarkP = (Mark/total)*(100.0);
		 
		 
		 System.out.printf("%.2f percent of students voted for Maria\n%.2f percent of students voted for Bill\n%.2f percent of students voted for Mark\n\n",MariaP, BillP, MarkP);
		 //Question 4

     double total1;
     double prcntdone;
     double amntdone;
		 System.out.println("How many kilobytes is the video game?");
     total1 = keyboard.nextInt();

     System.out.println("What percentage of the video game has already downloaded?");
     prcntdone = keyboard.nextInt();

     amntdone = total1*(prcntdone/100.00);
     System.out.printf("%.2f kilobytes of the video game has been downloaded", amntdone);

	 }
}
