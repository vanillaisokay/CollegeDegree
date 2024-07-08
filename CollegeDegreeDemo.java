// Import statement
import java.util.Scanner;

public class CollegeDegreeDemo {
    // Create main method
    public static void main (String[] args) {
        // Create objects Scanner & CollegeDegree
        Scanner keyboard = new Scanner(System.in);
        CollegeDegree myDegree = new CollegeDegree();
        int option;

        do {
            // Print all 9 options for user
            System.out.println("Press 1 to change the major of the degree");
            System.out.println("Press 2 to view the major of the degree");
            System.out.println("Press 3 to add a course to the degree");
            System.out.println("Press 4 to view all the courses required for the degree");
            System.out.println("Press 5 to view the number of courses required for the degree");
            System.out.println("Press 6 to view the total number of credits required for the degree");
            System.out.println("Press 7 to increase the maximum number of courses for all degrees");
            System.out.println("Press 8 to view the maximum number of courses for all degrees");
            System.out.println("Press 9 to the end the program");
            // Accept user's selection
            option = keyboard.nextInt();
            keyboard.nextLine();
            // Option to change major
            if (option == 1) {
                System.out.println("What is the major of your degree?");
                String newMajor = keyboard.nextLine();
                myDegree.setMajor(newMajor);
            } // Option to display major
            else if (option == 2) {
                System.out.println("Major: " + myDegree.getMajor());
            } // Option to add course & credits
            else if (option == 3) {
                System.out.println("What is the name of the course?");
                String courseName = keyboard.nextLine();
                System.out.println("How many credits is this course?");
                int numberOfCredits = keyboard.nextInt();
                myDegree.addCourse(courseName, numberOfCredits);
            } // Option to display courses required
            else if (option == 4) {
                System.out.println("Courses required: " + myDegree.getCourses());
            } // Option to display number of courses required
            else if (option == 5) {
                System.out.println("Number of courses required: " + myDegree.getNumberOfCourses());
            } // Option to display total number of credits
            else if (option == 6) {
                System.out.println("Total number of credits: " + myDegree.getTotalNumberOfCredits());
            } // Option to increase maximum number of courses
            else if (option == 7) {
                System.out.println("What is the new maxiumum number of courses?");
                int newMaximumNumberOfCourses = keyboard.nextInt();
                CollegeDegree.increaseMaximumNumberOfCourses(newMaximumNumberOfCourses);
            } // Option to display maximum number of courses
            else if (option == 8) {
                System.out.println("Maximum number of courses: " + CollegeDegree.getMaximumNumberOfCourses());
            } // Option to end program
            else if (option == 9) {
                System.out.println("Goodbye.");
            } // Display error if options 1-9 aren't chosen
            else {
                System.out.println("Error!");
            }
        // Loop program if option 9 isn't chosen
        } while (option != 9);
    }
}
