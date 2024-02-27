class AreaSin extends ConsoleProgram {

  /**
  * Finding 
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblArea;

    dblSideA = readDouble("What is the first known side? ");
    dblSideB = readDouble("What is the second known side? ");
    dblAngleC = readDouble("What is the known angle? ");

    dblArea = (dblSideA * dblSideB * Math.sin(dblAngleC))/2;

    System.out.println("The unknown area will be: " + dblArea);
  }
}