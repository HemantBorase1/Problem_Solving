import java.util.*;
class StrPro3
{

    public static void main(String[] args)
    {
         int count=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a String:");
         String str=sc.nextLine();
         String space=" ";
         for(int i=0;i<str.length();i++)
         {
                if(str.charAt(i)==' ')
                {
                   count++;
                }
         }
        System.out.println("Total Spaces in Your Input String:"+count);
    }
}