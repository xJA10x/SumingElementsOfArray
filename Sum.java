/***********************************

Sum class

************************************/

// Notes:
  // Abstract classes can obly be inherited,
  // you cannot create an instance from an abstract class
  // Abstract methods can only be overriden in the sub class,
  // abstract methods cannot be implemented in the base class.


abstract class Sum {

  // Builds abstract method.
  // Takes one parameter,
  // array theInts in the main class.
  public abstract int sumElements(int[] theInts);

}
