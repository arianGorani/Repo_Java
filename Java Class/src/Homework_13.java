import java.util.ArrayList;
import java.util.List;

public class Homework_13 {
    public static void main(String[] args) {

        Homework_13 a1 = new Homework_13();

        // TASK 1
        String[] words = {"happy", "peaceful","nice", "world", "begin", "learn"};
        a1.isDuplicateData(words);

        String[] words1 = {"happy", "peace", "grow", "joy", "happy", "laugh", "fun"};
        a1.isDuplicateData(words1);

        String[] words2 = {"happy", "peace", "grow", "joy", "laugh", "happy", "laugh", "fun"};
        a1.isDuplicateData(words2);


        System.out.println("\n\n");

        // TASK 2
        String[] words3 = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh"};
        List<String> word3 = a1.wordsAppearingManyTimes(words3);
        System.out.println("\nWords appearing more than one time: " + word3);

        String[] words4 = {"happy", "peace", "grow", "laugh", "happy", "laugh"};
        List<String> word4 = a1.wordsAppearingManyTimes(words4);
        System.out.println("\nWords appearing more than one time: " + word4);

        String[] words5 = {"happy", "peace", "grow", "laugh", "happy",};
        List<String> word5 = a1.wordsAppearingManyTimes(words5);
        System.out.println("\nWords appearing more than one time: " + word5);

        String[] words6 = {"happy", "peace", "grow", "laugh"};
        List<String> word6 = a1.wordsAppearingManyTimes(words6);
        System.out.println("\nWords appearing more than one time: " + word6);



        // TASK 3
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};


    }




        /**
         * Question 1:
         * Create a method that can find if the given array has any duplicate data or not?
         */
        public void isDuplicateData(String[] array){
            List<String> duplicateWords = new ArrayList<>();
            boolean isDuplicate = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equalsIgnoreCase(array[j])) {
                        duplicateWords.add(array[i]);
                        isDuplicate = true;
                    }
                }
            }
            if (isDuplicate){
                System.out.println("\nArray has duplicate data: " + isDuplicate + " and is " + duplicateWords );
            }else{
                System.out.println("\nArray does not have a duplicate data: " + isDuplicate);
            }
        }

        /**
         * Question 2:
         * Create a method that would return the values occurring more than one time in given string-array
         *
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         *
         *
         */
        public List<String> wordsAppearingManyTimes(String[] arrayInput){
            List<String> words = new ArrayList<>();
            for (int i = 0; i<arrayInput.length; i++){
                for(int j = i+1; j<arrayInput.length;j++){
                    if (arrayInput[i].equalsIgnoreCase(arrayInput[j])){
                        words.add(arrayInput[i]);
                    }
                }
            }
            return words;
        }






        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */




}


































