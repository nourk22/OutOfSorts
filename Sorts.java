public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean isSorted=false;


    if (data.length<2){
      isSorted=true;

    }else{
      int num_swaps=0;

      while (! isSorted){

        for (int i=0; i<data.length-1; i++){
          //holders
          int curr=data[i];
          int next=data[i+1];

          //check and swap
          if (next < curr){
            data[i] = next;
            data[i+1] = curr;
            num_swaps++;
          }
        }

        if (num_swaps==0){
          isSorted=true;
        }
      }
    }

  }
}
