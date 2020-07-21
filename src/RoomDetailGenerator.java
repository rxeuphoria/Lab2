import java.util.Scanner;

public class RoomDetailGenerator {
	public static void main(String[] args) {
		//make the whole thing loop
		boolean keepRunning = true;
			while (keepRunning = true) {
				System.out.println("Welcome to the Room Detail Generator!");
			Scanner scnr = new Scanner(System.in);
			
		
		//gather length and width
			System.out.println("Enter length (ft.):");
			double length = scnr.nextDouble();
			System.out.println("Enter width (ft.):");
			double width = scnr.nextDouble();
		
		//start calculating outputs
			double area = (length * width);
			double perimeter = (2 * length) + (2 * width);
			System.out.println("Area: " + area);
			System.out.println("Perimiter: " + perimeter);
		
			System.out.println("Would you like details for a different room? (y/n)");
			keepRunning = scnr.nextLine().toLowerCase().startsWith("y");
			
			}
		}
	}
