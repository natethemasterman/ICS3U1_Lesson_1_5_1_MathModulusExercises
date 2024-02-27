class Power extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblA;
    double dblB;
    double dblAnswer;

    dblA = readDouble("What is the base integer? ");
    dblB = readDouble("What is the exponent? ");

    dblAnswer = Math.pow(dblA, dblB);

    System.out.println("The answer is: " + dblAnswer);
  }
}