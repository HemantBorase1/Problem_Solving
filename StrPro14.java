class StrPro14
{

   public static void main(String[] args)
   {
         int count=0;
         String str="Hello World";
        for(int i=0;i<str.length();i++)
        {
             char c=str.charAt(i);
               if(c==' ')
               {

                } 
              else
                count++;
         }
        System.out.println(count);
   }
}