class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intHour;
    int intDays;
    int intRemainingHours;
    
    intHour = readInt("What is the amount of hours? ");

    intDays = intHour / 24;
    intRemainingHours = intHour - (intDays * 24);

    System.out.println("The hours in days is: " + intDays );
    System.out.println("The remaining hours is: " + intRemainingHours);
  }
}