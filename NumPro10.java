// This Program for finding Square Root of Given Number without using any Inbuild Function
class NumPro10
{

     public static void main(String[] args)
     {
            int n=784;
            int square=0;
            for(int i=2;i<=n;i++)
            {
                int temp=i*i;
                if(n==temp)
                {
                    square+=i;
                    break;
                }
            }
        System.out.println(square);
     }
}