class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    int intMinutes;
    int intDays;
    int intHours;
    int intRemainingMinutes;

    intMinutes = readInt("What is the amount of minutes? ");

    intDays = intMinutes / 1440;
    intHours = ( intMinutes - (intDays * 1440) ) / 60;
    intRemainingMinutes = intMinutes - (intHours * 60) - (intDays * 1440);

    System.out.println("The time in days is " + intDays + " and in hours is " + intHours + " and in minutes is " + intRemainingMinutes);
  }
}