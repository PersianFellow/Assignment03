/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class A3Q5 {

    
    
    public void insertionReverse(int[] n){
        
        
        for(int i = n.length - 1; i > 0; i--)
        {
            for(int x = i; x < n.length && n[x] > n[x - 1]; x++){
                
                int temp = n[x - 1];
                n[x - 1] = n[x];
                n[x] = temp;
            }
        }
        
        
    }
    
    
    public static void main(String[] args) {
        
        
        A3Q5 test = new A3Q5();
        
        int[] n = {10,9,8,7,6,5,4,3,2,1};
        test.insertionReverse(n);
        
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }
    }
}
