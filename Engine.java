public class Engine {
   double currentfuellevel;
   double maxfuellevel;
   private FuelType fueltype;

   /**
     * Creates a new engine and initializes its attributes
     * @param currentfuellevel
     * @param fueltype
    */
   public Engine (double currentfuellevel, FuelType fueltype){
     this.currentfuellevel = currentfuellevel;
     this.maxfuellevel = 100.0;
     this.fueltype = fueltype;
    }
    /**
     * Gives the current fuel level of the engine
     * @return currentfuellevel
    */
    public double getCurrentFuelLevel() {
        return currentfuellevel;
    }

    /**
     * Gives the maximum fuel level of the engine
     * @return maxfuellevel
    */
    public double getMaxFuelLevel() {
        return maxfuellevel;
    }

    /**
     * Refuels the engine to its maximum level
    */
    public void refuel() {
        currentfuellevel = maxfuellevel;
    }
    
   /**
      * Decreases the fuel level according to the time travelled and prints remaining fuel
      * The train can travel for 24 hours before it needs to be refuelled again. 
      * @param traveltime
    */
    public void go(double traveltime) {
        double fuelconsumed;
       currentfuellevel = getCurrentFuelLevel();
       fuelconsumed = traveltime*(100/24);
       if (currentfuellevel < fuelconsumed){
        throw new RuntimeException("There is not enough fuel to travel further. Fuel remaining: " + currentfuellevel);
       }
       currentfuellevel = currentfuellevel - fuelconsumed;
       if (currentfuellevel == 0) {
        throw new RuntimeException("There is not enough fuel to travel. Fuel remaining: " + currentfuellevel);
       }
       System.out.println("Fuel remaining: " + currentfuellevel);
    }
}
