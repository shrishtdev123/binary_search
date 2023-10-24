public class CountNumber {

      public int first(int a[],int target,int first)
      {
          int start=0;
          int end=a.length-1;
          int mid;
          while(start<=end)
          {
              mid=start+(end-start)/2;
              if(a[mid]==target)
              {
                  first=mid;
                  end=mid-1;
              }
              else if(target>a[mid])
              {
                  start=mid+1;
              }
              else
              {
                  end=mid-1;
              }
          }
          return first;
      }

    public int last(int a[],int target,int last)
    {
        int start=0;
        int end=a.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(a[mid]==target)
            {
                last=mid;
                start=mid+1;
            }
            else if(target>a[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return last;
    }


    public static void main(String[] args) {
        int[] a={2,3,4};
        int target=3;
        int first=-1;
        int last=-1;
        CountNumber t=new CountNumber();
        int x=t.first(a,target,first);
        int y=t.last(a,target,last);
        int count=y-x+1;
        System.out.println("The number of element come in the give array are:"+count);
    }
}
