/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

public class CountSort {
    
    
    void countSort(int arr[],int min,int max)
    {
        int[] a=new int[(max-min)+1];
        
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]-min]++;
        }
        
        int j=0;
        for(int i=min;i<=max;i++)
        {
            while(a[i-min]>0)
            {
                arr[j++]=i;
                a[i-min]--;
            }
        }
       
    }
    
    void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(""+arr[i]);
        }
        
    }
    
    public static void main(String args[])
    {
        CountSort c=new CountSort();
        
        int []arr={20,35,-15,7,55,1,-22};
        c.countSort(arr, 1, 10);
        c.print(arr, arr.length);
    }
    
}
