/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class A3Q6 {

    public void bucketSort(int[] n){
        
        //Suppose we need to sort an array of positive integers {3,11,2,9,1,5}.
        //A bucket sort works as follows: create an array of size 11. 
        //Then, go through the input array and place integer 3 into a second array at index 3,
        //integer 11 at index 11 and so on. We will end up with a sorted list in the second array.
        
        int[] tracker = new int[100];
        
        for(int i = 0; i < 100; i++){
            
            tracker[i] = n[i];
        }
        
        return;
        
    }
    
    
    
    public static void main(String[] args) {
        
        int[] random = new int[100];
        A3Q6 test = new A3Q6();
        
        for(int i = 0; i < 100; i++){
            
            int randomNums = (int)(Math.random()*101);
            random[i] = randomNums;
            
            test.bucketSort(random);
            System.out.println(random[i]);
        }
    }
}
