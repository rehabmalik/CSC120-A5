public class Engine {
    /* The current fuel level of the engine */
   private double currentFuelLevel;
   /* The maximum fuel level of the engine */
   private double maxFuelLevel;
   /* The fuel type of the engine, one of: STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER */
   private FuelType fuelType;

   /**
     * Creates a new engine and initializes its attributes
     * @param currentFuelLevel
     * @param fuelType
     */
   
    public Engine (FuelType fuelType, double currentFuelLevel){
     this.fuelType = fuelType;
     this.currentFuelLevel = currentFuelLevel;
     this.maxFuelLevel = 100.0;
    }
    
    /**
     * Gives the current fuel level of the engine
     * @return currentFuelLevel
     */
    
     public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * Gives the maximum fuel level of the engine
     * @return maxfuellevel
     */
    
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    /**
     * Gives the fuel type used in the engine
     * @return fueltype
     */
    
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Refuels the engine to its maximum level
     */
    
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

   /**
      * Decreases the fuel level according to the time travelled and prints remaining fuel
      * @param traveltime
     */

    public void go(double traveltime) {
        double fuelconsumptionrate = 4.16;
        double fuelconsumed;
       currentFuelLevel = getCurrentFuelLevel();
       fuelconsumed = traveltime*fuelconsumptionrate;
       if (currentFuelLevel < fuelconsumed){
        throw new RuntimeException("There is not enough fuel to travel further. Fuel remaining: " + currentFuelLevel);
       }
       currentFuelLevel = currentFuelLevel - fuelconsumed;
       if (currentFuelLevel <= 0) {
        throw new RuntimeException("There is not enough fuel to travel. Fuel remaining: " + currentFuelLevel);
       }
       System.out.println("Fuel remaining: " + currentFuelLevel);
    }
}
