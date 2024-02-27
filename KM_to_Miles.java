class KM_to_Miles extends ConsoleProgram {
    
    /**
    * Description 
    * @author:
    */

    public void run() {
    
    double dblKm;
    double dblMile;

    dblKm = readDouble("What is the distance in kilometers? ");

    dblMile = dblKm * 0.621371;

    System.out.println("The distance in miles is: " + dblMile);
    }
}
