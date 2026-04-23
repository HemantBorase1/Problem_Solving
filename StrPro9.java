class StrPro9
{

   public static void main(String[] args)
   {
          String str="ababab";
          for(int i=0;i<str.length()-1;i++)
          {
                 for(int j=i+1;j<str.length()-1;j++)
                 {
                         String sub=str.substring(i,j);
                         String temp=sub;
                        
                         for(int k=temp.length()-1;k>=0;k--)
                         {
                               String demo="";
                               demo+=temp.charAt(k);
                               if(demo==sub)
                               {

                                 System.out.print("Palindrome Strings :\t"+demo+"\t");
                               }
                         }
                 }
                
          }
   }
}