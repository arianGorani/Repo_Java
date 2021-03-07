public class Homework4 {
    public static void main(String[] args) {


        System.out.println("\nAnswer 1");
        String sentence_3 = "hello dear, how are you?";
        boolean result = sentence_3.length() > 10 ? true : false;
        System.out.println("length of \"hello dear, how are you? \" is greater than 10 is " + result+ "\n");
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         *
         * Hint: use ternary operator
         */


        System.out.println("Answer 2");
        String sentence_4 = "We all ARe Good ProgRommeR";
        System.out.println("Befor Replacment --> " + sentence_4);
        sentence_4 = sentence_4.replace("r","f").replace("R", "f");
        System.out.println("After Replacment --> " + sentence_4 + "\n");
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         */

        System.out.println("Answer 3");
        String fullName = "Arian Gorani";

        // * 1. Display the length of your fullname.
        int lengthOfFullName = fullName.length();
        // * 2. Does your name start with 'K' (Does your name start with 'K' ignore cases)
        boolean nameStartsWithK = fullName.startsWith("K") || fullName.contains("k");

        // * 3. Does your full name contain 'a' (ignore cases)
        boolean fullNameContain = fullName.contains("a") || fullName.contains("A");
        System.out.println("Display the length of your fullname " + lengthOfFullName + "\nDoes your name start with 'K' " + nameStartsWithK + "\nDoes your full name contain 'a' " + fullNameContain);


    }
}


