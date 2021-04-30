public class Homework6 {
    public static void main(String[] args) {



        /**     TASK 1
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         Grade A: 90.00 - 100.00
         Grade B: 80.00 - 89.99
         Grade C: 70.00 - 79.99
         Grade D: 60.00 - 69.99
         Grade E: 50.01 - 59.99
         Grade F: <= 50.00
         */
        double studentScore = 349;
        double maxScore = 700;
        double percentage = ((studentScore*100) / maxScore);

        if (percentage <= 100 && percentage >= 90){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: A");
        } else if (percentage <= 89.99 && percentage >= 80){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: B");
        } else if (percentage <= 79.99 && percentage >= 70){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: C");
        } else if (percentage <= 69.99 && percentage >= 60){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: D");
        } else if (percentage <= 59.99 && percentage >= 50){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: E");
        } else if (percentage <= 50){
            System.out.println("Your percentage: " + percentage +  " and your Grade is: F");
        }else if (studentScore >= 701){
            System.out.println("Your enter number out of range. Range of student score is:  ( 0 <---> 700 )");
        }






        /**     TASK 2
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int value =25;
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("Divisible by both");
        } else if  (value % 3 == 0) {
            System.out.println("Divisible by 3");
        }else if (value % 5 == 0){
            System.out.println("Dividible by 5");
        }else {
            System.out.println(value);
        }






        /**     TASK 3
         * Checking car gear (P, D, N, R)           // switch
         * if car gear is P, display "you can park the car"
         * if car gear is D,
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car gear is N, display "put car in car wash"
         * if car gear is R, display  "revere the car"
         */
        char carGear = 'D';
        String driveType = "eco";


        switch (carGear){
            case 'P':
                System.out.println("you can park the car");
                break;
            case 'D':
                switch (driveType){
                    case "snow":
                        System.out.println("You are on Snow mode");
                        break;
                    case "sport":
                        System.out.println("You are on Sport mode");
                        break;
                    case "eco":
                        System.out.println("You are on Eco mode");
                        break;
                }
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;
            case 'R':
                System.out.println("reverse the car");
                break;
            default:
                System.out.println("You put on wrong gear!");
        }

    }
}
