class ArrPro7
{
     public static void main(String[] args)
     {
            int a[]={2,7,11,20};
            int target=22;
            for(int i=0;i<a.length;i++)
            {
                    for(int j=i+1;j<a.length;j++)
                    {
                          if(a[i]+a[j]==target)
                          {
                                  System.out.println(a[i]+","+a[j]);
                                  break;
                          }
                           
                    }
            }
        
     }
}
/*
Two Sum Problem

Example:
Array = [2, 7, 11, 15], Target = 9
Output → [2, 7]

My Approach:

 int target=31;
            int found=0;
            Boolean b=false;
           for(int i=0;i<a.length-1;i++)
           {
                int add=a[i]+a[i+1];
                 
                if(add==target)
                {
                   b=true;
                   found=i;
                   break;
                }
           }
          if(b)
          {
               System.out.println(a[found]+","+a[found+1]);
          }
          else
          {
             System.out.println("Addition is Not Found");
          }
*/