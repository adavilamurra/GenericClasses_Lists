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

public class TesterArrayBased {
  public static void main(String[] args){
    ArrayBasedList<Integer> abl = new ArrayBasedList<Integer>();
    
    for (int i=1; i<12; i++){
      abl.add(i*2);
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
    System.out.println("Attempting to insert 100 at location 9.");
    abl.insert(9, 100);
    System.out.println("The current list is as follows: ");
    abl.printAll();    
    System.out.println("Attempting to insert 100 at location 3.");
    abl.insert(3, 100);
    System.out.println("The current list is as follows: ");
    abl.printAll();      
    System.out.println("Attempting to set the value at location 5 to 120.");
    abl.set(5, 120);
    System.out.println("The current list is as follows: ");
    abl.printAll();          
    System.out.println("The current size of the list is: "+abl.size());
    System.out.println("The value at position 3 is: "+abl.get(3));         

  }
}
