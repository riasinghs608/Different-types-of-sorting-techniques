
package sorting;

/**
 *
 * @author pc
 */

//MERGESORT IN DESCENDING ORDER


public class MergeSort {
    
   void mergesort(int arr[],int l, int r)
    {
	if(l<r)
	{
            int m;
            m=l+(r-l)/2;
		
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
		
            merge(arr,l,m,r);
		
	}
	
    }
    
    void merge( int arr[],int l,int m,int r)
    {
	int i,j,k;
	int n1=m-l+1;
	int n2=r-m;
	int L[]=new int[n1]; 
        int R[]=new int[n2];
	
	for(i=0;i<n1;i++)
	{
		L[i]=arr[l+i];
	}
	
	for(j=0;j<n2;j++)
	{
		R[j]=arr[m+1+j];
	}
	i=0;j=0;k=l;
	
	while(i<n1 && j<n2)
	{
		if(L[i]>R[j])
		{
			arr[k]=L[i];
			i++;
		}
		else
		{
			arr[k]=R[j];
			j++;
		}
		k++;
		
	}
	while(i<n1)
	{
		arr[k]=L[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		arr[k]=R[j];
		j++;
		k++;
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
        MergeSort m=new MergeSort();
        int[] arr={20,35,-15,7,55,1,-22};
        m.mergesort(arr,0,arr.length-1);
        m.print(arr,arr.length);
    }
    
}
            
