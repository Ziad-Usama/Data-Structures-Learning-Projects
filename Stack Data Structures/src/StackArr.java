public class StackArr {
  private int arr[];
  private int size; 
  private int tos;
  
  public StackArr(int size){
    this.size = size;
    arr = new int[size];
    tos = 0;
  }
public boolean pushStack(int data){
    boolean retval = false;
    // Check for an empty location
    if(tos<size){
        // Add value to array, at the index of tos;
        arr[tos] = data;
    //Update the value of tos
        tos++;
        retval = true;
    }
// Return true if data added, false otherwise
    return retval;
}
//Assume the stack contains +ve values only
public int popStack(){
    // Check if the stack is not empty
    int retval = -1;
    if(tos > 0){
    // Decrease the tos
        tos--;
    //copy the value of array to retval;
    retval = arr[tos];
    }
    // Return retval
    return retval;
}
public boolean isEmpty(){
    return (tos == 0);   
 }
}
