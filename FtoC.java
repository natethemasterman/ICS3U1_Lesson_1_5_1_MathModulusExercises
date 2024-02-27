class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblFahrenheit;
    double dblCelsius;

    dblFahrenheit = readDouble("What is the Fahrenheit? ");

    dblCelsius = 5.0 / 9.0 * (dblFahrenheit - 32);

    System.out.println("The temperature is celsius is: " + dblCelsius);
  }
}