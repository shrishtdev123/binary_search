import java.util.ArrayList;

public class OccranceOfelement {

     // finding first
      public int first(int a[],int target,int first)
      {
          int size=a.length;
          int start=0;
          int end=size-1;
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
  // finding last
    public int last(int a[],int target,int last)
    {
        int size=a.length;
        int start=0;
        int end=size-1;
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
        int[] a={2,3,3,3,4,5,6};
        int first=-1;
        int last=-1;
        int target=3;
        OccranceOfelement t= new OccranceOfelement();
        int x=t.first(a,target,first);
        int y=t.last(a,target,last);
        ArrayList<Integer> l=new ArrayList<>();
        l.add(x);
        l.add(y);
        System.out.println(l);

    }
}
