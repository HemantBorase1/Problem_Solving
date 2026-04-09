class ArrPro3
{

    public static void main(String args[])
    {
           int[] arr={9,7,8,47,62,3,2};
           int min=arr[0];
           for(int i=0;i<arr.length;i++)
           {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
           }
           System.out.println("Min Value of the array:"+min);
    }
}