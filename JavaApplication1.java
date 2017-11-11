/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author terrance.hanlon
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
     public static void sum(int[] x){
        long[] arr = new long[x.length];
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                if(x[j] <= min){
                   arr[i] = x[j];
                   min = x[j];
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
       
        int[] arr1 = new int[5];
        arr1[0] = 6;
        arr1[1] = 9;
        arr1[2] = 10;
        arr1[3] = 5;
        arr1[4] = 7;
        
        
        bubbleSort2(arr1);
        //sum(arr1);
    }

   public static void bubbleSort(int[] array){
       
//    for(int i = 0; i < array.length-1-i;i++){
//        for(int j = 0; j < array.length-1-i; j++){
//            if(array[j] > array[j+1]){
//                int temp = array[j+1];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//            }
//        }
//    }
       
  for (int i=0; i<array.length-1; i++) {
  for (int j=0; j<array.length-1-i; j++)
    if (array[j+1] < array[j]) {  /* compare the two neighbors */
      int tmp = array[j];         /* swap a[j] and a[j+1]      */
      array[j] = array[j+1];
      array[j+1] = tmp;
  }
}

//    for(int i = 0; i < array.length-1; i++){
//        for(int j = 0; j < array.length-1-i; j++){
//            if(array[j+1] < array[j]){
//                int temp = array[j];
//                array[j] = array[j+1];
//                array[j+1] = temp;
//            }
//        }
//    }
    
        for(int i = 0; i < array.length; i++){
           System.out.println(array[i] + " ");
       }
   }
 


public static void bubbleSort2(int[] x){
    
    for(int i = 0; i < x.length-1; i++){
        for(int j = 0; j < x.length-1-i; j++){
            if(x[j+1] < x[j]){
                int temp = x[j];
                x[j] = x[j+1];
                x[j+1] = temp;
            }
        }
    }
      for(int i = 0; i < x.length; i++){
           System.out.println(x[i] + " ");
       }

}
   
}
