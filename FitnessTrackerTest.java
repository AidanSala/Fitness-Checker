/* Professor: Amal Ibrahim
 * Program by: Aidan Salagala
 * Due by: 2025-02-14
 * Course: CST8284_302
 */
package assignment_1;

import java.util.Scanner;
/**
 * This class takes input for the Fitness Tracker then displays the fitnessData from Fitness Tracker
 * @author Aidan Salagala
 * @version 1
 * @see assignment_1
 * @since 21
*/
public class FitnessTrackerTest {
	
	/** Default Constructor*/
	public FitnessTrackerTest() {}
	
	/** Where the input and output goes for fitness data*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		FitnessTracker fitnessTracker = new FitnessTracker(null, null, null, 0, 0, 0);
		
		System.out.print("Enter first name: ");
		fitnessTracker.setFirst_name(scanner.next());
		
		System.out.print("Enter last name: ");
		fitnessTracker.setLast_name(scanner.next());
		
		System.out.print("Enter gender (male/female): ");
		fitnessTracker.setGender(scanner.next());
		
		System.out.print("Enter Daily Steps: ");
		fitnessTracker.setSteps_taken(scanner.nextInt());
		
		System.out.print("Enter Daily Calories Burned: ");
		fitnessTracker.setCalories_burned(scanner.nextInt());
		
		System.out.print("Enter Daily Active Minutes: ");
		fitnessTracker.setActive_minutes(scanner.nextInt());

        System.out.print("Enter Daily Maintenance Calories: ");
        /** Variable to store Calorie Maintenance info*/
        double calorie_Maintenance = scanner.nextDouble();
        
        System.out.println("");
		
		fitnessTracker.displayFitnessData(calorie_Maintenance);
		
		scanner.close();
	}

}
