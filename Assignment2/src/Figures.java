/* Programming Fundamentals
 * NAME: Michael Carrasco
 * PROGRAMMING ASSIGNMENT 2
 * Summer 2020
 */

import java.util.Scanner;

public class Figures {
	static int size = 0; //sets a starting value for size
	static int length = 0; //sets a starting value for size
	public static void main(String[] args) {
		Figures stars = new Figures();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the figure (odd number): ");
		length = input.nextInt();
			
			   // checks to see if an integer was plugged in
		while(length % 2 == 0) {
			System.out.print("Invalid figure size - must be an odd number\r\n" + 
					"\nRenter the size of the figure: ");
			length = input.nextInt();
		
		}
		
		
		stars.size = (length); //changes box size to inputed value
		System.out.print("MENU:\n"+"1. Print box\n" + "2. Print diamond\n" + "3. Print X\n" + "4. Quit program\n"+"\nPlease select an option: ");
		int shape=input.nextInt();
		switch (shape) {
		  case 1:
			  Figures.printBox(); //prints out our star box
		    break;
		  case 2:
			  Figures.printDiamond(); //Prints out half a diamond :(
		    break;
		  case 3:
			  Figures.printX(); //prints an X shape
		    break;
		  case 4:
			  System.out.println("\nGood bye!");
		    break;
		}
		

	}
	public static void printBox() { //creates our box shape
		for (int i=0;i<size;i=i+1) {  
		for (int j=0;j<size;j=j+1) {
			System.out.print("X");
		}
			System.out.println();
		}
	}
	public static void printX() { //creates our x shape
	for (int i = 0; i < length; i++) {
        int j = length - 1 - i; 
        for (int k = 0; k < length; k++) { 
            if (k == i || k == j) 
                System.out.print("X"); 
            else
                System.out.print(" "); 
        } 
        System.out.println(""); 
    }
	}
	public static void printDiamond() { //creates half of our diamond shape :(
			for (int i = 0; i < length; i++) {
	          int j = length - 1 - i;
	          for (int k = length/2; k < length; k++) { 
	              if (k == i || k == j) 
	                  System.out.print("X"); 
	              else
	                  System.out.print(" "); 
	          } 
	          System.out.println(""); 
			} 
			
	}
} 


