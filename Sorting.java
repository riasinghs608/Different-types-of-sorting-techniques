
package sorting;

import java.util.Arrays;

public class Sorting {

    public static void swap(int[] arr,int i,int j)
    {
        int temp;
        if(i==j)
            return;
        else
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

  public static void main(String[] args) {
        
        int[] array={20,35,-15,7,55,1,-22};
        
        //BUBBLE SORT
  
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                    swap(array,j,j+1);   
            }
        }
     
        
        //SELECTION SORT
        
        for(int i=0;i<array.length-1;i++)
        {
            int min=i;
            
            for(int j=i+1;j<array.length;j++)
            {
                if(array[min]>array[j])
                    min=j;
            }
            swap(array,min,i);
        }
        
        
        
        //INSERTION SORT
        
        for(int i=1;i<array.length;i++)
        {
            int key=array[i];
            int j=i-1;
            
            while(j>=0 && array[j]>key)
            {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}

    

