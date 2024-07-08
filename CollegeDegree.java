public class CollegeDegree {
    // Instance variables
    private String major;
    private int numberOfCourses;
    private String[] courseNameArray;
    private int[] courseCreditArray;

    // Static variable
    private static int maximumNumberOfCourses = 40;

    // Constructor
    public CollegeDegree() {
        major = "";
        numberOfCourses = 0;
        courseNameArray = new String[maximumNumberOfCourses]; 
        courseCreditArray = new int[maximumNumberOfCourses];
    }

    // Non-static methods
    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public String getMajor() {
        return major;
    }

    public void addCourse(String courseName, int numberOfCredits) {
        if ((1 <= numberOfCredits && numberOfCredits <= 5) && (numberOfCourses < courseNameArray.length)) {
            courseNameArray[numberOfCourses] = courseName; 
            courseCreditArray[numberOfCourses] = numberOfCredits;
            numberOfCourses++;
        }
    }

    public String getCourses() {
        String courses = ""; // single local string value to concatenate values from courseNameArray[]
        for (int i = 0; i < numberOfCourses; i++) {
            courses += courseNameArray[i];
            if (i < numberOfCourses - 1) {
                courses += ", ";
            }
        }
        return courses;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public int getTotalNumberOfCredits() {
        int credits = 0; // single local int value to concatenate values from courseCreditArray[]
        for (int i = 0; i < numberOfCourses; i++) {
            credits += courseCreditArray[i];
        }
        return credits;
    }

    // Static methods
    public static void increaseMaximumNumberOfCourses(int newMaximumNumberOfCourses) {
        if (newMaximumNumberOfCourses > maximumNumberOfCourses) {
            maximumNumberOfCourses = newMaximumNumberOfCourses;
        }   
    }

    public static int getMaximumNumberOfCourses() {
        return maximumNumberOfCourses;
    }
}
