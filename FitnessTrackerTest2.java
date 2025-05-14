/* Professor: Amal Ibrahim
 * Program by: Aidan Salagala
 * Due by: 2025-02-14
 * Course: CST8284_302
 */
package assignment_1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * This class does Junit testing to whether the methods of FitnessTracker are working properly
 * @author Aidan Salagala
 * @version 1
 * @see assignment_1
 * @since 21
*/
public class FitnessTrackerTest2 {
	
	/**Default Constructor*/
	public FitnessTrackerTest2() {}
	
	/**Tolerance*/
	private static final double EPSILON = 1E-12;
	
	/** This tests the calculateDistance method with gender as male and Steps_taken set as 350*/
	@Test
	public void testcalculateDistance() {
		FitnessTracker tracker = new FitnessTracker(null, null, "male", 350, 0, 0);
		 double Male = tracker.calculateDistance();
	     double expected = 280;
	     assertEquals(expected, Male, EPSILON);
	}
	/** This tests the calculate_Weekly_Active_Minutes method with Active_minutes set as 96*/
	@Test
	public void testcalculate_Weekly_Active_Minutes() {
		FitnessTracker active = new FitnessTracker(null, null, null, 0, 0, 96);
		double weekly = active.calculate_Weekly_Active_Minutes();
		double expectedWeekly = 672;
		assertTrue(weekly == expectedWeekly);
	}
	/** This tests the calculateCalorieDeficit method with Calories_burned set as 3000 and Calorie Maintenance set as 2000*/
	@Test
	public void testcalculateCalorieDeficit() {
		FitnessTracker calorie = new FitnessTracker(null, null, null, 0, 3000, 0);
		double maintain = calorie.calculateCalorieDeficit(2000);
		double expectedDeficit = -1000;
		assertEquals(expectedDeficit, maintain, EPSILON);
	}
	/** This tests the calculate_FitnessLevel method with gender as female, Steps_taken as 2000, and Active_minutes as 20*/
	@Test
	public void testcalculate_FitnessLevel() {
		FitnessTracker fitness = new FitnessTracker(null, null, "female", 2000, 0, 20);
		fitness.calculate_Weekly_Active_Minutes();
		fitness.calculateDistance();
		String fitness_level = fitness.calculate_FitnessLevel();
		String expectedFitness = "Moderately Active";
		assertSame(expectedFitness, fitness_level);
	}

}
