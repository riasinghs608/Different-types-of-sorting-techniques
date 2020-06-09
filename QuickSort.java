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
public class QuickSort {
    
    int partition(int arr[],int low,int high)
    {
	int pivot=arr[high];
	int i=low-1;
	int j; 
	
	for(j=low;j<=high-1;j++)
	{
		if(arr[j]<pivot)
		{
			i++;
			int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
	}
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
	
	return(i+1);
	
    }
    
    void quicksort(int arr[],int low,int high)
    {
	if(low<high)
	{
		int pi;
		pi=partition(arr,low,high);
		
		quicksort(arr,low,pi-1);
		quicksort(arr,pi+1,high);
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
        QuickSort q=new QuickSort();
        int []arr={20,35,-15,7,55,1,-22};
        q.quicksort(arr,0,arr.length-1);
        q.print(arr,arr.length);
    }
}
