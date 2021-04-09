import java.util.Arrays;

public class codeTest {


    public static void main(String[] args) {

        codeTest c1 = new codeTest();
        //  TASK 1
        int[] inputArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};

        c1.arrayAfterRemovingGivenInt(inputArray, 24);

        //  TASK 2

        int[] intArray = {-1, -3, 4, 2};
        c1.smallestPositiveInt(intArray);

        // TASK 3

        c1.pointsToCharged(135);


    }

    /**
     * Question 1:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     * <p>
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */


    public int[] arrayAfterRemovingGivenInt(int[] inputArray, int givenInt) {

        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == givenInt) {
                count++;
            }
        }

        int j = 0;
        int[] returnedArray = new int[inputArray.length - count];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != givenInt) {
                returnedArray[j] = inputArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(returnedArray));
        return returnedArray;
    }


    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     * <p>
     * Example:
     * For array : {3, 5, 1, 4, 2, 7}
     * Method should return : 6
     * <p>
     * For array : {-1, -3, 4, 2}
     * Method should return : 1
     * <p>
     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * Method should return : 4
     */
    //      UNFINISHED  UNFINISHED  UNFINISHED

    public int smallestPositiveInt(int[] inputArray) {
        int smallestPositiv = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > smallestPositiv && inputArray[i] <= inputArray.length) {
                smallestPositiv = inputArray[i];
            }
        }
        System.out.println(smallestPositiv);
        return smallestPositiv;
    }


    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     * <p>
     * 1. Speed Limit = 70
     * 2. Every 5 miles over the speed limit will add 1 point
     * 3. If user speed is such that system shows 12 points for a speed
     * then print, license is suspended
     * <p>
     * Example:
     * user speed = 74 ; 0 points
     * user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     * user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     * user speed = 178 ; 21 points (License suspended).
     * user speed = 70 ; Thank you for driving within the speed limit.
     */

    //  UNFINISHED  UNFINISHED  UNFINISHED
    
    public void pointsToCharged(int userSpeed) {

        int points = 0;


        if (userSpeed <= 70) {
            System.out.println("Thank you for driving within the speed limit.");
        } else if (userSpeed >= 70 && userSpeed <= 74) {
            points = 0;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 75 && userSpeed <= 80) {
            points = points + 1;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 81 && userSpeed <= 85) {
            points = points + 2;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 86 && userSpeed <= 90) {
            points = points + 3;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 91 && userSpeed <= 95) {
            points = points + 4;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 96 && userSpeed <= 100) {
            points = points + 5;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 101 && userSpeed <= 105) {
            points = points + 6;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 106 && userSpeed <= 110) {
            points = points + 7;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 111 && userSpeed <= 115) {
            points = points + 8;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 116 && userSpeed <= 120) {
            points = points + 9;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 121 && userSpeed <= 125) {
            points = points + 10;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 126 && userSpeed <= 130) {
            points = points + 11;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points);
        } else if (userSpeed >= 131 && userSpeed <= 135) {
            points = points + 12;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points + " and license is suspended");
        } else if (userSpeed >= 136) {
            points = points + 12;
            System.out.println("Your Speed is " + userSpeed + " and your points " + points + " and license is suspended");


        }


    }
}
