import java.util.Arrays;

public class Homework_10_Students_Methods {

    /**
     * Variable which will store values like:
     * school name
     * student name
     * student id
     * student enrolled course name
     * courses offered by school
     * total number of students
     * student fee-balance
     * student address
     */
    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM", "IT", "Network"};
    static double[] feesCourses = {1000, 2000, 3000, 4000, 5000};
    static int totalStudents = 0;

    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;
    double studentFeeDeposit;

    public void enrollStudent(String name, String addr, String course) {
        /*
            if course is available in school, we should inform student the fees-balance
            increase the total number of students
            we should student the studentId
         */
        boolean isCourseAvailable = false;
        for (int i=0 ; i<offeredCourses.length ; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                studentAddress = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    /**
     * Method to display student profile
     * Id
     * Name
     * Course
     *
     *
     * name: displayStudentProfile
     * Input: N/A
     * Return Type: String/void
     *
     */
    public void  displayStudentProfile() {
        System.out.println("Student Profile " +
                "\nStudent ID: " + studentId +
                "\nStudent name: " + studentName +
                "\nStudent course: " + studentEnrolledCourse + "\n\n");
    }

    /**
     * Method to fee deposit
     *
     * name: feeDeposit
     * Input: double
     * return: double
     */
    public double feeDeposit(double deposit){
        if (deposit == 0 || deposit <= 5000) {
            studentFeeDeposit = deposit - studentFeeBalance;
            System.out.println("\nYour available deposit is: " + deposit + "$");
        }else{
            System.out.println("\nMaximum amount of deposit is 5000$");
        }
        System.out.println("\nYour available deposit after deduct fee balance is: " + studentFeeDeposit  + "$");
        return deposit;
    }


    /**
     * Student to change course
     * Req:
     * 1. earlier deposited fees should be subtracted from new course fees
     * 2. Show error (saying, Same course entered) if student enter enrolled course as new course
     * 3. Show error (saying, Invalid course entered) if student enter a course not offered by school
     */

    public String changeCourse (String courseChange ){
        for (int i = 0; i < offeredCourses.length; i++){
            if(offeredCourses[i].equalsIgnoreCase(courseChange)){
                if(courseChange.equalsIgnoreCase(studentEnrolledCourse)){
                    System.out.println("\nYou choose the same course");
                }else if(courseChange != studentEnrolledCourse){
                    System.out.println("\nNew course enrollment");
                    studentEnrolledCourse = offeredCourses[i];
                    System.out.println("\nBalance after refund amount is: " + (studentFeeDeposit = studentFeeDeposit + studentFeeBalance)+ "$");
                    studentFeeBalance = feesCourses[i];
                    System.out.println("\nBalance after choosing different course is: " + (studentFeeDeposit = studentFeeDeposit - studentFeeBalance)+ "$");
                }else{
                    System.out.println("This course is not offered by school!");
                }
            }
        }
        return courseChange;
    }


    /**
     * static Method to display school summary:
     * School Name
     * Courses Offered
     * Total number of student
     *
     *
     */

    public static void schoolSummary(){
        System.out.println("\n\nSchool name: " + schoolName
                + "\nCourses Offered: " + Arrays.toString(offeredCourses)
                + "\nTotal number of Students: " + totalStudents );
    }








}
