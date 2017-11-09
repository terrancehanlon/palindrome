/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
/**
 *
 * @author terrance.hanlon
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   
    public static boolean palindrome(String x){
        int i = 0;
        int p = 0;
        boolean answer = false;
        String s = x.toLowerCase();
        String[] arr = s.split("");
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<>();
        while(i < arr.length){
            stack.push(arr[i]);
            queue.add(arr[i]);
            i++;
        }
       
        for(int j = 0; j < arr.length; j++){
          String stackPop = stack.pop();
          String queuePop = queue.poll();
       
          if(!(stackPop.equals(queuePop)))
                p = 0;
            else
                p = 1;
            }
        if(p == 1){
            return true;
        }
        else 
        return false;
    }
    
    public static void main(String[] args) {
        
        String x = "Hello This Anna be false";
        String[] y = x.split(" ");
        boolean ans = false;
        String text = "";
        for(int i = 0; i < y.length; i++){
            if(palindrome2(y[i])){
                ans = true;
                text += y[i];
            }
            
        }
        System.out.println(ans + " " + text);
    }
    
    public static boolean palindrome2(String x){
        boolean ans = false;
        String s = x.toLowerCase();
        String[] input = s.split("");
        String rev = "";
        for(int i = input.length-1; i >= 0; i--){
            rev += input[i];
        }
       
        if(rev.equals(s)){
            
            return true;
        }
        else{
           
            return false;
    }}
}
