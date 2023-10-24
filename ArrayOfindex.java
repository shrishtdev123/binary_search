import java.util.ArrayList;

public class ArrayOfindex {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
      public int array(int a[],int item)
      {
          int low=0;
          int high=a.length-1;
          while(low<high)
          {
              int mid=(low+high)/2;
              if(a[mid]==item)
              {
                 numbers.add(a[mid]);

              }
              else if(item>a[mid])
              {
                  low=mid+1;
              }
              else
              {
                  high=mid-1;
              }
          }
           return -1;
      }

    public static void main(String[] args) {
        int[] a={1,2,2,3,4,5};
        int item=2;
        ArrayOfindex t=new ArrayOfindex();
        System.out.println(t.array(a,item));
    }
}

