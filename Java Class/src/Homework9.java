import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {


        /**     TASK 1
         * Write a method to convert given string into Titlecase
         */

       titleCaseString("   tOdaY iS bEaUtiFul dAY IN nEw yOrK cIty    ");



        /**     TASK 2
         * Write a method that will tell grade to student for given score and MaxScore
         */
        gradeOfStudent(505);



        /**     TASK 3
         * Write a method that will reverse any given int-array
         */

        int[] givenIntArray = {23, 56, 78, 12, 45, 78, 90};

        reverseIntArray(givenIntArray);


        /**     TASK 4
         * Write a method that return the number of words in given sentence.
         */

        numberOfWordsInSentence("You only live once, but if you do it right, once is enough.");



    }


    // Write a method to convert given string into Titlecase

    public static String titleCaseString (String titleCase){
        titleCase = titleCase.trim();
        String[] sen1ArrayString = titleCase.toLowerCase().split(" ");
        titleCase ="";
        for (int i = 0; i <= sen1ArrayString.length -1; i++){
            titleCase = titleCase + sen1ArrayString[i].toUpperCase().charAt(0) + sen1ArrayString[i].substring(1) + " ";
        }
        System.out.println(titleCase);
        return titleCase;
    }

    // Write a method that will tell grade to student for given score and MaxScore

    public static double gradeOfStudent (double studentScore){

        double maxScore = 700;
        double percentage = ((studentScore*100) / maxScore);

        if (percentage <= 100 && percentage >= 90){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: A");
        } else if (percentage <= 89.99 && percentage >= 80){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: B");
        } else if (percentage <= 79.99 && percentage >= 70){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: C");
        } else if (percentage <= 69.99 && percentage >= 60){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: D");
        } else if (percentage <= 59.99 && percentage >= 50){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: E");
        } else if (percentage <= 50){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: F");
        }else if (studentScore >= 701){
            System.out.println("Your enter number out of range. Range of student score is:  ( 0 <---> 700 )");
        }
        return studentScore;

    }

    // Write a method that will reverse any given int-array

    public static int[] reverseIntArray (int[]  inputArray){
        for (int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[inputArray.length-1-i]);
        }
        return inputArray;
    }

    // Write a method that return the number of words in given sentence.

    public static String numberOfWordsInSentence (String input){

        int arrayLength = input.split(" ").length;
        System.out.println("Number of words in input String is :" + arrayLength);
        return input;
    }


}
