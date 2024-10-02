/* Class: CMSC203 CRN 20931
 * Program: Lab 1 
 * Instructor: Khandan Monshi
 * Summary of Description: To ask the user to enter a movie's title, rating, and tickets sold into the
 * class movie using get and set functions.
 * Due Date: 10/02/2024
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * Name: Fernando Benitez-Diaz
*/
package LAB1;
import java.util.Scanner;
public class MovieDriver_Task1 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Movie m = new Movie();
		
		System.out.println("Enter the name of a movie: ");
		m.setTitle(input.nextLine());
		
		System.out.println("Enter the rating of the movie: ");
		m.setRating(input.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		m.setSoldTickets(input.nextInt());
		
		System.out.println(m.toString());
		input.close();
		
	}
	
}
