class ArrPro8
{

   public static void main(String[] args)
   {
       
    int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int sum=0;
    int maxsum=a[0];
    for(int i=0;i<a.length;i++)
    {
       sum+=a[i];
      
       if(sum>maxsum)
       {
         maxsum=sum;
       }
      if(sum<0)
      {
         sum=0;
      }
      System.out.println(maxsum);
    }
   System.out.println(maxsum);
   }
}

/*

 Dry Run It also Again & Again
*/