/* 
 * Assignment 04
 * Nina Brillhart
 * Description: Printing pyramids using loops
 * Due Date: September 27, 2019
 * Course: IS 4010
 * Email: brillhnm@mail.uc.edu
 * Comments:
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/

package brillhnm_Assignment04;

public class Main {

	public static void main(String[] args) {
		int totLines = 5;							
		//defines total number of lines in pyramid
		for (int row = 1; row <= totLines; row++) {	
			//begins loop and keeps creating new rows (increment of 1) as long as the # of rows is less than the total number of lines define above
			for (int space = 1; space <= totLines-row; space++) {System.out.print(" ");}
			//prints out ((total # of lines)-(row #)) of spaces. For the first row it will print 4 spaces which will create the pyramid shape.
			for (int digCount = 1; digCount <= (2*row)-1; digCount++) {System.out.print(row);}	
			//loops to generate ((2*row#)-1) digits in each line which also helps creates the pyramid shape
			// prints the row # however many times defined above (digCount)
			System.out.println(); 
			//prints everything to the next line every time it loops through
		}
	}
}

