import java.util.*;
class StrPro1
{
    public static void main(String [] args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any String:");
            String str=sc.nextLine();
            String v="aeiouAEIOU";            

            int count=0;
            for(int i=0;i<str.length();i++)
            {
                   for(int j=0;j<v.length();j++)
                   {
                      if(str.charAt(i)==v.charAt(j))
                      {
                        count++;
                      }
                   }
            }
          System.out.println("Total Vowels in Your String:"+count);
    }
}