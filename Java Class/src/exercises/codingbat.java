package exercises;

import java.util.*;

public class codingbat {

    public static void main(String[] args) {

        codingbat a1 = new codingbat();

        HashMap<Integer, String> myMap1 = new HashMap<>();
        myMap1.put(101, "happy");
        myMap1.put(102, "peace");
        myMap1.put(103, "Happy");
        myMap1.put(104, "learn");
        myMap1.put(105, "PEaCe");
        myMap1.put(106, "HAPPY");

        a1.allKeysSameValue(myMap1);







        }

        public  void allKeysSameValue (Map<Integer, String> myMap){
            List<String> myKey = new ArrayList<>();
            for (String val : myMap.values()){
                myKey.add(val);
            }
            System.out.println(myKey);

            List<Integer> myVal = new ArrayList<>();
            for (Integer val : myMap.keySet()){
                myVal.add(val);
            }
            System.out.println(myVal);




            HashMap<String, List<Integer>> myResult = new HashMap<>();

            for (int i = 0; i < myKey.size(); i++){
                for (int j = i+1; j < myKey.size(); j++){
                    if (myKey.get(i).equalsIgnoreCase(myKey.get(j))){
                        myResult.put(myKey.get(i).toLowerCase(),myVal);
                    }
                }
            }

            System.out.println(myResult);

        }





    }

    /**
     *
     * Question 2:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     *
     * Create method that will print the keys with same value, else "All keys have different values"
     *
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     *      "happy" with keys -> 101, 103, 106
     *      "peace" with keys -> 102, 105
     *
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     *      All keys have different values
     *
     *
     */













