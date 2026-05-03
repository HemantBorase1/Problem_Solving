class NumPro12
{
     public static void main(String[] args)
     {
          int n=121;
          int temp=0;
          int original=n;
         while(n!=0)
         {
            int digit=n%10;
            temp=temp*10+digit;
            n/=10;
         }
        if(original==temp)
        {
            System.out.println("Number is Palidrome");
        }
        else
        {
              System.out.println("Number is Not Palindrome");
        }
     }
}