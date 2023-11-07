public class Passenger {
    /* The passenger's name*/
    String name;

    /**
     * Creates an instance of the train class and initiliases the attributes
     *@param name String
     */

    public Passenger(String name){
        this.name = name;
    }

    /**
     * Allows access to the passenger's name
     * @return name
     */
    
     public String getName(){
        return name;
    }
    
    /**
     * Adds passenger to a given car
     * @param c Car
     */
    
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Removes passemger from given car
     * @param c Car
     */
    
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
