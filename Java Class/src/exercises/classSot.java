package exercises;

import java.util.Arrays;

public class classSot {
    public static void main(String[] args) {

        String[] myWords = {"peace", "Happy", "happiness","happy", "haPPy", "grow", "happy", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};
        String wordToFind ="happy";
        int countWord = 0;
        for (String s : myWords) {
            if (s.equalsIgnoreCase(wordToFind))
                countWord++;
        }
        int j = 0;
        int[] numbers = new int[countWord];
        for (int i = 0; i < myWords.length; i++ ){
            if(myWords[i].equalsIgnoreCase(wordToFind)){
                numbers[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(numbers));



        /**
         * Count the number of times a given string is present in a given paragraph.
         */
        String paragraph = "Are you searching for Essay Writing Topics in English for various competitions and speeches for school events? Then you are on the right page here you will get all kinds of topics for essay writing in English. As we have gathered numerous essay topics in long and short forms for all classes students. Yes, what you heard is correct, this page is filled with Long essays for class 10, 9, 8, 7, and Short essays for class 6, 5, 4, 3, 2, 1. So, anyone can check out this Essay Writing in English Article on AplusTopper for school events & competitions. Moreover, you can also find 10 lines on the selected far topic in English for the speeches in school programs. These Ten lines in English will assists students and teachers at the time of school speeches on special events. Hence, students can refer to the below provided a massive list of essays in English and participate in any kind of events conducted by schools. For the sake of class 1 to 10 students, we have also covered 10 Lines and Essay on 'My School' in English and Hindi here.";
        String wordToFind1 = "essay";

        String[] paragraphSplit = paragraph.toLowerCase().split(" ");
        int count = 0;
        for (String s : paragraphSplit) {
            if (s.equalsIgnoreCase(wordToFind1))
                count++;
        }
        System.out.println("In paragraph String they are " +count+ " "+ wordToFind1 + " word.");







    }
}
