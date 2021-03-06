import java.util.Arrays;
import java.util.Locale;

    public class labTasks {
    public static void main(String[] args) {

            /**
             * 1)
             * Store "valid" or "invalid" in the string variable (validOrInvalid)
             * Store a String in 'myName' variable.
             * if
             *      length of string stored in myName variable > 10 , validOrInvalid = valid
             * else,
             *      validOrInvalid = invalid
             *
             */
            String myName = "Arian Gorani";
            String validOrInvalid = myName.length() > 10 ? "Valid" : "Invalid";
            System.out.println("\nValue inside the 'validOrInvalid' variable: " + validOrInvalid);


            /**
             * 2)
             * Using the above created 'myName' variable.
             * if myName length is > 5, Assign 1st character of your name to 'myChar' (char) variable.
             * else, Assign Last character of your name to 'myChar' (char) variable.
             */
            myName = "Arian Gorani";
            int len = myName.length();
            char  myChar = myName.length() > 5 ? myName.charAt(0) : myName.charAt(len - 1);
            System.out.println("\nFirst char of my name is: " + myChar);


            /**
             * 3)
             * Using the above created 'myName' variable.
             * if myName length is > 5, Assign 1st character of your name to 'myLetter' (String) variable.
             * else, Assign Last character of your name to 'myLetter' (String) variable.
             *
             * String myName = "Beautiful";
             * int nameLength = myName.length();
             */
            myName = "Arian Gorani";
            len = myName.length();
            String myLetter = myName.length() > 5 ? myName.substring(0,1) : myName.substring(len-1);
            System.out.println("\nFirst letter of my name is: " + myLetter);


            /**
             *
             * 4)
             */
            String sentence = " I am a good programmer and this is a good day to be cool";

            String[] afterSplit_oo = sentence.split("oo");

            System.out.println("\nSentence --> " + sentence);

            System.out.println("\nSentence after split 'oo' --> " + Arrays.toString(afterSplit_oo));
            // 4 -> " I am a g" , "d programmer and this is a g" , "d day to be c" , "l"


            /**
             * 5)
             * Enter your first name, and my code will:
             *
             * 1. Print the name in Titlecase (Happy)
             * 2. Print the number of letters in your first name.
             * 3. Trim the string
             */

            String yourFirstname = "  arIaN  ";
            yourFirstname = yourFirstname.trim();
            String upperCase = yourFirstname.substring(0,1).toUpperCase();
            String restName = yourFirstname.substring(1).toLowerCase();
            String firstName = upperCase + restName;
            int length = firstName.length();
            System.out.println("\nUser Name: " + firstName + " \nLength of the name is: " + length);



        /**
         * 6)
         * String sentanse_1 = "Happy peace Grow"
         *
         * If String contains any vowel (a, e, i, o, u),
         *      print the index of 'a' from the given sentence.
         * else
         *      print index of 'z' from the given sentence.
         * PS: Pls DO NOT consider cases
         *
         */


            String sentanse_1 = "Happy pace Grow";
            sentanse_1 = sentanse_1.toLowerCase();

            boolean isContainVowel =
                       sentanse_1.contains("a")
                    || sentanse_1.contains("e")
                    || sentanse_1.contains("i")
                    || sentanse_1.contains("o")
                    || sentanse_1.contains("u");

            int indexResult = isContainVowel ? sentanse_1.indexOf("a") : sentanse_1.indexOf("z");
            System.out.println(indexResult);



    }
}
