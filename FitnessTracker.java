/* Professor: Amal Ibrahim
 * Program by: Aidan Salagala
 * Due by: 2025-02-14
 * Course: CST8284_302
 */
package assignment_1;
/**
 * FitnessTracker.java
 * Starter code for FitnessTracker assignment.
 * @author Aidan Salagala
 * @version 1
 * @see assignment_1
 * @since 21
 */
public class FitnessTracker {

    // TODO 1: INCLUDE YOUR ATTRIBUTES HERE. CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

    // START CODE
		/**Variable to store first name*/
	    private String First_name;
	    /**Variable to store last name*/
	    private String Last_name;
	    /**Variable to store gender*/
	    private String Gender;
	    /**Variable to store daily steps*/
	    private int Steps_taken;
	    /**Variable to store daily calories burned*/
	    private int Calories_burned;
	    /**Variable to store daily active minutes*/
	    private int Active_minutes;
    // END CODE

    // TODO 2: INCLUDE YOUR CONSTRUCTOR HERE.

    // START CODE
	    /** This constructor receives the data as parameters to initialize all attributes 
	     * @param first_name      first name
	     * @param last_name       last name
	     * @param gender          gender
	     * @param steps_taken     daily steps
	     * @param calories_burned daily calories burned
	     * @param active_minutes  daily active minutes
	     * */
	public FitnessTracker(String first_name, String last_name, String gender, int steps_taken, int calories_burned, int active_minutes) {
		First_name = first_name;
		Last_name = last_name;
		Gender = gender;
		Steps_taken = steps_taken;
		Calories_burned = calories_burned;
		Active_minutes = active_minutes;
	}
    // END CODE

    // TODO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS DIAGRAM TO ENSURE ALL ARE COMPLETE.

    // START CODE
	/**Returns the user's first name
	 * @return first name*/
	public String getFirst_name() {
		return First_name;
	}
	/**Records first name
	 * @param first_name the user's first name*/
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	/**Returns the user's last name
	 * @return last name*/
	public String getLast_name() {
		return Last_name;
	}
	/**Records last name
	 * @param last_name the user's last name*/
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	/**Returns the user's gender
	 * @return gender*/
	public String getGender() {
		return Gender;
	}
	/**Records gender
	 * @param gender the user's gender*/
	public void setGender(String gender) {
		Gender = gender;
	}
	/**Returns the user's daily steps taken
	 * @return steps taken*/
	public int getSteps_taken() {
		return Steps_taken;
	}
	/**Records daily steps
	 * @param steps_taken amount of steps taken*/
	public void setSteps_taken(int steps_taken) {
		Steps_taken = steps_taken;
	}
	/**Returns the user's daily calories burned
	 * @return calories burned*/
	public int getCalories_burned() {
		return Calories_burned;
	}
	/**Records daily calories burned
	 * @param calories_burned amount of calories burned*/
	public void setCalories_burned(int calories_burned) {
		Calories_burned = calories_burned;
	}
	/**Returns the user's daily active minutes
	 * @return active minutes*/
	public int getActive_minutes() {
		return Active_minutes;
	}
	/**Records daily active minutes
	 * @param active_minutes amount of active minutes*/
	public void setActive_minutes(int active_minutes) {
		Active_minutes = active_minutes;
	}
	
	/**This method calculates the distance based on gender in meters
	 * @return Steps_taken*/
	public double calculateDistance (){
		double steps = 0;
			if (Gender.equalsIgnoreCase("male")) {
				steps = 0.8;
			}

			else {
				steps = 0.7;
			}
		
		return Steps_taken * steps;
	}
	
	/**This method calculates the weekly active minutes
	 * @return Active_minutes*/
	public double calculate_Weekly_Active_Minutes () {
		return Active_minutes * 7;
	}
	/**This method calculates the Fitness Level
	 * @return fitnessLevel*/
	public String calculate_FitnessLevel () {
		String fitnessLevel;
		if (Active_minutes > 150 && Steps_taken > 2000) {
			fitnessLevel = "Active";
		}
		
		else if ((Active_minutes >= 75 && Active_minutes <= 150) || (Steps_taken >= 1000 && Steps_taken <= 2000)) {
			fitnessLevel = "Moderately Active";
		}
		
		else {
			fitnessLevel = "sedentary";
		}
		
		return fitnessLevel;
	}
	/**This method calculates the Calorie Deficit
	 * @return calorie_Maintenance
	 * @param calorie_Maintenance passed to method */
	public double calculateCalorieDeficit(double calorie_Maintenance) {
        return calorie_Maintenance - Calories_burned;
    }
	
    // END CODE

    // TODO 4: THIS METHOD SHOULD DISPLAY ALL USER FITNESS DATA. DO NOT MISS ANY DATA/INFORMATION.
	/**THIS METHOD DISPLAYS ALL USER FITNESS DATA
	 * @param calorie_Maintenance passed to method*/
    public void displayFitnessData(double calorie_Maintenance) {
        
        // TODO 5: USE System.out.printf TO SHOW ALL FITNESS DATA. DO NOT MISS ANY ITEM.

        // START CODE
    	System.out.printf("--- User Fitness Data --- %n");
    	System.out.printf("Name: %s%n", First_name +" "+ Last_name);
    	System.out.printf("Gender: %s%n", Gender);
    	System.out.printf("Daily Steps: %s%n", Steps_taken);
    	System.out.printf("Fitness Level: %s%n", calculate_FitnessLevel());
    	System.out.printf("Daily Calories Deficit/Surplus: %s%n", calculateCalorieDeficit(calorie_Maintenance));
        // END CODE

        // You do not need to modify this piece of code; sit is fine as it is.
        System.out.println("Fitness Level Criteria:");
        System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
        System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
        System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
    }



} // end class FitnessTracker