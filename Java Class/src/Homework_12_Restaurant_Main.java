public class Homework_12_Restaurant_Main {

    public static void main(String[] args) {

        Homework_12_Restaurant_methods r1 = new Homework_12_Restaurant_methods("Arian", 50);

        r1.restaurantSummery();

        r1.availableSeats(5);
        r1.seatsParty(5);


        r1.availableSeats(10);
        r1.seatsParty(10);

        r1.availableSeats(-30);
        r1.seatsParty(-30);

        r1.availableSeats(40);
        r1.seatsParty(40);

        r1.removeParty(10);

        r1.restaurantSummery();

        r1.availableSeats(40);
        r1.seatsParty(40);

        r1.removeParty(20);

        r1.removeParty(10);

        r1.restaurantSummery();

        r1.availableSeats(15);
        r1.seatsParty(15);

        r1.removeParty(50);

        r1.availableSeats(25);
        r1.seatsParty(25);

        r1.availableSeats(18);
        r1.seatsParty(18);

        r1.restaurantSummery();

        r1.removeParty(20);
        r1.removeParty(15);
        r1.removeParty(13);

        r1.restaurantSummery();

        r1.removeParty(2);


























    }
}
