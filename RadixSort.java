/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author pc
 */
public class RadixSort {
    
    void countSort(int arr[],int min,int max)
    {
        int[] a=new int[max-min+1];
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
    
    int getmax(int arr[],int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    
    
    void radixSort(int arr[],int n)
    {
        int j=getmax(arr,n);
        
        for(int i=1;j/i>0;i++)
            countSort(arr,n,j);  
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
        RadixSort r=new RadixSort();
        
        int arr[]={4725,4586,1330,8792,1594,5729};
        r.radixSort(arr, arr.length);
        r.print(arr, arr.length);
    }
    
}
