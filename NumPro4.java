import java.util.*;
class NumPro4
{

    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a Number for Checking It Prime or Not:");
          int n=sc.nextInt();
          Boolean b=false;
          if(n<=1)
          {
                b=true;
          }
          for(int i=2;i<n;i++)
          {
                  if(n%i==0)
                  {
                       b=true;
                  }
          }
         if(b)
         {
              System.out.println("Number is Not Prime.");
         }
         else
         {
              System.out.println("Number is Prime");
         }
    }
}