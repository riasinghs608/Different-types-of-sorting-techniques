
package sorting;


public class ShellSort 
{
    
     void shellSort()
     {
        int[] arr={20,35,-15,7,55,1,-22};

        for(int gap=arr.length/2;gap>0;gap=gap/2)
        {
            for(int i=gap;i<arr.length;i++)
            {
                int ele=arr[i];
                int j=i;
                
                while(j>=gap && arr[j-gap]>ele)
                {
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=ele;
            }
        }
        
         
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
     
     
     public static void main(String args[])
     {
         ShellSort s=new ShellSort();
         s.shellSort();
     }
}
