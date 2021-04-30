package exercises;

import java.lang.reflect.Array;
import java.util.*;

public class HashMapUshtrime {

    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101,"happy");
        myMap.put(10,"job");
        myMap.put(908,"learn");
        myMap.put(1111,"grow");
        myMap.put(76,"HappY");

        // write code here
        // if value with given key is of length greater than 4 -->
        //      print the value
        // else -->
        //      print 'value not greater than 4'
        // if the given key is not found -->
        //      print 'key not available'

        Integer checkKey =76;

        if (myMap.containsKey(checkKey)){
            if (myMap.get(checkKey).length() >4){
                System.out.println(myMap.get(checkKey));
            }else {
                System.out.println("value not greater than 4");
            }
            }else {
            System.out.println("key not available");
        }




        /**
         * print all the keys from given Map
         * which has valueLength > 4
         *
         Map<Integer, String> myMap = new HashMap<>();
         myMap.put(101,"happy");
         myMap.put(10,"job");
         myMap.put(908,"learn");
         myMap.put(1111,"grow");
         myMap.put(76,"HappY");
         *
         * 101
         * 908
         * 76
         */

        Set<Integer> set1 = myMap.keySet();
        System.out.println(set1);

        Collection<String> myCol = myMap.values();
        System.out.println(myCol);

        for (Integer key : myMap.keySet()){
            if (myMap.containsKey(key)){
                if(myMap.get(key).length() >4){
                    System.out.println(key);
                }
            }
        }




        /**
         * Student name: john
         * Student Score: 90, 89, 76, 89, 100
         *
         * Student name: harry
         * Student Score: 70, 89, 76, 89, 100
         *
         * Student name: reene
         * Student Score: 90, 77, 98, 98, 100
         *
         * Student name: domino
         * Student Score: 90, 89, 100, 89, 100
         *
         * Student name: joy
         * Student Score: 89, 89, 77, 89, 98
         *
         * Store the data in a appropriate variable.
         *
         */



        Map<String, List<Integer>>  students = new HashMap<>();

        Integer[] studentArray = {90, 89, 76, 89, 100};
        List<Integer> studentJohn = Arrays.asList(studentArray);
        students.put("john", studentJohn);

        Integer[] studentArray1 = {70, 89, 76, 89, 100};
        List<Integer> studentHarry = Arrays.asList(studentArray1);
        students.put("harry", studentHarry);

        Integer[] studentArray3 = {90, 77, 98, 98, 100};
        List<Integer> studentReene = Arrays.asList(studentArray3);
        students.put("reene", studentReene);

        Integer[] studentArray4 = {90, 89, 100, 89, 100};
        List<Integer> studentDomino = Arrays.asList(studentArray4);
        students.put("domino", studentDomino);

        Integer[] studentArray5 = {89, 89, 77, 89, 98};
        List<Integer> studentJoy = Arrays.asList(studentArray5);
        students.put("joy", studentJoy);


        System.out.println(students);

        Collection<String> studentNames = students.keySet();
        System.out.println(studentNames);

        Map<String, Integer> totalScore = new HashMap<>();
        for (String studentName : studentNames){
            List<Integer> studentScore = students.get(studentName);
            int total = 0;
            for(Integer score : studentScore){
                total += score;
            }
            totalScore.put(studentName, total);
        }
        System.out.println(totalScore);

        int maxScore = 0;
        String topper = "";

        for (String studentName : studentNames){
            if(totalScore.get(studentName) > maxScore){
                topper = studentName;
                maxScore = totalScore.get(studentName);
            }
        }

        System.out.println("Topper : " + topper);
        System.out.println("Max Score : " + maxScore);




    }
}


