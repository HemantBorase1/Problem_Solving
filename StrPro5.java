import java.util.*;
class StrPro5
{
    public static void main(String[] args)
    {
         boolean b=false;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter First String");
         String str1=sc.nextLine().toLowerCase();
         System.out.println("Enter First String");
         String str2=sc.nextLine().toLowerCase();
         char CharAr1[]=str1.toCharArray();
         char CharAr2[]=str2.toCharArray();
         Arrays.sort(CharAr1);
         Arrays.sort(CharAr2);
         if(str1.length()==str2.length())
         {
               for(int i=0;i<str1.length();i++)
               {
                     for(int j=0;j<str2.length();j++)
                     {
                            if(CharAr1[i]==CharAr2[j])
                            {
                                 b=true;
                            }
                            else
                            {
                                 b=false;
                            }
                     }
               }
         }
        else
        {
             b=false;
        }
      if(b)
      {
           System.out.println("String is Anagram.");
      }
      else
      {
           System.out.println("String is Not Anagram.");
      }
    }
}

/*
👉 Problem:

Check whether two strings are Anagrams

Example:
"listen" & "silent" → Yes ✅
"hello" & "world" → No ❌

Output:
Enter First String
silent
Enter First String
LISTEN
String is Anagram.



*/