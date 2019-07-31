/***********************************

SumTwo class

************************************/

// Builds class.
// Inherits from abstract class Sum
// in order to have access to variables and methods.
public class SumTwo extends Sum {

  // Overrides abstract method.
  // Takes one parameter,
  // array theInts in the main class.
  public int sumElements(int[] theInts) {


    // Initializes variable to store sum
    // of elements.
    int sum = 0;

    // Builds for loop.
    for(int i = 0; i < theInts.length; i++) {

      // Adds elements of the array
      // through each loop iteration.
      // Stores output in the variable sum.
      sum += theInts[i];

      // Outputs to the console.
      System.out.println("-------- index ---- " + i + " ---------- element ---------------- " + theInts[i] + " ---------- sum ---------- " + sum);

    }

    // Returns sum.
    return sum;

  }

}
