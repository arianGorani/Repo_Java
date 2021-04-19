import java.sql.SQLOutput;

public class Homework_12_Restaurant_methods {

    /**
     * Create a Restaurant class:
     *
     * name
     * maxGuestCapacity
     * currentGuestCount
     * totalGuestsSoFar
     *
     * 1. Constructor that allows user to start a restaurant by passing restaurant name and max capacity.
     *      data form user goes to name and maxGuestCapacity
     * 2. Create a method that tells user if the X number of seats are available
     *      parameter: int
     *      return type: boolean
     * 3. Create a method that seats party
     *      parameter: int
     * 4. Create a method that remove party
     *      parameter: int
     * 5. Create a method that prints the restaurant summary:
     *      Name:
     *      Max capacity:
     *      Current guest count:
     *      Total guests served so far:
     *
     */

    String name;
    int maxGuestCapacity;
    int currentGuestCount;
    int totalGuestsSoFar;

                // Constructor
    public Homework_12_Restaurant_methods(String resName, int maxResCapacity){
        name = resName;
        maxGuestCapacity = maxResCapacity;

    }
            // Available Seats Method
    public void availableSeats (int partySize){
        if(partySize < 0){
            System.out.println("\n\nInvalid data Entered, available seats: " + maxGuestCapacity);
        }else if (partySize <= maxGuestCapacity && maxGuestCapacity >= 0){
            System.out.println("\n\nWe have available seats for party of " + partySize);

        }else{
            System.out.println("\n\nWe don't have enough seats for party of " + partySize);
            System.out.println("Table for party of " + partySize + " is going to be available shortly.");
        }
    }


            // Seats Party Method
    public void seatsParty (int seatsPartyOf){
        if(seatsPartyOf < 0 ){
            System.out.println("\n\nInvalid data Entered, available seats: " + maxGuestCapacity);
        }else if (seatsPartyOf <= maxGuestCapacity && maxGuestCapacity >=0){
            System.out.println("\n\nParty of " + seatsPartyOf + " has been seated.");
            maxGuestCapacity = maxGuestCapacity - seatsPartyOf;
            System.out.println("Remaining Seats: " + maxGuestCapacity );
            currentGuestCount = currentGuestCount + seatsPartyOf;
            totalGuestsSoFar = totalGuestsSoFar + seatsPartyOf;
        }else{
            System.out.println("\n\nTable for party of " + seatsPartyOf + " is going to be available shortly.");
        }
    }

             // Remove Party Method
    public void removeParty(int removePartyOf){
        if(removePartyOf < 0 || currentGuestCount < removePartyOf){
            System.out.println("\n\nInvalid data Entered, Current Guests in Restaurant are " + currentGuestCount);
        }else if(currentGuestCount >=0 && currentGuestCount >= removePartyOf){
            maxGuestCapacity = maxGuestCapacity + removePartyOf;
            System.out.println("\n\nParty of " + removePartyOf + " left the restaurant.");
            System.out.println("Remaining Seats: " + maxGuestCapacity );
            currentGuestCount = currentGuestCount - removePartyOf;
        }else{
            System.out.println("There's no more guests at Restaurant " + name);
        }
    }
            // Restaurant Summery Method
    public void restaurantSummery(){
        System.out.println("\n\nName: " + name +
                "\nMax capacity: " + maxGuestCapacity +
                "\nCurrent guest count: " + currentGuestCount +
                "\nTotal guests served so far: " + totalGuestsSoFar);
    }



}
