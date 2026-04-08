import java.util.*;
class StrPro2
{

    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String is Palindrom or not");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        
        if(str.equals(rev))
        {
            System.out.println("String is Palindrome");
         }
        else
       {
             System.out.println("String is Not Palindrome");
       }
        
    }
}