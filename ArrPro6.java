import java.util.*;
class ArrPro6
{

     public static void main(String[] args)
     {
            int a[]={10,20,30,40,50};
       
            for(int i=0;i<a.length-1;i++)
            {
               int last=a[a.length-1];
               a[i+1]=a[i];
              if(a.length==0)
              {
                 a[0]=last;
               }
            }
           
        
         System.out.println(Arrays.toString(a));
     }
}
/*
Remaining to Solve the Problem:
👉 Problem:

Rotate array by K positions to the right

Example:
[1, 2, 3, 4, 5], K = 2 → [4, 5, 1, 2, 3]

🧠 What you need to understand:
Elements shift circularly
🪜 Step-by-step thinking:

👉 Method 1 (Simple):

Repeat K times:
Take last element
Shift all elements right
Place last element at start

*/