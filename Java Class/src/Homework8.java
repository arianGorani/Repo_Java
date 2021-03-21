public class Homework8 {
    public static void main(String[] args) {


        /**
         *      TASK 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87, 18, 50, 65};
        double total = 0;
        for (double i : doubleArray){
            total = total + i;
        }
        System.out.println("The total of doubleArray is: " + total);





        /**
         *      TASK 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */
        String word = "lEveL";
        String[] wordSplit = word.toLowerCase().split("");
        String wordReverse = "";
        boolean isPalindrome;
        for (int i = 0; i < word.length(); i++){
            wordReverse = wordReverse + wordSplit[wordSplit.length-1-i];
        }
        if (word.equalsIgnoreCase(wordReverse)){
            isPalindrome = true;
        }else {
            isPalindrome = false;
        }
        System.out.println("Word \"" + word + "\" stored in String variable is: " + isPalindrome + " palindrome.");





        /**
         *      TASK 3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */

        int number = 7;
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = true;
            }
        }
        if (!isPrime) {
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }

    }
}
