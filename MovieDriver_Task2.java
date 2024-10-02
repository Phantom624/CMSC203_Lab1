/* Class: CMSC203 CRN 20931
 * Program: Lab 1
 * Instructor: Khandan Monshi
 * Summary of Description: To do the same function of task 1 but repeat the process in a loop that will
 * terminate only when n is entered to end the program. 
 * Due Date: 10/02/2024
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * Name: Fernando Benitez-Diaz
*/

package LAB1;
import java.util.Scanner;

public class MovieDriver_Task2 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Movie m = new Movie();
		String c;
		char choice;
		do
		{
			System.out.println("Enter the name of a movie: ");
			m.setTitle(input.nextLine());
			
			System.out.println("Enter the rating of the movie: ");
			m.setRating(input.nextLine());
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			m.setSoldTickets(input.nextInt());
			c = input.nextLine();
			System.out.println(m.toString());
			
			System.out.println("Do you want to enter another? (y or n): ");
			c = input.nextLine();
			System.out.println(c);
			choice = c.charAt(0);
		}while (choice == 'y');
		
		System.out.println("Goodbye");
		
		input.close();
	}

}
