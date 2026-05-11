class ArrPro14
{
 
  public static void main(String[] args)
  {
          int arr[]={10,4,5,14,32};
          int max=arr[0];
          int min=arr[0];
          for(int i=0;i<arr.length;i++)
          {
                  if(max<arr[i])
                  {
                     max=arr[i];
                  }
                  if(min>arr[i])
                  {
                    min=arr[i];
                  }
          }
         System.out.println("Maximum Element:"+max+"\t Minimum Element:"+min);
   }
}