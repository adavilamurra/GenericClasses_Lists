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
 **    Due Date: Tuesday, April 26                                                   **
 **    Last modification: 4/26/2016                                                  **
 **                                                                                  **
 **************************************************************************************/

public class ArrayBasedList<T> implements ListInterface<T>{
  
  private int MAX_ITEMS=10;  // Maximum Number of items the items array can hold.
  private Item<T>[] items;   // Array that will hold items of type T
  private int count;         // Number of valid items in the array
  
  ArrayBasedList(){
    items = new Item[MAX_ITEMS];
  }
  
  //Methods
  // Include obj as the last item of the list.
  public void add(T obj){
    if(!isFull()){
      items[count] = new Item(obj);
      count++;
    }
    else
      System.out.println("Could not add " + obj + " because the list is full");
  }
  
  // Insert obj to a particular position. 
  public void insert(int position, T obj){
    if(!isFull()){
      if(count < position){
        System.out.println("There are " + count + " elements in the list now");
        System.out.println("Could not insert because position is not between 0 and " + count);
        return;
      }
      Item temp = items[position];
      items[position] = new Item(obj);
      count++;
      for(int i = count; position < i; i--){
        items[i] = items[i-1];
      }
      items[position+1] = temp;
    }
    System.out.println("The List is full");
  }
  
  // Return the object in index position
  public T get(int position){
    return items[position].data;
  }
  
  // Update the object in index position by placing obj in that position.
  public boolean set(int position, T obj){
    if(!isFull()){
      items[position] = new Item(obj);
      return true;
    }
    System.out.println("The List is full");
    return false;
  }
  
  // Remove the item in current position.
  public boolean remove(int position){
    if(!isEmpty()){
      if(count <= position)
        return false;
      count--;
      for(int i = position; i < count; i++){
        items[i] = items[i+1];
      }
      return true;
    }
    return false;
  }
  
  // Return true if the list has reached its maximum capacity. 
  // Otherwise return false. 
  public boolean isFull(){
    if(MAX_ITEMS == count) return true;    
    return false;
  }
  
  // Return true if the list is empty. Otherwise return false.   
  public boolean isEmpty(){
    if(count == 0) return true;
    return false;
  }
  
  // Print everything in the list.
  public void printAll(){
    if(!isEmpty()){
      System.out.print("[");
      for(int i = 0; i < count; i++){
        System.out.print(items[i] + " ");
      }
      System.out.print("]");
      System.out.println();
    }
    else
      System.out.print("The list is empty.");
  }
  
  // Return the number of valid items in the list.
  public int size(){
    return count;
  }
  
}
