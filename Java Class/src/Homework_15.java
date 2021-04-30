
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Homework_15 {

    public static void main(String[] args) {


        /**
         * Question:
         * Create a method that will take an int as input.
         * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
         */
        // sout(generateTimeline(5));
        // 9pm 11pm 1am 3am 5am
        // sout(generateTimeline(5));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm
        // sout(generateTimeline(10));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am


        Homework_15 a1 = new Homework_15();


        System.out.println(a1.generateTimeline(10));

    }



    public List<String> generateTimeline(int input){

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("ha");
        List<String> myList = new ArrayList<>();

        for (int i = 0; i<input; i++){
            if (i > 0){
                cal.add(Calendar.HOUR,2);
            }
            myList.add(df.format(cal.getTime()));
        }
        return myList;
    }

}
