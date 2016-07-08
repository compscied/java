/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms;

/**
 *
 * @author AF
 */
public class MergeSort {
    public static void main(String[] args)
    {
        int []a = {5,12,32,57,61};
        int []b = {4,9,23,43,54,65,74};
        
        // Array c will hold both a and b
        int []c= new int[a.length+b.length];
        
        merge(a, b, c);
        
        System.out.print("Contents of array a:  \n");
        printArray(a);
        
        System.out.print("\n Contents of array b: \n");
        printArray(b);
        
        System.out.print("\n Now array c sorted and merged: \n");
        printArray(c);
       
    }
    
    //here is where the sort and merge magic happends
    public static void merge(int[] a, int[] b, int [] c)
    {
        int cursorA = 0, cursorB = 0, cursorC = 0;
        
        int lengthA = a.length;
        int lengthB = b.length;
        
        // Run until the end of both arrays
        while (cursorA <lengthA && cursorB < lengthB)
        {
            //Compare the items of two arrays and copy the smaller item into to third array
            if(a[cursorA] < b[cursorB]){
                c[cursorC++] = a[cursorA++];
            }else{
                c[cursorC++] = b[cursorB++];
            }
        }    
        
        // If array B's cursor scanned and compared all the items of the array
        // but array A's is not
        while(cursorA < lengthA)
        {
            c[cursorC++] = a[cursorA++];
        }
    }    
    
    public static void printArray(int []array)
    {
        for (int i: array)
        {
            System.out.print(i+" ");
        }    
    
    }       
}
