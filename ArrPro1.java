import java.util.*;
class ArrPro1 
{

    public static void main(String [] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Size of Array:");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("Enter Array Element");
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sc.nextInt();
         }
         
         int max=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             if(max<=arr[i])
             {
               max=arr[i];
             }
         }
        System.out.println("Maximum Value From the Array:"+max);
         
    }
}