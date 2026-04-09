class NumPro3
{

     public static void main(String[] args)
     {
          int sum=0;
          int n=183;
          int temp=n;
          int count=0;
          while(n>0)
          {
           n/=10;
           count++;
          }
         n=temp;
         while(n>0)
         {
            int digit=n%10;
            sum+=(int) Math.pow(digit,count);
            n/=10;
         }
         System.out.println(sum);
        if(temp==sum)
        {
            System.out.println("Number is Armstrong.");
        }
        else
        {
             System.out.println("Number is Not Armstrong");
        }
            
        
     }
}