class NumPro8
{
     public static void main(String[] args)
     {
          int n=8128;
          int sum=0;
          boolean b=false;
          for(int i=1;i<n;i++)
          {
               if(n%i==0)
               {
                    sum+=i;
                    
               }
          }
                    if(sum==n)
                        System.out.println("Number is Perfect Number.");
                    else
                        System.out.println("Number is Not Perfect.");
     }
}