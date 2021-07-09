package edu.cnm.deepdive;

// scope = range in which something is available or visible.

public class ScopeOfVariables {

  static int myNewInt = 5;

  public static void main(String[] args) {

    int myLocalInt = 10;

    {
      int myOtherInt = 20;
      System.out.println("myOtherInt in same code block = " + myOtherInt);
      System.out.println("myLocalInt in encapsulating code block = " + myLocalInt);
    }
    System.out.println("myOtherInt in it's own code block = " + myLocalInt);
    //System.out.println("myOtherInt outside of it's own code block = " + myOtherInt); does not compile.
    System.out.println("myNewInt is a class variable = " + myNewInt);
    int myOtherInt = 30;
    System.out.println("myOtherInt in same code block = " + myOtherInt);// no problem that we use the
    // same name because the myOtherInt that is 20 is out of scope here.
  }

  public static void myMethod() {
    //does not have access to the local variable myLocalInt but does have access to the global variable
    //(or also called class variable myNewInt.

  }

}
