public class Engine {
    /* The current fuel level of the engine */
   private double currentfuellevel;
   /* The maximum fuel level of the engine */
   private double maxfuellevel;
   /* The fuel type of the engine, one of: STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER */
   private FuelType fueltype;

   /**
     * Creates a new engine and initializes its attributes
     * @param currentfuellevel
     * @param fueltype
     */
   
    public Engine (FuelType fueltype, double currentfuellevel){
     this.fueltype = fueltype;
     this.currentfuellevel = currentfuellevel;
     this.maxfuellevel = 100.0;
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
     * Gives the fuel type used in the engine
     * @return fueltype
     */
    
    public FuelType getFuelType() {
        return fueltype;
    }

    /**
     * Refuels the engine to its maximum level
     */
    
    public void refuel() {
        currentfuellevel = maxfuellevel;
    }

   /**
      * Decreases the fuel level according to the time travelled and prints remaining fuel
      * @param traveltime
     */

    public void go(double traveltime) {
        double fuelconsumptionrate = 4.16;
        double fuelconsumed;
       currentfuellevel = getCurrentFuelLevel();
       fuelconsumed = traveltime*fuelconsumptionrate;
       if (currentfuellevel < fuelconsumed){
        throw new RuntimeException("There is not enough fuel to travel further. Fuel remaining: " + currentfuellevel);
       }
       currentfuellevel = currentfuellevel - fuelconsumed;
       if (currentfuellevel <= 0) {
        throw new RuntimeException("There is not enough fuel to travel. Fuel remaining: " + currentfuellevel);
       }
       System.out.println("Fuel remaining: " + currentfuellevel);
    }
}
