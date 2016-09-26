/**************************************************************************************
 **                                                                                  **
 **    Code by: Alejandro Davila Murra                                               **
 **                                                                                  **
 **    CS 2401: Elementary Data Structures and Algorithms                            **
 **    Instructor: Mahmud Shahriar Hossain                                           **
 **    TAs: Debakar Shamanta, Anthony M. Ortiz Cepeda, Andres H Olivas Aguilar       **
 **    Lab Assignment #9                                                             **
 **    Objective: The goal of this assignment is practice the use of generic         **
 **               classes and interfaces, as well as the implementations of lists.   **        
 **    Due Date: Sunday, April 24                                                    **
 **    Last modification: 4/24/2016                                                  **
 **                                                                                  **
 **************************************************************************************/

public class TesterListOfCubes {
  public static void main(String[] args){
    ArrayBasedList<Cube> abl = new ArrayBasedList<Cube>();
    
    for (int i=1; i<12; i++){
      Cube c = new Cube (i, i+1, i+2);
      abl.add(c);
    }
    System.out.println("The list is as follows: ");
    abl.printAll();
    System.out.println("Attempting to remove item at location 0.");
    abl.remove(0);
    System.out.println("The current list is as follows: ");
    abl.printAll();
    System.out.println("Attempting to remove item at location 5.");
    abl.remove(5);
    System.out.println("The current list is as follows: ");
    abl.printAll();
    Cube c= new Cube(100, 200, 300);
    System.out.println(
       "Attempting to insert a cube 100*200*300 at location 9.");
    abl.insert(9, c);
    System.out.println("The current list is as follows: ");
    abl.printAll();    
    System.out.println(
      "Attempting to insert a cube 100*200*300 at location 3.");
    abl.insert(3, c);
    System.out.println("The current list is as follows: ");
    abl.printAll();      
    c=new Cube (10, 11.2, 20.9);
    System.out.println(
     "Attempting to set the value at location 5 to a cube 10*11.2*20.9.");
    abl.set(5, c);
    System.out.println("The current list is as follows: ");
    abl.printAll();          
    System.out.println("The current size of the list is: "+abl.size());
    System.out.println("The value at position 3 is: "+abl.get(3));         
  }
}
