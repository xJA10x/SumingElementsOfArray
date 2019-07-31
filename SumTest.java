/*************************************

SumTest class

**************************************/

public class SumTest {

  public static void main(String[] args) {

    System.out.println("");
    System.out.println("##################### Running Program ###########################");
    System.out.println("");

    // Builds object from the class SumTwo
    // in order to have access to variables and methods.
    SumTwo sObj = new SumTwo();

    // Initilaizes array.
    int[] theInts = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    System.out.println("Program written by Jhoset!!!!!!!");

    // Method call
    // using object name.
    // Takes one parameter.
    sObj.sumElements(theInts);

    System.out.println("");
    System.out.println("####################### Exiting Program #########################");
    System.out.println("");

  }

}
