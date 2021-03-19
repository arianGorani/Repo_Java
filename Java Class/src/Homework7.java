public class Homework7 {
    public static void main(String[] args) {


        // Due: Mar 18, 2021
        /**     TASK 1
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        
        String sentence1 = "hApPY nEW yeAr";
        System.out.println(sentence1);
        String[] sen1ArrayString = sentence1.toLowerCase().split(" ");
        sentence1 ="";
        for (int i = 0; i <= sen1ArrayString.length -1; i++){
             sentence1 = sentence1 + sen1ArrayString[i].toUpperCase().charAt(0) + sen1ArrayString[i].substring(1) + " ";
        }
        sentence1 = sentence1.trim();
        System.out.println(sentence1);



        /**     TASK 2
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String sentence2 = "Lab sessIONS clAsses";
        String[] stringSplit = sentence2.split(" ");
        sentence2 ="";
        for (int i = 0; i <= stringSplit.length -1; i++ ){
           sentence2 = sentence2 + stringSplit[i].toUpperCase().substring(0,1);
        }
        System.out.println(sentence2);



        /**
         * Reverse a string
         *
         */
        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("sentence3 : " + sentence3);     // happy holidays
        String[] sen3Array = sentence3.split("");
        for (int i = 0; i < sen3Array.length; i++){
            reverseSentence3 = reverseSentence3 + sen3Array[sen3Array.length-1-i];
        }
        System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah

    }
}
