import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxcapacity;
    private int seatstaken;
    
    /**
     * Creates a new car and initializes the attributes for it
     * @param maxcapacity
     */

    public Car(int maxcapacity) {
        this.maxcapacity = maxcapacity;
        this.passengers = new ArrayList<>(maxcapacity);
        this.seatstaken = 0;
    }

    /**
     * Gives the maximum capacity of the car
      * @return maxcapacity
     */

    public int getCapacity() {
        return maxcapacity;
    }
    
    /**
     * Gives the available number of seats in the car
     * @return seatsremaining
     */

    public int seatsRemaining() {
        return maxcapacity - seatstaken;
    }

    /**
     * Adds a passenger to the car and alters the manifest and the number of seats taken accordingly
     * @param p Passenger
     */

    public void addPassenger(Passenger p){
        System.out.println("Adding passenger: " + p.getName());
        if (this.seatsRemaining() == 0){
            throw new RuntimeException("There are no more seats available");
        }
        if (this.passengers.contains(p)){
            throw new RuntimeException(p.getName() + " is already on board.");
        }
        this.passengers.add(p);
        seatstaken += 1;
        System.out.println("Added passenger: " + p.getName());
    }

    /**
     * Removes a given passenger from the car and alters the manifest and number of seats taken accordingly
     * @param p Passenger
     */

    public void removePassenger(Passenger p){
        System.out.println("Removing passenger: " + p.getName());
        if (!this.passengers.contains(p)){
            throw new RuntimeException(p.getName() + " is not on board.");
        }
        this.passengers.remove(p);
        seatstaken -= 1;
        System.out.println("Removed passenger: " + p.getName());
    }

    /**
     * Prints the names of all passengers on board
     */

    public void printManifest(){
        if (seatstaken == 0) {
            System.out.println("There are no passengers on board.");
        }
        else {
            System.out.println("Passenger Manifest:");
            for (Passenger passenger : passengers) {
                System.out.println(passenger.getName());
            }
        }
    }
}
