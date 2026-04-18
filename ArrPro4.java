class ArrPro4
{
    public static void main(String[] args)
    {
          int []arr={10,8,7,20};
          int max=arr[0];
          int secondmax=arr[0];
          for(int i=0;i<arr.length;i++)
          {
                 if(max<arr[i])
                 {
                      max=arr[i];
                      if(max<arr[i])
                      {
                          secondmax=arr[i];
                      }
                 }
          }
        System.out.println("Max Value in the Array:"+secondmax);
    }
}