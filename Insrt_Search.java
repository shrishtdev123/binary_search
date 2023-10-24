public class Insrt_Search {
      public int insert_search(int a[],int item)
      {
          int low=0;
          int high=a.length-1;
          while(low<high)
          {
              int mid=(low+high)/2;
              if(a[mid]==item)
              {
                  return mid;
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
          return low;
      }

    public static void main(String[] args) {
         int[] a={10,20,30,40,50};
         int item=35;
        Insrt_Search t=new Insrt_Search();
        System.out.println(t.insert_search(a,item));
    }
}
