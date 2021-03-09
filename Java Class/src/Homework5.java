import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class Homework5 {
    public static void main(String[] args) {
        // Due: March 11th
        String fullName = "Arian Gorani";

        /**     TASK 1)
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */

        // Does first name start with 'K' (ignore cases)
        boolean nameStartsK = fullName.toUpperCase().startsWith("K");
        System.out.println("\n\nDoes first name start with 'K' --> " + nameStartsK);

        // If user has a last name, Does last name ends with 'a' (ignore cases)
        String[]  userFullName = fullName.split(" ");
        int lengthOfUser = userFullName.length;

        if (lengthOfUser >= 2) {
            System.out.print("\n\nDoes last name ends with 'a' --> ");
            System.out.println(userFullName[1].toLowerCase().endsWith("a"));
        } else {
            System.out.println("\n\nNo last name entered");
        }

        //If user has a last name, print the 1st letter of last name
        if (lengthOfUser >= 2) {
            System.out.print("\n\nPrint the 1st letter of last name: ");
            System.out.println(userFullName[1].charAt(0));
        } else {
            System.out.println("\n\nNo last name entered");
        }






        /**     TASK  2)
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * sout(threeWordsSentence_1);  // Happy New Year
         */

        String threeWordsSentence = "hApPY nEW yeAr";
        String[] threeWordsSentence_1 = threeWordsSentence.toLowerCase().split(" ");

        char H = threeWordsSentence_1[0].toUpperCase().charAt(0);
        char N = threeWordsSentence_1[1].toUpperCase().charAt(0);
        char Y = threeWordsSentence_1[2].toUpperCase().charAt(0);

        String happy = threeWordsSentence_1[0].substring(1);
        String nEw = threeWordsSentence_1[1].substring(1);
        String year = threeWordsSentence_1[2].substring(1);

        String formattedSentence = H + happy + " " + N + nEw + " " + Y + year;

        System.out.println("\n\nFormatted Sentence: " + formattedSentence);




        /**     TASK 3)
         * Create abbreviation:
         * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * LSC
         *
         */

        String threeWord = "Lab sessIONS clAsses";
        String[] stringSplit = threeWord.split(" ");

        char char1 = stringSplit[0].toUpperCase().charAt(0);
        char char2 = stringSplit[1].toUpperCase().charAt(0);
        char char3 = stringSplit[2].toUpperCase().charAt(0);

        System.out.println("\n\nFirst letters of all strings: " + char1 + char2 + char3);



        /**     TASK 4)
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */
        String sentence_4 = "We all are here to learn good stuff";
        int arrayLength = sentence_4.split(" ").length;
        System.out.println("\n\nNumber of words in sentence_4 is :" + arrayLength);


    }
}
