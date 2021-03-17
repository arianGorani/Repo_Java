public class Homework7 {
    public static void main(String[] args) {


        // Due: Mar 18, 2021
        /**     TASK 1
         * String sentence1 =  "hApPY nEW yeAr ";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        
        String sentence1 = "hApPY nEW yeAr";
        String[] sen1ArrayString = sentence1.toLowerCase().split(" ");
        for (int i = 0; i <= sen1ArrayString.length -1; i++){
            System.out.print(sen1ArrayString[i].toUpperCase().charAt(0));
            System.out.print(sen1ArrayString[i].substring(1) + " ");
        }



        /**     TASK 2
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        System.out.println("\n");
        String sentence2 = "Lab sessIONS clAsses";
        String[] stringSplit = sentence2.split(" ");
        for (int i = 0; i <= stringSplit.length -1; i++ ){
            System.out.print(stringSplit[i].toUpperCase().charAt(0));
        }


        /**     TASK 3
         * Reverse a string
         *
         */
        System.out.println("\n");
        String sentence3 = "happy holidays";
        String reverseSentence3 = "happy holidays";
        System.out.println("sentence3: " + sentence3);     // happy holidays
        System.out.print("Reverse sentence3: " );          // syadiloh yppah
        for (int i = reverseSentence3.length()-1; i >= 0; i--){
            System.out.print(reverseSentence3.charAt(i));
        }

    }
}
