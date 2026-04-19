/*

👉 Problem:

Remove duplicate elements from an array

Example:
[1, 2, 2, 3, 4, 4] → [1, 2, 3, 4]

🧠 What you need to understand:
Avoid repeated elements

*/

import java.util.*;
class ArrPro5
{
      public static void main(String[] args)
      {
         
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=sc.nextInt();
        }
       
      }
}