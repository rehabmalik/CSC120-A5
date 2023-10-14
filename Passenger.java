import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;
   
    /**
     * creates an instance of the train class and initiliases the attributes
     *@param fuelType fuelType
     *@param fuelCapacity double
     *@param nCars int
     *@param passengerCapacity int
     */

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.cars = new ArrayList<>(nCars);
        this.engine = new Engine(fuelCapacity, fuelType);
        for (int i = 1; i <= nCars; i ++){
            this.cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Gives access to the engine linked to this train
     *@return the engine linked to this train
     */
    
    public Engine getEngine(){
        return this.engine;
    } 

    /** 
     *Searches the array for the car stored at the requested index
     *@return the car stored at index i in the array list
     */
    
    public Car getCar(int i){
        return this.cars.get(i);
    }

    /**
     * Totals the capacities of all cars in the train
     *@return maxcapacity
     */
    
    public int getMaxCapacity(){
        int maxcapacity = 0;
        for (Car car : cars) {
            maxcapacity = maxcapacity + car.getCapacity();
        }
        return maxcapacity;
    }

    /**
     * Totals the remaining seats in the cars of the train
     *@return seatsremaining
     */
    
    public int seatsRemaining(){
        int seatsremaining = 0;
        for (Car car : cars) {
            seatsremaining = seatsremaining + car.seatsRemaining();
        }
        return seatsremaining;
    }

    /**
     * Prints all the passengers aboard the train organized by car.
     */
    
    public void printManifest(){
        for (Car car : cars) {
            System.out.println("Car " + (this.cars.indexOf(car)+ 1));
            car.printManifest();
        }
    }
}
