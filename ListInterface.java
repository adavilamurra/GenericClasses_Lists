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

public interface ListInterface<T> {
   public void add(T obj); 
   // Include obj as the last item of the list.
   
   public void insert(int position, T obj); 
   // Insert obj to a particular position. 
   
   public T get(int position);
   // Return the object in index position
   
   public boolean set(int position, T obj);
   // Update the object in index position by placing obj in that position.
   
   public boolean remove(int position);
   // Remove the item in current position.
   
   public boolean isFull(); 
   // Return true if the list has reached its maximum capacity. 
   // Otherwise return false. 
   
   public boolean isEmpty(); 
   // Return true if the list is empty. Otherwise return false.    
   
   public void printAll();
   // Print everything in the list.
   
   public int size();
   // Return the number of valid items in the list.
  
}
