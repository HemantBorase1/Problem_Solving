class StrPro4
{
      public static void main(String[] args)
      {
            String str="Hello World";
            String[] words=str.split(" ");
            String result=" ";

            for(String wrd:words)
            {
             String reverseWord="";
            
            for(int i=wrd.length()-1;i>=0;i--)
            {
                   reverseWord+=wrd.charAt(i);
                   
            }
            result+=reverseWord+" ";
           }
          System.out.println(result.trim());
      }
}