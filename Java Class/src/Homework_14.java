import java.util.*;

public class Homework_14 {

    public static void main(String[] args) {

        Homework_14 h1 = new Homework_14();

        // TASK 1
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> colorList = Arrays.asList(words);
        System.out.println(h1.duplicateValues(colorList));

        String[] words1 = {"peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> colorList1 = Arrays.asList(words1);
        System.out.println(h1.duplicateValues(colorList1));

        String[] words2 = {"happy", "peace", "grow", "grow", "laugh", "grow", "joy"};
        List<String> colorList2 = Arrays.asList(words2);
        System.out.println(h1.duplicateValues(colorList2));

        System.out.println("\n");

        // TASK 2
        // UNFINISHED   // UNFINISHED   // UNFINISHED

        HashMap<Integer, String> myMap1 = new HashMap<>();
        myMap1.put(101, "happy");
        myMap1.put(102, "peace");
        myMap1.put(103, "Happy");
        myMap1.put(104, "learn");
        myMap1.put(105, "PEaCe");
        myMap1.put(106, "HAPPY");

        h1.allKeysSameValue(myMap1);

        System.out.println("\n");


        // TASK 3
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        h1.maximumColorCount(arr);
        System.out.println("\n");

        String[] arr1 = {"blue", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "green", "yellow", "grey", "blue" , "yellow", "grey",
                "blue", "blue"," green",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "blue"};
        h1.maximumColorCount(arr1);
        System.out.println("\n");

        String[] arr2 = {"red", "blue","yellow", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "blue", "yellow", "yellow", "grey", "blue" , "red", "grey","yellow",
                "green","blue", "grey", "grey", "blue", "red", "green", "green","yellow", "green"};
        h1.maximumColorCount(arr2);
        System.out.println("\n");

    }


    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     *
     */
    public Map<String, Integer> duplicateValues (List<String> inputList){
        Map<String, Integer> colorMap = new HashMap<>();
        int count=1;
        for (int i = 0; i < inputList.size(); i++){
            for (int j = i+1; j < inputList.size(); j++){
                if (inputList.get(i).equalsIgnoreCase(inputList.get(j))){
                    count++;
                }
            }
            if (!colorMap.containsKey(inputList.get(i)) && count > 1){
                colorMap.put(inputList.get(i), count);
            }
            count = 1;
        }
        return colorMap;
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

        // UNFINISHED   // UNFINISHED   // UNFINISHED

    public  void allKeysSameValue (Map<Integer, String> myMap){
        List<String> myKey = new ArrayList<>();
        for (String val : myMap.values()){
            myKey.add(val);
        }

        List<Integer> myVal = new ArrayList<>();
        for (Integer val : myMap.keySet()){
            myVal.add(val);
        }


        HashMap<String, List<Integer>> myResult = new HashMap<>();

        for (int i = 0; i < myKey.size(); i++){
            for (int j = i+1; j < myKey.size(); j++){
                if (myKey.get(i).equalsIgnoreCase(myKey.get(j))){
                    myResult.put(myKey.get(i).toLowerCase(), myVal);
                }
            }
        }
        System.out.println(myResult);
    }



    /**
     * Question 3:
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all.
     */

    public void maximumColorCount (String[] input){

        List<String> colors = Arrays.asList(input);
        Map<String, Integer> colorMap = new HashMap<>();
        int count=1;
        for (int i = 0; i < colors.size(); i++){
            for (int j = i+1; j < colors.size(); j++){
                if (colors.get(i).equalsIgnoreCase(colors.get(j))){
                    count++;
                }
            }
            if (!colorMap.containsKey(colors.get(i))){
                colorMap.put(colors.get(i), count);
            }
            count = 1;
        }

        Integer colorCunt = 0;
        for (Integer value : colorMap.values()){
            if (value > colorCunt){
                colorCunt = value;

            }
        }
        for (String key : colorMap.keySet()){
            Integer val = colorMap.get(key);
            if(val.equals(colorCunt)){
                System.out.println("Color: " + key.toUpperCase() + " Count: " + colorCunt);
            }
        }
    }



}





