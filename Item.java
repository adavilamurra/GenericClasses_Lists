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

public class Item<T> {
  T data;
  
  Item(T d){
    data=d;
  }
  
  public String toString(){
    return data.toString();
  }
}
