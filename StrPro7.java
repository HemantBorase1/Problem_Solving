class StrPro7
{
       public static void main(String[] args)
       {
            String str="abcabcbb";
            String substr="";
            int count=0;
            int index=-1;
            outer:
            for(int i=0;i<=str.length()-1;i++)
            {
                        for(int j=i+1;j<=str.length()-1;j++)
                        {
                               if(str.charAt(i)==str.charAt(j))
                               {
                                // System.out.println(j);
                                 index=j;
                                 
                                 return outer;
                               }
 
                        }
              
            }
            System.out.println(index);
           for(int i=0;i<=index;i++)
           {
                     substr+=str.charAt(i);
           }
          System.out.println("SubString:"+substr+"Length:"+index);
       }
}