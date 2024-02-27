class Circumference extends ConsoleProgram {

  /**
  * Finding the circumference of a circle based on measurements given and applying it to the formula
  * @author: Nathan Bruce Moran the Goat
  */
  
  public void run() {
    
    // start coding here
    double dblRad;
    double dblCir;

    dblRad = readDouble("What is the radius of the circle? ");

    dblCir = (dblRad * 2 * 3.14);

    System.out.println("The circumference of the circle is: " + dblCir);
  }
}