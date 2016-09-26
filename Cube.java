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

public class Cube {
  double width, height, length;
  Cube(){    
  }
  Cube (double w, double h, double l){
    width=w;
    height=h;
    length=l;
  }
  
  public double getVolume(){
    return width*height*length;
  }
  
  public String toString(){
    return "["+width+"x"+height+"x"+length+"]";
  }
}
