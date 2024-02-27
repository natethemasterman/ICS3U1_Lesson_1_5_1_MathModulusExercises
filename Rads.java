class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    
    double dblDeg;
    double dblRad;

    dblDeg = readDouble("What is the degree? ");

    dblRad = Math.toRadians(dblDeg);

    System.out.println("The radian is: " + dblRad);
  }
}