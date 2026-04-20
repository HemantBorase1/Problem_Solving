class StrPro6
{

   public static void main(String[] args)
   {
          String str="HHllo";
         for(int i=0;i<str.length();i++)
         {
            char current=str.charAt(i);
            int count=0;
               for(int j=0;j<str.length();j++)
                { 
                   if(str.charAt(j)==current)
                   {
                       count++;
                   }
                }
           if(count==1)
           {
                System.out.println(current);
           }
           
         }
        // Understand the Code Properly Dry Run It with Different Example
   }
}

/*
👉 Problem:

Find the First Non-Repeating Character

Example:
"programming" → p

🧠 What you need to understand:
Character that appears only once

*/