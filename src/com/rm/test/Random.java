package com.rm.test;

import java.util.Collections;

public class Random
{
    int min;                     //minimum number that can be generated.
    int max;                    //maximum number that can be generated. 
    int value;
 
    public Random(int n, int m)
    {
        max = m;        //code goes in this class
        min = n;
        
    }
     
 
    public int getRandom()
    {
      
       
        return value;
         
     }

public static void main(String[] args)
    {
        int min = 1;                 // smallest number that can be generated
        int max = 20;                // largest number that can be generated
        Random  rg = new Random(min, max);
        int num;
        int[] frequency = new int[max];
         
        Collections cs; 
        for (int x = 0; x < 10000; x++) 
        {
           num = rg.getRandom();
            
           System.out.println(num);
            
           for (int index = 0; index < max; index ++)     //determines frequency
              {
               if (num == index + 1) 
                 frequency[index]++;
               }
         }
          
          
          for (int index = 0; index < max; index ++)     // displays frequency
        {
            System.out.println(""+(index+1) + " = " + frequency[index]);
        }
   }
}