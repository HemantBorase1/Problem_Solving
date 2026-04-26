class NumPro11
{

   public static void main(String[] args)
   {
                int n=123;
                int temp=n;
                int ans=0;
            while(n!=0)
            {
             int digit =n%10;
             ans=ans*10+digit;
             n/=10;
            }
          if(ans==temp)
          {
             System.out.println("Number is Palindrome.");
          }
   }
}