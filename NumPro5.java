import java.util.*;
class NumPro5
{
    public static void main(String[] args)
    {
        int first=0,second=1,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        System.out.print(first+"\t"+second+"\t");
        for(int i=3;i<=n;i++)
        {
           temp=first+second;
           System.out.print(temp+"\t");
           first=second;
           second=temp;
        }
     
    }
}