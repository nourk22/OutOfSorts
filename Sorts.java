public class Sorts{

  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void bubbleSort(int[] data){
    boolean isSorted=false;

    if (data.length>=2){
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
        }else{
          num_swaps=0;
        }
      }
    }
  }

  /**selection sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */

   public static void selectionSort(int[] data){
     for (int i=0; i<data.length; i++){
       int smallest = data[i];
       int smallestIndex=i;

       //find smallest value
       for (int j=i; j<data.length; j++){
         if (data[j]<smallest){
           smallest=data[j];
           smallestIndex=j;
         }
       }

       //swap
       data[smallestIndex]=data[i];
       data[i]=smallest;
     }
   }

   /**insertion sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */

  public static void insertionSort(int[] data){
    int curr, index;

    for (int i=1; i<data.length; i++){
      curr = data[i];
      index = i-1;

      while (index >= 0  && data[index] > curr){
        data[index+1]=data[index];
        index --;
      }

      data[index+1]=curr;
     }
   }
 }
