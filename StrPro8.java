class StrPro8
{
    public static void main(String[] args)
    {
          String str="aabbcccd";
          int count=1;
          String ans="";
          
          for(int i=1;i<str.length();i++)
          {
               if(str.charAt(i)==str.charAt(i-1))
               {
                count++;
               }
               else
               {
                  ans+=str.charAt(i-1)+""+count;
                  count=1;
               }
          }
       ans+=str.charAt(str.length()-1)+""+count;
       
     System.out.println(ans);
    }
}
/*
Dry Run It Properly
*/