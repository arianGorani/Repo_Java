package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class commonWords {
    public static void main(String[] args) {

        commonWords a1 = new commonWords();


        String[] arr1 = {"pEace", "happiness", "Gives", "So", "aaa"};
        String[] arr2 = {"pEace", "HappiNess", "joy", "give", "AAA", "enjoy", "learN", "arian"};

        a1.commonWords(arr1, arr2);
        a1.commonWords1(arr1,arr2);



        /**
         * arr1 = {"pEace", "HappiNess", "joy", "give", "AAA", "enjoy", "learN"};                     --> All Unique
         * arr1 = {"pEace", "HappiNess", "peace", "give", "LEArn", "aaa", "PEACE", "learN"};          --> Peace
         * arr1 = {"pEace", "LearN", "peace", "give", "LEArn", "aaa", "PEACE", "learN"};             --> Peace, Learn
         *
         *
         * input: String[]
         * return type: String[]
         *
         *
         *
         * Find the words appearing max number of times in an array
         * if all words are unique, answer should be "All Unique"
         * if one words is appearing max number of times, answer should be that word
         * if two or more words is appearing max number of times, answer should be that all those words
         */


        String[] arr11 = {"pEace", "happiness", "Gives", "So", "aaa","peace", "sO", "givEs"};

        a1.sameWords(arr11);
        a1.sameWords1(arr11);



    }

    public String[] commonWords (String[] arr1, String[] arr2){
        int count = 0;
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length;j++){
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    count++;
                }
            }

        }
        int k = 0;
        String[] arr3 = new String[count];
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length;j++){
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
        return arr3;
    }



    public String rWord (String word){

        for(int i =0; i<word.length(); i++){
            String[] wordSplit = word.split("#");
            String front = wordSplit[i].substring(0,wordSplit[i].length()-1);
            String end = wordSplit[i].substring(1);
            System.out.println(front+end);

        }
        return word;
    }


    public String[] sameWords (String[] arr11){
        int count =0;
        for (int i = 0; i < arr11.length; i++) {
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i].equalsIgnoreCase(arr11[j])) {
                    count++;
                }
            }
        }
        int k = 0;
        String[] words = new String[count];
        for (int i = 0; i < arr11.length; i++) {
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i].equalsIgnoreCase(arr11[j])) {
                    words[k] = arr11[i];
                    k++;
                }
            }
        }
        if (words.length == 0){
            System.out.println("All Unique");
        }else {
            System.out.println(Arrays.toString(words));
        }
        return words;
    }

    // method for commonWords in two String[] using ArrayList
    public void commonWords1(String[] arr1, String[] arr2){

        List<String> commonWords1 = new ArrayList<>();
        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length;j++){
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    commonWords1.add(arr1[i]);
                }
            }
        }
        System.out.println(commonWords1);
    }


    // method for sameWords in a String[] using ArrayList
    public void sameWords1 (String[] arr11){

        List<String> sameWords = new ArrayList<>();
        for (int i = 0; i < arr11.length; i++) {
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i].equalsIgnoreCase(arr11[j])) {
                    sameWords.add(arr11[i]);
                }
            }
        }
        System.out.println(sameWords);
    }

}








