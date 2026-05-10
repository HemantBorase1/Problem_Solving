class StrPro13
{

   public static void main(String[] args)
   {
       String str="HelLo World";
       int UpperCase=0;
       int lowerCase=0;
    
       for(int i=0;i<str.length();i++)
       {
            char c=str.charAt(i);
            if(Character.isUpperCase(c))
            {
                UpperCase++;
            }
            else
            {
               lowerCase++;
            }
       }

      System.out.println("UpperCase Count:"+UpperCase+"\tLowerCase Count:"+lowerCase);
   }
}