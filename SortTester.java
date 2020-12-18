import java.util.Arrays;
import java.util.Random;

public class SortTester{
  //TOGGLE THIS VARIABLE TO TURN ON/OFF prints
  public static boolean DEBUG = true;

  public static void dprint(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }

  public static String toString(int[] array){
    String ans = "[";
    for (int i=0; i<array.length-1; i++){
      ans+=array[i]+", ";
    }
    if (array.length>0){
      ans+=array[array.length-1];
    }
    ans+="]";
    return ans;
  }

  public static void main(String[]args){
    //do this so you do not forget to turn it off
    dprint("TURN THIS OFF BEFORE SUBMITTING YOUR CODE!!!!!!!!");

    Random rng = new Random();
    for(int i =  0; i < 5; i++ ){
      int[] a = new int[(int)(Math.random()*10)];

      for (int j = 0; j<a.length; j++){
        a[j]=rng.nextInt() % 1000;
      }

      System.out.println("ORIGINAL: " + toString(a));
      Sorts.bubbleSort(a);
      System.out.println("BUBBLE SORT: " + toString(a));
    }


    //Add the other parts of your main

  }
}
